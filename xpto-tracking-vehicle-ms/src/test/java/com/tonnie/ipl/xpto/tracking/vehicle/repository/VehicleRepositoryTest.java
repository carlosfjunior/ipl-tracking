package com.tonnie.ipl.xpto.tracking.vehicle.repository;

import com.tonnie.ipl.xpto.tracking.vehicle.model.Vehicle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;
import java.util.UUID;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VehicleRepositoryTest {

	@Autowired
    private VehicleRepository repository;
	
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
	void list(){
		
		Assertions.assertThat(repository.findAll()).hasSize(2);
		
	}

	@Test
    @Order(2)
    @Rollback(value = false)
    void save(){

    	Vehicle entity = repository.save(createTestEntity());

        Assertions.assertThat(entity.getId()).isNotNull();
        
    }

    @Test
    @Order(3)
    void findById(){

        Vehicle entityRef = repository.save(createTestEntity());
    	
    	Optional<Vehicle> entityReturned = repository.findById(entityRef.getId());
    	
    	Assertions.assertThat(entityReturned)
    	.isPresent()
    	.contains(entityRef);

    }
    
    @Test
    @Order(4)
    void findByIdFails(){

    	Optional<Vehicle> entityReturned = repository.findById(UUID.randomUUID());
    	
    	Assertions.assertThat(entityReturned).isNotPresent();

    }

    @Test
    @Order(5)
    @Rollback(value = false)
    void updateSensor(){

        Vehicle entityRef = repository.save(createTestEntity());
    	
    	entityRef.setColor("blue");

        Vehicle entityUpdated = repository.save(entityRef);

        Assertions.assertThat(entityUpdated.getColor()).startsWith("blue");

    }

    @Test
    @Order(6)
    @Rollback(value = false)
    void deleteSensor(){

        Vehicle entityRef = repository.save(createTestEntity());
    	
    	UUID entifyRefId = entityRef.getId();
    	
        Assertions.assertThat(entifyRefId).isNotNull();

        repository.delete(entityRef);
       
        Optional<Vehicle> entityDeleted = repository.findById(entifyRefId);

        Assertions.assertThat(entityDeleted).isNotPresent();
    }

	
}
