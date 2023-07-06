package com.codeclef.entity;

import java.util.List;

public class SubLobData {

    private String id;
    private String lob;
    private String subLob;
    private String lda;
    private String dag;
    private List<ProjectData> projects;

    public SubLobData() {
    }

    public SubLobData(String id, String lob, String subLob, String lda, String dag, List<ProjectData> projects) {
        this.id = id;
        this.lob = lob;
        this.subLob = subLob;
        this.lda = lda;
        this.dag = dag;
        this.projects = projects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getSubLob() {
        return subLob;
    }

    public void setSubLob(String subLob) {
        this.subLob = subLob;
    }

    public String getLda() {
        return lda;
    }

    public void setLda(String lda) {
        this.lda = lda;
    }

    public String getDag() {
        return dag;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }

    public List<ProjectData> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectData> projects) {
        this.projects = projects;
    }
}
