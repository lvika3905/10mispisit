public class ResearchAssociate extends Employee {
    private String fieldOfStudy;

    public ResearchAssociate(int ssn, String name, String email, String fieldOfStudy) {
        super(ssn, name, email);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy (String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
