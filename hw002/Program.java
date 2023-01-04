package Homework.hw002;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Float> students = new HashMap<>();
        students.put("Mike", 4.6f);
        students.put("Ann", 4.3f);
        students.put("Jess", 3.8f);

        FileRecorder txt = new TxtFileRecorder();
        FileRecorder json = new JsonFileRecorder();
        FileRecorder xml = new XmlFileRecorder();

        txt.saveAs(students);
        json.saveAs(students);
        xml.saveAs(students);

    }
}
