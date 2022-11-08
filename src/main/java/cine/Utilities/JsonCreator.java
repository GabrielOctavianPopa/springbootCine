package cine.Utilities;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Scanner;

public class JsonCreator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int auxGenerator = 0;

        System.out.println("1. Pelicula");
        System.out.println("2. Sala");
        System.out.print("Que elemento quieres crear: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                String titulo, director, año, duracion, genero;
                System.out.print("¿Cuántas elemetos quieres crear?: ");
                auxGenerator = sc.nextInt();

                for (int i = 1; i <= auxGenerator; i++) {
                    // Generar datos aleatorios
                    titulo = faker.book().title();
                    director = faker.book().author();
                    año = String.valueOf(faker.number().numberBetween(1920, 2022));
                    duracion = String.valueOf(faker.number().numberBetween(60, 240));
                    genero = faker.book().genre();

                    //añadir pelicula a la lista con el formato de un json correcto
                    elementos.add("{\n" +
                            "    \"titulo\": \"" + titulo + "\",\n" +
                            "    \"director\": \"" + director + "\",\n" +
                            "    \"año\": \"" + año + "\",\n" +
                            "    \"duracion\": \"" + duracion + "\",\n" +
                            "    \"genero\": \"" + genero + "\"\n" +
                            "}"
                    );
                }
                //Recorrer el arraylist de peliculas y mostrarlas por pantalla
                elementos.forEach(System.out::println);
                break;
            case 2:
                String nombre, ubicacion, capacidad;
                System.out.print("¿Cuántas elemetos quieres crear?: ");
                auxGenerator = sc.nextInt();

                for (int i = 1; i <= auxGenerator; i++) {
                    nombre = faker.superhero().name();
                    ubicacion = faker.address().fullAddress();
                    capacidad = String.valueOf(faker.number().numberBetween(50, 70));

                    elementos.add("{\n" +
                            "    \"nombre\": \"" + nombre + "\",\n" +
                            "    \"ubicacion\": \"" + ubicacion + "\",\n" +
                            "    \"capacidad\": \"" + capacidad + "\"\n" +
                            "}"
                    );
                }

                elementos.forEach(System.out::println);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}