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
province = clean_text(province)
province = province.replace("_", " ")

print(
    f"{Fore.GREEN}Usted está en: {Fore.BLUE}{city} {province}, {country}. {Fore.GREEN}Su dirección de IP es: {Fore.BLUE}{ip}"
)
