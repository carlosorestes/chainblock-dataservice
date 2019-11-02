package chainblock.dataservice.domain;

import java.io.Serializable;
import java.util.Date;

import chainblock.dataservice.common.StringUtil;

public class Block implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
	public Block() {
	}
	
	public Block( String data, String previousHash) {
		this.previousHash = previousHash;
		this.data = data;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}

	public String calculateHash() {
		String calculatehash = StringUtil.applySha256(
				previousHash +
				Long.toString(timeStamp) + 
				data
		);
		return calculatehash;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
