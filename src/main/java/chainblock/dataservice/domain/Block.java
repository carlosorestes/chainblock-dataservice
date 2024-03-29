package chainblock.dataservice.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import chainblock.dataservice.common.StringUtil;

public class Block implements Serializable {

	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger(getClass().getName());
	
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	private int nonce;
	
	public Block() {
	}
	
	public Block( String data, String previousHash) {
		this.previousHash = previousHash;
		this.data = data;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
		this.nonce = getNonce();
	}

	public String calculateHash() {
		String calculatehash = StringUtil.applySha256(
				previousHash +
				Long.toString(timeStamp) + 
				Integer.toString(nonce) + 
				data
		);
		return calculatehash;
	}
	
	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();
		}
		logger.info("mineBlock : " + hash);
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

	public int getNonce() {
		return nonce;
	}

	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

}
