function fibonacci(n) {
  if (n <= 0) return [];
  if (n === 1) return [0];
  if (n === 2) return [0, 1];

  let fib = [0, 1];
  for (let i = 2; i < n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2];
  }
  return fib;
}

console.log("Primeros 5:", fibonacci(5));
console.log("Primeros 10:", fibonacci(10));
console.log("Primeros 10:", fibonacci(20));
