package com.cybernetic;

import java.util.Stack;

/**
 * Manages a patient's medical history as a stack of events,
 * allowing addition, viewing, and removal of medical events.
 */
public class PatientHistory {
    private Stack<String> medicalHistory;

    /**
     * Constructs a new, empty PatientHistory instance.
     */
    public PatientHistory() {
        this.medicalHistory = new Stack<>();
    }

    /**
     * Adds a new medical event to the patient's history.
     * @param event The medical event to be added.
     */
    public void addMedicalEvent(String event) {
        medicalHistory.push(event);
    }

    /**
     * Views the most recent medical event without removing it.
     * @return The most recent medical event.
     */
    public String viewLatestEvent() {
        if (!medicalHistory.isEmpty()) {
            return medicalHistory.peek();
        }
        return "No medical history available.";
    }

    /**
     * Removes and returns the most recent medical event from the history.
     * @return The most recent medical event.
     */
    public String removeMostRecentEvent() {
        if (!medicalHistory.isEmpty()) {
            return medicalHistory.pop();
        }
        return "No medical history available.";
    }

    /**
     * Checks if the medical history is empty.
     * @return True if empty, false otherwise.
     */
    public boolean isEmpty() {
        return medicalHistory.isEmpty();
    }
}
