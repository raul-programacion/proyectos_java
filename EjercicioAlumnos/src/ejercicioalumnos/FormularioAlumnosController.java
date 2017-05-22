/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnos;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Alumno;
import modelo.Carrera;
import modelo.CentroEstudio;
import modelo.Conexion;

public class FormularioAlumnosController implements Initializable{
    
    //Componentes GUI
    @FXML private ComboBox<Carrera> cmbCarrera;
    @FXML private ComboBox<CentroEstudio> cmbCentroEstudio;
    
    
    //Colecciones
    private ObservableList<Carrera> listaCarreras;
    private ObservableList<CentroEstudio> listaCentrosEstudios;
    
    
    private Conexion conexion;
    
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		conexion = new Conexion();
		conexion.establecerConexion();

		//Inicializar listas
		listaCarreras = FXCollections.observableArrayList();
		listaCentrosEstudios = FXCollections.observableArrayList();

		//Llenar listas
		Carrera.llenarInformacion(conexion.getConnection(), listaCarreras);
		CentroEstudio.llenarInformacion(conexion.getConnection(), listaCentrosEstudios);
                

		//Enlazar listas con ComboBox y TableView
		cmbCarrera.setItems(listaCarreras);
		cmbCentroEstudio.setItems(listaCentrosEstudios);

		
		conexion.cerrarConexion();
	}
	
}