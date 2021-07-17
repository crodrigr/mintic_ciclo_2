# Ejercicos de clases

## Arreglos 

```java
package ciclo_02;

public class arreglos_04 {

    public static void main(String[] agr) {
        System.out.println("Arreglos en java");
        int numeros[] = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 25;
        numeros[3] = 13;
        numeros[4] = 14;
        numeros[5] = 98;
        numeros[7] = 36;
        numeros[8] = 28;
        numeros[9] = 9;        
        
        
        for (int i=0;i<10;i++){
          System.out.println("Valor en "+i+":"+numeros[i]);
        }
       

    }

}


```

Arreglos con funciones

```java
package ciclo_02;

public class arreglos_04 {

    public static void main(String[] agr) {
        System.out.println("Arreglos en java");
        int numeros[] = new int[20];
        llenarArreglo(numeros);
        imprimirArreglo(numeros);        
        System.out.println("El promedio es:" + promedio(numeros));       

    }
    
    public static void llenarArreglo(int[] p){        
        for (int i=0;i<p.length;i++){
              p[i]= (int)(Math.random() * ((100 - 1) + 1));
        }    
    }
    
    public static int promedio(int[] y){
        int acumulador=0;       
        int promedio=0;
        for (int i=0;i<y.length;i++){
           acumulador=acumulador+y[i];
        }
        promedio=acumulador/y.length;
        
        return promedio;
    
    }
    
    public static void imprimirArreglo(int[] x){
        for (int i=0;i<x.length;i++){
          System.out.println("Valor en "+i+":"+x[i]);
        }
    }

}

```

## JOptionPanel

[Ejemplo](http://codejavu.blogspot.com/2013/12/ejemplo-joptionpane.html)

### leer datos de tipo Int
```java
package ciclo_02;

import javax.swing.JOptionPane;

public class JOptionPane_06 {

    public static void main(String arg[]) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un"
                + " numero para multiplicarlo por 2"));
        
        JOptionPane.showMessageDialog(null, "Este es numero: "+numero,
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        
        System.out.println(numero);

    }

}

```
### leer datos de tipo string
```java
package ciclo_02;

import javax.swing.JOptionPane;

public class JOptionPane_07 {
    public static void main(String arg[]) {

        String numero = (JOptionPane.showInputDialog("Ingrese un"
                + " numero para multiplicarlo por 2"));
        
        JOptionPane.showMessageDialog(null, "Este es numero: "+numero,
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        
        System.out.println(numero);

    }
    
}
```



