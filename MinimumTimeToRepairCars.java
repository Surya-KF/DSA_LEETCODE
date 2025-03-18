public class MinimumTimeToRepairCars {
  public static long repairCars(int[] ranks, int cars) {
    long left = 1;
    long right = (long) ranks[0] * cars * cars;

    while (left < right) {
        long mid = left + (right - left) / 2;
        long repaired = 0;
        for (int rank : ranks) {
            repaired += Math.sqrt(mid / rank);
        }
        if (repaired >= cars) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return left;
  }
  public static void main(String[] args) {
    int[] ranks = {4, 2, 3, 1};
    int cars = 10;
    System.out.println(repairCars(ranks, cars));
  }
  
}
