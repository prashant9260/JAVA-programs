// Case 1 
class Base
{}
class Derived extends Base
{}

// Case 2
interface Demo
{}
class Hello implements Demo
{}

// Case 3
interface Demo
{}
interface Hello
{}
class Marvellous implements Demo, Hello
{}

// case 4
interface Demo
{}
class Hello
{}
class Marvellous extends Hello implements Demo
{}

// Case 5
interface Demo
{}
interface Hello extends Demo
{}
class Marvellous implements Hello
{}

