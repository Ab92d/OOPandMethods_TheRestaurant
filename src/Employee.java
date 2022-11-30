// I've used an abstract class as it's useful for inheritance as a template for all subclasses
public abstract class Employee {

    private String name;
    private int age;
    private int experience;
    private String role;
    private String jobAccess;

    // Used constructors to help create objects by stating the variables used to create an object
    public Employee(String name, int age, int experience, String role, String jobAccess) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.role = role;
        this.jobAccess = jobAccess;
    }

    // I've used getters to get variable information from the class
    // I've also used setters to  change variable information in a class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return age;
    }
    // Links directly with the age variable found inside this class
    // Increases age by 1 year as an employee gets older
    public void getsOlder() {
        age++;
    }

    public int getExperience() {
        return experience;
    }
    public int setExperience() {
        return experience;
    }

    // Links directly with the experience variable found inside this class
    // Increases an employees experience the longer they work at the company
    public void getsMoreExperience() {
        experience++;
    }

    public String getRole() {
        return role;
    }

    public String getJobAccess() {
        return jobAccess;
    }

    public String setJobAccess() {
        return jobAccess;
    }

    // Created as a functional method for jobs
    abstract public void jobs();

    // Tier 1 access tasks. Tasks everyone can access
    public void TierOneJobs() {
        System.out.println("Tier 1 jobs: ");
        System.out.println("- Polish Cultery");
        System.out.println("- Serve tables");
        System.out.println("- Restock cupboards");
        System.out.println("- Clear tables");
    }

    // Employee Profile
    public void profile() {
        System.out.println("Name: " + getName() + " | Age: " + getAge() + " | Years of experience: " + getExperience() + " | Role: " + getRole() + "| Tier Access: " + getJobAccess());
    }
}


