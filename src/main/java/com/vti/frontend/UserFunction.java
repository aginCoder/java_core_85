package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;

    public void showAdminMenu() throws SQLException {
        while (true) {
            System.out.println("1. hiển thị danh sách user");
            System.out.println("2. tìm kiếm user theo id");
            System.out.println("3. thêm user");
            System.out.println("4. xóa user theo id");
            System.out.println("5. đăng xuất");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();

            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            } else if (menu == 5) {
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng");
                System.err.println("Nhập lại");
            }
        }
    }


    private void findAll() throws SQLException {
        List<User> users = repository.findAll();
        System.out.println("Danh sách users:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    private void findById() throws SQLException {
        System.out.println("Nhập vào id cần tìm:");
        int id = ScannerUtil.inputInt();
        User user = repository.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (user == null) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            String fullName = user.getFullName();
            String email = user.getEmail();
            System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
            System.out.println("+------+--------------------+--------------------+");
        }
    }

    private void findByEmailAndPassword() throws SQLException {
        System.out.println("Mời nhập vào thông tin đăng nhập");
        System.out.println("Nập vào email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password: ");
        String password = ScannerUtil.inputPassword();
        User user = repository.findByEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Đăng nhập thất bại");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(), role);
        }
    }

    private void create() throws SQLException {
        System.out.println("Thêm người mới: ");
        System.out.println("Mời nhập vào full name");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Mời nhập vào email");
        String email = ScannerUtil.inputEmail();
        int result = repository.create(fullName, email);
        System.out.printf("Đã thêm thành công %d user(s).%n", result);
    }

    private void deleteById() throws SQLException {
        System.out.println(" Nhập vào id cần xóa: ");
        int id = ScannerUtil.inputInt();
        int result = repository.deleteById(id);     // Hiển thị số người xóa
        System.out.printf("Đã xóa thành công %d user(s).%n", result);
    }
}