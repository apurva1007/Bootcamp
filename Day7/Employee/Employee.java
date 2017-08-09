import java.util.Date;

/**
 * Created by ruplaga on 7/18/2017.
 */

public class Employee {
    int employeeId;
    String name;
    Date dateOfBirth;
    Date dateOfJoining;
    int deptId;
    Location location;

    Object o;


    public Employee(int employeeId, String name, Date dateOfBirth, Date dateOfJoining, int deptId, Location location) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.deptId = deptId;
        this.location = location;
    }

        @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth.getYear() + "-" + dateOfBirth.getMonth() + "-" + dateOfBirth.getDate() +
//                ", dateOfJoining=" + dateOfJoining +
//                ", deptId=" + deptId +
//                ", location=" + location +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
