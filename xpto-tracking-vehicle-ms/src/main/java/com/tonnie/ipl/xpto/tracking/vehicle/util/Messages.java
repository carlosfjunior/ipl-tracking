package com.tonnie.ipl.xpto.tracking.vehicle.util;

public final class Messages {
	
	private Messages() {
		throw new IllegalStateException("Utility class");
	}

	public static final String VEHICLE_NOT_FOUND_FOR_ID = "Vehicle not found. ID: %s";
	public static final String TELEMETRY_PROFILE_ASSOCIATION_FAILED_TELEMETRY_PROFILE_NOT_FOUND = "Target TelemetryProfile not found. It's not possible to associate to a vehicle. TelemetryProfile ID: %s";
	public static final String CUSTOMER_OWNER_ASSOCIATION_FAILED_CUSTOMER_NOT_RELATED = "Target Customer not related to the Driver. It's not possible to associate to a vehicle. CustomerOwner ID: %s";
	public static final String CURRENT_DRIVER_ASSOCIATION_FAILED_DRIVER_NOT_FOUND = "Target Driver not found. It's not possible to associate to a vehicle. CurrentDriver ID: %s";

}
