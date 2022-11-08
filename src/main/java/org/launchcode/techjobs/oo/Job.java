package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name,Employer employer,Location location,PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        }
        Job job = (Job) object;
        return id == job.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        Character nl = '\n';
        Integer id = this.id;
        String jobName = this.name;
        String employerInfo = this.employer.getValue();
        String locationInfo = this.location.getValue();
        String positionTypeInfo = this.positionType.getValue();
        String coreCompetancyInfo = this.coreCompetency.getValue();

        if (jobName == ""){
            jobName = "Data not available";
        }

        if (employerInfo == ""){
            employerInfo = "Data not available";
        }
        if (locationInfo == ""){
            locationInfo = "Data not available";
        }

        if (positionTypeInfo == ""){
            positionTypeInfo= "Data not available";
        }

        if (coreCompetancyInfo == "") {
            coreCompetancyInfo = "Data not available";
        }

        return nl+ "ID: " + id + nl+ "Name: " + jobName + nl + "Employer: " + employerInfo + nl +
                "Location: " + locationInfo + nl + "Position Type: " + positionTypeInfo + nl +
                "Core Competency: " + coreCompetancyInfo + nl;
    }
}
