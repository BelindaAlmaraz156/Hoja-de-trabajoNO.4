/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojadetrabajono.pkg4belinda_almaraz;

/**
 *
 * @author waldemar
 */
public class HojadetrabajoNo4Belinda_Almaraz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public abstract class figura {
          public abstract double calcularArea();
          public abstract double calcularVolumen();
          public abstract double calcularPerimetro();
          
                  
        }
          public class Esfera extends Figura {
              private double radio;
              
              public Esfera(double radio){
                  this.radio=radio;
              }
              public double calcularArea() {
                  return 4* Math.PI * Math.pow(radio, 2);
              }
          }   public double calcularPerimetro()   {
              return 2 * Math.PI * radio;
          }
    }

public class Paralelepipedo extends Figura {
    private double largo;
    private double ancho;
    private double alto;
    
    public Paralelepipedo(double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double calcularArea(){
        return 2 * (largo * ancho + largo * alto + ancho * alto);
    }
    
    public double calcularPerimetro(){
        return 4 * (largo + ancho + alto);
    }
    
    public class Cono extends Figura {
        private double radio;
        private double altura;
        
        public Cono(double radio, double altura){
            this.radio = radio;
            this.altura = altura;
                
        }
        
        public double calcularArea(){
           return Math.PI * radio * (radio + Math.sqrt(Math.pow(altura, 2)+ Math.pow(radio, 2)));
            
            
        }
        
        public double calcularVolumen(){
            return (1.0/3.0) * Math.PI * Math.pow(radio, 2)* altura;
            
        }
             
        public double calcularPerimetro() {
            return Math.PI * radio + Math.sqrt(Math.pow(radio, 2)+ Math.pow(altura, 2));
            
        }
    }
    
    public class Cilindro extends Figura {
        private double radio;
        private double altura;
        
        public cilindro(double radio, double altura) {
            this.radio = radio;
            this.altura = altura;
        }
    
        public double calcularArea(){
            return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
        }
        
        public double calcular Volumen() {
            return Math.PI * Math.pow(radio, 2)* altura;
        }
        
        public double calcularPerimetro(){
            return 2 * Math.PI * radio + 2 * altura;
        }
   }

    import java.util.Scanner;
    
    public class MenuFiguras {
}


    
}

