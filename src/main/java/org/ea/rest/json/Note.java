package org.ea.rest.json;

import java.util.Objects;

public class Note {

    private String id;
    private String text;

    public Note() {
    }

    public Note(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Note)) {
            return false;
        }

        Note other = (Note) obj;

        return Objects.equals(other.id, this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}