LRU cache
1. Have a head and tail dummy nodes
2. Add new nodes at head, that is head.next points to the latest node
3. When capacity is reached, remove from the tail, that is tail.prev node is the least used
4. For every get operation, remove the node and add it back so its at the head
5. For every put operation, if it already exists, remove the node and add it back with new value to get it to front. If it doesnt exist, check and remove a node if capacity is reached and then add the new node at head