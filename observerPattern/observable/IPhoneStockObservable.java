package observerPattern.observable;

import observerPattern.observer.INotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements IStockObservable {
    private List<INotificationObserver> notificationObservers;
    private int stockCount;

    public IPhoneStockObservable(){
        this.notificationObservers = new ArrayList<>();
        this.stockCount = 0;
    }

    @Override
    public void add(INotificationObserver observer) {
        notificationObservers.add(observer);
    }

    @Override
    public void remove(INotificationObserver observer) {
        notificationObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(INotificationObserver observer : notificationObservers ){
            observer.update();
        }
    }

    @Override
    public void setData(int stock) {
        if(this.stockCount == 0){
            notifyObservers();
        }
        stockCount=stock;
    }
}
