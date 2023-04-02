package datamodel;

import java.util.Date;

public class Patient extends Person {
    private String symptoms;
    private Doctor assignedDoctor;

    public Patient(int id, String firstName, String lastName, Date dateOfBirth, int age, String gender, String mobile, String symptoms) {
        super(id, firstName, lastName, dateOfBirth, age, gender, mobile);
        this.symptoms = symptoms;
        this.assignedDoctor = null;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }
}
