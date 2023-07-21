package Recursion.PracticeQuestions;

/**
 * There are N stones, numbered 0,1,2,,..,N-1. For each i (O<=i<N), the height of Stone i is hi. There is a
 *  frog who is initially on Stone 0. Не will repeat the following action some number of times to reach
 *  Stone N-1:
 *  If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.
 *  Here, a cost of |hi-hjl is incurred, where j is the stone to land on.
 *  Find the minimum possible total cost incurred before the frog reaches Stone N.
 *  Input n= 4
 *  arr[]=10 30 40 20
 *  Output= 30
 */
public class T1_FrogJump {
    public static void main(String[] args) {
        int[] heightArray = {10,30,40,20};
        int ans = bestPath(heightArray, heightArray.length, 0);
        int ans2 = optimizedPath(heightArray, heightArray.length,0);
        System.out.println("Shortest Path by best path: "+ans);
        System.out.println("Shortest Path by optimized path: "+ans2);
    }

    /**
     * Number of calls at each level = Level*2
     * Total Number of calls = 2^n
     * Time Complexity = O(2^N)
     */
    private static int bestPath(int[] heightArray, int length, int index){
        if (index==length-1){
            return 0;
        }
        int path1 = bestPath(heightArray, length, index+1) + Math.abs(heightArray[index+1]-heightArray[index]);
        if (index==length-2){
            return path1;
        }
        int path2 = bestPath(heightArray, length, index+2) + Math.abs(heightArray[index+2]-heightArray[index]);
        return Math.min(path1,path2);
    }
    private static int optimizedPath(int[] heightArray, int length, int index){
        if (index==length-1){
            return 0;
        }
        if (index==length-2){
            return Math.abs(heightArray[index+1]-heightArray[index]);
        }
        int jump1 = Math.abs(heightArray[index+1]-heightArray[index]);
        int jump2 = Math.abs(heightArray[index+2]-heightArray[index]);

        int path1 = optimizedPath(heightArray, length, index+1) + jump1;
        int path2 = optimizedPath(heightArray, length, index+2) + jump2;
        return Math.min(path1, path2);
    }
}
