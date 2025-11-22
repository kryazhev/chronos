package ru.kvas.chronos.view.worklog;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.kvas.chronos.entity.WorkLog;
import ru.kvas.chronos.view.main.MainView;

@Route(value = "work-logs", layout = MainView.class)
@ViewController(id = "WorkLog.list")
@ViewDescriptor(path = "work-log-list-view.xml")
@LookupComponent("workLogsDataGrid")
@DialogMode(width = "64em")
public class WorkLogListView extends StandardListView<WorkLog> {
}