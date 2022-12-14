package observerPattern.observer;

import observerPattern.observable.IStockObservable;

public class MobileNotificationObserver implements INotificationObserver {
    IStockObservable stockObservable;
    private String number;

    public MobileNotificationObserver(IStockObservable stockObservable,String number){
        this.stockObservable=stockObservable;
        this.number=number;
    }

    @Override
    public void update() {
        System.out.println("Message sent to " + number);
    }
}
