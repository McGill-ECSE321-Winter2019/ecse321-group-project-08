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


public class IntegrationTests {
	
	private final String BASE_URL = "https://coop-backend-g8.herokuapp.com";
	
	private final String OTHER_URL = "https://cooperation-backend-g5.herokuapp.com";
	
	
    private JSONObject response;

    private JSONObject requestURL(String typeOfRequest, String url, String path, String parameters) {
        try {    
        	URL urll = new URL(url + path + ((parameters==null)?"":("?" + parameters)));
            System.out.println("Sending: "+url.toString());
            HttpURLConnection connection = (HttpURLConnection) urll.openConnection();
            connection.setRequestMethod(typeOfRequest);
            connection.setRequestProperty("Accept", "application/json");
            if (connection.getResponseCode() != 200) {
                throw new RuntimeException(url.toString() + " failed : HTTP error code : "
                        + connection.getResponseCode());
            }
            JSONObject r = new JSONObject(new BufferedReader(new InputStreamReader(
                    (connection.getInputStream()))).readLine());
            assertEquals(200, connection.getResponseCode());
            connection.disconnect();
            return r;
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

 
    
    
    @Test
    public void TestCreatingStudent() {
        try {
            response = requestURL("POST", BASE_URL, "/Student/1", "name=irmak");
            System.out.println("Received: "+response.toString());
            assertEquals("irmak", response.getString("name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    @Test
	public void TestCreatingCoopPlacementForm() {
		try {
			response = requestURL("POST", BASE_URL, "/CoopPlacementForm/1");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("coopPlacementFormID"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
       
	@Test
	public void TestCreatingCoopPosition() {
			try {
				response = requestURL("POST", BASE_URL, "/CoopPosition/1", "PositionName=Intern&CompanyName=Mcgill&startDate=2020-12-12&endDate=2020-12-15");
				System.out.println("Received: " + response.toString());
				assertEquals("Intern", response.getString("PositionName"));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
        
	@Test
	public void TestCreatingEmployer() {
			try {
				response = requestURL("POST", BASE_URL, "/Employer/1", "username=person1&password=123s");
				System.out.println("Received: " + response.toString());
				assertEquals(1, response.getInt("id"));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void TestCreatingTaxCreditForm() {
			try {
				response = requestURL("POST", BASE_URL, "/TaxCreditForm/1");
				System.out.println("Received: " + response.toString());
				assertEquals(1, response.getInt("taxCreditFormID"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		/*
		 * USE CASE 1
		 */
	}
	@Test
	public void TestCreatingStartConfirmation() {
		try {
			response = requestURL("POST", BASE_URL, "/StartConfirmation/1", "evaluationDate=2020-12-12&employerID=111&coopPositionID=133&studentID=2607");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("confirmationID"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		/*
		 * USE CASE 2
		 */
	
	@Test
	public void TestCreatingEvaluationForm() {
		try {
			response = requestURL("POST", BASE_URL, "/EvaluationForm/1", "employerID=1&coopPositionID=1");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    	/*
    	 * Assign Coop Position
    	 */
	
	@Test
	public void TestAssigningCoopPosition() {
		try {
			response = requestURL("POST", BASE_URL, "/updateCoopPosition", "coopPositionId=1&coopPlacementFormId=1");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("coopPositionID"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * USE CASE 3
	 */
	
	@Test
	public void TestGetCoopPlacementForm() {
		try {
			response = requestURL("POST", BASE_URL, "/CoopPlacementForm", "coopPositionID=1&employerID=1");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("coopPlacementFormID"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Assign Tax Credit Form
	 */
	
	@Test
	public void TestAssigningTaxCreditForm() {
		try {
			response = requestURL("POST", BASE_URL, "/updateCoop", "coopPositionID=1&taxCreditFormID=1");
			System.out.println("Received: " + response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * USE CASE 4
	 */
	
	@Test
	public void TestGetTaxCreditForm() {
		try {
			response = requestURL("POST", BASE_URL, "/TaxCreditForm", "coopPositionID=1&employerID=1");
			System.out.println("Received: " + response.toString());
			assertEquals(1, response.getInt("taxCreditFormID"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * USE CASE 5
	 */
	
	@Test
	public void TestCoopPositionsWithoutStudent() {
		try {
			response = requestURL("POST", BASE_URL, "/CoopPositionsWithoutStudents");
			System.out.println("Received: " + response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	 private JSONObject requestURL(String requestType, String baseUrl, String path) {
	        return requestURL(requestType,baseUrl,path,null);
	    }
	
	
    

}
