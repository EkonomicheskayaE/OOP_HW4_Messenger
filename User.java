import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class User {
    public static Object input2;
    public String id;
    public String firstName;
    public String lastName;
    public String data;
    public String time;


    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // public String getId() {
    //     return id;
    // }

    // public String getFirstname() {
    //     return firstName;
    // }

    // public String getLastname() {
    //     return lastName;
    // }

    // public String getData() {
    //     return data;
    // }

    // public String getTime() {
    //     return time;
    // }

    // public String toString() {
    //     return id + firstName + lastName + data + time;
    // }

    public void print() {
        System.out.println("ID -------> " + id);
        System.out.println("Имя ------> " + firstName);
        System.out.println("Фамилия --> " + lastName);
        System.out.println("Дата -----> " + data);
        System.out.println("Время ----> " + time + "!\n");
        
    }
 

          
    public void save() throws IOException {
        
        try {
            File file = new File("user.csv");

            if(!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println(id);
            pw.println(firstName);
            pw.println(lastName);
            pw.println(data);
            pw.println(time);
            pw.close();
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void read() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("user.csv"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                
            } br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}