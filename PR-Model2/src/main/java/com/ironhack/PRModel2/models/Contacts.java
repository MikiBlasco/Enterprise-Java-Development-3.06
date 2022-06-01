package com.ironhack.PRModel2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Contacts {

    @Id
    private String title;
    private String company;

    @Embedded
    @AttributeOverride(name = "firs_name", column = @Column(name = "name1"))
    private Name name;

    public Contacts(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public Contacts(){

    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
