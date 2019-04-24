package org.jbpm.sample;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestProcess {

    @Test
    public void testSampleProcess() {
        KieContainer kc = KieServices.get().newKieClasspathContainer();
        KieSession ks = kc.newKieSession();
        
        ks.startProcess("sample-process");
    }

}
