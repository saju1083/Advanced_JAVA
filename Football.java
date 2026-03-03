package advance_java;
// Abstract Class
abstract class FootballPlayer {
    protected String name;
    protected int goals;
    private double monthlySalary;  

    // Constructor
    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    // Getter for salary 
    protected double getMonthlySalary() {
        return monthlySalary;
    }

    // Abstract method
    abstract double calculateGoalRate();

    // Abstract method to get league name
    abstract String getLeague();

    // Method to display player info
    public void displayInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("League: " + getLeague());
        System.out.println("Goals Scored: " + goals);
        System.out.println("Goal Rate: " + calculateGoalRate());
        System.out.println("-----");
    }
}

// LaLiga Player Class
class LaLigaPlayer extends FootballPlayer {
    private int matchesPlayed;

    public LaLigaPlayer(String name, int goals, double salary, int matchesPlayed) {
        super(name, goals, salary);
        this.matchesPlayed = matchesPlayed;
    }

    // Implement abstract method
    @Override
    double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }

    @Override
    String getLeague() {
        return "LaLiga";
    }
}

// Premier League Player Class
class PremierLeaguePlayer extends FootballPlayer {
    private int matchesPlayed;

    public PremierLeaguePlayer(String name, int goals, double salary, int matchesPlayed) {
        super(name, goals, salary);
        this.matchesPlayed = matchesPlayed;
    }

    // Implement abstract method
    @Override
    double calculateGoalRate() {
        return (double) goals / matchesPlayed;
    }

    @Override
    String getLeague() {
        return "Premier League";
    }
}

// Football Class
public class Football {
    public static void main(String[] args) {

        // Messi LaLiga
        FootballPlayer messi =
                new LaLigaPlayer("Lionel Messi", 30, 5000000, 35);

        // Ronaldo Premier League
        FootballPlayer ronaldo =
                new PremierLeaguePlayer("Cristiano Ronaldo", 25, 4500000, 32);

        // Display details
        messi.displayInfo();
        ronaldo.displayInfo();
    }
}
