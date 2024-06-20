class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    Map<Integer, Node> cache;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Integer, Node>(capacity);
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node node;
        if(cache.containsKey(key)){
            remove(cache.get(key));
        } else{
            if(cache.size()==this.capacity){               
                remove(this.tail.prev);
            }
        }
        insert(new Node(key, value));
    }
    
    public void insert(Node node){
        cache.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    
    public void remove(Node node){
        cache.remove(node.key);
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */