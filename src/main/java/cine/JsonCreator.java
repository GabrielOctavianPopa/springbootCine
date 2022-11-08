package cine;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Scanner;

public class JsonCreator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        ArrayList<String> peliculas = new ArrayList<>();
        String titulo, director, año, duracion, categoria;

        Scanner sc = new Scanner(System.in);
        int numeroPeliculas = sc.nextInt();

        for (int i = 0; i <= numeroPeliculas; i++) {
            // Generar datos aleatorios
            titulo = faker.book().title();
            director = faker.book().author();
            año = String.valueOf(faker.number().numberBetween(1800, 2022));
            duracion = String.valueOf(faker.number().numberBetween(60, 240));
            categoria = faker.book().genre();

            //añadir pelicula a la lista con el formato de un json correcto
            peliculas.add("{\n" +
                    "    \"titulo\": \"" + titulo + "\",\n" +
                    "    \"director\": \"" + director + "\",\n" +
                    "    \"año\": \"" + año + "\",\n" +
                    "    \"duracion\": \"" + duracion + "\",\n" +
                    "    \"categoria\": \"" + categoria + "\"\n" +
                    "}");
        }
        //Recorrer el arraylist de peliculas y mostrarlas por pantalla
        peliculas.forEach(System.out::println);
    }
}
