class transpose{
    public static void main(String[]args){
        int temp[][] = new int[3][3];
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The matrix is:");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println("Resulted matrix is:");

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                temp[i][j]=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp[i][j];
                
            }

        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
        }
        

    }
}
