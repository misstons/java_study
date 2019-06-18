package ru.stqa.java_study.addressbook;

public class GroupContact {
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String homephone;
    private final String mobilephone;
    private final String email;

    public GroupContact(String firstname, String lastname, String address, String homephone, String mobilephone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getEmail() {
        return email;
    }
}
