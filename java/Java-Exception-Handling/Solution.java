
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
    long power(int n, int p) throws Exception{
        if (n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if (n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            long result = 1;
            for (int i = 0; i < p; i++) {
                result *= n;
            }
            return result;
        }
    }
    
}

