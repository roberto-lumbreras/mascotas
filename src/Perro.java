package src;
//Perro hereda de Mascota e implementa 
//el metodo de la interfaz Sonido
//añade un nuevo atributo raza
//define un nuevo método no heredado salirDePaseo()
public class Perro extends Mascota{
    private String raza;
    public Perro(String nombre,String raza) {
        super(nombre);
        this.raza=raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getNombre()+" dice: Woof!woof!");
    }

    public void salirDePaseo(){
        System.out.println(this.getNombre()+" sale a pasear!");
    }
    
}
