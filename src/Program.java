// Contains the individual profile of each Employee
public class Program {

    public static void main(String[] args) {
        Director d = new Director("Pippa", 47,15, "Director", "4");
        d.profile();
        d.TierOneJobs();
        d.TierTwoJobs();
        d.TierThreeJobs();
        d.TierFourJobs();

        Manager m = new Manager("Collin", 35,12, "Manager","3");
        m.profile();
        m.TierOneJobs();
        m.TierTwoJobs();
        m.TierThreeJobs();


        Supervisor s = new Supervisor("Gemma", 34, 6, "Supervisor", "2");
        s.profile();
        s.TierOneJobs();
        s.TierTwoJobs();


        Worker  w = new Worker("Lucy", 23, 3, "Worker", "1");
        w.profile();
        w.TierOneJobs();
        w.tidyUp();
    }
}
