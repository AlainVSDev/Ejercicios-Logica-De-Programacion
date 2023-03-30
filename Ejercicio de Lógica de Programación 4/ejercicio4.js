let numero = Number(prompt("Serie de Fibonacci Ingresa un numero"));

while(isNaN(numero)) {
    alert("Solo puedes ingresar numeros");
    numero = Number(prompt("Serie de Fibonacci Ingresa un numero"));
}

function fibonacci(n) {
    if (n < 2) return n
    return fibonacci(n - 2) + fibonacci(n - 1)
}

console.log(`Los primeros ${numero} numeros de la serie de Fibonacci son: ` + Array.from({length: numero}, (_, i) => fibonacci(i)).join(", "));
