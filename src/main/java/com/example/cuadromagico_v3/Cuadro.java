package com.example.cuadromagico_v3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class Cuadro extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Cuadro.class.getResource("sample.fxml"));



    }

    public static void main(String[] args) {
        int n = 3;
        int j_ant = 0;
        int i_ant = 0;
        int puntoInicial = n/2;
        int[][] Cuadro = new int[n][n];

        int temp = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Cuadro[i][j] = 0;

            }

        }
        int i =0;
        int j = puntoInicial;

        while (temp != (n*n)+1){
            if (Cuadro[i][j]==0){
                Cuadro [i][j]=temp;
            }else {
                i=i_ant+1;
                j=j_ant;
                Cuadro[i][j]=temp;
            }
            i_ant = i;
            j_ant = j;

            temp++;
            j++;
            i--;
            if(i<0 && j==n){
                i = n -1;
                j = 0;
            }else if(i<0) {
                i = i + n;
            }else if (j==n){
                j=0;
            }

        }
        for (int x = 0; x < n; x++) {
            String resultado = "";
            for (int y = 0; y < n; y++) {
                resultado =resultado + " " + Cuadro[x][y];
            }
            System.out.println(""+resultado);
        }
    }
}