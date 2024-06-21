package vaccineregistrationsystem;

public class Personnel {
    private String name;
    private String personnelId;

    public Personnel(String name, String personnelId) {
        this.name = name;
        this.personnelId = personnelId;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPersonnelId() { return personnelId; }
    public void setPersonnelId(String personnelId) { this.personnelId = personnelId; }

    // Methods to manage citizens, appointments, and vaccines
}
