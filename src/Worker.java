// Worker class. Includes: Worker only tasks and tier 1 access tasks
// Doesn't include promotions variable as Worker is the lowest ranking position
public class Worker extends Employee {

    // This constructor derives from the Employee class.
    // Variables are not listed here as they extend from the Pet Class.
    public Worker(String name, int age, int experience, String role, String jobAccess) {
        super(name, age, experience, role, jobAccess);
    }

    // This method can only be used by the Worker class and nay child classes
    public void tidyUp() {
        System.out.println("Worker only tasks: ");
        System.out.println("- Sweep the floor");
        System.out.println("- Dust lights");
        System.out.println("- Mop floor");
    }

    // Jobs is a abstract method found in Employee
    public void jobs() {}
}
