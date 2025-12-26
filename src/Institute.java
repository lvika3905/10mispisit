public class Institute {

    public String name;
    public String address;
    public ResearchAssociate researchAssociate;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public Institute (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setResearchAssociate (ResearchAssociate researchAssociate) {
        this.researchAssociate = researchAssociate;
    }

    @Override
    public String toString () {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
