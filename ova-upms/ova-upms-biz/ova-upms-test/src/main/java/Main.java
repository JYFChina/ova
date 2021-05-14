import lombok.Data;
import lombok.Generated;

import java.io.*;

/**
 * @Author: JYF
 * @Description:
 * @Date: create in 2021/5/13 15:41
 */
public class Main {
    public static void main(String[] args) {
        User user =new User();
        user.setName("李四");
        user.setSex(2);
        Student student=new Student();
        student.setName("张三");
        student.setClassName("高一五班");
        ObjectOutputStream outputStream1 = null;
        try {
            outputStream1=new ObjectOutputStream(new FileOutputStream("D:/2.txt"));
            outputStream1.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
@Data
class User{
    String name;
    int sex;
}
@Data
class Student implements Serializable  {

    private static final long serialVersionUID = -5809782578272943999L;
    String name;
    String className;
}
