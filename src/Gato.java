import java.awt.*;
import javax.swing.*;

import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Gato  extends JFrame   {
    
public int tablero[][] = new int[3][3];
public int x;
public int y;
public int tiradas=1;
public int jugador;
public boolean ganador=false;
public boolean ocupado=false;
public boolean estado=false;


          //    Scanner entrada = new Scanner(System.in);
              Random r = new Random();
              
public Gato(){ }
     
   
    public boolean evaluarCasilla (int x, int y) {
          this.x=x;
          this.y=y;
          ocupado=estado;
          
         if ((x>2)||(y>2)||(tablero[x][y] != 0)){

           // System.out.println ("Posicion ocupada o numero de fila y/o columna invalido\n");
                       
                       ocupado=true;
                                                         }
        return ocupado;
    } 
    
   public void turnoUsuario(int x, int y){
    this.x=x;
      this.y=y;
        jugador=1;
        // this.jugador=jugador;
         
       /*System.out.println ("Introduzca el numero de la fila\n ");
        x=entrada.nextInt();
        System.out.println ("Introduzca el numero de la columna\n ");
        y=entrada.nextInt();
        */
      tablero[x][y] = jugador;
                                    
                                       }    
    
    public boolean turnoComputadora (){
              jugador=2;
      boolean valido=false;
          int limite=2;
                   y=r.nextInt(limite+1);
                   x=r.nextInt(limite+1);
                
                while (tablero[x][y] != 0){      
                           y=r.nextInt(limite+1);    
                           x=r.nextInt(limite+1);
                          
                                          }
      
             // this.jugador=jugador;
  if  (
        (tablero[0][0]==2&&tablero[0][1]==2)||
        (tablero[1][2]==2&&tablero[2][2]==2)||
        (tablero[2][0]==2&&tablero[1][1]==2)||
        
        (tablero[0][0]==1&&tablero[0][1]==1)||
        (tablero[1][2]==1&&tablero[2][2]==1)||
        (tablero[2][0]==1&&tablero[1][1]==1)
        ) {
            if (tablero[0][2]==0){
                           x=0;
                           y=2;   }          
                    }
                        
  if (
       (tablero[0][1]==2&&tablero[0][2]==2)|| 
       (tablero[1][0]==2&&tablero[2][0]==2)||
       (tablero[1][1]==2&&tablero[2][2]==2)||
       (tablero[0][1]==1&&tablero[0][2]==1)||
       (tablero[1][0]==2&&tablero[2][0]==1)||
       (tablero[1][1]==2&&tablero[2][2]==1) )
     
                       {
           if(tablero[0][0]==0){
                        x=0;
                        y=0;    }
                    }
  if ( (tablero[0][0]==2&&tablero[0][2]==2)||
       (tablero[1][1]==2&&tablero[2][1]==2)||
       (tablero[0][0]==1&&tablero[0][2]==1)||
       (tablero[1][1]==1&&tablero[2][1]==1) )
    
                       {
                          if(tablero[0][1]==0){   
                        x=0;
                        y=1;                  }
                    }
  if ( (tablero[1][0]==2&&tablero[1][1]==2)||
       (tablero[0][2]==2&&tablero[2][2]==2)||
       (tablero[1][0]==1&&tablero[1][1]==1)||
       (tablero[0][2]==1&&tablero[2][2]==1) )
    
                       {if  (tablero[1][2]==0){
                           x=1;
                           y=2;           }
                        }
  if ((tablero[1][1]==2&&tablero[1][2]==2)||
      (tablero[0][0]==2&&tablero[2][0]==2)||
      (tablero[1][1]==1&&tablero[1][2]==1)||
      (tablero[0][0]==1&&tablero[2][0]==1) )
   
                       {  if(tablero[1][0]==0){ 
                           x=1;
                        y=0;       }
                    }
  if ( (tablero[1][0]==2&&tablero[1][2]==2)||
       (tablero[0][1]==2&&tablero[2][1]==2)||
       (tablero[0][0]==2&&tablero[2][2]==2)||
       (tablero[2][0]==2&&tablero[0][2]==2)||
       (tablero[1][0]==1&&tablero[1][2]==1)||
       (tablero[0][1]==1&&tablero[2][1]==1)||
       (tablero[0][0]==2&&tablero[2][2]==1)||
       (tablero[2][0]==1&&tablero[0][2]==1) )
     
                       { if(tablero[1][1]==0){
                           x=1;
                           y=1;                   }
                    }
  if ( (tablero[2][0]==2&&tablero[2][1]==2)||
       (tablero[0][2]==2&&tablero[1][2]==2)||
       (tablero[0][0]==2&&tablero[1][1]==2)||
       (tablero[2][0]==1&&tablero[2][1]==1)||
       (tablero[0][2]==2&&tablero[1][2]==1)||
       (tablero[0][0]==1&&tablero[1][1]==1) )
     
                       { if(tablero[2][2]==0){
                        x=2;
                        y=2;     }
                    }
  if ( (tablero[2][1]==2&&tablero[2][2]==2)||
       (tablero[1][1]==2&&tablero[0][2]==2)||
       (tablero[0][0]==2&&tablero[1][0]==2)||
       (tablero[2][1]==1&&tablero[2][2]==1)||
       (tablero[1][1]==1&&tablero[0][2]==1)||
       (tablero[0][0]==1&&tablero[1][0]==1))
    
                       {  if(tablero[2][0]==0){
                           x=2;
                        y=0;  }
                    }
                    
  if ( (tablero[2][0]==2&&tablero[2][2]==2)||
       (tablero[0][1]==2&&tablero[1][1]==2)||
       (tablero[2][0]==1&&tablero[2][2]==1)||
       (tablero[0][1]==1&&tablero[1][1]==1))
 
                       { if(tablero[2][1]==0){
                        x=2;
                        y=1;            }
                    }
                    
                    if (evaluarCasilla(x,y)==false){
                        
                        valido=true;
                    }
                        
                        return valido;
                                 
          
             
    }
    
    public boolean evaluarGanador (int tiradas) {
    
         if((tablero[0][0]==jugador&&tablero[0][1]==jugador&&tablero[0][2]==jugador)||
            (tablero[1][0]==jugador&&tablero[1][1]==jugador&&tablero[1][2]==jugador)||
            (tablero[2][0]==jugador&&tablero[2][1]==jugador&&tablero[2][2]==jugador)||
            (tablero[0][0]==jugador&&tablero[1][0]==jugador&&tablero[2][0]==jugador)||
            (tablero[0][1]==jugador&&tablero[1][1]==jugador&&tablero[2][1]==jugador)||
            (tablero[0][2]==jugador&&tablero[1][2]==jugador&&tablero[2][2]==jugador)||
            (tablero[0][0]==jugador&&tablero[1][1]==jugador&&tablero[2][2]==jugador)||
            (tablero[2][0]==jugador&&tablero[1][1]==jugador&&tablero[0][2]==jugador)){
              //   JOptionPane.showMessageDialog(null,"Jugador "+jugador+"  a ganado"); 
              
              ganador=true;
             
                           //  if( ganador==true){ imprimirTablero();}
                        //tiradas=20;
                      //   dispose();
                                      } 
                                      
          // if (tiradas==10){ganador=true;}                           
                                      return ganador;
                                   
                                   //    if( tiradas>=10){ System.exit(0);}
    }
    
    public String imprimirTablero () {
        String tableroImpreso="";
        tableroImpreso += "   _0_   _1_   _2_\n";
       // System.out.print("   0    1    2\n");                               
         for ( int i = 0; i < 3; i++) { tableroImpreso += i; //System.out.print(i);         
         for ( int j = 0; j < 3; j++) {             tableroImpreso += "|_"+tablero[i][j]+"_|";        
                                      // System.out.printf("|_"+tablero[i][j]+"_|");
                                       }              
                                      tableroImpreso += "\n";//  System.out.println("\n");
                                       }                 
                                    tableroImpreso += "\n";//    System.out.println("\n");
                                     return tableroImpreso;
    }
    

                                        }