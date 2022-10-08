Author: Ittai Kohavi
Acknowledgments: Mr. Kuzmaul for explaining the topic and providing assistence

List of written methods for the LPHashTable (Linear Probing Hash Table) class:
    insert():
        In: An int 
        Out: Nothing
        Effect: Inserts the passed int value into the table
        Issues: Colliding out of bounds will lead to error
    delete():
        In: An int
        Out: Nothing
        Effect: Deletes the value at the passed key
    search():
        In: An int
        Out: An Integer
        Effect: Takes in a key and returns the value at that location,
                or null if there is no object at the key location
    key():
        In: An int
        Out: An int
        Effect: Creates a key out of a passed int value

List of written methods for the Node class:
    getKey():
        In: Nothing
        Out: An Integer
        Effect: Returns the stored key value
    getValue(): 
        in: Nothing
        Out: An int
        Effect: Returns the stored 'value' value
    extended class NodeGrave:
        Effect: A basic object acting as a place holder for deleted nodes
    

    