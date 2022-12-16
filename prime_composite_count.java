import java.io.*;
class prime_composite_count
{
static int MAX = 1000000;
static int []prime = new int[MAX + 1];
static void updatePrimes()
{
for (int i = 2; i <= MAX; i++)
{
prime[i] = 1;
}
prime[0] = prime[1] = 0;
for (int i = 2; i * i <= MAX; i++)
{
if (prime[i] == 1)
{
for (int j = i * i; j <= MAX; j += i)
{
prime[j] = 0;
}
}
}
for (int i = 1; i <= MAX; i++)
{
prime[i] += prime[i - 1];
}
}
static int getDifference(int l, int r)
{
int total = r - l + 1;
int primes = prime[r] - prime[l - 1];
int composites = total - primes;
return (Math.abs(primes - composites));
}
public static void main (String[] args)
{
int queries[][] = { { 1, 10 }, { 5, 30 } };
int q = queries.length;
updatePrimes();
for (int i = 0; i < q; i++)
System.out.println (getDifference(queries[i][0],queries[i][1]));
}
}
