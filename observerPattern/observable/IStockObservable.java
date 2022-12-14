package observerPattern.observable;

import observerPattern.observer.INotificationObserver;

public interface IStockObservable {
    void add(INotificationObserver observer);
    void remove(INotificationObserver observer);
    void notifyObservers();
    void setData(int stock);
}
