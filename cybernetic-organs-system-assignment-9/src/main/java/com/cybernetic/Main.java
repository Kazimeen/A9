package com.cybernetic;

/**
 * Main class for simulating a patient management system and organ transplant matching.
 * This class initializes sample patients, manages a patient waiting list,
 * and performs organ compatibility checks and medical history management.
 */
public class Main {
    public static void main(String[] args) {
        Patient johnDoe = new Patient("P001", "John Doe", "A+", 70, "HLA-A");
        Patient janeSmith = new Patient("P002", "Jane Smith", "B-", 65, "HLA-B");
        Patient bobJohnson = new Patient("P003", "Bob Johnson", "O+", 80, "HLA-A");
        Patient aliceBrown = new Patient("P004", "Alice Brown", "AB-", 55, "HLA-C");

        // Create and manage patient waiting list
        PatientWaitingList waitingList = new PatientWaitingList();
        waitingList.addPatient(aliceBrown);
        waitingList.addPatient(bobJohnson);
        waitingList.addPatient(janeSmith);
        waitingList.addPatient(johnDoe);

        // Print and manage medical history events
        waitingList.printWaitingList();
        String[] events = {"Annual checkup", "Flu vaccination", "Broken arm surgery"};
        System.out.println("\nAdding medical events to Alice's history:");
        for (String event : events) {
            System.out.println("- " + event);
            aliceBrown.addMedicalEvent(event);
        }

        // View and remove medical events
        System.out.println("\nViewing Alice's latest medical event: " + aliceBrown.getHistory().viewLatestEvent());
        System.out.println("Removing Alice's latest medical event: " + aliceBrown.removeMostRecentEvent());

        // Organ creation and transplant matching process
        Organ cyberHeart = new Organ("O001", "CyberHeart-X1", "A+", 350, "HLA-A");
        Patient nextPatient = waitingList.removeNextPatient();
        System.out.println("\nProcessing the next patient for CyberHeart-X1 transplant:");
        System.out.println("Matched CyberHeart-X1 to " + nextPatient.getName());
        
        System.out.println("\n" + nextPatient.getName() + " is compatible with " + cyberHeart.getName() + "!\n");

        // Final print of the waiting list
        waitingList.printWaitingList();
    }
}
