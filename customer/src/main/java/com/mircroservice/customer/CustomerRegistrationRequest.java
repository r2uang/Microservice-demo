package com.mircroservice.customer;

public record CustomerRegistrationRequest(String firstName
        , String lastName
        , String email) {
}
