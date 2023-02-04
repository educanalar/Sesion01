import com.poo.clase.Persona;

public class Main {
    public static void main(String[] args) {
        calcularIMC();
    }

    public static void calcularIMC() {

        Persona p = new Persona("Eduardo","tiene sobrepeso",82,78);

        System.out.println("este metodo calcula el imc de la persona");
    }
}