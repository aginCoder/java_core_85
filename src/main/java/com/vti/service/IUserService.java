package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(int id) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;
}
