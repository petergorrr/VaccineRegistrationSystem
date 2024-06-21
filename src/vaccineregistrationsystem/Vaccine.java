package vaccineregistrationsystem;

public class Vaccine {
    private String vaccineName;
    private int availableDoses;

    public Vaccine(String vaccineName, int availableDoses) {
        this.vaccineName = vaccineName;
        this.availableDoses = availableDoses;
    }

    // Getters and Setters
    public String getVaccineName() { return vaccineName; }
    public void setVaccineName(String vaccineName) { this.vaccineName = vaccineName; }

    public int getAvailableDoses() { return availableDoses; }
    public void setAvailableDoses(int availableDoses) { this.availableDoses = availableDoses; }
}
