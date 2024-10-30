package com.cybernetic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages a waiting list of patients awaiting organ transplants,
 * allowing patients to be added, removed, and viewed.
 */
public class PatientWaitingList {
    private Queue<Patient> waitingList;

    /**
     * Constructs a new, empty PatientWaitingList.
     */
    public PatientWaitingList() {
        this.waitingList = new LinkedList<>();
    }

    /**
     * Adds a new patient to the waiting list.
     * @param patient The patient to be added.
     */
    public void addPatient(Patient patient) {
        waitingList.add(patient);
    }

    /**
     * Removes and returns the next patient in line from the waiting list.
     * @return The next patient in the waiting list.
     */
    public Patient removeNextPatient() {
        return waitingList.poll();
    }

    /**
     * Checks if the waiting list is empty.
     * @return True if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return waitingList.isEmpty();
    }

    /**
     * Prints the current state of the patient waiting list.
     */
    public void printWaitingList() {
        System.out.println("Current Waiting Queue:");
        int position = 1;
        for (Patient patient : waitingList) {
            System.out.println(position + ". [ " + patient.getName() + " ] <---");
            position++;
        }
    }
}
