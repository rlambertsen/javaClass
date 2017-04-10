/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rylan
 */
public class User implements Serializable {
    //variables
    public String firstName;
    public String lastName;
    public String phone;
    public String email;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String userName;
    public String password;
    //user object
    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        email = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        userName = "";
        password = "";
        
    }
    //set user data all at once
    
    //get first name
    public String getFirstName() {
        return firstName;
    }
    //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //get last name
    public String getLastName() {
        return lastName;
    }
    //set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //get phone name
    public String getPhone() {
        return phone;
    }
    //set phone name
    public void setPhone(String phone) {
        this.phone = phone;
    }
    //get email name
    public String getEmail() {
        return email;
    }
    //set email name
    public void setEmail(String email) {
        this.email = email;
    }
    //get address name
    public String getAddress() {
        return address;
    }
    //set city name
    public void setAddress(String address) {
        this.address = address;
    }
    //get city name
    public String getCity() {
        return city;
    }
    //set city name
    public void setCity(String city) {
        this.city = city;
    }
    //get state name
    public String getState() {
        return state;
    }
    //set state name
    public void setState(String state) {
        this.state = state;
    }
    //get zip name
    public String getZip() {
        return zip;
    }
    //set zip name
    public void setZip(String zip) {
        this.zip = zip;
    }
    //get userName name
    public String getUserName() {
        return userName;
    }
    //set userName name
    public void setUserName(String userName) {
        this.userName = userName;
    }
    //get password name
    public String getPassword() {
        return password;
    }
    //set password name
    public void setPassword(String password) {
        this.password = password;
    }
}
