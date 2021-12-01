package microfrontend.vaadin.hw.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.wontlost.ckeditor.VaadinCKEditor;
import com.wontlost.ckeditor.VaadinCKEditorBuilder;

@CssImport("./helloworld-view.css")
public class MicrofrontendView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public static class Exporter extends WebComponentExporter<MicrofrontendView> {

		private static final long serialVersionUID = 1L;
		

		public Exporter() {
			super("microfrontend-view");
			// tag name: microfrontend-view
			// javascript path: http://localhost:8092/helloworld-app/web-component/microfrontend-view.js
			
		}

        @Override
        protected void configureInstance( WebComponent<MicrofrontendView> webComponent, MicrofrontendView component )
        {
            //default config
        }

	}

	private VaadinCKEditor vaadinCKEditor = new VaadinCKEditorBuilder().createVaadinCKEditor();

	public MicrofrontendView() {
        this.setId("MicrofrontendView");
        
	    this.add( new Text("Remote microfrontend VaadinCKEditor:") );
	    this.add( vaadinCKEditor );
		
	}

}
