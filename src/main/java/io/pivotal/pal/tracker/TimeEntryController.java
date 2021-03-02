package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.TimeEntry;
import io.pivotal.pal.tracker.TimeEntryRepository;
import org.springframework.http.ResponseEntity;

public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntryToCreate) {
    return null;
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }
}
