package Activity_02;

public class Elevator {
	private int currentFloor;
	private int totalFloors;
	private int numberOfPeople;
	private int capacity;

		public Elevator(int totalFloors, int capacity) {
			this.totalFloors = totalFloors;
			this.capacity = capacity;
		}

		public int getCurrentFloor() {
			return this.currentFloor;
		}

		public int getTotalFloors() {
			return this.totalFloors;
		}

		public int getnumberOfPeople() {
			return this.numberOfPeople;
		}

		public int getCapacity() {
			return this.capacity;
		}

		public void addPerson() {
			if (this.numberOfPeople <= this.capacity) {
				this.numberOfPeople++;
				System.out.printf("\n Number of people in the elevator: %d.\n", this.numberOfPeople);
			}	
		}

		public void removePerson() {
			if (this.numberOfPeople > 0) {
				this.numberOfPeople--;
				System.out.printf("\n Number of people in the elevator: %d.\n", this.numberOfPeople);
			}
		}

		public void elevatorUp() {
			if (this.currentFloor < this.totalFloors) {
				this.currentFloor++;
				System.out.printf("\n Elevator goes up to: %d floor.\n", this.currentFloor);
			}
		}

		public void elevatorDown() {
			if (this.currentFloor > 0) {
				this.currentFloor--;
				System.out.printf("\n Elevator goes down to: %d floor.\n", this.currentFloor);
			}
		}

}