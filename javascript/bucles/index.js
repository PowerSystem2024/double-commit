const $ = (el) => document.querySelector(el);

const styles = {
  background: "rgba(236, 236, 236, 0.582)",
  color: "yellow",
  "font-style": "italic",
  "padding-inline": "4px",
  "border-radius": "4px",
};

const preStyles = {
  "background-color": "#1E2227",
  color: "green",
  width: "50%",
  padding: "8px",
  "border-bottom": "1px solid #2D2E32",
  "border-left": "1px solid #2D2E32",
  "border-radius": "4px",
  "font-family": "Cascadia Code PL SemiBold",
  "font-size": "14px",
  "text-wrap": "pretty",
};

const convertStylesToString = (stylesObject) => {
  return Object.entries(stylesObject)
    .map(([key, value]) => `${key}: ${value}`)
    .join("; ");
};

const addStyles = (styleType, children) => {
  const stylesObject = styleType === "span" ? styles : preStyles;
  const stylesString = convertStylesToString(stylesObject);

  if (styleType === "span") {
    return `<span style="${stylesString}">${children}</span>`;
  } else if (styleType === "pre") {
    return `<pre style="${stylesString}">${children}</pre>`;
  } else {
    throw new Error("Unsupported style type");
  }
};

// Contador de vocales
function vowelsCounter(frase) {
  const vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ";
  let counter = 0;
  for (const letra of frase) {
    if (vowels.includes(letra)) {
      counter++;
    }
  }
  return counter;
}

// Otro bucle contador de vocales
function vowelsCounter2(frase) {
  const vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ";
  let counter = 0;
  for (let i = 0; i < frase.length; i++) {
    if (vowels.includes(frase[i])) {
      counter++;
    }
  }
  return counter;
}
// Arrays
const fruits = [
  "🍎",
  "🍏",
  "🍇",
  "🍈",
  "🍉",
  "🍊",
  "🍌",
  "🍍",
  "🥭",
  "🍋",
  "🥝",
  "🥑",
  "🍓",
  "🍒",
  "🍑",
];

function printFruit(fruits) {
  let result = "Frutas: ";
  for (let i = 0; i < fruits.length; i++) {
    result += fruits[i];
  }
  return ($(".result-container-2").innerHTML = result);
}
$(".pre-1").innerHTML = `${addStyles("pre", printFruit)}`;
$(".result-container-3").innerHTML = printFruit(fruits);

function parImpar(...nums) {
  const group = {
    Par: [],
    Impar: [],
  };
  nums.forEach((n) => {
    n % 2 === 0 ? group.Par.push(n) : group.Impar.push(n);
  });
  return group;
}
$(".pre-2").innerHTML = `${addStyles("pre", parImpar)}`;
const result = parImpar(1, 2, 3, 4, 5, 6, 7, 8, 9);
$(".result-container-3").innerHTML = `Par: ${addStyles(
  "span",
  result.Par.join(", ")
)} Impar: ${addStyles("span", result.Impar.join(", "))}`;

document.addEventListener("DOMContentLoaded", () => {
  const $input = $("input");
  const template = $("#result-template").content;

  $("form").addEventListener("submit", (event) => {
    event.preventDefault();

    const clone = template.cloneNode(true);
    clone.querySelector(".result").innerHTML = `
      <p>La palabra ${addStyles(
        "span",
        $input.value
      )} contiene ${vowelsCounter2($input.value)} vocales.</p>
    `;

    const resultContainer = $(".result-container");
    resultContainer.innerHTML = "";
    resultContainer.appendChild(clone);
    $input.value = "";
  });
});
