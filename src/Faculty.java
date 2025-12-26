import java.util.ArrayList;
import java.util.List;

public class Faculty {

    public String name;
    public Employee dean;
    private List<Institute> institutes;

    public Faculty (String name, Employee dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Employee getDean () {
        return dean;
    }

    public void setDean (Employee dean) {
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        this.institutes.add(institute);
    }

    public void displayInstitutes() {
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
    }
}
