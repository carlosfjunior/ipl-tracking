package com.tonnie.ipl.xpto.tracking.vehicle.service;

import com.tonnie.ipl.xpto.tracking.vehicle.XptoTrackingVehicleMsApplication;
import com.tonnie.ipl.xpto.tracking.vehicle.model.Vehicle;
import com.tonnie.ipl.xpto.tracking.vehicle.service.impl.VehicleService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = XptoTrackingVehicleMsApplication.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VehicleServiceTest {

	@Autowired
	private VehicleService service;

	private Vehicle createTestEntity() {
		return Vehicle.builder()
					.customerOwnerId(UUID.randomUUID())
					.telemetryProfileId(UUID.randomUUID())
					.currentDriverId(UUID.randomUUID())
					.numberPlate("RG12PH")
					.vin("4Y1SL65848Z411438")
					.color("red").build();
	}
	
	
	@Test
	@Order(1)
	void findAll() {

		Assertions.assertThat(service.findAll()).hasSize(2);

	}

	@Test
	@Order(2)
	@Rollback(value = false)
	void save() {

		Vehicle entity = service.save(createTestEntity());

		Assertions.assertThat(entity.getId()).isNotNull();

	}

	@Test
	@Order(3)
	void findById() {

		Vehicle entityRef = service.save(createTestEntity());

		Optional<Vehicle> entityReturned = service.findById(entityRef.getId());

		Assertions.assertThat(entityReturned)
		.isPresent()
		.contains(entityRef);

	}

	@Test
	@Order(4)
	void findByIdFails() {

		Optional<Vehicle> entityReturned = service.findById(UUID.randomUUID());

		Assertions.assertThat(entityReturned).isNotPresent();

	}

	@Test
	@Order(5)
	void findByEntityId() {

		Vehicle entityRef = service.save(createTestEntity());

		Optional<Vehicle> entityReturned = service.findById(entityRef);

		Assertions.assertThat(entityReturned)
		.isPresent()
		.contains(entityRef);

	}

	@Test
	@Order(6)
	void findByEntityIdFails() {

		Vehicle entityRef = createTestEntity();
		
		entityRef.setId(UUID.randomUUID());	

		Optional<Vehicle> entityReturned = service.findById(entityRef);

		Assertions.assertThat(entityReturned).isNotPresent();

	}

	@Test
	@Order(7)
	@Rollback(value = false)
	void update() {

		Vehicle entityRef = service.save(createTestEntity());

		entityRef.setColor("blue");

		Vehicle entityUpdated = service.save(entityRef);

		Assertions.assertThat(entityUpdated.getColor()).startsWith("blue");

	}

	@Test
	@Order(8)
	@Rollback(value = false)
	void delete() {

		Vehicle entityRef = service.save(createTestEntity());

		UUID entifyRefId = entityRef.getId();

		Assertions.assertThat(entifyRefId).isNotNull();

		service.delete(entityRef);

		Optional<Vehicle> entityDeleted = service.findById(entifyRefId);

		Assertions.assertThat(entityDeleted).isNotPresent();
	}

	@Test
	@Order(9)
	@Rollback(value = false)
	void deleteById() {

		Vehicle entityRef = service.save(createTestEntity());

		UUID entifyRefId = entityRef.getId();

		Assertions.assertThat(entifyRefId).isNotNull();

		service.delete(entifyRefId);

		Optional<Vehicle> entityDeleted = service.findById(entifyRefId);

		Assertions.assertThat(entityDeleted).isNotPresent();
	}

}
