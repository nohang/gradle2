package com.skp.band.entity;

import javax.persistence.*;

/**
 * User: hyungwook.noh@sk.com
 * Date: 2014. 3. 20.
 */
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "team")
    private String team;

    @Column(name = "FLOOR")
    private String floor;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
