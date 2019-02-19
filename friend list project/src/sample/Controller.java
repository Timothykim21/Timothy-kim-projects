package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class Controller {
    public TextField textGetusername;
    public TextField textGetfirstname;
    public TextField textGetlastname;
    public ListView<Friend> Friendlist;
    public Label lblFirst;
    public Label lblLast;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textGetusername.getText(), textGetfirstname.getText(), textGetlastname.getText());
        Friendlist.getItems().add(temp);
        textGetlastname.clear();
        textGetfirstname.clear();
        textGetusername.clear();
    }



    public void deleteFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = Friendlist.getSelectionModel().getSelectedItem();
        Friendlist.getItems().remove(temp);
        lblFirst.setText("");
        lblLast.setText("");
    }

    public void Displayfriend(javafx.scene.input.MouseEvent mouseEvent) {
        Friend temp;
        temp = Friendlist.getSelectionModel().getSelectedItem();
        lblFirst.setText(temp.firstName);
        lblLast.setText(temp.lastName);

    }
}
