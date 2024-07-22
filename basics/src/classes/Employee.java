package classes;

public class Employee {
    private String title;
    private String firstName;
    private String surname;
    private String jobTitle;
    private String department;

    public String getMailingName(){
        return title + " " + firstName + " " + surname;
    }

    public String getMailingName(boolean firstInitialOnly){
        if(firstInitialOnly){
            return title + " " + firstName.charAt(0) + " " + surname;
        }
        return title + " " + firstName + " " + surname;
    }

    public Employee() {
    }

    public Employee(String title, String firstName, String surname, String jobTitle, String department) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
