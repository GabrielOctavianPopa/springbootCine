package cine;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class JsonCreator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        ArrayList<String> peliculas = new ArrayList<>();
        String titulo, director, año, duracion, categoria;
        for (int i = 0; i <= 2; i++) {
            titulo = faker.book().title();
            director = faker.book().author();
            año = String.valueOf(faker.number().numberBetween(1800, 2022));
            duracion = String.valueOf(faker.number().numberBetween(60, 240));
            categoria = faker.book().genre();
            //add the elements to the arraylist with the format of the json
            peliculas.add("{\n" +
                    "    \"titulo\": \"" + titulo + "\",\n" +
                    "    \"director\": \"" + director + "\",\n" +
                    "    \"año\": \"" + año + "\",\n" +
                    "    \"duracion\": \"" + duracion + "\",\n" +
                    "    \"categoria\": \"" + categoria + "\"\n" +
                    "}");
        }

        //return each pelicula in the arraylist as a JSON string as a new line
        peliculas.forEach(System.out::println);


    }
}
