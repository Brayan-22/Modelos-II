#include <chrono>//libreria para calcular tiempos
#include <iostream>
using namespace std;
using namespace std::chrono;
using std::cout; using std::ofstream;
using std::endl; using std::string;
using std::fstream;
//metodo necesario para los intercambios en el ordenamiento burbuja
void intercambio(int a[], int min, int i){
	int aux;
	aux=a[i];
	a[i]=a[min];
	a[min]=aux;
}
//Metodo que ordena el arreglo usando el algoritmo burbuja
void burbuja (int a[], int N){
	int i,j;
	time_point<steady_clock> start, stop;
	start = steady_clock::now();
 	for (i=N; i>=1; i--)
		for(j=2; j<=i; j++)
 			if(a[j-1]> a[j]) intercambio(a,j-1,j);

 	stop = steady_clock::now();
 	duration<double> elapsed = (stop - start);
    cout<<"N:"<<N<<"\n"<<"Tiempo: "<<elapsed.count()<<" s."<<endl;
}

int main(int argc, char *argv[]){
	int N;
    cout<<"N representa la cantidad de datos en el arreglo"<<endl;
	for(int i=100; i<=10000; i+=100){
		N=i;
		int a[N];
		for(int j=N;j>=0;j--)
			a[N-j]=j;//Llena el arreglo en orden inverso, para que el algoritmo burbuja trabaje con su peor caso: O(N^2)
		burbuja(a, N);
	}

	return 0;
}
