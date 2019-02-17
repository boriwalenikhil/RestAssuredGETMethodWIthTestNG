package RestAssuredFramewok.RestAssuredFramewok;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetRequest 
{
	@Test
	
	//Gettning only Status code 
	public  void  testResponseCode() {
		
	int code = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println("Status code is"+ code);
		// check ststus code getting correct or not.
		Assert.assertEquals(code, 200);
		
		
	}
	
	@Test
	
	//Getting all body data 
public  void  TestBodydata() {
		
		String data = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		long time = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		System.out.println("Response time" +time);
	}
	
}
