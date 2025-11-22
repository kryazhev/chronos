package ru.kvas.chronos.view.location;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.kvas.chronos.entity.Location;
import ru.kvas.chronos.view.main.MainView;

@Route(value = "locations/:id", layout = MainView.class)
@ViewController(id = "Location.detail")
@ViewDescriptor(path = "location-detail-view.xml")
@EditedEntityContainer("locationDc")
public class LocationDetailView extends StandardDetailView<Location> {
}