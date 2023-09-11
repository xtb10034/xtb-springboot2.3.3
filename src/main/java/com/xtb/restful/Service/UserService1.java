package com.xtb.restful.Service;


import com.xtb.restful.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component
public class UserService1 {
    private static Log logger = LogFactory.getLog(MysqlService.class);

    @Autowired
    UserDao dao;

    private int counter = 0;
//    @Async("SISBatchExecutor")
//
//    (name = "aaa")

    public String qureyUserById() throws Exception{
        logger.warn("===Start query user by id.===");
        int in=0;
    logger.warn("before "+ in);
        try{
            List<Map<String, Object>> sourceData =  dao.getDataSourceUserId();
            if(sourceData.size() ==0 ){
                logger.warn("No data in your query.===");
            }else{
                logger.warn("Data Rows: "+sourceData.size());
                for ( Map<String, Object> o:sourceData ) {
                    logger.warn(o.get("person_id") + " " + o.get("first_name") + " " + o.get("last_name"));
                }
            }
            in++;
            Thread.sleep(10000);
            logger.warn("after "+ in);
            counter++;
            logger.warn("counter "+ counter);
        }catch(Exception e){
            logger.error("Error message: " + e);
        }finally {
            return "ss";
        }

//        logger.warn("===Finish query user by id.===");
    }


}
