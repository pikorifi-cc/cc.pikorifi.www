package cc.pikorifi.views.home;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Home")
@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        setSpacing(false);

        Image img = new Image("images/pikorifi.jpg", "photo of the device running everything");
        img.setWidth("1280px");
        add(img);

        H2 header = new H2("Cloud Foundry Korifi running on a single Raspberry Pi 5");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph("Running Spring Boot 3.4.2 and Vaading 24.6"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
