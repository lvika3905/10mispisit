import java.util.Date;

public class Project {

    public String name;
    public Date start;
    public Date end;
    public int hours;

    @java.lang.Override
    public java.lang.String toString () {
        return "Project{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", hours=" + hours +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Date getStart () {
        return start;
    }

    public void setStart (Date start) {
        this.start = start;
    }

    public Date getEnd () {
        return end;
    }

    public void setEnd (Date end) {
        this.end = end;
    }

    public int getHours () {
        return hours;
    }

    public void setHours (int hours) {
        this.hours = hours;
    }

    public Project (String name, Date start, Date end, int hours) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.hours = hours;
    }
}