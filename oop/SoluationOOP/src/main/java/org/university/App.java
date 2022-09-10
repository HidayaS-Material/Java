package org.university;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> itDepartments = new ArrayList<String>() {
            {
                add("CS");
                add("CIS");
                add("CE");
                add("NES");
            }
        };
        ITFaculty itFaculty = new ITFaculty("JUST", "Irbid", "blue",
                "Information & Communication Technology" , 2500, itDepartments,30);

        System.out.println(itFaculty.facultyFullName());

        itFaculty.displayDepartments();

        System.out.println(itFaculty.toString());
    };
}
