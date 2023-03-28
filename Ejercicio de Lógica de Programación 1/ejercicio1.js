//Se solicitaran mediante pront 3 numeros al usuario
let num1 = Number(prompt("Ingrese el primer numero"));
let num2 = Number(prompt("Ingrese el segundo numero"));
let num3 = Number(prompt("Ingrese el tercer numero"))

//Verifica que sean numeros

if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
    console.log("Solo puedes ingresar Numeros");
} else {
    //identificamos el valor maximo, minimo y el del centro

    let mayor = Math.max(num1, num2, num3);
    let menor = Math.min(num1, num2, num3);
    let centro = num1 + num2 + num3 - mayor - menor;


//mostramos los numero de mayor a menor y viceversa

console.log("Tus numeros ordenados de mayor a menor son: ", (`${mayor}, ${centro}, ${menor}`));
console.log("Tus numeros ordenados de mayor a menor son: ",(`${menor}, ${centro}, ${mayor}`));

// se verifica los numeros iguales
if (num1 === num2 || num1 === num3) {
    console.log("tienes numeros iguales");
}} 