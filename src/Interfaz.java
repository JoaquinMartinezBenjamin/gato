
import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;

public class Interfaz extends Gato {
    public int ancho=420;
    public int alto=380;
   
    public JTextArea area;
    public JScrollPane barra;
    int tiradas=1;
            
    public JTextArea area2=new JTextArea();
    public JButton B00,B01,B02;
    public JButton B10,B11,B12;
    public JButton B20,B21,B22;
    public JButton Reiniciar;
    public JButton Salir;
           
    public Interfaz (){
         
      
        
          area      = new JTextArea();
          area.setEditable (false);
          barra     = new JScrollPane(area);
          
          area2.setEditable (false);
          area2.setBackground(Color.black);
          area2.setBounds(10,20,210,210);
        
         Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("                 GATO:::MODO_GRAFICO:::");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);
        //   getContentPane().setBackground(Color.white);

        //****************Fila1 
         B00=new JButton("");
         B00.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B00.setBackground(Color.white);
         B00.setBounds(00,00,60,60);
         area2.add(B00);
         
         B01=new JButton("");
          B01.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B01.setBackground(Color.white);
         B01.setBounds(75,00,60,60);
         area2.add(B01);

         B02=new JButton("");
          B02.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B02.setBackground(Color.white);
         B02.setBounds(150,00,60,60);
         area2.add(B02);

        //****************Fila2
     
         B10=new JButton("");
          B10.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B10.setBackground(Color.white);
         B10.setBounds(00,75,60,60);
         area2.add(B10);

         B11=new JButton("");
          B11.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B11.setBackground(Color.white);
         B11.setBounds(75,75,60,60);
         area2.add(B11);

         B12=new JButton("");
          B12.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B12.setBackground(Color.white);
         B12.setBounds(150,75,60,60);
         area2.add(B12);
         
         //******************Fila3
         
         B20=new JButton("");
          B20.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B20.setBackground(Color.white);
         B20.setBounds(00,150,60,60);
         area2.add(B20);

         B21=new JButton("");
          B21.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B21.setBackground(Color.white);
         B21.setBounds(75,150,60,60);
         area2.add(B21);

         B22=new JButton("");
          B22.setFont(new java.awt.Font("Comic Sans MS",3,30));
         B22.setBackground(Color.white);
         B22.setBounds(150,150,60,60);
         
          Reiniciar=new JButton("Reiniciar");
          //Reiniciar.setFont(new java.awt.Font("Comic Sans MS",3,30));
       //  Reiniciar.setBackground(Color.white);
         Reiniciar.setBounds(70,250,90,40);
          getContentPane().add(Reiniciar);
          
           Salir=new JButton("Cerrar");
          //Reiniciar.setFont(new java.awt.Font("Comic Sans MS",3,30));
       //  Reiniciar.setBackground(Color.white);
         Salir.setBounds(275,250,90,40);
          getContentPane().add(Salir);
         
          area2.add(B22);  
         
          barra.setBounds(250, 20, 150, 210);
          getContentPane().add(barra);
          getContentPane().add(area2);
          
     
   
    ActionListener accion = new java.awt.event.ActionListener()
       {
         public void actionPerformed(java.awt.event.ActionEvent evento){
                   Object obj=evento.getSource();

                   if (obj== B00&&tiradas<10){   
                       x=0;
                       y=0;
                       evaluarTiro();
                                 }
                   if (obj== B01&&tiradas<10){   
                       x=0;
                       y=1;
                      evaluarTiro();
                                 }
                   if (obj== B02&&tiradas<10){    
                       x=0;
                       y=2;
                       evaluarTiro();
                                 }
                    
                   if (obj== B10&&tiradas<10){   
                       x=1;
                       y=0;
                      evaluarTiro();
                                 }
                   if (obj== B11&&tiradas<10){    
                       x=1;
                       y=1; 
                       evaluarTiro();
                                  }
                   if (obj== B12&&tiradas<10){   
                       x=1;
                       y=2;
                       evaluarTiro();
                                  }
                    
                   if (obj== B20&&tiradas<10){   
                       x=2;
                       y=0;
                      evaluarTiro();
                   }
                   if (obj== B21&&tiradas<10){   
                       x=2;
                       y=1;
                       evaluarTiro();
                                  }
                   if (obj== B22&&tiradas<10){    
                       x=2;
                       y=2;
                      evaluarTiro();
                                 } 
                                 
               if (obj== Reiniciar){    
                      tiradas=1;
                      B00.setText("");
                       B01.setText("");
                        B02.setText("");
                         B10.setText("");
                          B11.setText("");
                           B12.setText("");
                            B20.setText("");
                             B21.setText("");
                              B22.setText("");
                              ganador=false;
                              
                             for (int x=0; x<3; x++) { 
                               for (int y=0; y <3; y++){
                                   tablero[x][y]=0;
                                                             } 
                                                            }
                             area.append ("Nuevo juego\n");                               
                                }
                 if (obj==Salir){    
                     dispose();              
                            }
                        }
                            
       };
       B00.addActionListener(accion);
       B01.addActionListener(accion);
       B02.addActionListener(accion);
       
