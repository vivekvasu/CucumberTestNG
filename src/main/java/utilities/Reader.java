package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Reader 
{
	public static Properties readPropertiesFile(String path)
	{
		InputStream iStream = null;
		Properties properties = null;
		try 
		{
			iStream = new FileInputStream(path);
			properties = new Properties();
			properties.load(iStream);

		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return properties;
	}

	public static StringBuilder readTextFile(String path)
	{
		String line;
		File file = null;
		FileReader fReader = null;
		BufferedReader bReader = null;
		StringBuilder sBuilder = null;
		try 
		{
			file = new File(path);
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			sBuilder = new StringBuilder();
			while((line = bReader.readLine()) != null)
			{
				sBuilder.append(line);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return sBuilder;
	}
}
