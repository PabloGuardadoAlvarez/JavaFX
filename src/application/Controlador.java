package application;
import javafx.scene.control.*;
import javafx.fxml.FXML;;

public class Controlador {
	
	@FXML
	private Button botonsumar;
	@FXML
	private Button restar;
	@FXML
	private Button dividir;
	
	@FXML
	private TextField primernumero;
	
	@FXML 
	private TextField segundonumero;
	
	@FXML 
	private TextField tercernumero;
	
	
	@FXML
	
	public void initialize() {
		
		
	}
	
	public void sumar() {
		
		int aux1 = Integer.parseInt(primernumero.getText());
		
		int aux2 = Integer.parseInt(segundonumero.getText());
		
		int aux3 = aux1 + aux2;
		
		tercernumero.setText(String.valueOf(aux3));
	}
	
	public void restar() {
		
		int aux1 = Integer.parseInt(primernumero.getText());
		
		int aux2 = Integer.parseInt(segundonumero.getText());
		
		int aux3 = aux1 - aux2;
		
		tercernumero.setText(String.valueOf(aux3));
		
	}
	
	public void dividir() {

		int aux1 = Integer.parseInt(primernumero.getText());
		
		int aux2 = Integer.parseInt(segundonumero.getText());
		
		int aux3 = aux1 / aux2;
		
		tercernumero.setText(String.valueOf(aux3));
		
	}
	
	

}
