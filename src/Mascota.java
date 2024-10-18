package src;
//Una clase solo puede heredar de otra pero
//puede implementar multiples interfaces
//ya que estas unicamente describen una funcionalidad
//al declarar esta clase como abstracta la responsabilidad
//de implementar el metodo de la interfaz puede
//quedar delegada a las clases que hereden de este
//esta clase define un metodo constructor y un getter para su
//unico atributo nombre
//nombre Tiene un modificador de acceso private
//por lo que una vez se construya el objeto
//el valor de nombre no podra ser modificado
//pero si recogido con una llamada al metodo getNombre()
public abstract class Mascota implements Sonido{
    private String nombre;

    public Mascota(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }   
}