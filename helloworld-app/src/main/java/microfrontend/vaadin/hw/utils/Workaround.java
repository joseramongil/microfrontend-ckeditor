package microfrontend.vaadin.hw.utils;

import com.vaadin.flow.component.UI;

public class Workaround {
	
	private Workaround() {}
	
	public static void addJSModule(UI ui, String url) {
        ui.getPage().executeJs(
                "var s = document.createElement('script');s.type='module'; s.src=$0;document.head.appendChild(s);",
                url);

    }
	
	public static void addJSListenerRedirect(UI ui, String tagId, String event,  String parameter, String url ) {
	    
	    StringBuilder jsSb = new StringBuilder();
	    jsSb.append( " var component = document.getElementById('").append(tagId).append("'); " )
	        .append( " component.addEventListener('").append(event).append("',  function(event) { ")
	        .append( " var property = component['").append(parameter).append("']; " )
	        .append( " alert('redirigir con propiedad: ' + property); " )
	        .append( " window.open('").append(url).append("/' + property, '_self'); " )
	        .append( " });" ).append( "\n" );
	    
        ui.getPage().executeJs( "var s2 = document.createElement('script');s2.innerHTML=$0;document.head.appendChild(s2);"
                                , jsSb.toString());

    }
}
