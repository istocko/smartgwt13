package sk.extremesystems.smartgwt13.client.blockchain;

import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.Layout;



public class BlockChainExample {
	Layout lay;
	
	public void bindOutput(Layout lay) {
		this.lay = lay;
	}

	public void run() {
		if (lay != null) {
			lay.setMembers(new Label("init blockchainj"));
		}
		BlockChain blockChain = new BlockChain();
		Miner miner = new Miner();
		Block block0 = new Block(0,"transaction1",Constants.GENESIS_PREV_HASH);
		miner.mine(block0, blockChain);
		addInfoMsg(miner.getInfoMsg());
		Block block1 = new Block(1,"transaction2",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
		miner.mine(block1, blockChain);
		addInfoMsg(miner.getInfoMsg());
		Block block2 = new Block(2,"transaction3",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
		miner.mine(block2, blockChain);
		addInfoMsg(miner.getInfoMsg());
		addInfoMsg("Blockchain:\n"+blockChain);
		addInfoMsg("Miner's reward: "+miner.getReward());
	}
	
	private void addInfoMsg(String msg) {
		if (lay != null) {
			lay.addMember(new Label(msg.replaceAll("\n", "<br />")));
		}
	}

	
	
	
	
}
