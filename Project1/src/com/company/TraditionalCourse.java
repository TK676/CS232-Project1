package com.company;

import java.time.LocalTime;

public class TraditionalCourse extends Course {
    public LocalTime start;
    public LocalTime stop;
    public String days;
    public String room;

    public TraditionalCourse(String name, int crn, String number, int section, int credits, String type, String instructor, LocalTime start, LocalTime stop, String days, String room) {
        super(name, crn, number, section, credits, type, instructor);
        this.start = start;
        this.stop = stop;
        this.days = days;
        this.room = room;
    }

    public TraditionalCourse(){}

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getStop() {
        return stop;
    }

    public void setStop(LocalTime stop) {
        this.stop = stop;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean conflictsWith(Course x) {
        boolean conflicts = false;

        if (x instanceof TraditionalCourse) {
            TraditionalCourse courseToCheck = (TraditionalCourse) x;

            if (this.getDays().equals(courseToCheck.getDays())) {
                if (this.getStop().isAfter(courseToCheck.getStart()) && this.getStart().isBefore(courseToCheck.getStop())) {
                    conflicts = true;
                }
                else if (this.getStart().isBefore(courseToCheck.getStop()) && this.getStop().isAfter(courseToCheck.getStop())) {
                    conflicts = true;
                }
                else if (this.getStart().isAfter(courseToCheck.getStart()) && this.getStop().isBefore(courseToCheck.getStop())) {
                    conflicts = true;
                }
                else if (this.getStart() == courseToCheck.getStart()) {
                    conflicts = true;
                }
            }
        }

        return conflicts;
    }

    @Override
    public String toString() {
        return crn + " : " + number + "-00" + section + " " + credits + " (" + name + "), " + instructor + ", " + type + ", " + start + "-" + stop + ", " + days + ", " + room;
    }

}
