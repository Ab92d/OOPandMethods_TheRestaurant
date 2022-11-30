// Supervisor class. Includes:  Tier 1 and Tier 2 access tasks
import Interfaces.TierTwo;

// Implementing Tier two gives Supervisors access to Tier 2 tasks
public class Supervisor extends Employee implements TierTwo {
    public Supervisor(String name, int age, int experience, String role, String jobAccess ) {
        super(name, age, experience, role, jobAccess);
    }

    public void jobs() {}
    public void TierTwoJobs() {
        System.out.println("Tier 2 jobs: ");
        System.out.println("- Write the Rota");
        System.out.println("- Organise floor plan");
        System.out.println("- Count the stock");
        System.out.println("- Run training sessions");
    }
}
