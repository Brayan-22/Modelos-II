#include <iostream>
using namespace std;
void llenarMatriz(char *aux[],int *sudoku[]);
void imprimirSudoku(int *sudoku[],int tam);
bool fuerzaBruta(int *sudoku[],int row,int col);
bool isValid(int *sudoku[],int row,int col,int num);
int conversion(char a);
int main(int argc, char *argv[]){
	if(argc<=1 || argc!=5){
		cout<<"Hacen falta parametros"<<endl;
	}else{
		int **sudoku;
		int tam=4;
		sudoku=new int *[tam];
		for(int i=0;i<tam;i++){
			sudoku[i]=new int[tam];
			for(int j=0;j<tam;j++){
				sudoku[i][j]=0;
			}
		}
		llenarMatriz(argv,sudoku);
		cout<<"Sudoku planteado:"<<endl;
		imprimirSudoku(sudoku,tam);
		fuerzaBruta(sudoku,0,0);
		cout<<endl;
		cout<<"Sudoku resuelto:"<<endl;
		imprimirSudoku(sudoku,tam);
		delete sudoku;
	}
	return 0;
}
void llenarMatriz(char *aux[],int *sudoku[]){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				char aux2=aux[i+1][j];
				sudoku[i][j]=conversion(aux2);;
			}
		}
}
int conversion(char a){
	int var;
	switch(a){
		case '0':
			var=0;
			break;
		case '1':
			var=1;
			break;
		case '2':
			var=2;
			break;
		case '3':
			var=3;
			break;
		case '4':
			var=4;
			break;
		case '5':
			var=5;
			break;
		case '6':
			var=6;
			break;
		case '7':
			var=7;
			break;
		case '8':
			var=8;
			break;
		case '9':
			var=9;
			break;
	}
	return var;
}
bool isValid(int *sudoku[],int row,int col,int num){
	for(int i=0;i<4;i++){
		if(sudoku[row][i]==num || sudoku[i][col]==num
		|| sudoku[(row/2) * 2 + i/2][(col/2)*2+i%2]==num){
			return false;
		}
	}
	return true;
}

void imprimirSudoku(int *sudoku[],int tam){
	for(int i=0;i<tam;i++){
		for(int j=0;j<tam;j++){
			cout<<sudoku[i][j]<<" ";
		}
		cout<<endl;
	}
}
bool fuerzaBruta(int *sudoku[],int row,int col){
	if(col == 4){
		return fuerzaBruta(sudoku,row + 1,0);
	}
	
	if(row == 4){
		return true;
	}
	if(sudoku[row][col]!=0){
		return fuerzaBruta(sudoku,row,col+1);
	}
	
	for(int i=1;i<=4;i++){
		if(!isValid(sudoku,row,col,i)){
			continue;
		}
		sudoku[row][col]=i;
		if(fuerzaBruta(sudoku,row,col+1)){
			return true;
		}
		sudoku[row][col]=0;
	}
	return false;
}
