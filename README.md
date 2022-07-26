# Learning-Java-Array-and-Array-Lists

Arrays or array lists are used when we have a collection of the same types of objects and we want to hold them. Both arrays and array lists have super-fast random access because of using index's. Array's are fixed in length, whereas, ArrayLists grow and shrink automatically as we add and remove elements. 
        
Unlike ArrayLists which require alot of dynamic re-sizing, each element in a LinkedList is called a node and each node has a pointer. Each pointer has a reference to the next node 0>1>2>3>4 etc. In Java the LinkedList class in java is a doubly linked list, so in addition to having a reference to the next node, each node has a reference to the previous node. This is why LinkedLists have slower random access compared to array's. 
