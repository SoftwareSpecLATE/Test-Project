import java.util.Scanner;
import java.text.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class AppointmentBookReader 
{

	public AppointmentBookReader()
	{
		book = new AppointmentBook();
	}

	public AppointmentBook read(String filename) throws IOException, ParseException
	{
		FileReader reader = new FileReader(filename);
		Scanner in = new Scanner(reader);
		while(in.hasNextLine())
		{
			String input1 = in.nextLine();
			String input2 = in.nextLine();
			book.add(input1, input2);
		}
		reader.close();
		return book;
	}

	private AppointmentBook book;
	
	public static void main(String[] args)
	{
		AppointmentBookReader bookReader = new AppointmentBookReader();
		AppointmentBook book = bookReader.read(filename);
		System.out.println(book);
	}

}
