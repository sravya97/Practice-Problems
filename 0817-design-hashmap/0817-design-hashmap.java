class ListNode{
    int key;
    int value;
    ListNode next;
    ListNode(int key, int val){
        this.key = key;
        this.value = val;
        this.next = null;
    }
}
class MyHashMap {
    int size = 1000;
    ListNode[] table;
    public MyHashMap() {
        this.table = new ListNode[size];
    }

    public int hash(int key){
        return key % this.size;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        if(this.table[index]==null){
            this.table[index] = new ListNode(key, value);
            return;
        }
        ListNode current = this.table[index];
        while(current != null){
            if(current.key == key){
                current.value = value;
                return;
            } 
            if(current.next == null){
                current.next = new ListNode(key, value);
                return;
            }
            current = current.next;
        }
        return;
    }
    
    public int get(int key) {
        int index = hash(key);
        ListNode current = this.table[index];;
        while(current != null){
            if(current.key==key){
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        ListNode current = this.table[index];
        if(current == null){
            return;
        }
        if(current.key == key){
            this.table[index] = current.next;
            return;
        }
        while(current.next != null){
            if(current.next.key==key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */