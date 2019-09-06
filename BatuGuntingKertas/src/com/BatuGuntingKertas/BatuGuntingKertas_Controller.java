// made by Nicolavickh Yohanes 1772016

package com.BatuGuntingKertas;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class BatuGuntingKertas_Controller {
    public TextField txtLose;
    public TextField txtDraw;
    public TextField txtWin;
    public ImageView userChoose = new ImageView();
    public ImageView compChoose = new ImageView();
    public Random random = new Random();
    public int win = 0, lose = 0, draw = 0;

    public String gambarRandom ()
    {
        int n = random.nextInt(3);
        String gambar="";
        if (n == 0)
        {
            gambar = "com/BatuGuntingKertas/batu.jpg";
        }
        else if (n == 1)
        {
            gambar = "com/BatuGuntingKertas/gunting.jpg";
        }
        else if (n == 2)
        {
            gambar = "com/BatuGuntingKertas/kertas.jpg";
        }
        return (gambar);
    }

    public void match(String user, String comp)
    {
        if (user.equals("com/BatuGuntingKertas/kertas.jpg") && comp.equals("com/BatuGuntingKertas/batu.jpg"))
        {
            win += 1;
        }
        else if (user.equals("com/BatuGuntingKertas/kertas.jpg") && comp.equals("com/BatuGuntingKertas/gunting.jpg"))
        {
            lose += 1;
        }
        else if (user.equals("com/BatuGuntingKertas/gunting.jpg") && comp.equals("com/BatuGuntingKertas/batu.jpg"))
        {
            lose += 1;
        }
        else if (user.equals("com/BatuGuntingKertas/gunting.jpg") && comp.equals("com/BatuGuntingKertas/kertas.jpg"))
        {
            win += 1;
        }
        else if (user.equals("com/BatuGuntingKertas/batu.jpg") && comp.equals("com/BatuGuntingKertas/gunting.jpg"))
        {
            win += 1;
        }
        else if (user.equals("com/BatuGuntingKertas/batu.jpg") && comp.equals("com/BatuGuntingKertas/kertas.jpg"))
        {
            lose += 1;
        }
        else
        {
            draw += 1;
        }
    }

    public void paper(ActionEvent actionEvent) {
        String gambar="";
        userChoose.setImage(new Image("com/BatuGuntingKertas/kertas.jpg"));
        gambar = gambarRandom();
        compChoose.setImage(new Image(gambar));
        match("com/BatuGuntingKertas/kertas.jpg",gambar);
        txtDraw.setText(Integer.toString(draw));
        txtLose.setText(Integer.toString(lose));
        txtWin.setText(Integer.toString(win));

    }

    public void rock(ActionEvent actionEvent) {
        String gambar="";
        userChoose.setImage(new Image("com/BatuGuntingKertas/batu.jpg"));
        gambar = gambarRandom();
        compChoose.setImage(new Image(gambar));
        match("com/BatuGuntingKertas/batu.jpg",gambar);
        txtDraw.setText(Integer.toString(draw));
        txtLose.setText(Integer.toString(lose));
        txtWin.setText(Integer.toString(win));
    }

    public void scissors(ActionEvent actionEvent) {

        String gambar="";
        userChoose.setImage(new Image("com/BatuGuntingKertas/gunting.jpg"));
        gambar = gambarRandom();
        compChoose.setImage(new Image(gambar));
        match("com/BatuGuntingKertas/gunting.jpg",gambar);
        txtDraw.setText(Integer.toString(draw));
        txtLose.setText(Integer.toString(lose));
        txtWin.setText(Integer.toString(win));
    }

    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }
}
