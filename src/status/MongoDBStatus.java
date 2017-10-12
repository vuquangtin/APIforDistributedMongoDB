package status;

public class MongoDBStatus {
	private String ipAddress;
	private int port;
	private TYPE type;
	private boolean isPrimary;
	private STATUS status;
	
	public enum TYPE {
		MONGOS, MONGOD
	}
	
	public enum STATUS {
		ALIVE, DOWN
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
}
