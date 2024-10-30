import requests


class Location:
    requests_count = 0

    def __init__(self):
        Location.requests_count += 1
        self._request_id = Location.requests_count
        self._location_data = self._get_location_data()

    def _get_location_data(self):
        response = requests.get("https://geolocation.microlink.io")
        return response.json()

    @property
    def ip(self) -> str:
        return self._location_data["ip"]["address"]

    @property
    def city(self) -> str:
        return self._location_data["city"]["name"]

    @property
    def country(self):
        return self._location_data["country"]["name"]

    @property
    def state(self):
        sta = self._location_data["timezone"].replace("America/Argentina/", "")
        return sta.replace("_", " ")

    def __str__(self) -> str:
        return f"""
        Ciudad: {self.city} ({self.state}), País: {self.country}
        {self._request_id}° Llamada a la API
        Su dirección de IP es: {self.ip}
        """
