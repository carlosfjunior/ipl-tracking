from models.entities import TelemetryData, GeoData
from models.repositories import BaseRepository, TelemetryDataRepository, GeoDataRepository
from typing import List, Type


class BaseService:

    repository: BaseRepository = NotImplementedError
    entity: Type = NotImplementedError

    def fetch_by_id(self, entity_id) -> entity:
        return self.repository.fetch_by_id(entity_id)

    def fetch_all(self) -> List[entity]:
        return self.repository.fetch_all()

    def save(self, entity) -> entity:
        return self.repository.create(entity)


class TelemetryDataService (BaseService):

    def __init__(self):
        self.repository = TelemetryDataRepository()
        self.entity = TelemetryData


class GeoDataService(BaseService):

    def __init__(self):
        self.repository = GeoDataRepository()
        self.entity = GeoData
