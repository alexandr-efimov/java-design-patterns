Flyweight

## Category
Structural

## Intent & Motivation
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and 
increase performance. Flyweight pattern tries to reuse already existing similar kind objects by storing them and 
creates new object when no matching object is found 
 
## Applicability
The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when 
all of the following are true

When (all true)
- an application uses a large number of objects
- storage costs are high because of the sheer quantity of objects
- most object state can be made extrinsic
- many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
- the application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return 
true for conceptually distinct objects.