Adapter

## Category
Structural

## Intent & Motivation
Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that 
could not otherwise because of incompatible interfaces. 

## Applicability
When:
- you want to use an existing class, and its interface does not match the one you need
- you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that 
don't necessarily have compatible interfaces
- you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one.
 An object adapter can adapt the interface of its parent class.
- most of the applications using third party libraries use adapters as a middle layer between the application and the
   3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application code. 