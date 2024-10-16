import requests as req
import re
from colorama import init, Fore

init()


def get_weather_data():
    res = req.get("https://geolocation.microlink.io")
    data = res.json()
    return data


data = get_weather_data()

pattern = r"\b\w+/\w+/"


def clean_text(txt) -> str:
    format_text = re.sub(pattern, "", txt)
    return format_text


ip = data["ip"]["address"]
city = data["city"]["name"]
province = data["timezone"]
country = data["country"]["name"]

print(
    f"Usted está en {city} {clean_text(province)}, {country}. Su dirección de IP es: {ip}"
)
