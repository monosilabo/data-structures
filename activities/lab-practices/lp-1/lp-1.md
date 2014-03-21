# Laboratory practice

## Q&A

Write some programs to answer the following questions.

1. What is the value of `Math.abs(-2147483648)`?
2. Can you use < and > to compare String variables?
3. Why do we say (a && b) and not (a & b)? What is the difference between those operators?
4. If a[] is an array, why does System.out.println( a) print out a hexadecimal integer, such as @f62373, instead of the elements of the array?

## Exercises

1. Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.
2. What does the following program print?

	```
	int f = 0;
	int g = 1; 
	for (int i = 0; i <= 15; i++) {
		System.out.println(f); 
		f = f + g;
		g = f - g;
	}
	```

3. What do each of the following print? Explain each outcome.
	
	a. `System.out.println('b');`
	b. `System.out.println('b' + 'c');`
	c. `System.out.println((char) ('a' + 4));`
	
4. Write a code fragment that puts the binary representation of a positive integer N into a String s.
5. Write a code fragment that prints the contents of a two-dimensional boolean array (N x M), using * to represent true and a - to represent false. Include row and column numbers.

	* Input: 0 1 0 1 | 1 1 1 1 | 0 0 0 0
	* Output:
	
		0,0 -  
		0,1 *  
		0,2 -  
		0,3 *  
		1,0 *  
		...
		
6. 	Write a code fragment to print the transposition (rows and columns changed) of a two-dimensional array with M rows and N columns.
7. 	Write a static method `histogram()` that takes an array `a[]` of `int` values and an integer `M` as arguments and returns an array of length `M` whose `i`th entry is the number of times the integer `i` appeared in the argument array. If the values in `a[]` are all between `0` and `M − 1`, the sum of the values in the returned array should be equal to `a.length`.


	* Input: 2 3 3 1 | 4
	* Output: 0 1 1 2
