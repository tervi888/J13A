package ru.netology.javaqa;

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String data;

    public Meeting(int id, String topic, String project, String data) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.data = data;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}

