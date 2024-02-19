package test;

public class Auto {
    String modelo;
    int precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos()
    {
        int cAsientos = 0;
        for(int k = 0; k< asientos.length; k++)
        {
            cAsientos++;
        }
        return cAsientos;
    }
    String verificarIntegridad()
    {
        if(this.motor.registro != this.registro)
        {
            return "Las piezas no son originales";
        }
        else if(this.motor.registro == this.registro)
        {
            for(int k = 0; k< asientos.length; k++)
            {
                if(asientos[k] != null)
                {
                    if(asientos[k].registro != this.registro)
                    {
                        return "Las piezas no son originales";
                    }
                }
            }
        }
        else if(this.motor.registro != this.registro)
        {
            for(int k = 0; k< asientos.length; k++)
            {
                if(asientos[k] != null)
                {
                    if(asientos[k].registro != this.registro)
                    {
                        return "Las piezas no son originales";
                    }
                }
            }
        }
        return "Auto original";
    }
}