package Question4;

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract double accelerate();
    
    public double getCurrentSpeed () {
        return currentSpeed;
    }
    
    public double getMaxSpeed () {
        return maxSpeed;
    }
    
    public void pedalToTheMedal () {
        while(currentSpeed == maxSpeed) {
            accelerate();
        }
    }
}