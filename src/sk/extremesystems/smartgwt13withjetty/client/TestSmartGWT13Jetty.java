package sk.extremesystems.smartgwt13withjetty.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TestSmartGWT13Jetty implements EntryPoint {
	public void onModuleLoad() {
		VerticalPanel mainPanel = new VerticalPanel();
	
		
		
		
		
		Button b = new Button("Click me");
		b.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent evnt) {
				Window.alert("OK?");
				
			}
		});
		
		mainPanel.add(b);		
		
		RootPanel.get("root").add(mainPanel);
	}
}
