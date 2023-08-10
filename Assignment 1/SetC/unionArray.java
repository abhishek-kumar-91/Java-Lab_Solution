public class unionArray {
    public static void main(String args[]){
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int size = arr1.length;
        int totalLength = arr1.length + arr2.length;
        int [] newArray = new int[totalLength];

        for(int i = 0; i < arr1.length; i++){
                newArray[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            newArray[size++] = arr2[i];
        }

        //print union array

        for(int i = 0; i < totalLength; i++){
            System.out.println(newArray[i]);
        }
    }
}
