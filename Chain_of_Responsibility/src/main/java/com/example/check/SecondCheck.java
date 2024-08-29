package com.example.check;

public class SecondCheck {
private ThirdCheck next = new ThirdCheck();

    public void check(String pass) {
        int lengthPasswords = pass.length();
        if(lengthPasswords>18 ){
            System.out.println("Пароль должен быть не больше 18 символов");
        } else {
            System.out.println("Пароль успешно прошёл вторую проверку!");
            next.check(pass);
        }
    }

}
