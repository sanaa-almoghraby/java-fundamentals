/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Path newpath = Paths.get("app/src/main/resources/gates.js");

        System.out.println(ReadFiler(newpath));
    }

    public static String ReadFiler(Path newpath) {
        String line = "";
        String errormasseg = "";
        int num=1;

        try (
                BufferedReader bufferedReader = Files.newBufferedReader(newpath)
        ) {
            while ((line = bufferedReader.readLine()) != null) {
                if (!(line.isBlank() || line.endsWith("{") || line.endsWith("}") || line.contains("if") || line.contains("else") || line.endsWith(";")))
                    errormasseg += "Line " + num + ": Missing semicolon.\n";
                num++;
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        return errormasseg;
    }
}
