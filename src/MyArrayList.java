import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


    public  class  MyArrayList  implements  List  {
        public static void main(String[] args) {
             MyArrayList A =  new MyArrayList() ;
              A.add(5 , 4 );
        }

     private  final int  intSize = 5;
     private  int  [] array;
     private int pointer = 0;
      public  MyArrayList () {

           int [] array = new int [intSize];

           array[0] = 23;
           array[1] = 24;
           array[2] = 10;
           array[3] = 15;
           array [4] =17;
      }
         public int size() {
              return  0;
         }

         @Override
         public boolean isEmpty() {
             return false;
         }

         @Override
         public boolean contains(int  t) {
             return false;
         }

         @Override
         public void add(int  t , int index ) {
           int  [] newArray = new  int  [array.length+1 ];
          newArray[ index  ] = t;
             for (int  i = 0;  i <   index ;  i++)
                 newArray[i] = array[i];

             for (int i = index ; i < array.length; i++)
                 newArray[i+1] = array[i];
             array = newArray ;

             for (int  i = 0;  i < newArray.length ; i++) {
                 System.out.println(newArray[i]);
             }

         }

         @Override
         public void remove(int  t) {

         }

         @Override
         public void resize(int length) {

         }
     }



 // for (int  i = index ;  i < array.length ;  i++)
 //       newArray [i+1 ] = array[i];
  //      array = newArray;