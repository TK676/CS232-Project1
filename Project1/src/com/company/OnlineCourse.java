package com.company;

public class OnlineCourse  extends Course {
    public OnlineCourse(String name, int crn, String number, int section, int credits, String type, String instructor) {
        super(name, crn, number, section, credits, type, instructor);
    }

    public OnlineCourse(){}

    @Override
    public boolean conflictsWith(Course c) {
        boolean conflicts = false;

        if (this.getCrn() == c.getCrn()) {
            conflicts = true;
        }
        return conflicts;
    }

    @Override
    public String toString() {
        return crn + " : " + number + "-00" + section + " " + credits + " (" + name + "), " + instructor + ", " + type;
    }
}
