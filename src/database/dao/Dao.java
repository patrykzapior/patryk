package database.dao;

import database.DataSource;

public interface Dao<T> {
    void connect(DataSource dataSource);
    void save(T object);
    void getLastId();
    void delete(T object);
    T getById(int id);
}
