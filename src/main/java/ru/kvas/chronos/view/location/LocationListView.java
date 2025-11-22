package ru.kvas.chronos.view.location;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.kvas.chronos.entity.Location;
import ru.kvas.chronos.view.main.MainView;

@Route(value = "locations", layout = MainView.class)
@ViewController(id = "Location.list")
@ViewDescriptor(path = "location-list-view.xml")
@LookupComponent("locationsDataGrid")
@DialogMode(width = "64em")
public class LocationListView extends StandardListView<Location> {
}