package main;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Observer> listeners = new ArrayList<Observer>();
	
	public void subscribe(Observer listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(Observer listener) {
		listeners.remove(listener);
	}
	
	public void notify(Observer typeListener, String message) {
		for (Observer listener : listeners) {
			if(listener.getClass().equals(typeListener.getClass()))
				listener.update(message);
		}

}
}