package ru.kvas.chronos.view.worklog;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.kvas.chronos.entity.WorkLog;
import ru.kvas.chronos.view.main.MainView;

@Route(value = "work-logs/:id", layout = MainView.class)
@ViewController(id = "WorkLog.detail")
@ViewDescriptor(path = "work-log-detail-view.xml")
@EditedEntityContainer("workLogDc")
public class WorkLogDetailView extends StandardDetailView<WorkLog> {
}