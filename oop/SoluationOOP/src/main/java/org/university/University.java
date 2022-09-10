package org.university;

public abstract class University {
    private String name;
    private String location;
    private String flagColour;


    public University(String name, String location, String flagColour) {
        this.name = name;
        this.location = location;
        this.flagColour = flagColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFlagColour() {
        return flagColour;
    }

    public void setFlagColour(String flagColour) {
        this.flagColour = flagColour;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", flagColour='" + flagColour + '\'' +
                '}';
    }

    public abstract void displayDepartments();

}
