package heranca;

import java.util.ArrayList;
import java.util.List;

public class AppNavio {

	public static void main(String[] args) {

		List<NavioGraneleiro> navioGraneleiro = new ArrayList<NavioGraneleiro>();
		List<NavioContainer> navioContainer = new ArrayList<NavioContainer>();

		navioGraneleiro.add(new NavioGraneleiro(10, "Estrela do Mar", 4, 50000, 4));
		navioGraneleiro.add(new NavioGraneleiro(25, "Cruzeiro do Sul", 3, 80000, 6));

		navioContainer.add(new NavioContainer(33, "Bela Fera", 2, 100000, 2, 30));
		navioContainer.add(new NavioContainer(48, "Arrecifes", 2, 120000, 2, 30));
		navioContainer.add(new NavioContainer(52, "Águas Belas", 1, 90000, 0, 25));
		
		//System.out.println(navioGraneleiro);
		//System.out.println(navioContainer);

	}

}
