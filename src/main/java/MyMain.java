public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int totalNum = mat.length * mat[0].length;
        double sum = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                double num = mat[row][col];
                sum += num;
            }
        }

        return sum / totalNum;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int num = 0;
        double median = 0;

        if (mat.length * mat[0].length % 2 == 1) {
            int medianNum = (mat.length * mat[0].length) / 2 + 1;
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    num++;
                    if (num == medianNum) {
                       median += mat[row][col];
                    } 
                }
            }
            return median;
        } 
        else {
            int medianNum1 = (mat.length * mat[0].length) / 2;
            int medianNum2 = (mat.length * mat[0].length) / 2 + 1;
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    num++;
                    if (num == medianNum1 || num == medianNum2) {
                       median += mat[row][col];
                    } 
                }
            }
            return median / 2;
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double valueExist1 = 0;
        double valueExist2 = 0;
        int numExist1 = 0;
        int numExist2 = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                double value = mat[row][col];
                valueExist1 = value;
                numExist1++;
                
                if (valueExist2 == value) {
                    numExist2++;
                }

                if (numExist1 > numExist2) {
                    numExist2 = numExist1;
                    valueExist2 = valueExist1;
                    numExist1 = 0;
                }
            }
        }
        return valueExist2;
    }


    public static void main(String[] args) {
        double[][] mat1 = {{1, 2, 3}, 
                        {4, 5, 6}};
        double[][] mat2 = {{1, 2, 4, 4}, 
                        {5, 9, 6, 8},
                        {12, 12, 12, 13}};              
        double[][] mat3 = {{1, 3, 3}, 
                        {4, 6, 6},
                        {12, 12, 12}};
        double re1 = mean(mat1);
        double re2 = median(mat2);
        double re3 = mode(mat3);

        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
    }
}
