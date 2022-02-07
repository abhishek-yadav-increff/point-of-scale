package com.increff.pos.model;

import java.util.Objects;

/**
 * UserData
 */
public class UserData {
    private String name;
    private String message;

    public UserData() {}

    public UserData(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserData name(String name) {
        setName(name);
        return this;
    }

    public UserData message(String message) {
        setMessage(message);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) o;
        return Objects.equals(name, userData.name) && Objects.equals(message, userData.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", message='" + getMessage() + "'" + "}";
    }

}
