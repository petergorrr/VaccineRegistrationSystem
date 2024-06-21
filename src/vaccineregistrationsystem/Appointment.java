package vaccineregistrationsystem;

import java.util.Date;

public class Appointment {
    private String personId;
    private String vaccineName;
    private Date appointmentDate;

    public Appointment(String personId, String vaccineName, Date appointmentDate) {
        this.personId = personId;
        this.vaccineName = vaccineName;
        this.appointmentDate = appointmentDate;
    }

    // Getters and Setters
    public String getPersonId() { return personId; }
    public void setPersonId(String personId) { this.personId = personId; }

    public String getVaccineName() { return vaccineName; }
    public void setVaccineName(String vaccineName) { this.vaccineName = vaccineName; }

    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }
}
