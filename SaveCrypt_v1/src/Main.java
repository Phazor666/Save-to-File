public class Main {
    public static void main(String[] args) {
        GameObject object = new GameObject(10, 20, 30, 300, "Cube", false);
        SaveObjectService.saveToFile(object);
    }
}

/*
   itm GameObject:
   x=10
   y=20
   z=30
   dir=200
   objectName="Hello!, World"
   isBodyRig=false
 */
class GameObject {
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") int x;
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") int y;
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") int z;
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") int dir;
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") String objectName;
    @SaveObject(filePath="C:/Users/tisla/Downloads/ser.txt") boolean isBodyRig;

    public GameObject(int x, int y, int z, int dir, String objectName, boolean isBodyRig) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dir = dir;
        this.objectName = objectName;
        this.isBodyRig = isBodyRig;
    }
}