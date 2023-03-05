package com.tonnie.ipl.xpto.tracking.vehicle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle implements IEntity<UUID> {

    @Id
    @Column(name = "vehicle_id")
    @GeneratedValue
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "customer_owner_id")
    private UUID customerOwnerId;

    @Column(name = "telemetry_profile_id")
    private UUID telemetryProfileId;

    @Column(name = "current_driver_id")
    private UUID currentDriverId;

    @Column(name = "number_plate")
    private String numberPlate;

    @Column(name = "vin")
    private String vin;

    @Column(name = "color")
    private String color;
}
