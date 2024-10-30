package com.cybernetic;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * Represents a patient awaiting organ transplantation,
 * including their ID, name, blood type, weight, HLA type, and medical history.
 */
@Data
public class Patient {
    private String id;
    private String name;
    private String bloodType;
    private int weight;
    private String hlaType;

    @Setter(AccessLevel.NONE)
    private PatientHistory history;

    /**
     * Constructs a Patient instance with specified attributes.
     * @param id Patient ID.
     * @param name Patient name.
     * @param bloodType Blood type.
     * @param weight Patient weight.
     * @param hlaType HLA type.
     */
    public Patient(String id, String name, String bloodType, int weight, String hlaType) {
        this.id = id;
        this.name = name;
        this.bloodType = bloodType;
        this.weight = weight;
        this.hlaType = hlaType;
        this.history = new PatientHistory();
    }

    /**
     * Adds a medical event to the patient's history.
     * @param medicalEvent The medical event description.
     */
    public void addMedicalEvent(String medicalEvent) {
        this.history.addMedicalEvent(medicalEvent);
    }

    /**
     * Removes and returns the most recent medical event from the patient's history.
     * @return The description of the removed medical event.
     */
    public String removeMostRecentEvent() {
        return this.history.removeMostRecentEvent();
    }
}
