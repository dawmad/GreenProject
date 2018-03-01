/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kernel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *
 * @author student
 */
public class logowanieController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
     //   label.setText("Nie robi xD");
       
     
        // otwieram okno tutaj będzie system do logowania
        // trzeba jeszcze zamknąć to okno bo zostaje otwarte
        
            Stage stage = new Stage();      
            stage.setTitle("System zarządzania");
     
            Parent root = FXMLLoader.load(getClass().getResource("FXMLs/FXML_menu.fxml"));       
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
          
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
