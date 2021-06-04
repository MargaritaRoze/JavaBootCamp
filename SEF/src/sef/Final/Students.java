package sef.Final;

public class Students {
    private String name;
    private String schoolName;

    public Students () {
        this.name = "Danny";
        this.schoolName = "Baltic University";
    }
    public String getName () {
        return name;}

    public void setName(String name) {
        this.name = name;
    }
public String getschoolName(){
        return schoolName;}
    public void setSchoolName(String name){
        this.schoolName = schoolName;
    }
    public String introduce (){
        return "I am study in university"+getschoolName();
    }
}