       B10.addActionListener(accion);
       B11.addActionListener(accion);
       B12.addActionListener(accion);
       
       B20.addActionListener(accion);
       B21.addActionListener(accion);
       B22.addActionListener(accion);
     
        Reiniciar.addActionListener(accion);
        Salir.addActionListener(accion);
    }
    public void evaluarTiro (){   
           ImageIcon icono = new ImageIcon("X.PNG");
       Image imagen = icono.getImage();
            ImageIcon aescala = new ImageIcon(
       imagen.getScaledInstance(60,60,Image.SCALE_SMOOTH));
   
        JLabel label3 = new JLabel (aescala);
      
      

                    if (  evaluarCasilla(x,y)==false){
                          
                           if ( x==0&&y==0){ B00.setText("X");}    
                           if ( x==0&&y==1){ B01./*add(label3);}*/setText("X");}
                           if ( x==0&&y==2){ B02./*add(label3);}*/setText("X");}
                           if ( x==1&&y==0){ B10./*add(label3);}*/setText("X");}
                           if ( x==1&&y==1){ B11./*add(label3);}*/setText("X");}
                           if ( x==1&&y==2){ B12./*add(label3);}*/setText("X");}
                           if ( x==2&&y==0){ B20./*add(label3);}*/setText("X");}
                           if ( x==2&&y==1){ B21./*add(label3);}*/setText("X");}
                           if ( x==2&&y==2){ B22./*add(label3);}*/setText("X");}
                              
                                 juegaUsuario();
                                                         } else {                     
                                     JOptionPane.showMessageDialog (null,"Posicion ocupada\n"
                                     +"Vuelva a tirar");                        
                                 
                                                                }
                    if (tiradas%2==0&&evaluarGanador(tiradas)==false&&tiradas<10){
                            juegaComputadora();
                                         } 
                          }
    public void juegaUsuario()      {
                           turnoUsuario(x,y);
                           area.append ("Turno Usuario:\n");
                           area.append ("Fila: "+x+"  columna: "+y+"\n");
                           area.append (imprimirTablero());
                           tiradas=tiradas+1;
                           evaluarGanador(tiradas);
                           if (evaluarGanador(tiradas)==false&&tiradas>=10){  
                                 JOptionPane.showMessageDialog(null,"Nadie gano :("); 
                              //  dispose();
                                                                }
                          
                           if (evaluarGanador(tiradas)==true&&tiradas<10){  
                               
                         
                                 JOptionPane.showMessageDialog(null,"Usuario ha ganado"); 
                                 tiradas=11;
                                              
                               
                               // dispose();
                                                                }
                                    
                                     }
                                     
    public void juegaComputadora ()  {
        while (turnoComputadora()==false){
                           turnoComputadora();  
                                    }
                     tablero[x][y] =2;  
                     area.append ("Turno Computadora:\n");
                     area.append ("Fila: "+x+"  columna: "+y+"\n");
                                  
       ImageIcon icono2 = new ImageIcon("O.PNG");
       Image imagen2 = icono2.getImage();
       ImageIcon aescala2= new ImageIcon(
       imagen2.getScaledInstance(60,60,Image.SCALE_SMOOTH));
       JLabel O = new JLabel (aescala2);
                     //  if ( x==0&&y==0){ B00.add(O);}// B00.setText("X");}    
                           if ( x==0&&y==0){ B00.setText("O");}    
                           if ( x==0&&y==1){ B01.setText("O");}
                           if ( x==0&&y==2){ B02.setText("O");}
                           if ( x==1&&y==0){ B10.setText("O");}
                           if ( x==1&&y==1){ B11.setText("O");}
                           if ( x==1&&y==2){ B12.setText("O");}
                           if ( x==2&&y==0){ B20.setText("O");}
                           if ( x==2&&y==1){ B21.setText("O");}
                           if ( x==2&&y==2){ B22.setText("O");}
                              

                         area.append (imprimirTablero());
                           tiradas=tiradas+1;
                           evaluarGanador(tiradas);
                          
                         
               if (evaluarGanador(tiradas)==true){  
                   
                 
                                 JOptionPane.showMessageDialog(null,"Computadora ha ganado"); 
                                 tiradas=11;
                                              }
                     // JOptionPane.showMessageDialog(null,"Jugador "+jugador+"  a ganado"); 
                          //   dispose();
                                                  }
                                        

                                     
                                     
      public static void main(String args[]) {
        new Interfaz().setVisible(true);
                                             }
    
}