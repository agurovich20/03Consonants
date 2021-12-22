public class SearchDriver{
  static int _size = 100_000; //billion
  static long timesf;
  static Comparable[] array = makeArray(_size);
  static int _trials = 100_000;

 public static Comparable[] makeArray(int size){

	Comparable[] array = new Comparable[size];
	for(int i=0;i<size;i++){
		array[i] = i;
	}
    return array;
 }

 public static long BinTime() {
	long past = System.currentTimeMillis();

        for(Comparable target : array) {
		BinSearch.binSearch(array, target);
	}

	long now = System.currentTimeMillis();
	timesf = now - past;
    return timesf;
 }

 public static double BinaryTimeAvg() {
    return (double)(timesf) / _size;
 }

 public static long LinTime() {
	long past = System.currentTimeMillis();

	for(Comparable target : array) {
		LinSearch.linSearch(array, target);
	}

	long now = System.currentTimeMillis();
	timesf = now - past;
   return timesf;
 }

public static long linWorst() {
	long past = System.currentTimeMillis();

	for(int i = 0; i < _trials; i++){
		LinSearch.linSearch(array, _size -1);
	}

	long now = System.currentTimeMillis();
	timesf = now - past;
  return timesf;
}


public static long binWorst() {
	long past = System.currentTimeMillis();

	for(int i = 0; i < _trials; i++){
		BinSearch.binSearch(array, _size -1);
	}

	long now = System.currentTimeMillis();
	timesf = now - past;
  return timesf;
}

 public static double LinearTimeAvg() {
   return (double)(timesf) / _size;
 }

 public static void main(String[] args){
	System.out.println("Binary time spent on a " + _size + " Array: " + BinTime() + " milliseconds");

	System.out.println("Average time in milliseconds per search: " + BinaryTimeAvg() + "\n");

	System.out.println("Linear time spent on a " + _size + " Array: " + LinTime() + " milliseconds");

	System.out.println("Average time in milliseconds per search: " + LinearTimeAvg() + "\n");

	System.out.println("Binary time spent on a worst case " + _size + " Array " + binWorst() + " milliseconds, for " + _trials + " trials");

        System.out.println("Average time in milliseconds per search: " + BinaryTimeAvg() + "\n");

        System.out.println("Linear time spent on a worst case " + _size + " Array " + linWorst() + " milliseconds, for " + _trials + " trials"); 

        System.out.println("Average time in milliseconds per search: " + LinearTimeAvg() + "\n");
 }
}
