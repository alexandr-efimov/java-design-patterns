Template Method

## Category
Behavioral

## Intent & Motivation
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets 
subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Applicability
Use pattern when
- to implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that 
can vary
- when common behavior among subclasses should be factored and localized in a common class to avoid code duplication.
- to control subclasses extensions. You can define a template method that calls "hook" operations at specific points,
 thereby permitting extensions only at those points 