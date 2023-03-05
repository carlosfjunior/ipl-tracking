from config import db
from sqlalchemy.dialects.postgresql import UUID
import uuid


class TelemetryData(db.Model):
    __tablename__ = "telemetry_data"

    telemetry_data_id = db.Column(UUID(as_uuid=True), primary_key=True, default=uuid.uuid4)
    vehicle_id = db.Column(UUID(as_uuid=True))
    date = db.Column(db.DateTime)
    sensor_type = db.Column(db.String(255))
    value = db.Column(db.String(255))

    def get_id(self):
        return self.telemetry_data_id

    def __init__(self, telemetry_data_id, vehicle_id, date, sensor_type, value):
        self.telemetry_data_id = telemetry_data_id
        self.vehicle_id = vehicle_id
        self.date = date
        self.sensor_type = sensor_type
        self.value = value

    def __repr__(self):
        return 'TelemetryData(telemetry_data_id=%d, vehicle_id=%s, date=%s, sensor_type=%s, value=%s)' % (
            self.telemetry_data_id, self.vehicle_id, self.date, self.sensor_type, self.value)

    def json(self):
        return {'telemetry_data_id': str(self.telemetry_data_id), 'vehicle_id': str(self.vehicle_id), 'date': self.date,
                'sensor_type': self.sensor_type, 'value': self.value}


class GeoData(db.Model):
    __tablename__ = "geo_data"

    geo_data_id = db.Column(UUID(as_uuid=True), primary_key=True, default=uuid.uuid4)
    vehicle_id = db.Column(UUID(as_uuid=True))
    date = db.Column(db.DateTime)
    sensor_type = db.Column(db.String(255))
    latitude = db.Column(db.String(255))
    longitude = db.Column(db.String(255))
    altimeter = db.Column(db.String(255))

    def get_id(self):
        return self.geo_data_id

    def __init__(self, geo_data_id, vehicle_id, date, sensor_type, latitude, longitude, altimeter):
        self.geo_data_id = geo_data_id
        self.vehicle_id = vehicle_id
        self.date = date
        self.sensor_type = sensor_type
        self.latitude = latitude
        self.longitude = longitude
        self.altimeter = altimeter

    def __repr__(self):
        return 'GeoData(geo_data_id=%d, vehicle_id=%s, date=%s, sensor_type=%s, latitude=%s, longitude=%s, ' \
               'altimeter=%s)' % (
            self.geo_data_id, self.vehicle_id, self.date, self.sensor_type, self.latitude, self.longitude,
            self.altimeter)

    def json(self):
        return {'geo_data_id': str(self.geo_data_id), 'vehicle_id': str(self.vehicle_id), 'date': self.date,
                'sensor_type': self.sensor_type, 'latitude': self.latitude, 'longitude': self.longitude,
                'altimeter': self.altimeter}