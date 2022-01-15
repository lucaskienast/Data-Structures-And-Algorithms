package Demo;

import java.util.Scanner;

public class StateDesignPattern {
	Controller controller;
	
	StateDesignPattern(String conn) {
		controller = new Controller();
		
		if (conn.equalsIgnoreCase("mongodb")) {
			controller.setMongoDBConnection();
		}
		else if (conn.equalsIgnoreCase("s3")) {
			controller.setS3Connection();
		}
		else if (conn.equalsIgnoreCase("dynamodb")) {
			controller.setDynamoDBConnection();
		}
		controller.connect();
		controller.close();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the database you want to connect to...");
		String dbname = sc.next();
		
		new StateDesignPattern(dbname);
		
		sc.close();
	}
}

class Controller {
	public static MongoDB mgdb;
	public static S3 s3;
	public static DynamoDB ddb;
	
	private static DatabaseConnection conn;
	
	Controller() {
		mgdb = new MongoDB();
		s3 = new S3();
		ddb = new DynamoDB();
	}
	
	public void setMongoDBConnection() {
		conn = mgdb;
	}
	
	public void setS3Connection() {
		conn = s3;
	}
	
	public void setDynamoDBConnection() {
		conn = ddb;
	}
	
	public void connect() {
		conn.connect();
	}
	
	public void close() {
		conn.close();
	}
}

interface DatabaseConnection {
	public void connect();
	public void close();
}

class S3 implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to S3...");
	}

	@Override
	public void close() {
		System.out.println("Disconnecting from S3 store.");	
	}
}

class MongoDB implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to MongoDB...");
	}

	@Override
	public void close() {
		System.out.println("Disconnecting from MongoDB.");	
	}
}

class DynamoDB implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to DynamoDB...");
	}

	@Override
	public void close() {
		System.out.println("Disconnecting from DynamoDB.");	
	}
}