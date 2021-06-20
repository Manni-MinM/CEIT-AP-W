package calculator ;

import java.lang.Math ;

import java.net.URL ;

import java.util.ResourceBundle ;

import javafx.fxml.FXML ;
import javafx.scene.control.* ;
import javafx.event.ActionEvent ;
import javafx.fxml.Initializable ;

/**
 * The Controller Class
 *
 * @author Manni Moghimi
 * @version v1.0
 */
public class Controller implements Initializable {
	@FXML
	private Button cos ;
	@FXML
	private Button addition ;
	@FXML
	private Button sin ;
	@FXML
	private Button seven ;
	@FXML
	private Button eight ;
	@FXML
	private Button nine ;
	@FXML
	private Button subtraction ;
	@FXML
	private Button four ;
	@FXML
	private Button five ;
	@FXML
	private Button six ;
	@FXML
	private Button multiplication ;
	@FXML
	private Button zero ;
	@FXML
	private Button tan ;
	@FXML
	private Button equals ;
	@FXML
	private Button division ;
	@FXML
	private Button clear ;
	@FXML
	private Button power ;
	@FXML
	private Button one ;
	@FXML
	private Button two ;
	@FXML
	private Button three ;
	@FXML
	private TextField display ;

	double data = 0.0 ;
	String answer = "" ;
	String operation = "" ;

	/**
	 * Handles button actions
	 *
	 * @param event The event
	 */
	public void handleButtonAction(ActionEvent event) {
		if ( event.getSource() == one ) {
			display.setText(display.getText() + "1") ;
		} else if ( event.getSource() == two ) {
			display.setText(display.getText() + "2") ;
		} else if ( event.getSource() == three ) {
			display.setText(display.getText() + "3") ;
		} else if ( event.getSource() == four ) {
			display.setText(display.getText() + "4") ;
		} else if ( event.getSource() == five ) {
			display.setText(display.getText() + "5") ;
		} else if ( event.getSource() == six ) {
			display.setText(display.getText() + "6") ;
		} else if ( event.getSource() == seven ) {
			display.setText(display.getText() + "7") ;
		} else if ( event.getSource() == eight ) {
			display.setText(display.getText() + "8") ;
		} else if ( event.getSource() == nine ) {
			display.setText(display.getText() + "9") ;
		} else if ( event.getSource() == zero ) {
			display.setText(display.getText() + "0") ;
		} else if ( event.getSource() == clear ) {
			display.setText("") ;
		} else if ( event.getSource() == addition ) {
			data = Double.parseDouble(display.getText()) ;
			operation = "addition" ;
			display.setText("") ;
		} else if ( event.getSource() == subtraction ) {
			data = Double.parseDouble(display.getText()) ;
			operation = "subtraction" ;
			display.setText("") ;
		} else if ( event.getSource() == multiplication ) {
			data = Double.parseDouble(display.getText()) ;
			operation = "multiplication" ;
			display.setText("") ;
		} else if ( event.getSource() == division ) {
			data = Double.parseDouble(display.getText()) ;
			operation = "division" ;
			display.setText("") ;
		} else if ( event.getSource() == power ) {
			data = Double.parseDouble(display.getText()) ;
			operation = "power";
			display.setText("");
		} else if ( event.getSource() == sin ) {
			data = Double.parseDouble(display.getText()) ;
			answer = String.valueOf(Math.sin(data)) ;
			display.setText(answer) ;
		} else if ( event.getSource() == cos ) {
			data = Double.parseDouble(display.getText()) ;
			answer = String.valueOf(Math.cos(data)) ;
			display.setText(answer) ;
		} else if ( event.getSource() == tan ) {
			data = Double.parseDouble(display.getText()) ;
			answer = String.valueOf(Math.tan(data)) ;
			display.setText(answer) ;
		} else if ( event.getSource() == equals ) {
			double number = Double.parseDouble(display.getText()) ;
			if ( operation.equals("addition") ) {
				answer = String.valueOf(data + number) ;
			} else if ( operation.equals("subtraction") ) {
				answer = String.valueOf(data - number) ;
			} else if ( operation.equals("multiplication") ) {
				answer = String.valueOf(data * number) ;
			} else if ( operation.equals("division") ) {
				if ( number == 0.0 ) {
					answer = "Division By Zero" ;
				} else {
					answer = String.valueOf(data / number) ;
				}
			} else if ( operation.equals("power") ) {
				answer = String.valueOf(Math.pow(data , number)) ;
			} else {
				// Pass
			}
			display.setText(answer) ;
			answer = "" ;
			operation = "" ;
		}
	}
	@Override
	/**
	 * Initializes the Controller
	 *
	 * @param url The url
	 * @param resourceBundle The resource Bundle
	 */
	public void initialize(URL url , ResourceBundle resourceBundle) {
		// PASS
	}
}
