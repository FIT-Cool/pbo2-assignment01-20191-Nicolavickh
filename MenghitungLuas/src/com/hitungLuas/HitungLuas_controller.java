// made by Nicolavickh Yohanes 1772016

package com.hitungLuas;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HitungLuas_controller {
    public TextField length;
    public TextField width;
    public TextField rad;
    public TextField height;
    public boolean kel;
    public String choose;
    int l, w, h, r;
    double A, C;

    public void countSquare(ActionEvent actionEvent) {
        width.setEditable(true);
        height.setEditable(true);
        rad.setEditable(false);
        length.setEditable(false);
        width.setDisable(false);
        height.setDisable(false);
        rad.setDisable(true);
        length.setDisable(true);
        choose = "square";
        kel = true;
        length.setText("");
        width.setText("");
        height.setText("");
        rad.setText("");

    }

    public void countBall(ActionEvent actionEvent) {
        width.setEditable(false);
        length.setEditable(false);
        height.setEditable(false);
        rad.setEditable(true);
        width.setDisable(true);
        length.setDisable(true);
        height.setDisable(true);
        rad.setDisable(false);
        choose = "ball";
        kel = false;
        length.setText("");
        width.setText("");
        height.setText("");
        rad.setText("");
    }

    public void countTube(ActionEvent actionEvent) {
        width.setEditable(false);
        length.setEditable(false);
        rad.setEditable(true);
        height.setEditable(true);
        width.setDisable(true);
        length.setDisable(true);
        rad.setDisable(false);
        height.setDisable(false);
        choose = "tube";
        kel = false;
        length.setText("");
        width.setText("");
        height.setText("");
        rad.setText("");
    }

    public void submit(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (choose.equals("square")){
            h = Integer.parseInt(height.getText());
            w = Integer.parseInt(width.getText());
            A = w * h;
            C = 2*(w+h);
        }
        else if (choose.equals("ball")){
            r = Integer.parseInt(rad.getText());
            A = 4*Math.PI*Math.pow(r,2);
            C = (4/3)*Math.PI*Math.pow(r,3);
        }
        else if (choose.equals("tube")){
            r = Integer.parseInt(rad.getText());
            h = Integer.parseInt(height.getText());
            A = 2 * Math.PI * r * (r + h);
            C = Math.PI*Math.pow(r,2)*h;
        }
        if (kel){
            alert.setContentText("Area: "+A+", Circumference: "+C);
        }
        else
        {
            alert.setContentText("Surface Area: " + A + ", Volume: " + C);
        }
        alert.show();
    }
}
