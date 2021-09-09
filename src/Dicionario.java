import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	public Map<String, String> map;
	
	String retorno;
	//token temporario para funcionar
	Valor valor;
	public void setValor(Chave chave, Valor valor) {
		map = new HashMap<String, String>();
		map.put(chave.chave, valor.word);
		System.out.println(map);
		
	}

	public void getValor(Chave chave) {
		System.out.println(map.get(chave.chave));
	}

	public void delValor(Chave chave) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}