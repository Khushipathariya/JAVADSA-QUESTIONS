public class countnumelement {
    public static void main(String[] args){
        int[] arr={3,5,7,9,12,56};
        int n=10;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>n)
                count++;
        }
        System.out.println("the number of element:- "+n+ " = " + count);
    }
    
}
