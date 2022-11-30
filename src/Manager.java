// Supervisor class. Includes:  Tier 1, Tier 2 and Tier 3 access tasks
import Interfaces.TierThree;
import Interfaces.TierTwo;

// Implementing Tier two gives Supervisors access to Tier 2 and 3 tasks
public class Manager extends Employee implements TierTwo, TierThree{


    public Manager(String name, int age, int experience, String role, String jobAccess) {
        super(name, age, experience,role, jobAccess);
    }
    public void TierTwoJobs() {
        System.out.println("Tier 2 jobs: ");
        System.out.println("- Write the Rota");
        System.out.println("- Organise floor plan");
        System.out.println("- Count the stock");
        System.out.println("- Run training sessions");
    }
    public void TierThreeJobs() {
        System.out.println("Tier 3 jobs: ");
        System.out.println("- Take money out of safe ");
        System.out.println("- Hire people");
        System.out.println("- Lock up");
        System.out.println("- Fire People");
    }
    public void jobs() {}
}
