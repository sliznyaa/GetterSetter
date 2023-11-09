public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", 15, 7, 1990, "john@example.com", "+1234567890");
        user1.setSurname("Doe");
        user1.setWeight(70.5);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(10000);
        user1.printAccountInfo();

        FitnessTracker user2 = new FitnessTracker("Bob", 10, 9, 1995, "bob@example.com", "+1122334455");
        user2.setSurname("Smith");
        user2.setWeight(80.0);
        user2.setBloodPressure("130/90");
        user2.setStepsPerDay(12000);
        user2.printAccountInfo();

        FitnessTracker user3 = new FitnessTracker("Alice", 20, 5, 1985, "alice@example.com", "+9876543210");
        user3.setSurname("Johnson");
        user3.setWeight(65.2);
        user3.setBloodPressure("110/70");
        user3.setStepsPerDay(8000);
        user3.printAccountInfo();
    }
}
