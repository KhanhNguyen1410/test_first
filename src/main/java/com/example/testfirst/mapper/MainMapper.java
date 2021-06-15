package com.example.testfirst.mapper;

import org.modelmapper.ModelMapper;

public class MainMapper {
   static ModelMapper mapper = new ModelMapper();
    public static void main(String[] args) {
        User user = new User("khanh","khanh","khanh@","0123");
        UserDTO userDTO = mapper.map(user, UserDTO.class);
        System.out.println(userDTO.getUsername());
        userDTO.setTime(5L);
        System.out.println(userDTO.getTime());
    }

}
