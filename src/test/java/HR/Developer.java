package HR;

public class Developer extends Employment{
    private String title;

    public Developer(String name, String surname) {
        super(name, surname);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
