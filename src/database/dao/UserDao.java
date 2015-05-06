package database.dao;


import database.DataSource;
import database.model.User;

import java.sql.*;

public class UserDao implements Dao<User> {

    private final String TABLE = "users";
    private Connection connection = null;
    private Statement statement;
    private PreparedStatement preparedStatement;

    @Override
    public void connect(DataSource dataSource) {
        try {
            Class.forName(dataSource.getDriverClassName());
            connection = DriverManager.getConnection(dataSource.getUrl(), dataSource.getUsername(), dataSource.getPassword());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }

    @Override
    public void save(User object) {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO " + TABLE + " VALUES(?,?,?,?,?)");
            preparedStatement.setInt(1, object.getId());
            preparedStatement.setString(2, object.getName());
            preparedStatement.setString(3, object.getLastname());
            preparedStatement.setString(4, object.getPassword());
            preparedStatement.setString(5, object.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getLastId() {

    }

    @Override
    public void delete(User object) {

    }

    @Override
    public User getById(int id) {
        return null;
    }
}
