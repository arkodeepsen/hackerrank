#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int n,m;
    scanf("%d %d", &n, &m);
    float a,b;
    scanf("%f %f", &a, &b);
    printf("%d ", n+m);
    printf("%d \n", n-m);
    printf("%.1f ", a+b);
    printf("%.1f \n", a-b);
    return 0;
}
