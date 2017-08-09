/**
 * Created by ruplaga on 7/21/2017.
 */
public class Person {
    String name;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (((Person) obj).getName().equals(this.getName()) && ((Person) obj).getGender().equals(this.getGender())) {
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.getGender().hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
