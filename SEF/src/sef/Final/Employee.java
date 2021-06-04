package sef.Final;

public class Employee extends Person {

private String name;
private int age;
private String jobTitle;
private String company;

public Employee(){
    this.name = "Alla";
this.age = 22;
this.jobTitle = "PMO";
this.company = "Accenture";

}
 public String getName(){ return name;}
    public void setName(String name) { this.name = name;}
public int getAge(){ return age;}
    public void setAge(int age) { this.name = name;}
public String getJobTitle() { return jobTitle;}
    public void setJobTitle (String jobTitle) {this.jobTitle = jobTitle;}
public String getCompany(){ return company;}
public void setCompany(String company) {this.company = company;}

public String introduce ()
{return "My name is"+ getName()+"and i am"+getAge()+ "years old"+"I work as"+getJobTitle()+"in"+getCompany();} }

