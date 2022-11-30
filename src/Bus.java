public class Bus {
    private int lastStop;
    private int currentStop;
    private boolean goingToEnd;

    public Bus(int lastStop) {
        this.lastStop = lastStop;
        currentStop = 1;
        goingToEnd = true;
    }

    public void move() {
        if(isGoingForward()) {
            currentStop++;
        } else {
            currentStop--;
        }
    }

    public int getCurrentStop() {
        return currentStop;
    }

    private boolean isGoingForward() {
        if(currentStop == lastStop) {
            goingToEnd = false;
        } else if (currentStop == 1) {
            goingToEnd = true;
        }

        return goingToEnd;
    }
}
