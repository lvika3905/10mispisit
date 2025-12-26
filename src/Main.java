public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee dean = new AdministrativeEmployee(1234, "Dean d", "dean@example.com");
        ResearchAssociate researcher = new ResearchAssociate(4567, "ResearchAssociate ra",
                "researchAssociate@example.com", "Software development");
        Lecturer lecturer1 = new Lecturer(7890, "Professor Smith", "smith@example.com", "Computer Science");
        Lecturer lecturer2 = new Lecturer(7891, "Dr. Johnson", "johnson@example.com", "Data Structures");

        // Создаем факультет и институт
        Faculty faculty = new Faculty("Faculty of Computer Science", dean);
        Institute institute = new Institute("Department of Software Engineering", "Address");
        faculty.addInstitute(institute);

        // Создаем курсы
        Course[] courses = {
                new Course("Object-Oriented Programming", 101, 120.0f),
                new Course("Algorithms", 102, 90.0f),
                new Course("Database Systems", 103, 80.0f)
        };



        // Выводим информацию
        System.out.println("=== UNIVERSITY MANAGEMENT SYSTEM ===\n");

        // Организационная структура
        System.out.println("1. ORGANIZATIONAL STRUCTURE:");
        System.out.println("University");
        System.out.println("└── " + faculty.getName());
        System.out.println("    ├── Dean: " + dean.getName());
        System.out.println("    └── " + institute.getName());
        System.out.println("        ├── Head: " + researcher.getName());
        System.out.println("        ├── " + lecturer1.getName());
        System.out.println("        └── " + lecturer2.getName());

        // Сотрудники
        System.out.println("\n2. EMPLOYEES:");
        System.out.println("Dean: " + dean.getName());
        System.out.println("Research Head: " + researcher.getName() + " (" + researcher.getFieldOfStudy() + ")");
        System.out.println("Lecturers: " + lecturer1.getName() + ", " + lecturer2.getName());

        // Курсы
        System.out.println("\n3. COURSES:");
        float totalHours = 0;
        for (Course course : courses) {
            System.out.println("- " + course.getName() + " (" + course.getHours() + " hours)");
            totalHours += course.getHours();
        }

        // Статистика
        System.out.println("\n4. STATISTICS:");
        System.out.println("- Total courses: " + courses.length);
        System.out.println("- Total teaching hours: " + totalHours);
        System.out.println("- Total employees: 4");

        System.out.println("\n=== END OF REPORT ===");
    }
}
