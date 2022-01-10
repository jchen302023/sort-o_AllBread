import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList increasing = new ArrayList<Integer>();
    increasing.add(1);
    increasing.add(2);
    increasing.add(3);
    increasing.add(4);
    increasing.add(5);
    ArrayList decreasing = new ArrayList<Integer>();
    decreasing.add(5);
    decreasing.add(4);
    decreasing.add(3);
    decreasing.add(2);
    decreasing.add(1);
    ArrayList unordered = new ArrayList<Integer>();
    unordered.add(7);
    unordered.add(1);
    unordered.add(5);
    unordered.add(12);
    unordered.add(3);

    //worst cases
    ArrayList oneTen = new ArrayList<Integer>();
    for (int i = 10; i > 0; i --) {
      oneTen.add(i);
    }
    ArrayList oneFifty = new ArrayList<Integer>();
    for (int i = 50; i > 0; i --) {
      oneFifty.add(i);
    }
    ArrayList oneHundo = new ArrayList<Integer>();
    for (int i = 100; i > 0; i --) {
      oneHundo.add(i);
    } // oneHundo
    ArrayList oneThouso = new ArrayList<Integer>();
    for (int i = 1000; i > 0; i --) {
      oneThouso.add(i);
    }
    ArrayList oneTenThouso = new ArrayList<Integer>();
    for (int i = 10000; i > 0; i --) {
      oneTenThouso.add(i);
    }

    // best cases
    ArrayList oneTenBest = new ArrayList<Integer>();
    for (int i = 0; 10 > i; i ++) {
      oneTenBest.add(i);
    }
    ArrayList oneFiftyBest = new ArrayList<Integer>();
    for (int i = 0; 50 > i; i ++) {
      oneFiftyBest.add(i);
    }
    ArrayList oneHundoBest = new ArrayList<Integer>();
    for (int i = 0; 100 > i; i ++) {
      oneHundoBest.add(i);
    } // oneHundo
    ArrayList oneThousoBest = new ArrayList<Integer>();
    for (int i = 0; 1000 > i; i ++) {
      oneThousoBest.add(i);
    }
    ArrayList oneTenThousoBest = new ArrayList<Integer>();
    for (int i = 0; 10000 > i; i ++) {
      oneTenThousoBest.add(i);
    }


    // bubble sort ==========================
    // == Best Case == //
    // 0 swaps neccessary
    System.out.println("\n==BubbleSort==");


    System.out.println( "ArrayList increasing before sorting:\n" + increasing );
    Sorts.bubble(increasing);
    System.out.println( "ArrayList increasing after sorting:\n" + increasing );
    System.out.println("======================");
    // == Worst Case Scenario == //
    // 10 swaps neccessary

    System.out.println( "ArrayList decreasing before sorting:\n" + decreasing );
    Sorts.bubble(decreasing);
    System.out.println( "ArrayList decreasing after sorting:\n" + decreasing );
    System.out.println("======================");
    // == Unordered Case Scenario == //
    // 5 swaps

    System.out.println( "ArrayList unordered before sorting:\n" + unordered );
    Sorts.bubble(unordered);
    System.out.println( "ArrayList unordered after sorting:\n" + unordered );
    System.out.println("======================");

    Sorts.bubble(oneTen +\n);
    Sorts.bubble(oneFifty);
    Sorts.bubble(oneHundo);
    Sorts.bubble(oneThouso);
    Sorts.bubble(oneTenThouso);
    System.out.println("======================");
    Sorts.bubble(oneTenBest);
    Sorts.bubble(oneFiftyBest);
    Sorts.bubble(oneHundoBest);
    Sorts.bubble(oneThousoBest);
    Sorts.bubble(oneTenThousoBest);


    // insertion sort =========================
    // == Best Case == //
    // 0 swaps neccessary
    System.out.println("\n==InsertionSort==");

    System.out.println( "ArrayList increasing before sorting:\n" + increasing );
    Sorts.insertion(increasing);
    System.out.println( "ArrayList increasing after sorting:\n" + increasing );
    System.out.println("======================");
    // == Worst Case Scenario == //
    // 10 swaps neccessary

    System.out.println( "ArrayList decreasing before sorting:\n" + decreasing );
    Sorts.insertion(decreasing);
    System.out.println( "ArrayList decreasing after sorting:\n" + decreasing );
    System.out.println("======================");
    // == Unordered Case Scenario == //
    // 5 swaps

    System.out.println( "ArrayList unordered before sorting:\n" + unordered );
    Sorts.insertion(unordered);
    System.out.println( "ArrayList unordered after sorting:\n" + unordered );
    System.out.println("======================");

    Sorts.insertion(oneTen);
    Sorts.insertion(oneFifty);
    Sorts.insertion(oneHundo);
    Sorts.insertion(oneThouso);
    Sorts.insertion(oneTenThouso);
    System.out.println("======================");
    Sorts.insertion(oneTenBest);
    Sorts.insertion(oneFiftyBest);
    Sorts.insertion(oneHundoBest);
    Sorts.insertion(oneThousoBest);
    Sorts.insertion(oneTenThousoBest);

    // selection sort =========================
    // == Best/Worst Case == //
    // 10 swaps neccessary
    System.out.println("\n==SelectionSort==");

    System.out.println( "ArrayList increasing before sorting:\n" + increasing );
    Sorts.selection(increasing);
    System.out.println( "ArrayList increasing after sorting:\n" + increasing );
    System.out.println("======================");
    // == Best/Worst Case Scenario == //
    // 10 swaps neccessary

    System.out.println( "ArrayList decreasing before sorting:\n" + decreasing );
    Sorts.selection(decreasing);
    System.out.println( "ArrayList decreasing after sorting:\n" + decreasing );
    System.out.println("======================");
    // == Best/Worst Case Scenario == //
    // 10 swaps

    System.out.println( "ArrayList unordered before sorting:\n" + unordered );
    Sorts.selection(unordered);
    System.out.println( "ArrayList unordered after sorting:\n" + unordered );
    System.out.println("======================");

    Sorts.selection(oneTen);
    Sorts.selection(oneFifty);
    Sorts.selection(oneHundo);
    Sorts.selection(oneThouso);
    Sorts.selection(oneTenThouso);
    System.out.println("======================");
    Sorts.selection(oneTenBest);
    Sorts.selection(oneFiftyBest);
    Sorts.selection(oneHundoBest);
    Sorts.selection(oneThousoBest);
    Sorts.selection(oneTenThousoBest);

  } // main
} // Driver class
