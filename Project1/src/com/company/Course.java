package com.company;

public abstract class Course {
    public String name;
    public int crn;
    public String number;
    public int section;
    public int credits;
    public String type;
    public String instructor;

    public Course(String name, int crn, String number, int section, int credits, String type, String instructor) {
        this.name = name;
        this.crn = crn;
        this.number = number;
        this.section = section;
        this.credits = credits;
        this.type = type;
        this.instructor = instructor;
    }

    public Course(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public abstract boolean conflictsWith(Course x);

}
