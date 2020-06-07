package it.polito.tdp.demografia;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.demografia.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblStatus;

    @FXML
    private ProgressBar pbProgress;

    @FXML
    private ChoiceBox<?> boxCircPartenza;

    @FXML
    private Button btnElenca;

    @FXML
    private TextField txtLunghezza;

    @FXML
    private Button btnRicerca;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert pbProgress != null : "fx:id=\"pbProgress\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert boxCircPartenza != null : "fx:id=\"boxCircPartenza\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert btnElenca != null : "fx:id=\"btnElenca\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert txtLunghezza != null : "fx:id=\"txtLunghezza\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert btnRicerca != null : "fx:id=\"btnRicerca\" was not injected: check your FXML file 'Movimenti.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Movimenti.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
