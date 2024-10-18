package src;
//Gato hereda de Mascota e implementa 
//el metodo de la interfaz Sonido
//no define nuevos atributos o métodos
public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getNombre()+" dice: Miaaaauuu");
    }
    
}
