package com.vti.service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService {
    private IUserRepository repository;

    @Override
    public List<User> findAll() {
        try {
            return repository.findAll();
        } catch (SQLException | IOException e) {
            return List.of();
        }
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return repository.findById(id);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return repository.findByEmailAndPassword(email, password);
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        return repository.create(fullName, email);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return repository.deleteById(id);
    }
}
