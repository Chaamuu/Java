public class index{


    public static int linearSearch(int numbers[],int key){

        for(int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={10,33,28,99,12,87,21,34};
        int key=33;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is at index:" +index);
        }
    }
}
