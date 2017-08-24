package dustybirdapps.cat_a_day;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Michael Scofield on 8/24/2017.
 */

public class DailyCounter {
    public DailyCounter() {
        final ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(
                () -> counter++, 0, 1, TimeUnit.DAYS);
    }
    private static int counter;
}
