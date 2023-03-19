package org.example;

import io.vavr.control.Option;

import java.util.Random;

record User(String nickname, String email) {

}

public class Example3
{
    //Presentation layer
    public static void main(String[] args) {
        System.out.println(getNickname(1));
    }

    //Business Layer
    static String getNickname(Integer id) {
        return getUserById(id)
                .map(i -> i.nickname())
                .getOrElse( "Not found user");
    }

    //Data access layer
    static Option<User> getUserById(Integer id) {
        var r = new Random();
        return r.nextBoolean() ?
                Option.of(new User("Cristian", "test@test.com")) :
                Option.none();
    }
}
