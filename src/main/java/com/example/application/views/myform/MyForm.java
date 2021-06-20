package com.example.application.views.myform;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "myform", layout = MainLayout.class)
@RouteAlias(value = "/myform", layout = MainLayout.class)
@PageTitle("My form")
@Tag("my-form-view")
@JsModule("./views/myform/my-form-view.ts")
public class MyForm extends LitTemplate {

    @Id
    private TextField name;

    @Id
    private Button sayHello;

    public MyForm() {
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }
}

