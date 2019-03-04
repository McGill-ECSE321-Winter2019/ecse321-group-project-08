package ca.mcgill.ecse321.cooperator.testIntegration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class IntegrationTests {
//	
//	private final String BASE_URL = "https://coop-backend-g8.herokuapp.com";
//    private final String STUDENT_NAME = "nirmak";
//    private JSONObject response;
//
//    private JSONObject sendRequest(String requestType, String baseUrl, String path, String parameters) {
//        try {
//            URL url = new URL(baseUrl + path + ((parameters==null)?"":("?" + parameters)));
//            System.out.println("Sending: "+url.toString());
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod(requestType);
//            connection.setRequestProperty("Accept", "application/json");
//            if (connection.getResponseCode() != 200) {
//                throw new RuntimeException(url.toString() + " failed : HTTP error code : "
//                        + connection.getResponseCode());
//            }
//            JSONObject r = new JSONObject(new BufferedReader(new InputStreamReader(
//                    (connection.getInputStream()))).readLine());
//            assertEquals(200, connection.getResponseCode());
//            connection.disconnect();
//            return r;
//        } catch (JSONException | IOException e) {
//            e.printStackTrace();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private JSONObject sendRequest(String requestType, String baseUrl, String path) {
//        return sendRequest(requestType,baseUrl,path,null);
//    }
//    
//    
//    @Test
//    public void TestAddingCourse() {
//        try {
//            response = sendRequest("POST", BASE_URL, "/Student/1", "name=" + STUDENT_NAME);
//            System.out.println("Received: "+response.toString());
//            assertEquals(STUDENT_NAME, response.getString("name"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
