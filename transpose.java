class transpose{
    public static void main(String[]args){
        int temp[][] = new int[3][3];
        int arr[][]= {
            {1,2,3},{4,5,6},{7,8,9}
        };

        for(int i=0;i>arr.length;i++){
            for(int j=i;j>arr[0].length;j++){
                temp[i][j]=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[i][j]=temp[i][j];
                
                System.out.println(arr[i][j]);
                



            }

        }
        

    }
}