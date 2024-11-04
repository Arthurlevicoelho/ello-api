package com.ello.br.ello.services;

import com.ello.br.ello.models.ResponseModel;
import com.ello.br.ello.models.entitys.UserEntity;

import com.ello.br.ello.repositorys.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService extends BaseService<UserEntity, UUID> {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Transactional
    public ResponseEntity<ResponseModel> findByName(String userName){

        if (userName != null) {
            UserEntity user = userRepository.findByName(userName);

            if (user != null) return ResponseEntity.ok().body(new ResponseModel(user, ""));
        }

        return ResponseEntity.badRequest().body(new ResponseModel(null, "Usuário inválido"));

    }

    @Transactional
    public ResponseEntity<ResponseModel> save(UserEntity user) {
        if (user != null) {
            UserEntity u = userRepository.findByEmail(user.getEmail());

            if (u == null) {
                userRepository.save(user);

                return ResponseEntity.ok().body(new ResponseModel(null, "Usuário cadastrado"));
            } else {
                return ResponseEntity.badRequest  ().body(new ResponseModel(null, "Email já cadastrado"));
            }
        }

        return ResponseEntity.badRequest().body(new ResponseModel(null, "Usuário inválido"));
    }

    public ResponseEntity<ResponseModel> put(UserEntity user) {
        if (user != null && user.getId() != null) {
            UserEntity u = userRepository.findByEmail(user.getEmail());

            if (u == null) return ResponseEntity.badRequest().body(new ResponseModel(null, "Usuário não localizado"));
            if (u != null && !u.getId().equals(user.getId())) return ResponseEntity.badRequest().body(new ResponseModel(null, "Email já utilizado"));

            userRepository.save(user);

            return ResponseEntity.ok().body(new ResponseModel(null, "Usuário atualizado"));
        }

        return ResponseEntity.badRequest().body(new ResponseModel(null, "Usuário inválido"));
    }
}
