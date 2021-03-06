<h1>Development of Web RIA applications with Java using SmartGWT 13</h1>

<br>

<h2><a href="live/TestSmartGWT13Jetty.html" target="_NEW">Live Example</a></h2>
<iframe src="live/TestSmartGWT13Jetty.html" width="400" height="400"> </iframe>

<code>
  package sk.extremesystems.smartgwt13withjetty.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TestSmartGWT13Jetty implements EntryPoint {
	public void onModuleLoad() {
		
		Button b = new Button("Click me!");
		b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				SC.say("OK?");
				
			}
		});
		
		Label info = new Label("created by <a href='https://www.extremesystems.sk' target='_NEW'>ExtremeSystems SK</a>");
		info.setWidth100();
		
		HLayout hl = new HLayout();
		hl.setHeight100();
		hl.setWidth100();
		hl.setAlign(Alignment.CENTER);
		hl.addMember(b);
		hl.addMember(info);
	
		RootPanel.get("root").add(hl);
	}
		
}
</code>

<h2>Requirements for setup of IDE eclipse:</h2>
<br>
<br>
Open JDK 13
<br>
Eclipse for EE Developers
<br>
GWT 2.9.0
<br>
GWT Plugin from Eclipse Marketplace (uncheck GWT 2.7.0 and 2.8.0 download option)
<br>
Run with Jetty Plugin from Eclipse Marketplace
<br>
<a href="https://www.smartclient.com/product/download-bounce.jsp?product=smartgwt&license=lgpl&version=13.0p&nightly=true" download>SmartGWT 13 library</a>
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
Run As -> configurations -> setup Jetty Web App -> set path target\TestSmartGWT13Jetty-1.0-SNAPSHOT\ 
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

