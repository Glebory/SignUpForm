package com.signupform.signupform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FormController {
    @FXML
    private Label inValidPassword;
    private Label inValidEmail;
    private Label validInfo;

    @FXML
    protected void onSignUpButtonClick() {
        if (){
        inValidEmail.setText("That email doesn't make sense, please try again");
    }
        if (){
            inValidPassword.setText("That password is not safe, please try again");
        }
        else {
            validInfo.setText("How you doin'?");
        }
    }
}