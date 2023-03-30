let numero = Number(prompt("¡Adivina el numero secreto! Ingresa un numero del 1 al 100"))

while(isNaN(numero)) {
    alert("Solo puedes ingresar numeros");
    numero = Number(prompt("¡Adivina el numero secreto! Ingresa un numero del 1 al 100"));
}
let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let numerosIntroducidos = [];

while (true) {
    numerosIntroducidos.push(numero);
  
    if (numero === numeroSecreto) {
      console.log("Le atinaste al número secreto.");
      console.log("Los números previos son: " + numerosIntroducidos.join(", "));
      break;
    } else {
      console.log(` ${numero} ` + " NO es el numero secreto. Intentalo de nuevo");
      numero = Number(prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:"));
      while (isNaN(numero)) {
        alert("Solo puedes ingresar números.");
        numero = Number(prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:"));
      }
    }
  }