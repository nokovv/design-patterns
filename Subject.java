package patterns2;

import java.util.Observer;

@SuppressWarnings("deprecation")
public interface Subject {
	
	public void regObserver(Observer o);
    public void unregObserver(Observer o);
    public void notifyObservers();



}
