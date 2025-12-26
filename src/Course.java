public class Course {

    public String name;
    public int id;
    public float hours;

    public Course (String name, int id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    @java.lang.Override
    public java.lang.String toString () {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hours=" + hours +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public float getHours () {
        return hours;
    }

    public void setHours (float hours) {
        this.hours = hours;
    }
}
