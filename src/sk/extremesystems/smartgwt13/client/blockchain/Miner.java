package sk.extremesystems.smartgwt13.client.blockchain;

public class Miner {
	private double reward;
	private String lastInfoMsg;
	
	public void mine(Block block, BlockChain blockChain ) {
		while (notGoldenHash(block)) {
			block.generateHash();
			block.incrementNonce();
		}
		
		String msg = block+" has just mined ...";
		this.lastInfoMsg = msg;
		System.out.println(msg);
		
		msg = "Hash is: "+block.getHash();
		this.lastInfoMsg += "\n" + msg;
		System.out.println(msg);
		
		blockChain.addBlock(block);
		
		reward += Constants.MINER_REWARD;
		
	}
	
	public boolean notGoldenHash(Block block) {
		String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
		return !block.getHash().substring(0,Constants.DIFFICULTY).equals(leadingZeros);
	}
	
	public double getReward() {
		return this.reward;
	}
	
	public String getInfoMsg() { 
		return this.lastInfoMsg;
	}
	
}
