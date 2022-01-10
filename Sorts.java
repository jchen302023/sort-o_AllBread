import java.util.ArrayList;
public class Sorts {

  public static void bubbleSortV(ArrayList<Comparable> data) {
    int counter = 0;
    int numCompare = 0;
    int len = data.size();
    		int passNum = 0;
    		while (passNum < len) {
    			for (int i = len-1;i>0;i--) {

            numCompare += 1;

    				if (data.get(i).compareTo(data.get(i-1)) < 0){ //need to swap
    					data.set( i, data.set(i-1,data.get(i)) );

              counter += 1;

    				}
    			}
    			passNum += 1;
    		}
        System.out.println("Number of swaps: " + counter);
        System.out.println("Number of comparisons: " + numCompare);
        System.out.println("Number of passes: " + passNum + "\n");

  } // bubble

  public static ArrayList<Comparable> bubble( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    bubbleSortV( data );

    //return working ArrayList
    return data;
  }//end bubbleSort

  public static void insertionSortV(ArrayList<Comparable> data) {
    int counter = 0;
    int numCompare = 0;
    int passNum = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      // System.out.println( "\npartition: " + partition + "\ndataset: "); //diag
      // System.out.print( data +"\n");


      //traverse sorted region from right to left
      passNum += 1;
      for(int i=partition; i > 0; i--) {
        numCompare += 1;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0) {
          // System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
	        data.set( i, data.set(i-1,data.get(i)) );

          counter += 1;
        }
        else
          break;
      }
    }
      System.out.println("Number of swaps: " + counter);
      System.out.println("Number of comparisons: " + numCompare);
      System.out.println("Number of passes: " + passNum + "\n");
  } // insertion

  public static ArrayList<Comparable> insertion( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

  public static void selectionSortV(ArrayList<Comparable> data) {
    int maxPos;
    int counter = 0;
    int numCompare = 0;
    int passNum = 0;

        for( int pass = data.size()-1; pass > 0; pass-- ) {
          // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
          maxPos = 0;
          passNum += 1;
          for( int i = 1; i <= pass; i++ ) {
            // System.out.println( "maxPos: " + maxPos );//diag
            // System.out.println( data );//diag
            numCompare += 1;
            if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
              maxPos = i;

          }
          data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
          counter += 1;
          // System.out.println( "after swap: " +  data );//diag
        }
        System.out.println("Number of swaps: " + counter);
        System.out.println("Number of comparisons: " + numCompare);
        System.out.println("Number of passes: " + passNum + "\n");
  } // selection

  public static ArrayList<Comparable> selection( ArrayList<Comparable> input ) {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

  public static void main( String [] args ) {
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      selection(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
    }
} // end class
