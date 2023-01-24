package UltimoTRyEnClase.Calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn9;

    @FXML
    private Button btn6;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnMultipy;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btn0;

    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnAdd;

    @FXML
    private Label label;
    private String[] texto= {"",null,""};
    private String operando= null;

    @FXML
    void click(ActionEvent event) {
    	Button btn = (Button) event.getSource();
    	textoConsola(btn.getText());
    }
	private void textoConsola(String text) {
	if(texto[1] == null) {
		texto[0] += text;
	}
	else {
		texto[2] += text;
	}
	mostrar();
}

    @FXML
    void clickDecimal(ActionEvent event) {
    	if(texto[1] == null) {
    		if(texto[0].indexOf(',')== -1) texto[0]+=".";
    	}
    	else {
    		if(texto[2].indexOf(',')== -1) texto[2]+=".";
    	}
    	mostrar();
    }

    @FXML
    void clickOperation(ActionEvent event) {
    	Button btn = (Button) event.getSource();
    	if(btn.getText().equals("=")) {
    		if(texto[1]!=null && texto[2].length()>0)operar();
    	}
    	else {
    		texto[1] = " "+btn.getText()+" ";
    		System.out.println(texto[1]);
    		mostrar();
    	}
    	
    }
    private void operar() {
    	double num1 = Double.valueOf(texto[0]);
    	double num2 = Double.valueOf(texto[2]);
    	if(texto[1].equals(" + "))label.setText(String.valueOf((num1 + num2)));
    	if(texto[1].equals(" - "))label.setText(String.valueOf((num1 - num2)));
    	if(texto[1].equals(" * "))label.setText(String.valueOf((num1 * num2)));
    	if(texto[1].equals(" / "))label.setText(String.valueOf((num1 / num2)));
    	texto[0]="";
    	texto[1]= null;
    	texto[2]="";
	}
    
	void mostrar() {
    	String pantalla=texto[0];
    	if(texto[1]!=null) pantalla+= texto[1];
    	if(texto[2]!=null) pantalla+= texto[2];
    	label.setText(pantalla);
    }
	    

}
