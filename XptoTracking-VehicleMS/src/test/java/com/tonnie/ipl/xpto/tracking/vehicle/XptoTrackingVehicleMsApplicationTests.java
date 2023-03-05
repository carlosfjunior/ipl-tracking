package com.tonnie.ipl.xpto.tracking.vehicle;

import com.tonnie.ipl.xpto.tracking.vehicle.service.IVehicleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@UnitTestProfile
class XptoTrackingVehicleMsApplicationTests {

	@Autowired
	private IVehicleService service;
	
	@Test
	void contextLoads() {
		assertNotNull(service);
	}
}
