public class LPHashTable {

    //linearing probing is when you stack on collisions.

    private Node[] table;
    private NodeGrave NG = new NodeGrave();

    public LPHashTable(int maxIdx){
        table = new Node[maxIdx+1];
    }

    public void insert(int in){
        if(in >= table.length){
            throw new RuntimeException("InsertedValueTooHigh");
        }
        int Nkey = key(in);
        Node num = new Node(Nkey, in);
        int idxAdd = 0;
        while(table[Nkey+idxAdd] != null && table[Nkey+idxAdd] != NG){
            idxAdd++;
        }
        table[Nkey+idxAdd] = num;
    }

    public void delete(Integer key){
        if(key >= table.length){
            throw new RuntimeException("DeletedKeyValueTooHigh");
        }
        if(key < 0){
            throw new RuntimeException("DeletedKeyValueTooLow");
        }
        if(table[key] == null){
            return;
        }
        int idxAdd = 0;
        while(!(key.equals(table[key+idxAdd].getKey()))){
            idxAdd++;
            if(table[key+idxAdd] == null){
                return;
            }
        }
        table[key+idxAdd] = NG;
    }

    public Integer search(Integer key){
        if(key >= table.length){
            throw new RuntimeException("IndexOfSearchTooHigh");
        }
        if(key < 0){
            throw new RuntimeException("IndexOfSearchTooLow");
        }
        if(table[key] == null){
            return null;
        }
        int idxAdd = 0;
        while(!(key.equals(table[key+idxAdd].getKey()))){
            idxAdd++;
            if(key+idxAdd >= table.length || table[key+idxAdd] == null){
                return null;
            }
        }
        return table[key+idxAdd].getValue();
    }

    public int key(int value){
        return Math.abs(value);
    }
}
