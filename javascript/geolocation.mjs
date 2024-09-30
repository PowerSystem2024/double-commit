const createGoogleMap = (longitude, latitude) => `
         <iframe
          src=https://www.google.com/maps/embed?pb=!1m17!1m12!1m3!1d3362.721134731404!2d${longitude}!3d${latitude}!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m2!1m1!2zMzLCsDMzJzM3LjAiUyA2NcKwMTQnMDYuNSJX!5e0!3m2!1ses-419!2sar!4v1716605671110!5m2!1ses-419!2sar
          loading="lazy"
        ></iframe>
`;

const createHTML = (latitude, longitude, accuracy, speed, ts) => `
    <div>
      <header>
        <h3>Ubicación</h3>
      </header>
      <aside>
        <table>
          <thead>
            <tr>
              <th>Latitud</th>
              <th>Longitud</th>
              <th>Presición</th>
              <th>Velocidad</th>
              <th>Hora</th>
            </tr>
          </thead>
          <tbody>
            <td>${latitude}</td>
            <td>${longitude}</td>
            <td>${accuracy} mts.</td>
            <td>${speed}</td>
            <td>${ts}</td>
          </tbody>
        </table>
      </aside>
      ${createGoogleMap(longitude, latitude)}
    </div>
`;

function formatTime(ts) {
  const date = new Date(ts).toLocaleTimeString("es-Es", {
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
  });
  return date;
}

function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition((position) => {
      const latitude = position.coords.latitude;
      const longitude = position.coords.longitude;
      const accuracy = position.coords.accuracy;
      const speed =
        position.coords.speed === null ? "Solo móvil" : position.coords.speed;
      const ts = position.timestamp;
      document.body.innerHTML = createHTML(
        latitude,
        longitude,
        accuracy.toFixed(2),
        speed,
        formatTime(ts)
      );
    });
  }
}

let array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let array2 = ["a", "b", "c", "d", "e", "f", "g", "h"];

function recorrerArrays(arr1, arr2) {
  let hash = "";
  let i = 0,
    j = 0;
  while (i < arr1.length || j < arr2.length) {
    if (i < arr1.length) {
      hash += arr1[i++];
    }
    if (j < arr2.length) {
      hash += arr2[j++];
    }
    if (i % arr1.length === 4) {
      hash += "_";
    }
    if (j % arr1.length === arr2.length) {
      hash += "_";
    }
  }
}
recorrerArrays(array1, array2);

document.addEventListener("DOMContentLoaded", () => {
  getLocation();
});
