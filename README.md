<h1>Development of Web RIA applications with Java using SmartGWT 13.1d</h1>

<br>

<h2><a href="live/SmartGWT13.html" target="_NEW">Live Example</a></h2>
<iframe src="live/SmartGWT13.html" width="400" height="400"> </iframe>
<br>
<br>
<pre>
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

</pre>

<h2>Requirements for setup of IDE eclipse:</h2>
<br>
<br>
Open JDK 16
<br>
Eclipse for EE Developers (2023-09)
<br>
GWT 2.11.0
<br>
GWT 4.0.0 Plugin from Eclipse Marketplace 
<br>
Run with Jetty Plugin from Eclipse Marketplace
<br>
<a href="https://www.smartclient.com/product/download-bounce.jsp?product=smartgwt&license=lgpl&version=13.1d&nightly=true" download>SmartGWT 13.1d library</a>
<br>
GIT
<br>
<br>
<h2>Deploy test project from github</h2>
<br>
Clone repository https://github.com/istocko/smartgwt13.git
<br>
Import project to eclipse
<br>
Setup project with  GWT (set path where GWT is uzipped)
<br>
Copy smartgwt libraries (*.jar) to project dir
<br>
Compile GWT app with Eclipse
<br>
Run App via Run As -> Run with Jetty
<br>
Clear Cache in browser (CTRL+Shift+Delete in chrome , check only Chached Images and Files)
<br>
open http://localhost:8080 in browser
<br>
<img src ="screenshots/test1.png">
<br>
<br>
<br>
<h2>Debugging app</h2>
<br>
Run As -> Run with Jetty
<br>
Debug As -> GWT Develepoment Mode
<br>
open http://localhost:9876 and drag&drop bookmarklets DEV Mode ON and Dev Mode Off to bookmark panel in browser (CTRL+SHIFT+B in chrome)
<br>
open http://localhost:8080 in browser
<br>
Click at bookmark Dev Mode On and click at Compile button
<br>
<br>
<h2>Presentation of all smartgwt components with source</h2>
Start using smartgwt in your Java web application project 
Showcase about SmartGWT <a href="https://www.smartclient.com/smartgwt/showcase/">here</a>
<br>
<h2>Example of BlockChain by using <a href="https://github.com/istocko/sk.icoin.blockchainj" target="_NEW">blockchainj</a></h2>
<br>
<img src ="screenshots/test2.png">
