package com.newt.dao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.ID
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
	@Id
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.name
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.address
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.username
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.password
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.ID
     *
     * @return the value of customer.ID
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.ID
     *
     * @param id the value for customer.ID
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.name
     *
     * @return the value of customer.name
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.name
     *
     * @param name the value for customer.name
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.address
     *
     * @return the value of customer.address
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.address
     *
     * @param address the value for customer.address
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.username
     *
     * @return the value of customer.username
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public String getusername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.username
     *
     * @param username the value for customer.username
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public void setusername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.password
     *
     * @return the value of customer.password
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.password
     *
     * @param password the value for customer.password
     *
     * @mbggenerated Sat Feb 27 12:07:26 IST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}