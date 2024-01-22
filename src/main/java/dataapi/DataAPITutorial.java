package dataapi;

import com.dtsx.astra.sdk.AstraDB;

public class DataAPITutorial {

	static final String ASTRA_TOKEN = System.getenv("ASTRA_DB_APP_TOKEN");
	static final String ASTRA_API_ENDPOINT = System.getenv("ASTRA_API_ENDPOINT");
	
	public static void main(String[] args) {
	// Initialization
	AstraDB db = new AstraDB(ASTRA_TOKEN, ASTRA_API_ENDPOINT);
	
	db.findAllCollections().forEach(col -> 
			System.out.println("Collection:" + col.getName()));
	
	}
}
