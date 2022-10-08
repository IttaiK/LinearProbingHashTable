public class Node {

    private Integer key = null;
    private int value;
    
    public Node(){}

    public Node(int k, Integer v){
        key = k;
        value = v;
    }

    public Integer getKey(){
        return key;
    }

    public int getValue(){
        return value;
    }

}
