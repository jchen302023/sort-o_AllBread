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


  } // main
} // Driver class
