package org.university;

import java.util.ArrayList;

public class ITFaculty extends University {
    private String facultyName;
    private int numOfStudents;
    private ArrayList <String> departments;
    private int numOfStaff;

    public ITFaculty(String name, String location, String flagColour, String facultyName, int numOfStudents, ArrayList<String> departments, int numOfStaff) {
        super(name, location, flagColour);
        this.facultyName = facultyName;
        this.numOfStudents = numOfStudents;
        this.departments = departments;
        this.numOfStaff = numOfStaff;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }

    public int getNumOfStaff() {
        return numOfStaff;
    }

    public void setNumOfStaff(int numOfStaff) {
        this.numOfStaff = numOfStaff;
    }

    @Override
    public String toString() {

        return super.toString() + " \n›ITFaculty{" +
                "facultyName='" + facultyName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", departments=" + departments +
                ", numOfStaff=" + numOfStaff +
                '}';
    }

    public String facultyFullName(){
        return "Faculty of "+ this.facultyName +" at "+ super.getName();
    }

    @Override
    public void displayDepartments() {
        for (int i = 0; i < this.departments.size(); i++) {
            System.out.println(i+1+". "+ departments.get(i));
        }
    }

}
