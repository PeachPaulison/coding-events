package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //All these methods are static.  These encapsulate the behavior of storing the objects.

    // A place to store all the events
    private static final Map<Integer, Event> events = new HashMap<>();

    // Should be able to add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    // Get all of the
    public static Collection<Event> getAll() {
        return events.values();
    }


    // Get a single event
    public static Event getById(int id) {
        return events.get(id);
    }


    // Should be able to remove an event
    public static void remove(int id) {
        events.remove(id);

    }

}


