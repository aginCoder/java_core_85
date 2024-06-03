package com.vti.frontend;

import com.vti.repository.UserRepository;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
//        function.findAll();

//        function.findById();
//        function.deleteById();
//        function.findAll();

//        function.create();
//        function.findAll();

//        function.findAll();
//        function.findByEmailAndPassword();

        function.showAdminMenu();
    }
}