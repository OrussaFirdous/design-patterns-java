package observerPattern;

import observerPattern.observable.IPhoneStockObservable;
import observerPattern.observable.IStockObservable;
import observerPattern.observer.EmailNotificationObserver;
import observerPattern.observer.INotificationObserver;
import observerPattern.observer.MobileNotificationObserver;

public class Main {
    public static void main(String[] args) {

        IStockObservable iPhoneObservable = new IPhoneStockObservable();

        INotificationObserver observer1 = new EmailNotificationObserver(iPhoneObservable,"oru@gmail.com");
        INotificationObserver observer2 = new MobileNotificationObserver(iPhoneObservable,"1234567890");

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);

        iPhoneObservable.setData(78);
    }
}
