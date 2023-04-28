package org.josesaldana.system;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author joser
 */

public class TableViewEjemplo extends Application {  

    private TableView<Persona> table = new TableView<Persona>();  
    private final ObservableList<Persona> data =  
        FXCollections.observableArrayList(  
            new Persona("Jose", "Mauricio", null,"Diaz" ,"Herrera"),  
            new Persona("Luisa", "Isabella", null,"Martinez" ,"Salazar"),  
            new Persona("Alan", "Gabriel", null,"Fernandez" ,"Estrada"),  
            new Persona("Diego", "Rene", null,"Arriola" ,"Ortiz"),  
            new Persona("Pablo", "Andres", null,"Mendez" ,"Sanchez")  
        );

    public static void main(String[] args) {  
        launch(args);  
    }  

    @Override  
    public void start(Stage stage) {  
        Scene scene = new Scene(new Group());  
        stage.setTitle("Table View Ejemplo");  

        final Label label = new Label("Control academico");  
        label.setFont(new Font("Arial", 20));  

        TableColumn nombre1Col = new TableColumn("Nombre1");  
        nombre1Col.setCellValueFactory(  
                new PropertyValueFactory<Persona, String>("Nombre1"));  

        TableColumn nombre2Col = new TableColumn("Nombre2");  
        nombre2Col.setCellValueFactory(  
                new PropertyValueFactory<Persona, String>("Nombre2"));  

        TableColumn nombre3Col = new TableColumn("Nombre3");  
        nombre3Col.setCellValueFactory(  
                new PropertyValueFactory<Persona, String>("Nombre3"));  
        
        TableColumn apellido1Col = new TableColumn("Apellido1");  
        apellido1Col.setCellValueFactory(  
                new PropertyValueFactory<Persona, String>("Apellido1")); 
        
        TableColumn apellido2Col = new TableColumn("Apellido2");  
        apellido2Col.setCellValueFactory(  
                new PropertyValueFactory<Persona, String>("Apellido2")); 

        table.setItems(data);
        table.getColumns().addAll(nombre1Col, nombre2Col, nombre3Col, apellido1Col, apellido2Col);  

        final VBox vbox = new VBox();  
        vbox.setSpacing(5);  
        vbox.setPadding(new Insets(10, 0, 0, 10));  
        vbox.getChildren().addAll(label, table);  

        ((Group) scene.getRoot()).getChildren().addAll(vbox);  

        stage.setScene(scene);  
        stage.show();  
    }  

    public static class Persona {  

        private final SimpleStringProperty nombre1;  
        private final SimpleStringProperty nombre2;  
        private final SimpleStringProperty nombre3;  
        private final SimpleStringProperty apellido1; 
        private final SimpleStringProperty apellido2; 

        private Persona(String nombre1, String nombre2, String nombre3, String apellido1, String apellido2) {  
            this.nombre1 = new SimpleStringProperty(nombre1);  
            this.nombre2 = new SimpleStringProperty(nombre2);  
            this.nombre3 = new SimpleStringProperty(nombre3);  
            this.apellido1 = new SimpleStringProperty(apellido1);
            this.apellido2 = new SimpleStringProperty(apellido2);
        }  

        public String getNombre1() {  
            return nombre1.get();  
        }  

        public void setNombre1(String nombre1) {  
            this.nombre1.set(nombre1);  
        }  

        public String getNombre2() {  
            return nombre2.get();  
        }  

        public void setNombre2(String nombre2) {  
            this.nombre2.set(nombre2);  
        }  

        public String getNombre3() {  
            return nombre3.get();  
        }  

        public void setNombre3(String nombre3) {  
            this.nombre3.set(nombre3);  
        }  
        
        public String getApellido1() {  
            return apellido1.get();  
        }  

        public void setApellido1(String apellido1) {  
            this.apellido1.set(apellido1);  
        } 
        
        public String getApellido2() {  
            return apellido2.get();  
        }  

        public void setApellido2(String apellido2) {  
            this.apellido2.set(apellido2);  
        } 
    }  
}
