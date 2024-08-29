package com.example.check;

public class FirstCheck {
    private SecondCheck next = new SecondCheck();
    public void check(String pass) {
       int lengthPasswords = pass.length();
       if(lengthPasswords<5 ){
           System.out.println("Пароль должен быть не меньше 5 символов");
       } else {
           System.out.println("Пароль успешно прошёл первую проверку!");
           next.check(pass);
       }
    }
}
