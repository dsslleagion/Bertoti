

import java.util.ArrayList;
import java.util.List;

public class Governo implements Politicos {
	public List<Politicos> governo = new ArrayList<Politicos>();
	
	public void add(Politicos politicos) {
		governo.add(politicos);
	}
	
	public void remove(Politicos politicos) {
		governo.remove(politicos);
	}
	
	public void executarOrdem(String ordem) {
		for(Politicos membro : governo) {
			membro.executarOrdem(ordem);
		}
	}

}