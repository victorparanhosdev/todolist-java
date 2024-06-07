package br.com.victorparanhos.todolist.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class UserController {

    @PostMapping("/users")
    public String userControler(@RequestBody AtributosUser atributosUser) {
        return atributosUser.getNomedoUsuario();
    }
}
