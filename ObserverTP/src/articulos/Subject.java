package articulos;

import java.util.List;
import java.util.ArrayList;

/**
 * Como observable pero sin concurrencia y sin
 * la implementacion completa. Es un parche
 * para que no me tiré warnings. Se puede
 * reemplazar perfectamente por la clase deprecada
 * observable.
 * 
 * @author fercho
 *
 */
public abstract class Subject {

	List<Observer> o;
	
	public Subject() {
		o = new ArrayList<Observer>();
	}
	
	public Subject Attach(Observer ob){
		o.add(ob);
		return this;
	}
	
	public Subject Detach(Observer ob) {
		o.remove(ob);
		return this;
	}
	
	public void notifyObservers(Object arg) {
		o.stream().forEach(ob -> ob.update(arg));
	}
}
