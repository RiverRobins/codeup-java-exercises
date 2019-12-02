package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        boolean cont = true;
        while (cont){
            Input input = new Input();

            MoviesArray.Movie[] movies = MoviesArray.findAll();

            System.out.print("What would you like?\n" +
                    "0 - Exit\n" +
                    "1 - Show all movies\n" +
                    "2 - Show by genre\n" +
                    "3 - Search by genre\n" +
                    "4 - Search by title\n");
            try {
                switch (input.getInt()) {
                    case 0: {
                        cont = false;
                        break;
                    }
                    case 1: {
                        for (MoviesArray.Movie i : movies) {
                            System.out.println(i.title);
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("Select an option:\n" +
                                "Options:\n" +
                                "0 - Exit\n" +
                                "1 - Back to main\n" +
                                "Movie Genres:\n" +
                                "2: Animated\n" +
                                "3: Horror\n" +
                                "4: Drama\n" +
                                "5: Sci-Fi\n" +
                                "6: Musical\n");
                        try {
                            switch (input.getInt()) {
                                case 0: {
                                    cont = false;
                                    break;
                                }
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    for (MoviesArray.Movie i : movies) {
                                        if (i.genre.equalsIgnoreCase("animated")) {
                                            System.out.println(i.title);
                                        }
                                    }
                                    break;
                                }
                                case 3: {
                                    for (MoviesArray.Movie i : movies) {
                                        if (i.genre.equalsIgnoreCase("horror")) {
                                            System.out.println(i.title);
                                        }
                                    }
                                    break;
                                }
                                case 4: {
                                    for (MoviesArray.Movie i : movies) {
                                        if (i.genre.equalsIgnoreCase("drama")) {
                                            System.out.println(i.title);
                                        }
                                    }
                                    break;
                                }
                                case 5: {
                                    for (MoviesArray.Movie i : movies) {
                                        if (i.genre.equalsIgnoreCase("scifi")) {
                                            System.out.println(i.title);
                                        }
                                    }
                                    break;
                                }
                                case 6: {
                                    for (MoviesArray.Movie i : movies) {
                                        if (i.genre.equalsIgnoreCase("musical")) {
                                            System.out.println(i.title);
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Unknown Command");
                                    break;
                                }
                            }
                        } catch (Exception e){
                            System.out.print("\nPlease enter a NUMBER\n");
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Search by genre; enter a genre:\n");
                        String search = input.getString();
                        boolean found = false;
                        for (MoviesArray.Movie i : movies) {
                            if (i.genre.equalsIgnoreCase(search)) {
                                System.out.println(i.title);
                                found = true;
                            }
                        }
                        if (found == false){
                            System.out.println("No results found");
                        }
                        break;
                    }
                    case 4: {
                        System.out.print("Enter a movie title:\n");
                        String search = input.getString();
                        boolean found = false;
                        for (MoviesArray.Movie i : movies) {
                            if (i.title.equalsIgnoreCase(search)) {
                                System.out.println(i.title + ", " + i.genre);
                                found = true;
                            }
                        }
                        if (found == false){
                            System.out.println("No results found");
                        }
                        break;
                    }
                    default: {
                        System.out.println("unknown command");
                    }
                }
            } catch (Exception e){
                System.out.print("\nPlease enter a NUMBER\n\n");
            }
        }
    }
}