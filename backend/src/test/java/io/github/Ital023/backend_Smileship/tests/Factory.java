package io.github.Ital023.backend_Smileship.tests;

import io.github.Ital023.backend_Smileship.entities.User;

public class Factory {

    public static User createUser(){
        return new User(1L
                , "IsraelNasc"
                ,"123456789"
                ,"nascisrael@gmail.com"
                ,"Israel"
                ,"Nascimento");
    };

}
