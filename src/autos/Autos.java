
package autos;

public class Autos
{
    public static void main(String[] args) 
    {
        auto vocho = new auto();
        vocho.setDatos("Escarabajo","2000" , "VW", "2.0", "standar");
        System.out.println(vocho.getDatos());
        vocho.encender();
        vocho.encender();
    }
}
