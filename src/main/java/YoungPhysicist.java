
public class YoungPhysicist {

    public static String isIdle(int[][] forces ){
        int [] sum = new int [3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                sum[j]+= forces[i][j];
            }
        }
        if (sum[0] == 0 && sum[1] == 0 && sum[2] == 0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
