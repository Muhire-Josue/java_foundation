package classes;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setTitle("Mr");
        employee.setFirstName("John");
        employee.setSurname("Doe");

        System.out.println(employee.getMailingName());

        Department department =  new Department("Finance", "Sally Green");
        System.out.println(department.getManagerName());
    }
}
