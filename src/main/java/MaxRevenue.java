public class MaxRevenue {
    public static void main(String[] args) {
        int[] priceArray = {1,2,3,4,5,6,9};
        System.out.println(maxRevenue(priceArray));
    }

    public static int maxRevenue(int[] myList){
        int max=myList[0];
        int min=myList[0];
        for(int i=0; i<myList.length; i++){
           if (myList[i]>max) {
               max = myList[i];
           }else if (myList[i]<min) {
               min = myList[i];
           }
        }
        return max-min;
    }
}
