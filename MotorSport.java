package patterns2;

import java.util.ArrayList;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class MotorSport implements Subject{
	
		private ArrayList<Observer> racing = new ArrayList<Observer>();
		
		public void regObserver(Observer observer) {
			this.racing.add(observer);
			
			
		}
		public void unregObserver(Observer observer) {
			this.racing.remove(observer);
		}
		@Override
		public void notifyObservers() {
			// TODO Auto-generated method stub
			this.racing.notify();
		}
	
}
	 
	

