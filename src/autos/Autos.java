
package autos;
import java.util.Scanner;
public class Autos
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        int opc = 0;
        auto miAuto = new auto();
        do
        {
            System.out.println("Menu: \n"
            +"1.- Crear nuevo auto\n"
            + "2.- Ver datos del auto\n"
            + "3.- Ver accines\n"
            + "4.- Salir\n");
            opc = lector.nextInt();
            switch(opc)
            {
                case 1:
                    miAuto.setDatos("Escarabajo","2000" , "VW", "2.0", "standar");
                break;
                case 2:
                System.out.println(miAuto.getDatos());
                break;
                case 3:
                    System.out.println("Acciones:\n"
                    +"1.- Encender auto\n"
                    + "2.- Avanzar\n"
                    + "3.- Retroceder\n"
                    + "4.- Girar\n"
                    + "5.- Frenar\n"
                    + "6.- Encender luces\n");
                    opc = lector.nextInt();
                    switch(opc)
                    {
                        case 1:
                            miAuto.encender();
                        break;
                            
                        case 2:
                            miAuto.avanzar();
                        break;

                        case 3:
                            miAuto.Retroceder();
                        break;

                        case 4:
                            miAuto.girar();
                        break;

                        case 5:
                            miAuto.Frenar();
                        break;

                        case 6:
                            miAuto.encenderLuces();
                        break;
                    }
                break;
                case 4:
                break;
                default:
                break;
            }
        }while(opc != 4);
        
    }
}
