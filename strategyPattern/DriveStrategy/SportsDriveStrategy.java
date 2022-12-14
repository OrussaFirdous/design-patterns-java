package strategyPattern.DriveStrategy;

public class SportsDriveStrategy implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Functionality!");
    }
}
