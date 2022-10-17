import numpy
from time import time
arreglo = list()

def llenarArreglo(N):
  aux=N
  for i in range(0,N,1):
    arreglo.insert(i,aux)
    aux-=1

def imprimirArreglo():
  for i in range(0,numpy.size(arreglo),1):
    print(arreglo[i])
def intercambio(min,i):
  aux=arreglo[i]
  arreglo[i]=arreglo[min]
  arreglo[min]=aux
  
def algoritmoBurbuja(N):
  start=time()
  for i in range(N,1,-1):
    for j in range(1,i,1):
      if arreglo[j-1]>arreglo[j]:
        intercambio(j-1,j)
  stop=time()
  elapsed_time=stop-start
  print("N: ",N,"Tiempo: ",elapsed_time,"s")
  #print(elapsed_time)

  


for i in range(100,10000,100):
  llenarArreglo(i)
  #imprimirArreglo()
  algoritmoBurbuja(i)
  #imprimirArreglo()

