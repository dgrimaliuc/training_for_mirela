package elevator_floors;

public class Lift {

    final int maxFloor = 9;
    private int currentFloor;

    public Lift() {
        currentFloor = 1;
    }

    public Lift(int currentFloor) {
        setCurrentFloor(currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        if (currentFloor > 0 && currentFloor <= maxFloor) {
            this.currentFloor = currentFloor;
        } else throw new IllegalArgumentException("Elevator floors are values between 1-" + maxFloor);

    }

    public void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException ignored) {
        }
    }

    public void move(int toFloor) {
        if (currentFloor < toFloor) {
            for (int i = currentFloor; i <= toFloor; i++) {
                sleep(1);
                System.out.println("Current Floor: " + i);
                currentFloor = i;
            }
        } else if (currentFloor > toFloor) {
                for (int i = currentFloor; i >= toFloor; i--) {
                    sleep(1);
                    System.out.println("Current Floor: " + i);
                    currentFloor = i;
                }
        }
        else {
            System.out.println("Current Floor: " + currentFloor);
        }
    }
}



