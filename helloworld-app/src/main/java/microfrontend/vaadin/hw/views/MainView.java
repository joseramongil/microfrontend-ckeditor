package microfrontend.vaadin.hw.views;

import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.wontlost.ckeditor.VaadinCKEditor;
import com.wontlost.ckeditor.VaadinCKEditorBuilder;



@PageTitle("Remote VaadinCKeditor")
@Route(value = "")
public class MainView extends VerticalLayout implements HasSize{

    private static final long serialVersionUID = 1L;
    
    private RemoteVaadinCKeditor remoteVaadinCKeditor;
    
    private VaadinCKEditor vaadinCKEditor;
    
    public MainView() {
        this.setId("MainView");
        
        remoteVaadinCKeditor = new RemoteVaadinCKeditor();
        vaadinCKEditor= new VaadinCKEditorBuilder().createVaadinCKEditor();
        
        this.add( remoteVaadinCKeditor );
        this.add( new Text("Native microfrontend VaadinCKEditor:") );
        this.add( vaadinCKEditor );
    }

 

}
