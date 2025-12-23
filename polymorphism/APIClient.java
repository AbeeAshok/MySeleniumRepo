package week3.polymorphism;

public class APIClient {

	void sendRequest(String endpoint) {
		System.out.println("Endpoint received");
	}
	
	void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint, requestBody and requestStatus received");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient a = new APIClient();
		a.sendRequest("www.google.com");
		a.sendRequest("www.yahoo.com", null, false);

	}

}
