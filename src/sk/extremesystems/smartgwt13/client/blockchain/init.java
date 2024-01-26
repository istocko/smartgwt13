package sk.extremesystems.smartgwt13.client.blockchain;

public class init {

	public static void main(String[] args) {
		System.out.println("init blockchainj");
		BlockChain blockChain = new BlockChain();
		Miner miner = new Miner();
		Block block0 = new Block(0,"transaction1",Constants.GENESIS_PREV_HASH);
		miner.mine(block0, blockChain);
		Block block1 = new Block(1,"tansaction2",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
		miner.mine(block1, blockChain);
		Block block2 = new Block(2,"transaction3",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
		miner.mine(block2, blockChain);
		System.out.println("\n"+"Blockchain:\n"+blockChain);
		System.out.println("Miner's reward: "+miner.getReward());
	}

}
