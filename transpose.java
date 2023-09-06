class transpose{
    public static void main(String[]args){
        int temp[][] = new int[3][3];
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The matrix is:");

        for(int a[]:arr){
            for(int b:a)
                System.out.print(b+" ");
            }
            System.out.println("");
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
        
        for(int c[]:arr){
            for(int d:c){
                System.out.print(d+" ");
            }
            System.out.println("");
        }
        

    }
}
