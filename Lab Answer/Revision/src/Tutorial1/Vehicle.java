
package Tutorial1;

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public double getCurrent(){
        return currentSpeed;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void pedalToMetal() {
        while(currentSpeed<maxSpeed){
            accelerate();
        }
    }
}
