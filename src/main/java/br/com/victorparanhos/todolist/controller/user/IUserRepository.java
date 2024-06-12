package br.com.victorparanhos.todolist.controller.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
        UserModel findByNomedoUsuario(String nomedoUsuario);
    
} 