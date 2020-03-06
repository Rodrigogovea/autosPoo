package autos;

public class auto 
{
    private String placa, modelo, niv, anio,marca,tipodemotor,tipotransmision;
    private boolean estaEncendido;
    
    auto()
    {
        this.placa = "";
        this.modelo = "";
        this.niv = "";
        this.anio = "";
        this.marca = "";
        this.tipodemotor = "";
        this.tipotransmision = "";
        estaEncendido = false;
    }
    public void encender()
    {
        if(!estaEncendido)
        {
            System.out.println("El auto ha sido encendido");
            this.estaEncendido = true;
        }
        else
        {
            System.out.println("El auto ya esta encendido");
        }
    }
    public void setDatos(String model, String year, String mark, String tipoMotor, String tipoTransmision)
    {
        this.anio = year;
        this.marca = mark;
        this.modelo = model;
        this.tipodemotor = tipoMotor;
        this.tipotransmision = tipoTransmision;
    }
    
    public void setPlaca(String laPlaca)
    {
        this.placa = laPlaca;
    }
    
    public void setNiv(String theNiv)
    {
        this.niv = theNiv;
    }
    public String getDatos()
    {
        return "Marca: " + this.marca + "\nModelo: "+ this.modelo + "\nAño: " + this.anio + "\nMotor: " + this.tipodemotor + "\nTransmisión: " + this.tipotransmision;
    }
    public void avanzar() 
    {
        System.out.println("El auto avanzo!!!");
	}
    public void Retroceder() 
    {
        System.out.println("El auto va en reversa!!!");
	}
    public void girar() 
    {
        System.out.println("El auto giro!!!");
	}
    public void Frenar() 
    {
        System.out.println("El auto freno!!!");
	}
    public void encenderLuces() 
    {
        System.out.println("El auto encendio las luces!!!");
	}
}
