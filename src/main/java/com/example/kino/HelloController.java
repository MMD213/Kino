package com.example.kino;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private Button butto1n1;

    @FXML
    private Button butto1n10;

    @FXML
    private Button butto1n11;

    @FXML
    private Button butto1n12;

    @FXML
    private Button butto1n2;

    @FXML
    private Button butto1n3;

    @FXML
    private Button butto1n4;

    @FXML
    private Button butto1n5;

    @FXML
    private Button butto1n6;

    @FXML
    private Button butto1n7;

    @FXML
    private Button butto1n8;

    @FXML
    private Button butto1n9;

    @FXML
    private Button butto2n1;

    @FXML
    private Button butto2n10;

    @FXML
    private Button butto2n11;

    @FXML
    private Button butto2n12;

    @FXML
    private Button butto2n2;

    @FXML
    private Button butto2n3;

    @FXML
    private Button butto2n4;

    @FXML
    private Button butto2n5;

    @FXML
    private Button butto2n6;

    @FXML
    private Button butto2n7;

    @FXML
    private Button butto2n8;

    @FXML
    private Button butto2n9;

    @FXML
    private Button butto3n1;

    @FXML
    private Button butto3n10;

    @FXML
    private Button butto3n11;

    @FXML
    private Button butto3n12;

    @FXML
    private Button butto3n2;

    @FXML
    private Button butto3n3;

    @FXML
    private Button butto3n4;

    @FXML
    private Button butto3n5;

    @FXML
    private Button butto3n6;

    @FXML
    private Button butto3n7;

    @FXML
    private Button butto3n8;

    @FXML
    private Button butto3n9;

    @FXML
    private Button butto4n1;

    @FXML
    private Button butto4n10;

    @FXML
    private Button butto4n11;

    @FXML
    private Button butto4n12;

    @FXML
    private Button butto4n2;

    @FXML
    private Button butto4n3;

    @FXML
    private Button butto4n4;

    @FXML
    private Button butto4n5;

    @FXML
    private Button butto4n6;

    @FXML
    private Button butto4n7;

    @FXML
    private Button butto4n8;

    @FXML
    private Button butto4n9;

    @FXML
    private Button butto5n1;

    @FXML
    private Button butto5n10;

    @FXML
    private Button butto5n11;

    @FXML
    private Button butto5n12;

    @FXML
    private Button butto5n2;

    @FXML
    private Button butto5n3;

    @FXML
    private Button butto5n4;

    @FXML
    private Button butto5n5;

    @FXML
    private Button butto5n6;

    @FXML
    private Button butto5n7;

    @FXML
    private Button butto5n8;

    @FXML
    private Button butto5n9;

    @FXML
    private Button butto6n1;

    @FXML
    private Button butto6n10;

    @FXML
    private Button butto6n11;

    @FXML
    private Button butto6n12;

    @FXML
    private Button butto6n2;

    @FXML
    private Button butto6n3;

    @FXML
    private Button butto6n4;

    @FXML
    private Button butto6n5;

    @FXML
    private Button butto6n6;

    @FXML
    private Button butto6n7;

    @FXML
    private Button butto6n8;

    @FXML
    private Button butto6n9;

    @FXML
    private Button butto7n1;

    @FXML
    private Button butto7n10;

    @FXML
    private Button butto7n11;

    @FXML
    private Button butto7n12;

    @FXML
    private Button butto7n2;

    @FXML
    private Button butto7n3;

    @FXML
    private Button butto7n4;

    @FXML
    private Button butto7n5;

    @FXML
    private Button butto7n6;

    @FXML
    private Button butto7n7;

    @FXML
    private Button butto7n8;

    @FXML
    private Button butto7n9;

    @FXML
    private Button butto8n1;

    @FXML
    private Button butto8n10;

    @FXML
    private Button butto8n11;

    @FXML
    private Button butto8n12;

    @FXML
    private Button butto8n2;

    @FXML
    private Button butto8n3;

    @FXML
    private Button butto8n4;

    @FXML
    private Button butto8n5;

    @FXML
    private Button butto8n6;

    @FXML
    private Button butto8n7;

    @FXML
    private Button butto8n8;

    @FXML
    private Button butto8n9;

    @FXML
    private Button canm;

    @FXML
    private Button rev;
    int[] nam = new int[96];
    ArrayList<Button> activno = new ArrayList<>();
    ArrayList<Button> buttons = new ArrayList<>();

    @FXML
    void initialize() {
        for (int i = 0; i < nam.length; i++) {
            nam[i] = 0;
        }
        buttons.add(butto1n1);
        buttons.add(butto1n2);
        buttons.add(butto1n3);
        buttons.add(butto1n4);
        buttons.add(butto1n5);
        buttons.add(butto1n6);
        buttons.add(butto1n7);
        buttons.add(butto1n8);
        buttons.add(butto1n9);
        buttons.add(butto1n10);
        buttons.add(butto1n11);
        buttons.add(butto1n12);
        buttons.add(butto2n1);
        buttons.add(butto2n2);
        buttons.add(butto2n3);
        buttons.add(butto2n4);
        buttons.add(butto2n5);
        buttons.add(butto2n6);
        buttons.add(butto2n7);
        buttons.add(butto2n8);
        buttons.add(butto2n9);
        buttons.add(butto2n10);
        buttons.add(butto2n11);
        buttons.add(butto2n12);
        buttons.add(butto3n1);
        buttons.add(butto3n2);
        buttons.add(butto3n3);
        buttons.add(butto3n4);
        buttons.add(butto3n5);
        buttons.add(butto3n6);
        buttons.add(butto3n7);
        buttons.add(butto3n8);
        buttons.add(butto3n9);
        buttons.add(butto3n10);
        buttons.add(butto3n11);
        buttons.add(butto3n12);
        buttons.add(butto4n1);
        buttons.add(butto4n2);
        buttons.add(butto4n3);
        buttons.add(butto4n4);
        buttons.add(butto4n5);
        buttons.add(butto4n6);
        buttons.add(butto4n7);
        buttons.add(butto4n8);
        buttons.add(butto4n9);
        buttons.add(butto4n10);
        buttons.add(butto4n11);
        buttons.add(butto4n12);
        buttons.add(butto5n1);
        buttons.add(butto5n2);
        buttons.add(butto5n3);
        buttons.add(butto5n4);
        buttons.add(butto5n5);
        buttons.add(butto5n6);
        buttons.add(butto5n7);
        buttons.add(butto5n8);
        buttons.add(butto5n9);
        buttons.add(butto5n10);
        buttons.add(butto5n11);
        buttons.add(butto5n12);
        buttons.add(butto6n1);
        buttons.add(butto6n2);
        buttons.add(butto6n3);
        buttons.add(butto6n4);
        buttons.add(butto6n5);
        buttons.add(butto6n6);
        buttons.add(butto6n7);
        buttons.add(butto6n8);
        buttons.add(butto6n9);
        buttons.add(butto6n10);
        buttons.add(butto6n11);
        buttons.add(butto6n12);
        buttons.add(butto7n1);
        buttons.add(butto7n2);
        buttons.add(butto7n3);
        buttons.add(butto7n4);
        buttons.add(butto7n5);
        buttons.add(butto7n6);
        buttons.add(butto7n7);
        buttons.add(butto7n8);
        buttons.add(butto7n9);
        buttons.add(butto7n10);
        buttons.add(butto7n11);
        buttons.add(butto7n12);
        buttons.add(butto8n1);
        buttons.add(butto8n2);
        buttons.add(butto8n3);
        buttons.add(butto8n4);
        buttons.add(butto8n5);
        buttons.add(butto8n6);
        buttons.add(butto8n7);
        buttons.add(butto8n8);
        buttons.add(butto8n9);
        buttons.add(butto8n10);
        buttons.add(butto8n11);
        buttons.add(butto8n12);

        for (Button button : buttons) {
            button.setOnAction(e -> {
                button.setStyle("-fx-background-color: green");
                activno.add(button);
            });
        }
    }
    @FXML
    void del(ActionEvent event) {
    for(int i=0;i<activno.size();i++){
    activno.get(i).setStyle("");
    activno.get(i).setDisable(false);
        }
    }

    @FXML
    void podtverdit(ActionEvent event) {
        for(int i=0;i<activno.size();i++){
            activno.get(i).setStyle("-fx-background-color: red");
            activno.get(i).setDisable(true);
        }
    }

    @FXML
    void proceNum(ActionEvent event) {


    }
    }


