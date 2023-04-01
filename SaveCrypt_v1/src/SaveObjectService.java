import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.lang.reflect.Field;

public class SaveObjectService {
    public static void saveToFile(GameObject item) {
        for (Field field : item.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(SaveObject.class)) {
                SaveObject service = field.getAnnotation(SaveObject.class);
                File file = new File(service.filePath());
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    ArrayList<Integer> i1 = new ArrayList<Integer>();
                    ArrayList<String> i2 = new ArrayList<String>();
                    ArrayList<Boolean> i3 = new ArrayList<Boolean>();
                    i1.add(item.x);
                    i1.add(item.y);
                    i1.add(item.z);
                    i1.add(item.dir);
                    i2.add(item.objectName);
                    i3.add(item.isBodyRig);

                    writer.write("itm GameObject");
                    writer.newLine();
                    writer.write(i1.toString());
                    writer.newLine();
                    writer.write(i2.toString());
                    writer.newLine();
                    writer.write(i3.toString());
                    writer.newLine();
                    writer.close();
                } catch (Exception myErr) {
                    myErr.printStackTrace();
                    return;
                }
            }
        }
    }
}