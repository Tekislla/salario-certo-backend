# Backend da aplicação Salário certo (https://salariocerto.vercel.app)

### Endpoint de cálculo:
```https://salario-certo-backend-bef60a9bc195.herokuapp.com/salario-certo/calcular/```

### Exemplo de request:
```
{
    "modelSalBruto": 5000.00,
    "modelDescFixo": 0,
    "modelPensaoAlimenticia": 150.99,
    "modelNumDependentes": 2
}
```
### Exemplo de response:
```
{
    "salBruto": 5000.0,
    "descFixo": 0.0,
    "pensaoAlimenticia": 150.99,
    "numDependentes": 2,
    "descontoINSS": 526.1925,
    "descontoIRRF": 0.0,
    "salLiquido": 4473.8075
}
```
