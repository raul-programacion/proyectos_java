/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendafx3;

import Persona.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author adminprofe
 */
public class FXMLVistaController implements Initializable {
    
    @FXML private Button aniadirBT;
    @FXML private Button modificarBT;
    @FXML private Button eliminarBT;
    @FXML private Button nuevoBT;
    
    // Declaramos los textfileds
    @FXML private TextField nombreTF;
    @FXML private TextField apellidoTF;
    @FXML private TextField edadTF;
    @FXML private TextField telefonoTF;
    
    // Declaramos la tabla y las columnas
    @FXML private TableView<Persona> tablaPersonas;
    @FXML private TableColumn nombreCL;
    @FXML private TableColumn apellidoCL;
    @FXML private TableColumn edadCL;
    @FXML private TableColumn telefonoCL;
    ObservableList<Persona> personas;
    
    private int posicionPersonaEnTabla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
