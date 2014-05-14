package integrationTraining;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.integrationTraining.HelloMaven;

public class HelloMavenTest {

	HelloMaven helloMaven;



	@Before
	public void setUp() throws Exception {
		
		helloMaven = new HelloMaven();
		
	}

	@Test
	public void test() {
		assertEquals("HELLO MAVEN", helloMaven.SayHello("NONE"));
	}

}
