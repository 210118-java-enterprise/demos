package com.revature.screens;

public class RegisterScreen extends Screen {

    public RegisterScreen(){
        super("RegisterScreen", "/register");
    }
    @Override
    public void render(){
        System.out.println("RegisterScreen works!");
    }
}
