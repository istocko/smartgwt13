package sk.extremesystems.smartgwt13withjetty.client.blockchain;

import java.util.Date;

public class Block {
	private int id;
	private int nonce;
	private long timeStamp;
	private String hash;
	private String prevHash;
	private String transaction;
	
	public Block(int id, String transaction, String prevHash) {
		this.id = id;
		this.transaction = transaction;
		this.prevHash = prevHash;
		this.timeStamp = new Date().getTime();
		generateHash();
	}
	
	
	public void generateHash() {
		String dataToHash = Integer.toString(id) + prevHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction.toString();
		String hashValue = SHA256Helper.generateHash(dataToHash);
		this.hash = hashValue;
	}
	
	public String getHash() {
		return this.hash;
	}
	
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getPrevHash() {
		return this.prevHash;
	}
	
	public void setPrevHash(String prevHash) {
		this.prevHash = prevHash;
	}
	
	public void incrementNonce() {
		this.nonce++;
	}
	
	public String toString() {
		return this.id+"-"+this.transaction+"-"+this.hash+"-"+this.prevHash+"-";
	}
	
	
}
