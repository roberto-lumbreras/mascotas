package src;
public class Main {
    public static void main(String[] args) {
        //No se puede instanciar directamente una clase abstracta 
        //Mascota m = new Mascota("Chispas");

        //La capacidad de asignar objetos distintos a una referencia 
        //padre es una caracteristica de polimorfismo
        Mascota perro = new Perro("Tobi","Mastin");
        Mascota gato = new Gato("Misifu");

        //solo puedo acceder al atributo nombre a traves del getter
        System.out.println("Nombre del perro: "+perro.getNombre());
        //si el atributo no fuera private esto funcionaria
        //System.out.println("Nombre del perro: "+perro.nombre);

        //cada clase tiene una implementacion distinta de la interfaz Sonido
        perro.hacerSonido();
        gato.hacerSonido();

        //Como la referencia del perro es de tipo Mascota, no sabe salir a pasear
        //perro.salirDePaseo();

        //Pero si cambiamos su referencia con un cast a su tipo real 
        //ya podemos acceder a su método particular
        ((Perro)perro).salirDePaseo();

        //En realidad todas las clases heredan de la clase Object
        Object o = new Perro("Tobi","Mastin");

        //Aunque las interfaces pueden ser implementadas por clases
        //hay ocasiones en que la implementacion de una interfaz es 
        //necesaria en un unico lugar
        //podemos crear sobre la marcha una instancia de una clase anónima
        //a la cual podremos hacer referencia con el nombre de la interfaz

        Sonido s = new Sonido() {
            public void hacerSonido(){
                System.out.println("Buzz");
            }
        };
        s.hacerSonido();

        //si observamos el codigo anterior, podemos ver que hay informacion redundante
        //Por que es necesario especificar el metodo que vamos a implementar
        //si nuestra interfaz solo tiene ese método???
        //Esta es la idea que subyace en la sintaxis de las expresiones lambda
        //para hacer la implementacion de una interfaz con una expresion lambda
        //solamente tenemos que indicar los parametros y el cuerpo de la funcion
        //separados por una flecha (->)

        s = () -> System.out.println("Fizz");
        s.hacerSonido();
        //Destacar que las expresiones lambda se usan para implementar interfaces funcionales
        //que son aquellas que tienen un unico método abstracto
        //ESTO SE USA MUCHO!!!
    }
}
