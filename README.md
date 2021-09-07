# NagarroJava

// Question 1

		int N = 10000; //O(n^2)
		int a = 0;
		for (int i = 0; i < N; i++) { //N times 
			for (int j = N; j > i; j--) {
				a = a + i + j;
			}
		}


// Question 2

		int N = 10000;
		int a = 0, i = N;
		while (i > 0) {
			a += i;
			i /= 2; -> i = i / 2;
		}
    
// Question 3
```
                for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (int k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				}
			}
		}
		//O(n^2 *logn)
		
```

// Question 4
```
               for (i = 1; i <= n; i++) { //O(1000 * (n ^ 2))
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {

				}
			}
		}
```

 
// Question 5
```
int i = 1;

while(i <= n) {
      i++;
}
```
//O(n)

// Question 6
```
int i = 1;

while(i <= n) {
      i  = i + 2;
}
```
//n/2 -> O(n)

// Question 7
```
int i = 1;

while(i <= n) {
      i  = i + 2;
      i  = i + 3;
}
```
//n/5-> O(n)
// Question 8
```
int i = 1;

while(i <= n) {
      i  = i + k;
}
```
//n/k-> O(n/k)

// Question 9
```
int i = 1;

while(i <= n) {
      i  = i * 2;
}
```

// O(log<sub>2</sub>n)

// Question 10
```
int i = 1;

while(i <= n) {
      i  = i * 3;
}
```
// O(log<sub>3</sub>n)
// Question 11
```
int i = 1;

while(i <= n) {
      i  = i * 2;
      i  = i * 3;
}
```
// O(log<sub>6</sub>n)

// Question 12
```
int i = 1;

while(i <= n) {
      i  = i * k;
}
```
// O(log<sub>k</sub>n)

// Question 13
```
while(n > 0) {
      n = n - 1;
}
```
//O(n)

// Question 14
```
while(n > 0) {
      n = n - 2;
}
```
//n/2 ->O(n)

// Question 15
```
while(n > 0) {
      n = n - 2;
      n = n - 3;
}
```

//n/5 ->O(n)

// Question 16
```
while(n > 0) {
      n = n - k;
}
```
//n/k ->O(n/k)

// Question 17
```
while(n > 0) {
      n = n/2;
}
```
// O(log<sub>2</sub>n)

// Question 18
```
while(n > 0) {
      n = n/3;
}
```
// O(log<sub>3</sub>n)

// Question 19

```
while(n > 0) {
      n = n/2;
      n = n/3;
}
```
// O(log<sub>6</sub>n)

// Question 20

```
while(n > 0) {
      n = n/k;
}
```

// O(log<sub>k</sub>n)


// Question 21
```
                for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		} //O(sqrt(n))
```


