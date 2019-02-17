package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private GridPane myGrid;
    @FXML
    private Text txt0;
    @FXML
    private Text txt1;
    @FXML
    private Text txt2;
    @FXML
    private Text txt3;
    @FXML
    private Text txt4;
    @FXML
    private Text txt5;
    @FXML
    private Text txt6;
    @FXML
    private Text txt7;
    @FXML
    private Text txt8;

    @FXML
    private void initialize(){
        txt0.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        txt5.setVisible(false);
        txt6.setVisible(false);
        txt7.setVisible(false);
        txt8.setVisible(false);
    }

    @FXML
    private void playOnTurn(){

    }

    private void changeText(Integer col, Integer row){

    }

}
