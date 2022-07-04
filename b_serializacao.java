import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exemplo {
	public static void main(String[] args) {
		
		ArrayList<Object> lista = new ArrayList();
		
		// Serialização 
		
		ObjectOutputStream objOutput = new ObjectOutputStream();
		FileOutputStream objFile = new FileOutputStream(objOutput);
		objFile.writeObject(lista);
		objFile.close();
		
		// Desserialização
		
		ObjectInputStream objInput = new ObjectInputStream();
		FileInputStream objInputFile = new FileInputStream(objInput);
		lista = (ArrayList<Object>)objInput.readObject();
		objInputFile.close();
	}
}