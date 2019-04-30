package org.jbpm.sample;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.api.time.SessionPseudoClock;

public class TestDateEffective {

    @Test
    public void testSampleProcess() {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSessionConfiguration config = KieServices.get().newKieSessionConfiguration();
        config.setOption(ClockTypeOption.get("pseudo"));
        KieSession ks = kc.newKieSession(config);

        SessionPseudoClock clock = ks.getSessionClock();

        // the pseudo clock current time is always Unix epoch time in 1969
        long pseudoTime = clock.getCurrentTime();

        // we add 1ms to the difference so the comparison would work correctly
        Calendar cal = Calendar.getInstance();
        cal.set(2019, Calendar.MAY, 01);
        long diff = cal.getTimeInMillis() - pseudoTime + 1;

        // move the pseudo clock forward until the last run time
        clock.advanceTime(diff, TimeUnit.MILLISECONDS);

        ks.startProcess("date-effective");
    }

}
