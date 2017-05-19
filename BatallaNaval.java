/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int coordenadaFila;
        int coordenadaColumna;
        int usuario[][]=new int [5][5];
        int compu[][]=new int [5][5];
        int oponenteFila;
        int oponenteColumna;
        int filaAtaque;
        int columnaAtaque;
        int contUsuario=5;
        int contCompu=5;
        
        
        for(int i=0;i<usuario.length;i++){
            System.out.println("Indique las coordenadas de su barco "+(i+1));
            System.out.println("Fila");
            coordenadaFila=sc.nextInt();
            System.out.println("Columna");
            coordenadaColumna=sc.nextInt();
            usuario[coordenadaFila-1][coordenadaColumna-1]=1;
            
            oponenteFila=(int)(Math.random()*5+1);
            oponenteColumna=(int)(Math.random()*5+1);
            compu[oponenteFila-1][oponenteColumna-1]=1;
        }
        
        for(int i=0;i<compu.length;i++){
            for(int j=0;j<compu[i].length;j++){
                System.out.print("["+usuario[i][j]+"] ");
            }
            System.out.println("");
        
        }
        System.out.println("");
        for(int i=0;i<compu.length;i++){
            for(int j=0;j<compu[i].length;j++){
                System.out.print("["+compu[i][j]+"] ");
            }
            System.out.println("");
        
        }
        for(int i=0;i<contUsuario || i<contCompu;){
            System.out.println("Turno del Usuario");
            System.out.println("Coloque la fila");
            filaAtaque=sc.nextInt();
            System.out.println("Coloque la columna");
            columnaAtaque=sc.nextInt();
            if(compu[filaAtaque-1][columnaAtaque-1]==1){
                compu[filaAtaque-1][columnaAtaque-1]=0;
                contCompu--;
                System.out.println("Le has dado a Bolivia");
            }else{
                System.out.println("Misil fallido :(");
            }
            
            System.out.println("Turno del computador");
            filaAtaque=(int)(Math.random()*5+1);
            columnaAtaque=(int)(Math.random()*5+1);
            if(usuario[filaAtaque-1][columnaAtaque-1]==1){
                usuario[filaAtaque-1][columnaAtaque-1]=0;
                contUsuario--;
                System.out.println("Le han dado a Chile");
            }else{
                System.out.println("Misil fallido :(");
            }
            if(contUsuario==0 || contCompu==0){
                break;
            }
        
        
        }
        if(contUsuario==0){
            System.out.println("Gano la flota de Bolivia");
        }else{
            System.out.println("Gano el usuario");
        
        }
        
    }
    
}
