package poker;

import java.util.HashMap;
import java.util.Iterator;

public class PokerStatus {

	HashMap<Character,Integer> m;
	
	public PokerStatus() {
		m = new HashMap<Character,Integer>();
	}
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {

		String hv = this.getHandValues(c1,c2,c3,c4,c5);
		return this.esPoker(hv);
		
	}

	private boolean esPoker(String hv) {
		this.clearMSet();
		for(int i=0; i < hv.length();i++) {
			this.addMSet(hv.charAt(i));
		}
		return this.hayPokerEnMSet(); 
	}

	private boolean hayPokerEnMSet() {
		Iterator<Character> i = m.keySet().iterator();
		while(i.hasNext()) {
			Character c = i.next();
			if(m.get(c) >= 4) {
				return true;
			}
		}
		return false;
	}

	private void addMSet(Character s) {
		
		m.put(s, m.getOrDefault(s, 0) + 1);
		System.out.println(m.get(s));
		
	}

	private void clearMSet() {
		m.clear();
	}

	private String getHandValues(String c1, String c2, String c3, String c4, String c5) {
		return "" + c1.charAt(0) + c2.charAt(0) + c3.charAt(0) + c4.charAt(0) + c5.charAt(0);
	}

}
