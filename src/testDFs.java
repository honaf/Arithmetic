import java.util.HashSet;

public class testDFs {
    public static void main(String[] args) {
        String[] array = permutation("ab");
        for (String s : array) {
            System.out.println(s);
        }
    }
    public static String[] permutation(String str) {
        if (str == null) {
            return new String[0];
        }
        //添加组合去重
        HashSet<String> set = new HashSet<>();
        //这里记录下访问过的位置
        boolean[] visited = new boolean[str.length()];
        DFS("", str, set, visited);
        return set.toArray(new String[0]);
    }

    private static void DFS(String appendStr, String original, HashSet<String> set, boolean[] visited) {
        //当拼接完后结束递归，并把结果添加到集合
        if (appendStr.length() == original.length()) {
            set.add(appendStr);
            System.out.println(appendStr);
            return;
        }
        for (int i = 0; i < original.length(); i++) {
            //已经选择过的就跳过
            if (visited[i]) {
                continue;
            }
            //标识为已访问
            visited[i] = true;
            DFS(appendStr + original.charAt(i), original, set, visited);
            //方法弹栈的时候注意要复位，结合图理解，如第二排bc为可选 选了b后被标识为已访问，
            //当换到c的时候，b要复位
            visited[i] = false;
        }
    }
}
