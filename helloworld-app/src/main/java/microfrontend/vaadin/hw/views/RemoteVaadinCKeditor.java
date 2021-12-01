package microfrontend.vaadin.hw.views;


import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;

import microfrontend.vaadin.hw.utils.Workaround;



@Tag("microfrontend-view")
public class RemoteVaadinCKeditor extends Component implements HasSize {

    private static final long serialVersionUID = 1L;
    

    public RemoteVaadinCKeditor() {
        this.setId("RemoteVaadinCKeditor");
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        Workaround.addJSModule(attachEvent.getUI(),
                "http://localhost:8092/helloworld-app/web-component/microfrontend-view.js");
        setWidth("100%");
        
        
    }
    
}