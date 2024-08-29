package com.example.check;

public class ThirdCheck {
    public void check(String pass) {
        try {
            Long integer = Long.valueOf(pass);
            System.out.println("Пароль не может содержать только цифры");

        } catch (NumberFormatException e) {
            System.out.println("Пароль успешно прошёл все проверки!");
        }
    }
}
