package sk.extremesystems.smartgwt13.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.VLayout;

import sk.extremesystems.smartgwt13.client.blockchain.BlockChainExample;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SmartGWT13 implements EntryPoint {
	public void onModuleLoad() {
		
		Button b = new Button("Version of SmartGWT ".concat(SC.getScVersion()).concat(" Click here for test"));
		b.setMargin(2);
		b.setWidth("500px");
		b.setBorder("1px red solid");
		b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				SC.say("SmartGWT v. ".concat(SC.getScVersion()));
				
			}
		});
		
		Label info = new Label("created by <a href='https://www.extremesystems.sk' target='_NEW'>ExtremeSystems SK</a>");
		info.setWidth100();
		
		final VLayout outputInfo = new VLayout();
		Button runBlockchainExample = new Button("Run Blockchain Example");
		runBlockchainExample.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				BlockChainExample bce = new BlockChainExample();
				bce.bindOutput(outputInfo);
				bce.run();
				
			}
		});
		
		
		VLayout vl = new VLayout();
		vl.setHeight100();
		vl.setWidth100();
		vl.setAlign(Alignment.CENTER);
		vl.addMember(b);
		vl.addMember(runBlockchainExample);
		vl.addMember(outputInfo);
		
		vl.addMember(info);
	
		RootPanel.get("root").add(vl);
	}
		
}
