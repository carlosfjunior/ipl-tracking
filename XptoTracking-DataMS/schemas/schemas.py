from flask_marshmallow.fields import fields

from config import ma
from models.entities import TelemetryData, GeoData


class TelemetryDataSchema(ma.SQLAlchemyAutoSchema):
    telemetryDataId = fields.String(attribute="telemetry_data_id")
    vehicleId = fields.String(attribute="vehicle_id")

    class Meta:
        model = TelemetryData
        load_instance = True
        exclude = ["telemetry_data_id", "vehicle_id"]


class GeoDataSchema(ma.SQLAlchemyAutoSchema):
    geoDataId = fields.String(attribute="geo_data_id")
    vehicleId = fields.String(attribute="vehicle_id")

    class Meta:
        model = GeoData
        load_instance = True
        exclude = ["geo_data_id", "vehicle_id"]
