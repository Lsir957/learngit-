package com.example.demo1.mapper;


import com.example.demo1.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}