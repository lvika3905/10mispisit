import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University() {
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void displayFaculties() {
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getName());
        }
    }
}



