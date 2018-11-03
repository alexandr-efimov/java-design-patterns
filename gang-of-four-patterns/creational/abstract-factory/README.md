Abstract Factory

## Category
Creational

## Intent & Motivation
Provide an interface for creating families of related or dependent
objects without specifying their concrete classes. 
Abstract Factory pattern is almost similar to Factory Pattern except the fact that its more like factory of factories. 

Wiki: `The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common  
theme without specifying their concrete classes`

## Applicability
Use the Abstract Factory pattern when
- a system should be independent of how its products are created, composed, and
represented.
- a system should be configured with one of multiple families of products.
- a family of related product objects is designed to be used together, and you need
to enforce this constraint.
- you want to provide a class library of products, and you want to reveal just their
interfaces, not their implementations. 

## Consequences
The Abstract Factory pattern has the following benefits and liabilities:
- It isolates concrete classes. 
- It makes exchanging product families easy. 
- It promotes consistency among products. 
- Supporting new kinds of products is difficult(CONS). Extending abstract factories to
produce new kinds of Products isn't easy. That's because the AbstractFactory
interface fixes the set of products that can be created.