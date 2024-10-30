def get_ip():
    import requests

    res = requests.get("http://geolocation.microlink.io")
    data = res.json()
    return data


data = get_ip()

ip = data["ip"]["address"]
city = data["city"]["name"]
country = data["country"]["name"]

print(f"Usted se encuentra en {city}, {country} su IP es: {ip}")
