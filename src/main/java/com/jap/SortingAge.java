package com.jap;

public class SortingAge {
    public void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int[] getSortedAge(int [] ageArray) {

//        for (int i = 1; i < ageArray.length; i++) {
//            int key = ageArray[i];//key=arr[1]
//            int j = i - 1;//j=0
//            while (j >= 0 && ageArray[j] > key) {
//                ageArray[j + 1] = ageArray[j];//j=1
//                j = j - 1;
//            }
//            ageArray[j + 1] = key;
//
//        }
        int temp=0;
        for(int i=0;i< ageArray.length;i++){
            for(int j=0;j<ageArray.length-i-1;j++){
                if(ageArray[j]<ageArray[j+1]){
                    temp=ageArray[j];
                    ageArray[j]=ageArray[j+1];
                    ageArray[j+1]=temp;
                }
            }
        }
        return ageArray;
    }

    public static void main(String[] args) {
int[] ageArr={22,34,33,32,36,27,28};
SortingAge sortingAge=new SortingAge();
        //Call the method getSortedAge and pass the parameter
int[] sorted=sortingAge.getSortedAge(ageArr);
sortingAge.printArray(sorted);


    }
}
