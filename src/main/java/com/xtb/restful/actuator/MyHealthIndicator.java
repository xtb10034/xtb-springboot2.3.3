package com.xtb.restful.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MyHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String,Object> map = new HashMap<>();
        if(1==2){
            builder.up();
            map.put("message","Successful");
        }else {
            builder.down();
            map.put("message","error");
        }

        builder.withDetail("code",100).withDetails(map);


    }
}
