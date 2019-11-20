package TestClasses;

public class TestClass {
    
    static boolean isCorner(boolean[][] matrix, int i, int j){
        if ((i==0 && j==0) ||(i==matrix.length && j==0) 
                ||(i==0 && j==matrix[0].length) ||(i==matrix.length && j==matrix[0].length) ){
            return true;
        }
        return false;
    }
    
    static boolean isSide(boolean[][] matrix, int i, int j){
        if (i==0  || j==0 || j==matrix[0].length || i==matrix.length  ){
            return true;
        }
        return false;
    }
    
    static int gV(boolean input){
        if (input) return 1;
         return 0;
    }
    
    static int getCount(boolean[][] m, int i, int j){
        //corner 
         if (i==0 && j==0){ 
             System.out.println("hörn 1 "+i+" "+j);
             return gV(m[1][0])+gV(m[1][1])+gV(m[0][1]);
         }
         else if (i==m.length-1 && j==0){ 
             System.out.println("hörn 2 "+i+" "+j);
             return gV(m[m.length-2][0])+gV(m[m.length-2][1])+gV(m[m.length-1][1]);
         }
         else if (i==0 && j==m[0].length-1){ 
             System.out.println("hörn 3 "+i+" "+j);
             return gV(m[0][m[0].length-2])+gV(m[1][m[0].length-2])+gV(m[1][m[0].length-1]);
         }
         else if (i==m.length-1 && j==m[0].length-1){ 
             System.out.println("hörn 4 "+i+" "+j);
             return gV(m[m.length-1][m[0].length-2])+gV(m[m.length-2][m[0].length-1])+gV(m[m.length-2][m[0].length-2]);
         }
         
//side (noncorner)
         else if (j==0){ 
             System.out.println("kant 1 "+i+" "+j);
             return gV(m[i-1][0])+gV(m[i+1][0])+gV(m[i-1][1])+gV(m[i+1][1])+gV(m[i][1]);}
         else if (i==0){ 
             System.out.println("kant 2 "+i+" "+j);
             return gV(m[0][j-1])+gV(m[0][j+1])+gV(m[1][j-1])+gV(m[1][j])+gV(m[1][j+1]);}
         else if (i==m.length-1){ 
             System.out.println("kant 3 "+i+" "+j);
             return gV(m[m.length-1][j-1])+gV(m[m.length-1][j+1])+gV(m[m.length-2][j-1])+gV(m[m.length-2][j])+gV(m[m.length-2][j+1]);}
         else if (j==m[0].length-1){ 
             System.out.println("kant 4 "+i+" "+j);
             return gV(m[i-1][m[0].length-1])+gV(m[i+1][m[0].length-1])+gV(m[i-1][m[0].length-2])+gV(m[i][m[0].length-2])+gV(m[i+1][m[0].length-2]);}
         
         else  { 
             System.out.println("mitten "+i+" "+j);
             return gV(m[i][j+1])+gV(m[i][j-1])+gV(m[i-1][j])+gV(m[i+1][j])
                 +gV(m[i-1][j-1])+gV(m[i+1][j+1])+gV(m[i+1][j-1])+gV(m[i-1][j+1]);}
    }
    
    static int[][] minesweeper(boolean[][] matrix) {
        int temp = 0;
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i=0; i < matrix.length;i++){
            for (int j=0; j < matrix[0].length;j++){
                if (matrix[i][j] == true){
                    System.out.println("found mine");
                    temp = 1;
                    res[i][j] = 1;
                }
                else{
                   // System.out.println("found false");
                    temp = getCount(matrix, i, j);
                    res[i][j] = temp;
                }
                //System.out.println("setting "+i+" "+j+" "+temp);
            }
        }
        return res;
    }
    
static boolean evenDigitsOnly(int n) {
    String sn = n+"";
    boolean res = true;
    try{
        for(int i = 0; i < sn.length(); i++){
            int j = Integer.parseInt(sn.substring(i, i+1));
                if (j % 2 != 0) return false;
            }
    }
    catch (Exception e){}
    return true;
}

static boolean firstNumeric(String name){
   // try{
        int i = Character.getNumericValue(name.charAt(0));
        System.out.println(i);
        if (i >= 10 ) return false;
        return true;
   // }
   // catch(Exception e){
   //     return false;
   // }
}

static boolean match (String name){
    if (name.matches("^[A-Za-z0-9_]*$")){
        return true;
    }
    return false;
}

static int convertLetter(char c){
        return Character.valueOf(c)-64;
}

static boolean chessBoardCellColorold(String cell1, String cell2) {
    int num1 = convertLetter(cell1.charAt(0));
    int num2 = Integer.parseInt(cell1.substring(1,2));
    int num3 = convertLetter(cell2.charAt(0));
    int num4 = Integer.parseInt(cell2.substring(1,2));
    System.out.println(num1+" "+num2+" "+num3+" "+num4);
    
    if ((num1%2==1 && num2%2==1 && num3%2==1 && num4%2==1 ) //udda
            || (num1%2==0 && num2%2==0 && num3%2==0 && num4%2==0 )
            || (num1%2==1 && num2%2==1 && num3%2==0 && num4%2==0 ) || (num1%2==0 && num2%2==0 && num3%2==1 && num4%2==1 )
            || (num1%2==1 && num2%2==0 && num3%2==1 && num4%2==0 ) || (num1%2==0 && num2%2==1 && num3%2==1 && num4%2==0 )){
        return true;
    }
    return false;
}

static boolean chessBoardCellColor(String cell1, String cell2) {
    int num1 = convertLetter(cell1.charAt(0));
    int num2 = Integer.parseInt(cell1.substring(1,2));
    int num3 = convertLetter(cell2.charAt(0));
    int num4 = Integer.parseInt(cell2.substring(1,2));
    System.out.println(num1+" "+num2+" "+num3+" "+num4);
    
    if ( ((num1%2==1 && num2%2==1 || num1%2==0 && num2%2==0) && (num3%2==0 && num4%2==0 || num3%2==1 && num4%2==1))
        || ((num1%2==0 && num2%2==1 || num1%2==1 && num2%2==0) && (num3%2==0 && num4%2==1 || num3%2==1 && num4%2==0)) ){
        return true;
    }
    return false;
}

static int depositProfit(int deposit, int rate, int threshold) {
    double sum = deposit;
    double drate = rate;
    int i = 0;
    while(sum <= threshold){
        sum += sum * drate/100;
        System.out.println("sum "+sum);
        i++;
    }
    return i;
}

static int getIndexSmallest(int[] a){
    int min = (int)Double.MAX_VALUE;
    int index = -1;
    for(int i = 0; i < a.length; i++){
        if (a[i] < min){
            min = a[i];
            index = i;
        }
     }
    return index;
}

static int absoluteValuesSumMinimization(int[] a) {
    int[] distarr = new int[a.length];
    int smallestDist = -2000000;
    int sum = 0;
    for (int i = 0; i < a.length; i++){
        sum = 0;
        for (int j = 0; j < a.length; j++){
            sum += Math.abs(a[i] - a[j]);
        }
       distarr[i]= sum;
    }
    for (int i : distarr ){
        System.out.print(i + " ");
    }
    int s = getIndexSmallest(distarr);
    System.out.println("index: "+s);
    return a[s];
}

    
    public static void main(String[] args){
       // int[] arr = {2,4,7};
       int[] arr = {-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};
       System.out.println(absoluteValuesSumMinimization(arr));  //true, 56, 78
    //   System.out.println(depositProfit("F7", "G8")); //true, 67, 78
    //   System.out.println(depositProfit("H8", "H7")); //false
    }
    

}
