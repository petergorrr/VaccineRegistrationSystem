package vaccineregistrationsystem;

public class Person {
    private String name;
    private String id;
    private String contact;

    public Person(String name, String id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
