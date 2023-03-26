public class Main {

    //Primera parte: Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int Suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        //*Primera parte* Llamado de función Suma() y asignación de valores.
        int resultado = Suma(1,2,3); 
        System.out.println("=== Primera parte ===");
        System.out.println("El Resultado de la Suma es: "+resultado);

        //*Segunda Parte */Crear un objeto miCoche en el main y añadirle una puerta.
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("=== Segunda parte ===");
        System.out.println("Número de puertas del Coche es: "+miCoche.NumPuertas);
    }
}

//Segunda parte: Creación de clase "Coche"
class Coche {
    public int NumPuertas = 0; //variable numérica que almacene el número de puertas que tiene

    public void IncrementarPuertas() { //función que incremente el número de puertas que tiene el coche.
        this.NumPuertas++;
    }
}