package cilco_02_83_1;

public class reto1Ejemplo {

    static int size = 5;

    public static void main(String[] arg) {
      
        String[] personas = new String[size];//personas
        String[] cromosomas = new String[size];//cromosomas
        loadData(personas,cromosomas);
        printData(personas,cromosomas);
    
    }

    public static void printData(String[] p,String[] c){
        System.out.println("Listado de personas con su cromosoma");   
        for(int i=0;i<size;i++){
            System.out.println("Nombre: "+p[i]+" Cromosoma: "+c[i]);           
           }
    }
    
    public static void loadData(String[] per, String[] cromo) {
        //Llenado de personas  
        per[0] = "Camilo Rodriguez";
        per[1] = "Juana Perez";
        per[2] = "Lizeth Villamizar";
        per[3] = "Sebastian Rodriguez";
        per[4] = "Diego Rangel";
        //llenado de cromosomas
        cromo[0] = "0011";
        cromo[1] = "0111";
        cromo[2] = "1111";
        cromo[3] = "1100";
        cromo[4] = "1110";

    }

}
