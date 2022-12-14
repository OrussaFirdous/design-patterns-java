package strategyPattern;

import strategyPattern.DriveStrategy.NormalDriveStrategy;

public class Toyota extends Vehicle{

    public Toyota(){
        super(new NormalDriveStrategy());
    }
}
