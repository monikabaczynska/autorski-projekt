import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private Date startOfEmployment;
    private double salary;

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    Date getDateOfBirth() {
        return dateOfBirth;
    }
    Date getStartOfEmployment() {
        return startOfEmployment;
    }
    double getSalary() {
        return salary;
    }
}
