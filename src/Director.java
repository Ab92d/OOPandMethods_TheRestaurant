// Supervisor class. Includes:  Tier 1, Tier 2, Tier 3 and Tier 4 access tasks
import Interfaces.TierFour;
import Interfaces.TierThree;
import Interfaces.TierTwo;

// Implementing Tier two gives Supervisors access to Tier 2 and 3 tasks
public class Director extends Employee implements TierTwo, TierThree, TierFour {
    public Director(String name, int age, int experience, String role, String jobAccess)
    {super(name, age, experience, role, jobAccess );
    }

    // Jobs of Director
    public void jobs() {}
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
    public void TierFourJobs() {
        System.out.println("Tier 4 jobs: ");
        System.out.println("- Accounting for the business ");
        System.out.println("- Appointing senior managers");
        System.out.println("- Promoting the success of the company");
        System.out.println("- Paying wages");
    }
}
