package classes;

public class Department {
     String name;
     String managerName;

    public Department(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return managerName;
    }
}
