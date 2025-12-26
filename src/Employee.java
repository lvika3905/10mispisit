public abstract class Employee {

    public int ssNo;
    public String name;
    public String email;
    public int counter;

    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

}
