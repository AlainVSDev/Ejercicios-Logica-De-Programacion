let temperatura = Number(prompt("Ingrese la temperatura que deseas convertir en grados Celsius:"));

while (isNaN(temperatura)) {
  alert("ERROR Solo puedes ingresar valores numéricos.");
  temperatura = Number(prompt("Ingrese la temperatura en grados Celsius:"));
}

let farenheit = (temperatura * 9/5) + 32;
let kelvin = temperatura + 273.15;

console.log(`${temperatura} grados Celsius equivalen a ${farenheit.toFixed(2)} grados Farenheit y ${kelvin.toFixed(2)} grados Kelvin.`);
