package edu.wbqa.test4;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.wbqa.examples.jan2013.MyFileOperations;

@RunWith(value=Parameterized.class)
public class TestMyFileOperations {

	MyFileOperations op ;
	String path;
	int expectedLen;
	
	public TestMyFileOperations(String path, int expectedLen){
		this.path = path;
		this.expectedLen = expectedLen;
	}
	
	@Before
	public void setup(){
		op = new MyFileOperations();
	}
	
	@Ignore
	@Test
	public void testReadFile(){
				
		File myfile = new File("C:\\Users\\Shilpi\\SkyDrive\\training\\demo.txt");
		
		StringBuffer buff = op.readAFile(myfile);
		
		Assert.assertNotNull("The contents could not be read", buff);
		
		Assert.assertTrue(buff.indexOf("beautiful") > 0);
	}
	
	@Ignore
	@Test
	public void testWriteFile(){
		File myfile = new File("C:\\Users\\Shilpi\\SkyDrive\\training\\demo1.properties");
		op.writeAFile(myfile);
		
		Assert.assertTrue(myfile.exists());
		
	}
	
	@Ignore
	@Test
	public void testReadFromStandard(){
		
		String str = op.readFromStandardInput();
		System.out.println(str);
		Assert.assertNotNull(str);
	}
	
	@After
	public void cleanup(){
		op = null;
	}
	
	@Ignore
	@Test
	public void testCreateFile(){
		
		boolean ret = op.createFile("c:\\users\\something\\abc.txt");
		Assert.assertFalse(ret);
	}
	
	@Ignore
	@Test
	public void testCreateDir(){
		
		boolean ret = op.createDir("C:\\Users\\Shilpi\\SkyDrive\\training\\newDir");
		Assert.assertTrue(ret);
	}
	@Ignore
	@Test
	public void testCount(){
		
		File myfile = new File("C:\\Users\\Shilpi\\SkyDrive\\training\\demo.txt");

		int len = op.countChar(myfile);
		Assert.assertTrue(len>0);
		Assert.assertEquals(5, len);
		
	}
	
	@Test
	public void testCount1(){
		
		File myfile = new File(path);

		int len = op.countChar1(myfile);
		Assert.assertTrue(len>0);
		Assert.assertEquals(expectedLen, len);
		
		
	}
	//data driven testing
	@Parameters
	public static Collection data(){
		
		Object[][] data = new Object[][] {
				{"C:\\Users\\Shilpi\\SkyDrive\\training\\demo.txt" , 5},
				{ "C:\\Users\\Shilpi\\SkyDrive\\training\\demo1.txt" , 9 }
		};
		
		return Arrays.asList(data);
		
	}
}
