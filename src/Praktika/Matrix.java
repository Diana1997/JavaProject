package Praktika;

/**
 * Created by Harut on 16.05.2017.
 */
public class Matrix {

    static void printArr(int[][] arr){
        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void Matrix47(){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,6,3},
                {7,5,6,8},
        };
        int k1 = 0, k2 = 3;
        int[] t = arr[k1];
        arr[k1] = arr[k2];
        arr[k2] = t;
        printArr(arr);
    }

    static void Matrix49(){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,6,3},
                {7,5,6,8},
        };
        int max = 0, min = 0;
        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr[i].length; ++j){
                if(arr[i][j] > arr[i][max]){
                    max = j;
                }
                if(arr[i][j]<arr[i] [min]){
                    min = j;
                }
            }
            int t = arr[i][min];
            arr[i][min] = arr[i][max];
            arr[i][max] = t;
        }

        printArr(arr);
    }


    /*static void Matrix50(){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,6,3},
                {7,5,6,8},
        };
        int max = 0, min = 0;
       for(int i=0; i<arr[].length; ++i){
            for(int j=0; j<arr.length; ++j){
                if(arr[j][i] > arr[max][i]){
                    max = j;
                }
                if(arr[j][i] < arr[min] [i]){
                    min = j;
                }

            }
          // System.out.println(max);
          // System.out.println(min);
         /*  int t = arr[min][i];
           arr[min][i] = arr[max][i];
           arr[max][i] = t;
*/
        //}
        //printArr(arr);

    //}

    static void Matrix51(){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {2,3,0,5}
        };
        int min = arr[0][0], max = arr[0][0], minInd = 0, maxInd = 0;
        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr[i].length; ++j){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    minInd = i;
                }
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxInd = i;
                }
            }

        }


        int t[] = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = t;
        printArr(arr);
    }

    static void Matrix52(){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {2,3,0,5}
        };
        int min = arr[0][0], max = arr[0][0], minInd = 0, maxInd = 0;
        for(int i=0; i<arr.length; ++i){
            for(int j=0; j<arr[i].length; ++j){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    minInd = j;
                }
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxInd = j;
                }
            }

        }

        for(int i=0; i<arr.length; ++i){
            int t = arr[i][max];
            arr[i][maxInd] = arr[i][minInd];
            arr[i][minInd] = t;
        }
        System.out.println(maxInd);
        System.out.println(minInd);
        printArr(arr);
    }
    public static void main(String[] args) {
        System.out.println("--------------Matrix(47)-------------------");
        Matrix47();
        System.out.println("--------------Matrix(47)-------------------");
        Matrix49();
        //System.out.println("--------------Matrix50()-------------------");
       // Matrix50();
        System.out.println("--------------Matrix(47)-------------------");
        Matrix51();
        System.out.println("--------------Matrix(47)-------------------");
      Matrix52();

    }
}
