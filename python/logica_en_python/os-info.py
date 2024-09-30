import os
import platform
import psutil
from colorama import init, Fore, Style

init()

system = platform.system()
release = platform.release()
version = platform.version()
machine = platform.machine()
processor = platform.processor().replace(" 25", "").replace("Stepping 0, ", "")
threads = os.cpu_count()
total_ram = round(psutil.virtual_memory().total / (1024**3), 2)
available_ram = round(psutil.virtual_memory().available / (1024**3), 2)
disk_usage = psutil.disk_usage("/")
total_disk = round(disk_usage.total / (1024**3), 2)
free_disk = round(disk_usage.free / (1024**3), 2)

output = f"""{Fore.BLUE}|-----------------------------------------------------------|
|{Fore.LIGHTYELLOW_EX}           Especificaciones del Sistema Operativo          {Fore.BLUE}|
|-----------------------------------------------------------|
|{Fore.BLUE} Sistema Operativo  | {Fore.LIGHTBLACK_EX}{system:<35}  {Fore.BLUE}|
|{Fore.BLUE} Versión            | {Fore.LIGHTBLACK_EX}{release:<36} {Fore.BLUE}|
|{Fore.BLUE} Build              | {Fore.LIGHTBLACK_EX}{version:<36} {Fore.BLUE}|
|{Fore.BLUE} Arquitectura       | {Fore.LIGHTBLACK_EX}{machine:<36} {Fore.BLUE}|
|{Fore.BLUE} Procesador         | {Fore.LIGHTBLACK_EX}{processor}   {Fore.BLUE}|
|{Fore.BLUE} Núcleos/Hilos      | {Fore.LIGHTBLACK_EX}{threads:<36} {Fore.BLUE}|
|{Fore.BLUE} RAM Total          | {Fore.LIGHTBLACK_EX}{total_ram} GB                             {Fore.BLUE}|
|{Fore.BLUE} RAM Disponible     | {Fore.LIGHTBLACK_EX}{available_ram} GB                              {Fore.BLUE}|
|{Fore.BLUE} Disco Total        | {Fore.LIGHTBLACK_EX}{total_disk} GB                            {Fore.BLUE}|
|{Fore.BLUE} Disco Libre        | {Fore.LIGHTBLACK_EX}{free_disk:<2} GB                              {Fore.BLUE}|
|-----------------------------------------------------------|{Style.RESET_ALL}"""
print()
print(
    output.format(
        system=system,
        release=release,
        version=version,
        machine=machine,
        processor=processor,
        threads=threads,
        total_ram=total_ram,
        available_ram=available_ram,
        total_disk=total_disk,
        free_disk=free_disk,
    )
)
print()
