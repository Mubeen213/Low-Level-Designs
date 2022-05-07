package com.mubeen;

import java.util.ArrayList;

public class RegisteredUser extends User{

    private ArrayList<Ticket> bookingHistory;

    public RegisteredUser(String name, int userId) {
        super(name, userId);
        this.bookingHistory = new ArrayList<>();
    }
}
