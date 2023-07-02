public class BinarySerach{
    public static int Binary(int numbers[],int key){
        int start=0,end=numbers.length-1;

        while (start <= end){
            int mid = (start + end)/2;

            //comparision
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;

            }else{
            end = mid-1;
        }
    }
    return -1;
}
    public static void main(String args[]){
        int numbers[]={10,20,30,40,50};
        int key=30;
        System.out.println("the index for  key is:"  + Binary(numbers,key));
    }

}