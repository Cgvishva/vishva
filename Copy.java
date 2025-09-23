class Copy{
    public static void main(String[]args){
        int[] arr = {3,3,6,1};
        int large =arr [0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
         System.out.println(large);
}

}
