package org.ea;

import org.ea.rest.json.Note;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/notes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestEndpoint {

    private Set<Note> notes = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public RestEndpoint() {
        notes.add(new Note("1","Build some stuff"));
        notes.add(new Note("2","Learn some stuff"));
        notes.add(new Note("3","Profit!"));
    }

    @GET
    public Set<Note> list() {
        return notes;
    }

    @POST
    public Set<Note> add(Note note) {
        notes.add(note);
        return notes;
    }

    @DELETE
    public Set<Note> delete(Note note) {
        notes.remove(note);
        return notes;
    }
}