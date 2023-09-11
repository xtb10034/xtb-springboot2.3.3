package com.xtb.restful.model;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class User2 implements RowMapper<User2> {
    private int id;
    private String username;
    private String password;
   @Override
    public User2 mapRow(ResultSet resultSet, int i) throws SQLException {
        User2 user = new User2();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}