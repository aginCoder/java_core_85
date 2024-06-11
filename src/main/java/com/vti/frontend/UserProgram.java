package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.repository.IUserRepository;
import com.vti.repository.UserRepository;
import com.vti.service.IUserService;
import com.vti.service.UserService;

import java.io.IOException;
import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException, IOException {
        IUserRepository repository = new UserRepository();
        IUserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction function = new UserFunction(controller);
        function.showMenu();
    }
}