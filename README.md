This is a demonstration of the characteristics of the four pillars of OOP: Abstraction, Encapsulation, Inheritance, Polymoprphism.

The parent class, Employee is the Superclass and main class. This is an abstract class and therefore can 
be instantiated. Within the Employee class is an abstract method, jobs, which demonstrates another tool
that can be used, where I created a template that has to be implemented in all the child classes of the
Employee class. Worker, Supervisor, Manager and Director classes all inherit from the Employee class, so 
all the charcteristics of the Employee class are available to each of these classes. TierTwo, TierThree
and TierFour are all interfaces and are implemented into Supervisor, Manager and Director in part, to
allow certain employees access to certain tasks dependant on their status in the workplace.





