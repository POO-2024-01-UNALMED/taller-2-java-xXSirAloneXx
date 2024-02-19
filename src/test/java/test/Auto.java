package test;

public class Auto {
    String modelo;
    int precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){

    }
    String verificarIntegridad(){
        String w = "SI";
        if(motor.registro == this.registro)
        {
            if(w=="SI")
            {
                for(int k = 0; k < asientos.length; k++)
                {
                    if(asientos[k].registro == this.registro)
                    {
                        w = "SI";
                    }
                    else
                    {
                        w = "NO";
                        break;
                    }
                }
            }
            else
            {
                return "Las piezas no son originales";
            }

        }
        else
        {
            return "Las piezas no son originales";
        }

        if(w=="SI")
        {
            return "Auto original";
        }
    }
}