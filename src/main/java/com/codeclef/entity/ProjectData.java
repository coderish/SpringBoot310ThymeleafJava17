package com.codeclef.entity;

public class ProjectData {

    private String name;
    private String reportLink;
    private int latestProjectVersion;
    private String lastUpdated;
    private String reportLastRun;
    private String lastRunStatus;

    public ProjectData() {
    }

    public ProjectData(String name, String reportLink, int latestProjectVersion, String lastUpdated, String reportLastRun, String lastRunStatus) {
        this.name = name;
        this.reportLink = reportLink;
        this.latestProjectVersion = latestProjectVersion;
        this.lastUpdated = lastUpdated;
        this.reportLastRun = reportLastRun;
        this.lastRunStatus = lastRunStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportLink() {
        return reportLink;
    }

    public void setReportLink(String reportLink) {
        this.reportLink = reportLink;
    }

    public int getLatestProjectVersion() {
        return latestProjectVersion;
    }

    public void setLatestProjectVersion(int latestProjectVersion) {
        this.latestProjectVersion = latestProjectVersion;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getReportLastRun() {
        return reportLastRun;
    }

    public void setReportLastRun(String reportLastRun) {
        this.reportLastRun = reportLastRun;
    }

    public String getLastRunStatus() {
        return lastRunStatus;
    }

    public void setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }
}
