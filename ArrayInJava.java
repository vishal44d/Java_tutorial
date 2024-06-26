class ArrayInJava{
public static void main(String[] args) {
    //datatype[] array_name= new int[no. of values to store];
    int[] arr = new int[5];
    //or
    //int [] arr;
    //arr=new int[5];
    arr[0] = 10;
    arr[1] = 12;
    arr[2] = 14;
    arr[3] = 16;
    arr[4] = 18;
    System.out.println("Output of arr is :"+arr);
    int [] arr2={0,1,2,3,4,5};
    int[] arr3;   //this is preferred
    //this also works: int arr3[]

    arr3= new int[]{12, 23, 6, 5, 5};
    //warning cuz i am not using arr3
    /*
    [I@6acbcfc0 some hashcode with respect to object reference
    Note: hash code is not the address of object it was jus a unique no generated by JVM .
    may use address and some algorithms .bit is not address
    because Java don't allow anyone to find address of the object.
    Hope this will work for u
     */
    System.out.println("values at stored in arr:");
    for(int i:arr){
        System.out.print(" "+i);
    }
    System.out.println();
    for(int i=0;i< arr.length;i++){
        System.out.println("The value at arr["+i+"] = "+arr[i]);
    }

    int [][]multiarray=new int[2][3];//This create 2 row and 3 column
    //Or you can also say that an array that of store  2 array and this 2 array store 3 element
    // like this : {{1,2,3},{4,5,6}}
    multiarray[0][0]=1;
    multiarray[0][1]=2;
    multiarray[0][2]=3;
    multiarray[1][0]=4;
    multiarray[1][1]=5;
    multiarray[1][2]=6;


    System.out.println("get Values store in multi dimension array is m1");
    for(int[] i:multiarray){
        for(int j:i){
            System.out.print(" "+j);
        }
        System.out.println();
    }
    System.out.println("get Values store in multi dimension array is m2");
    for(int i=0;i<multiarray.length;i++){
        for(int j=0;j<multiarray[i].length;j++){
            System.out.print(" "+multiarray[i][j]);
        }
        System.out.println();
    }

    System.out.println("Array of Array different length");
    int multi[][]=new int[2][];
    //an array with 2 rows and unknown no. of column
    multi[0]=new int[]{1,2,3,4,5,6};
    //or
    multi[1]=new int[3];
    multi[1][0]=7;
    multi[1][1]=8;
    multi[1][2]=9;

    for(int[] i:multi){
        for(int j:i){
            System.out.print(" "+j);
        }
        System.out.println();
    }

    System.out.println("Array of Object Student :");
    class Student{
        String name;
        int rollNo;
    }

    Student[] s=new Student[2];

    s[0]=new Student();
    s[0].name="veer";
    s[0].rollNo=12;

    s[1]=new Student();
    s[1].name="Dhoni";
    s[1].rollNo=13;

    for(Student i:s){
        System.out.println("name = "+i.name+ ", Roll no. = "+i.rollNo);
    }

}
}
