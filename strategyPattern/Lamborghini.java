package strategyPattern;

import strategyPattern.DriveStrategy.SportsDriveStrategy;

public class Lamborghini extends Vehicle{

    public Lamborghini(){
        super(new SportsDriveStrategy());
    }
}
