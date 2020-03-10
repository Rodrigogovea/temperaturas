package temperaturas;

public class conversor 
{
    public double convertirCaF(double laTemperaturaC)
    {
        return (laTemperaturaC*1.8)+32;
    }
    
    public double convertirFaC(double laTemperaturaF)
    {
        return (laTemperaturaF-32)/1.8;
    }
    
}
