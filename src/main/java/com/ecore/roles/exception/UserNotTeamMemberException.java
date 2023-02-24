package com.ecore.roles.exception;

import static java.lang.String.format;

public class UserNotTeamMemberException extends RuntimeException {

    public <T> UserNotTeamMemberException() {
        super(format("Invalid 'Membership' object. The provided user doesn't belong to the provided team."));
    }
}
