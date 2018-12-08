Prototype

## Category
Creational

## Intent & Motivation
Prototype pattern refers to creating duplicate object. This pattern is used when creation of object directly is 
costly. For example, an object is to be created after a costly database operation. 

## Applicability
When:
- when the classes to instantiate are specified at run-time, for example, by dynamic loading
- to avoid building a class hierarchy of factories that parallels the class hierarchy of products
- when instances of a class can have one of only a few different combinations of state