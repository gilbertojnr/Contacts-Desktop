package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    ListView list;

    @FXML
    TextField enterName;

    @FXML
    TextField enterPhone;

    @FXML
    TextField enterEmail;


    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void addContact() {
        if (enterName.getText().isEmpty() | enterPhone.getText().isEmpty() | enterEmail.getText().isEmpty()) {

        } else {
            Contact c = new Contact(enterName.getText(), enterPhone.getText(), enterEmail.getText());
            contacts.add(c);
            enterName.setText("");
            enterPhone.setText("");
            enterEmail.setText("");
        }
    }

    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);

    }
}
