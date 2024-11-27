class pradeep {
    public static void main(String[] args) {

        // int n=5;
        // for(int i = 1;i<=n;i++){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }


    //  int n=5;
    //  for(int i =n;i>=1;i--){
    //     for(int j =1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+j);
    //     }
    //     System.out.println();
    // }

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j =1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

//     int n  = 5;
// for(int i=n;i>=1;i--){
//     System.out.print(i);
// }

// int n =5;
// for(int i=0;i<n;i++){
//     for(int j=0;i<n-i-1;j++){
//         System.out.print(" ");
//     }
//     int value=1;
//     for(int j =0;j<=i;j++){
//         System.out.print(value +" ");
//         value = value*(i-j)/(j+1);
//     }
//     System.out.println();
// }
int n = 5;
for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    int value=1;
    for(int j=0;j<=i;j++){
        System.out.print(value +" ");
        value = value*(i-j)/(j+1);
    }
    System.out.println();
}


    }
}
