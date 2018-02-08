import java.nio.file.*;
import java.io.*;
public class FileIn {
public static void main(String[ ] args) throws IOException{
Path file = Paths.get("DND 5e items.txt");
InputStream input = null;
String line = null;
try {
input = Files.newInputStream(file);
BufferedReader reader = new
BufferedReader(new InputStreamReader(input));
line = reader.readLine();
while (line != null) {
System.out.println(line);
line = reader.readLine();
}
input.close();
}
catch (Exception e) {
System.out.println("Message: " + e);
}
}
}
