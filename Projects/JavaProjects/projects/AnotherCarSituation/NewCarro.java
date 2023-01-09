package AnotherCarSituation;
public class NewCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro(1900, "Fusca", 35000);
		Carro carro2 = new Carro(1901, "BMW", 50000);
		Carro carro3 = new Carro(1902, "HighLux", 200000);
		
		//Localização na memória do carro 1, 2 e 3. Hexadecimal.
		//System.out.println(carro);
		//System.out.println(carro2);
		//System.out.println(carro3);
		System.out.println();
		
		System.out.println("==================================================");
		System.out.println("* Modelo do veiculo: "+carro1.getModelo());
		System.out.println("- Valor do carro: "+carro1.getPreco());
		System.out.println("* Ano do carro: "+carro1.getAno());
		System.out.println("- Localização na memória "+carro1);
		System.out.println("==================================================");
		
		System.out.println();
		
		System.out.println("==================================================");
		System.out.println("* Modelo do veiculo: "+carro2.getModelo());
		System.out.println("- Valor do carro: "+carro2.getPreco());
		System.out.println("* Ano do carro: "+carro2.getAno());
		System.out.println("- Localização na memória "+carro2);
		System.out.println("==================================================");
		
		System.out.println();
		
		System.out.println("==================================================");
		System.out.println("* Modelo do veiculo: "+carro3.getModelo());
		System.out.println("- Valor do carro: "+carro3.getPreco());
		System.out.println("* Ano do carro: "+carro3.getAno());
		System.out.println("- Localização na memória "+carro3);
		System.out.println("==================================================");
		
		System.out.println();
		
		System.out.println("Ao todo são "+Carro.total()+" De carros.");
		
	}

}
