package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

Double numero1; 
Double numero2; 
double resultado = 0;



Scanner tomarNumero1 = new Scanner(System.in);
System.out.println("Ingrese el primer numero");
numero1 = tomarNumero1.nextDouble();



Scanner tomarnumero2 = new Scanner(System.in);
System.out.println("Ingrese el segunfo numero");
numero2 = tomarnumero2.nextDouble();



Scanner operador = new Scanner(System.in);
System.out.println("Ingrese el operador opciones: +,-,*,/,%");
char operacion = operador.next().charAt(0);





if (operacion == '+') { resultado = numero1 + numero2;
    
}

else if (operacion == '-') { resultado = numero1 - numero2;
 

} else if (operacion=='*') {resultado = numero1 * numero2;}

else if (operacion=='/') {resultado = numero1 / numero2;}

else if (operacion == '%') { resultado = numero1 % numero2;}
    


else {System.out.println("Error retome nuevamente el procedimiento");}
  

if (numero1 > numero2) { System.out.println("El primer numero digitado es mayor que el segundo");}

else if (numero2 > numero1) {System.out.println("El segundo numero digitado es mayor que el primero");}

else {System.out.println("Ambos son iguales");
    

if (resultado % 2 == 0) {System.out.println("El resultado es par");}

else{System.out.println("El resultado es impar");}
    




int resultadoEntero = (int)resultado;
System.out.println("este es el resultado en entero: " + resultadoEntero);


//Condiciones compuestas paso 9

if (numero1 > 10 && numero2 > 10 ) {System.out.println("La condicion de que ambos sean postivos y mayores a 10 cumple"); } 
else if (numero1 > 10 && numero2 == 0) {System.out.println("La condicion cumple la cual es si al menos uno de los numeros es negativo o igual a cero");   
}




    
}
    
}





    
}


    

    
 








