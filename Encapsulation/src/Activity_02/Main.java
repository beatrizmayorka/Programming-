package Activity_02;

public class Main {

	public static void main(String[] args) {
		
		Elevator firstElevator = new Elevator(11, 14);
	
		firstElevator.addPerson(); // Add 1 person in the elevator.
		firstElevator.addPerson(); // Add 1 person in the elevator.
		firstElevator.addPerson(); // Add 1 person in the elevator.
		firstElevator.addPerson(); // Final number of people inside the elevator.
		
		firstElevator.removePerson(); // Remove 1 person from the elevator.
		firstElevator.removePerson(); // Final number of people inside the elevator.
		
		
		firstElevator.elevatorUp(); // Elevator goes up to the first floor.
		firstElevator.elevatorUp();	// Elevator goes up to the second floor.
		firstElevator.elevatorUp(); // Elevator goes up to the third floor.
		firstElevator.elevatorUp(); // Current elevator floor.
		
		firstElevator.elevatorDown(); // Elevator goes down to the third floor.
		firstElevator.elevatorDown(); // Elevator goes down to the second floor.
		firstElevator.elevatorDown(); // Elevator goes down to the first floor
		firstElevator.elevatorDown(); // Current elevator floor (ground).
	}

}