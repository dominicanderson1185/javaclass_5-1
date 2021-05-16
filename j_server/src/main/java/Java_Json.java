import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Java_Json {
	public static void main(String[] args) throws IOException {
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			My_Object my_object = new My_Object("Will Smith", "philly", "brown", 40);
			My_Object my_object1 = new My_Object("Robert stutter", "Detroit", "brown", 20);



			objectMapper.writeValue(new File("target/obj.json"), my_object);
			objectMapper.writeValue(new File("target/obj1.json"), my_object1);

		}
		catch(Exception e)
		{
			System.out.println("There seems to have been a error");
		}




	}
}
