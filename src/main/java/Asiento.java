public class Asiento {
    String color;
    int precio;
    int registro;
    int i;

    void cambiarColor(String color){
        while (i == 1)
        {
            if (color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco"){
                i = 1;
            } else{
                System.out.println("Color no valido");
                continue;
            }
        
        }

    }
    
}
