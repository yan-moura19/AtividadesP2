# Operadores

## Aritméticos:

- **Soma** : '+'
- **Subtração** : '-'
- **Multiplicação** : '*'
- **Divisão** : '/'
- **Resto da divisão** : '%'

```java
    int a = 1;
    a = a + 1;        //Soma 1 em a
    a = a - 1;        //Subtrai 1 de a
    a = a * 1;        //Multiplica a por 1
    a = a / 2;        //Divide a por 2
    a = a % 2;        //Pega o resto divisão de a por 2
  
```

## Unários:

- **incremento** : '++'
- **Decremento** : '--'
- **Inversor** : '!'

```java
    int a = 1  ;         
    int b = a++;        //incrementa a em b
    int c = a--;        //decrementa a em c
    
    
    boolean teste = true;
    teste = !teste;        //o valor de teste foi invertido para false
```
## Relacionais:

- **Menor que** : '<'
- **Maior que** : '>'
- **Menor/igual** : '<='
- **Maior/igual** : '>='

```java
  int a = 1;
  int b = 2;
  
  if ( a < b ){
     System.out.println(" 'a' é menor que 'b' ")
  }
  if ( a > b ){
     System.out.println(" 'a' é maior que 'b' ")
  }
  if ( a >= b ){
     System.out.println(" 'a' é maior/igual que 'b' ")
  }
  if ( a <= b ){
     System.out.println(" 'a' é menor/igual que 'b' ")
  }
  
```

## Atribuição:

- **Atribui somando** : '+='
- **Atribui subtraindo** : '-='
- **Atribui multiplicando** : '*='
- **Atribui dividindo** : '/='
```java
    int a = 1  ;         
    int b  += a;        // atribui a somando com b 
    int c  -= a;        // atribui a subtraindo com c
    int d  *= a;        // atribui a multiplicando com d
    int e  /= a;        // atribui a dividindo com e
      
```

## Lógicos:

- **Simula uma porta AND** : '&&'
- **Simula uma porta OU**  : '||'
```java
  int a = 1;
  int b = 2;
  int c = 3;
  
  if ( a < b && c > b){
     System.out.println(" 'a' é menor que 'b' e  'c' é maior que 'b' ")
  }
   if ( a < b || c > b){
     System.out.println(" 'a' é menor que 'b' ou'c' é maior que 'b' ")
  }
  
```
