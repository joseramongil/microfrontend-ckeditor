# microfrontend-ckeditor
example microfrontend and VaadinCKEditor

## Running the application
The project is a standard Maven project. To run it from the command line,
type the next comand.

```shell
mvn spring-boot:run -Pproduction
```
Then open http://localhost:8092/helloworld-app/ in your browser.

## View description

|Class|Description|
|--- |--- |
|MicrofrontendView.class|Microfrontend created by WebComponentExporter. Contain a VaadinCKEditor for show it on another Vaadin web app|
|RemoteVaadinCKeditor.class|Component that load microfrontend 'microfrontend-view'|
|MainView.class|Principal view, it show on route '/'. This view show a native VaadinCKEditor and a remote VaadinCKEditor in a microfrontend|
