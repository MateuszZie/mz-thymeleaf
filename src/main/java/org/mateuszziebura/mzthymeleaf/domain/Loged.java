package org.mateuszziebura.mzthymeleaf.domain;

import javax.validation.constraints.NotBlank;

public class Loged {

    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;

    }

    public void setPassword(String password) {
        this.password = password;
    }
}
