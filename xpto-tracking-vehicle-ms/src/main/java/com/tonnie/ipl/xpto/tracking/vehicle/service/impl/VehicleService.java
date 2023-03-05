package com.tonnie.ipl.xpto.tracking.vehicle.service.impl;

import com.tonnie.ipl.xpto.tracking.vehicle.model.Vehicle;
import com.tonnie.ipl.xpto.tracking.vehicle.repository.VehicleRepository;
import com.tonnie.ipl.xpto.tracking.vehicle.service.IVehicleService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleService extends BaseEntityService<UUID, Vehicle, VehicleRepository> implements IVehicleService {
    public VehicleService(VehicleRepository repository) {
        super(repository);
    }
}