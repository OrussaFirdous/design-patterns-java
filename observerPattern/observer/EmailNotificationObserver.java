package observerPattern.observer;

import observerPattern.observable.IStockObservable;

public class EmailNotificationObserver implements  INotificationObserver{

    IStockObservable stockObservable;
    String emailAddress;

    public EmailNotificationObserver(IStockObservable stockObservable,String emailAddress){
        this.stockObservable=stockObservable;
        this.emailAddress=emailAddress;
    }

    @Override
    public void update() {
        System.out.println("Email sent to : " + emailAddress);
    }
}
