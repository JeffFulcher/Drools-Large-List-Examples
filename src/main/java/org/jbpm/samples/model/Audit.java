package org.jbpm.samples.model;

import java.util.concurrent.ConcurrentHashMap;

public class Audit {
	private ConcurrentHashMap<String, String> event;
	private long lastRunTime;

	public ConcurrentHashMap<String, String> getEvent() {
		return event;
	}

	public void setEvent(ConcurrentHashMap<String, String> event) {
		this.event = event;
	}

	public long getLastRunTime() {
		return lastRunTime;
	}

	public void setLastRunTime(long lastRunTime) {
		this.lastRunTime = lastRunTime;
	}
}
