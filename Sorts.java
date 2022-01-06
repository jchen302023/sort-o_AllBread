import java.util.ArrayList;
public class Sorts {

  public static void bubble(ArrayList<Comparable> data) {
    int len = data.size();
    		int passNum = 0;
    		while (passNum < len) {
    			for (int i = len-1;i>0;i--) {
    				if (data.get(i).compareTo(data.get(i-1)) < 0){ //need to swap
    					data.set( i, data.set(i-1,data.get(i)) );
    				}
    			}
    			passNum += 1;
    		}
  } // bubble

  public static void insertion(ArrayList<Comparable> data) {
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\ndataset: "); //diag
      System.out.print( data +"\n");


      //traverse sorted region from right to left
      for(int i=partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0) {
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
	        data.set( i, data.set(i-1,data.get(i)) );

        }
        else
          break;
      }
    }
  } // insertion

  public static void selection(ArrayList<Comparable> data) {
    int maxPos;

        for( int pass = data.size()-1; pass > 0; pass-- ) {
          System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
          maxPos = 0;
          for( int i = 1; i <= pass; i++ ) {
            System.out.println( "maxPos: " + maxPos );//diag
            System.out.println( data );//diag
            if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
              maxPos = i;
          }
          data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
          System.out.println( "after swap: " +  data );//diag
        }

  } // selection

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
