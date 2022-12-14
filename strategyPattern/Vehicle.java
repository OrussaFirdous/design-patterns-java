package strategyPattern;

import strategyPattern.DriveStrategy.IDriveStrategy;

public class Vehicle {

    private final IDriveStrategy driveStrategy;

    public Vehicle(IDriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
