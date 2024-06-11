package br.com.victorparanhos.todolist.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class UserController {

    @PostMapping("/users")
    public String CreateControler(@RequestBody UserModel userModel) {
        return userModel.getNomedoUsuario();
    }
    @GetMapping("/users")
    public String SearchControler(@RequestBody UserModel userModel) {
        return userModel.getPassword();
    }
}
