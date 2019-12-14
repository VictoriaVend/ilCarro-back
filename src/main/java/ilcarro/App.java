package ilcarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        try (
                ConfigurableApplicationContext contect = SpringApplication.run(App.class, args)
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 'quit' for shutdown server");
            String line;
            do
                line = scanner.nextLine();
            while (!line.equalsIgnoreCase("quit"));
        }
    }
}
