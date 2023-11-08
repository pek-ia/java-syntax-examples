# Dealing with Damage

This is a tiny example that shows some possible
uses of inheritance, abstraction, and polymorphism.

## Abstraction
An abstraction is defined as "an essential characteristic" of an object.

All software deals in abstractions.  A Java class defines the essential characteristics of some real-world (or game-world) concept.  There are two kinds of characteristics that we care about in programming: 

1. What an object "knows" = the state of its variables.
2. What an object "does" = the behavior of its methods.

What is an "essential" characteristic?  It depends on what we think is important.  An abstraction does NOT model the complete and accurate behavior of a real-world object.  At best, it models some limited state and behavior that is "close enough" to satisfy our needs.  Defining abstractions focuses our attention on what we consider to be important.

In software, we can often consider abstractions separately, if they are not tightly related to each other.  In this example, we consider only a few tiny aspects of a proposed game:

1. A Player is an object that represents a person who is playing the game.  
Players can interact with each other, and with other objects in the game.
2. Most game objects can be damaged in some way.  
This includes players, NPCs, and objects used by players.
3. A Vehicle is an object that can carry one or more players.  
By using a vehicle, a Player can move more quickly through the game world, and have more fun.
4. There are various kinds of Vehicle - for example, Mopeds, Hovercrafts, Trucks, etc.  They differ in how many passengers they can carry and how resistant they are to damage.
5. We measure the "damage" done to an object with "hit points".  Every object starts with 100 hit points, and can lose or gain hit points by interactions with hazards, powerups, etc.  If the hit points for any object drop to zero, it is out of the action.  A player "dies".  A vehicle is "wrecked" and cannot be used any more.

This tiny project ONLY considers how objects gain or lose hit points, and is NOT a complete model of how the game works.  It is NOT necessarily a really GOOD model, either.  It was thought up by PK at 3:00 on a Tuesday.

## Inheritance

Classes that have similar responsibilities may inherit code from a common superclass.  To deal with the concept of "damage", Players and the important objects they use all inherit from a superclass named "Damageable".  Methods and attributes of Damageable encapsulate the essential concept of hit points.

To deal with the concept of "vehicle", we have a superclass named Vehicle.

## Polymorphism

Subclasses have the same responsibilities as a superclass, but may carry them out in different ways.  

In this example, a Vehicle acquires damage by running into hazards, e.g. a nasty, prickly cactus:

1. The "default" Vehicle superclass takes one point of damage from a cactus.
2. A Hovercraft floats on a layer of air, and takes no damage from a cactus.
3. A Moped is pretty weak, and built low to the ground, so it takes a LOT of damage from a cactus.

A Player acquires damage by fighting with other players or interacting with certain hazards.

## A cool-looking diagram 

Even for a tiny project, a "complete" UML class diagram becomes REALLY LARGE.  Please, never try to fit ALL the details of your project into one big diagram.

Diagrams are best used to describe your thoughts to other developers, often in informal meetings.  Always carry a pencil!  You can draw them on the back of an envelope or a cocktail napkin.  Of course, if you use some drawing app, your diagrams will look better.

Here is a UML class diagram that I drew with Umlet, a simple Java-based tool.  It describes just a few aspects of players, vehicles and damage.

![](.\docs\images\GameDamageSystem.gif)