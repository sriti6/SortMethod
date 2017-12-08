public class SortArray {


    public static String[] sort(String[] scores) {
        String min = "";
        int minIdx = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            int oldMinIdx = i;
            min = scores[i];

            for (int j = i + 1; j < scores.length; j++) {
                if (Double.parseDouble(min) > Double.parseDouble(scores[j])) {
                    min = scores[j];
                    minIdx = j;

                }

            }
          swap(scores,minIdx,oldMinIdx,min);

        }
      System.out.println("The min is " +min);
    for (int x=0; x<scores.length;x++){
        System.out.println(scores[x]);
    }
    return scores;

    }
private static void swap (String[]scores,int minIdx,int oldMinIdx,String min){
        String temp = scores[oldMinIdx];
        scores[oldMinIdx] = min;
        scores [oldMinIdx] = temp;
}
}





