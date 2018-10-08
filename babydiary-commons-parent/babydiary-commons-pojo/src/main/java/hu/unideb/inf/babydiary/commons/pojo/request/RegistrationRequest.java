package hu.unideb.inf.babydiary.commons.pojo.request;

import hu.unideb.inf.babydiary.commons.pojo.enumeration.UserRole;

import java.io.Serializable;
import java.time.LocalDate;

public class RegistrationRequest implements Serializable {

    private String username;

    private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;

    private String rememberToken;

    private LocalDate createdDate;

    private UserRole userRole;
}
