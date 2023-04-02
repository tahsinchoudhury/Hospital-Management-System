package datamodel;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Employee{
    private String department;
    private ArrayList <Patient> patients;

    public Doctor(int id, String firstName, String lastName, Date dateOfBirth, int age, String gender, String mobile, Date joiningDate, String post, String department) {
        super(id, firstName, lastName, dateOfBirth, age, gender, mobile, joiningDate, post);
        this.department = department;
        this.patients = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
