let numero = Number(prompt("Ingresa un numero para saber su factorial"));

while(isNaN(numero)) {
    alert("Solo puedes ingresar numeros");
    numero = Number(prompt("Ingresa un numero para saber su factorial"));
}
let factorial = 1

for (let i=1; i<=numero; i++) {
    factorial *= i;
}

console.log(`El factorial de ${numero} es ${factorial}`);
