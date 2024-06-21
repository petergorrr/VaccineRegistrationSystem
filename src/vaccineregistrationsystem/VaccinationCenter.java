package vaccineregistrationsystem;

import java.util.ArrayList;

public class VaccinationCenter {
    private ArrayList<Vaccine> vaccines = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addVaccine(Vaccine vaccine) {
        vaccines.add(vaccine);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Methods to manage vaccines and appointments
}
