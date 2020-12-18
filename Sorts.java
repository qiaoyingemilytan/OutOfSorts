public class Sorts{

  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean sorted = false;
    while(!sorted){
      sorted = true;
      for(int i = 0; i < data.length-1; i++){
        if(data[i] > data[i+1]){
          temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
      for(int i = 0; i < data.length-1; i++){
        if(data[i] > data[i+1]){
          sorted = false;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length; i++){
      int index = i;
      for(int j = i + 1; j < data.length; j++){
        if(data[j] < data[i]){
          index = j;
        }
      }
      int temp = data[index];
      data[index] = data[i];
      data[i] = temp;
    }
  }

}
