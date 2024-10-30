package com.cybernetic;

import lombok.Data;

/**
 * Represents an organ available for transplantation, including identification,
 * name, blood type, weight, and human leukocyte antigen (HLA) type compatibility.
 */
@Data
class Organ {
    private String id;
    private String name;
    private String bloodType;
    private int weight;
    private String hlaType;

    /**
     * Constructs an Organ instance with specified attributes.
     * @param id Organ ID.
     * @param name Organ name.
     * @param bloodType Blood type compatibility.
     * @param weight Weight of the organ.
     * @param hlaType HLA type compatibility.
     */
    public Organ(String id, String name, String bloodType, int weight, String hlaType) {
        this.id = id;
        this.name = name;
        this.bloodType = bloodType;
        this.weight = weight;
        this.hlaType = hlaType;
    }
}
