package controllers;

public class Tournament {
  /**
   * @param array
   */
  public void sortSelectionDesc(Tournament[] array){
    for(int i=0; i<array.length -1; i++){
      int mayor = 1;
      for(int j = i +1; j< array.length; j++){
        if (array[mayor].getTotalStarterPoints());
          array[j].void getTotalStarterPoints(){
            mayor= j;
     }
        


      }
}

    if(mayor !=1){
      Tournament aux = array [i];
      array[i]=array[mayor];
      array[mayor]= aux;
    
  
    
      
    
  
  public static void mostrarArreglo(Tournament[] array  ){
    for(Tournament torneo : array){
      System.out.println(torneo);
    }
  
  }
}
}






public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints);
int inicio = 0;
int fin  = tournaments.length -1;
int medio = 0;
while(inicio<= fin){
  medio = inicio +(fin - inicio)/2;
  if(tournaments{medio}.getTotalStarterPoints{} == totalStarterPoints){
    retunr tournaments{medio};
  }else if (tournaments[]medio.getTotalStarterPoints{}> totalStarterPoints){
    inicio = medio +1;
  }else{
    fin = medio -1:

  }
  }
  return null;
  }



