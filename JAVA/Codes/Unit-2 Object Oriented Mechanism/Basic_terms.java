/*
    Association in Java
    *********************

        Association is a relationship where all object have their own lifecycle and there is no owner. 

        Let's take an example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. Both can create and delete independently.


    Agregation in Java
    *********************

        Aggregation is a specialized form of Association where all objects have their own lifecycle but there is ownership and child objects can not belong to another parent object.
        
        Let's take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department the teacher object will not be destroyed. We can think about "Has-A" relationship.


    Composition in Java
    *********************

        Composition is again specialized form of Aggregation and we can call this as a "death" relationship. It is a strong type of Aggregation. Child object does not have their lifecycle and if parent object is deleted, all child objects will also be deleted.

        Let's take again an example of a relationship between House and rooms. House can contain multiple rooms - there is no independent life of room and any room can not belong to two different houses. If we delete the house - room will automatically be deleted. 

        We can think about it as a "part-of" relationship.

    

 */