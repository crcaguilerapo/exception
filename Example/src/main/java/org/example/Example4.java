package org.example;

import io.vavr.control.Either;

import java.util.Random;

class NotFoundUser extends Exception {
}

public class Example4 {
    //Presentation layer
    public static void main(String[] args) {
        System.out.println(getNickname(1));
    }

    //Business Layer
    static String getNickname(Integer id) {
        return getUserById(1)
                .map(i -> i.nickname())
                .getOrElse("Not found user");
    }

    //Data access layer
    static Either<Exception, User> getUserById(Integer id) {
        var r = new Random();
        return r.nextBoolean() ?
                Either.right(new User("Cristian", "test@test.com")) :
                Either.left(new NotFoundUser());
    }
}
