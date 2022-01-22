package sk.extremesystems.smartgwt13withjetty.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TestSmartGWT13Jetty implements EntryPoint {
	public void onModuleLoad() {
		
		Button b= new Button("Click me!");
		b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				SC.say("OK?");
				
			}
		});
	
		RootPanel.get("root").add(b);
	}
		
}
