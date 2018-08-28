class Animal
{
 void speak()
 {
  System.out.println("In the Animal class,which is parent class");
 }
}
class Dog extends Animal
{
 void speak()                   //it will first check object class i.e dog,when that function is not there then it will check in parent class
 {
 System.out.println("In the dog class");
 }
} 
class Cat extends Animal
{
 void speak()
 {
 System.out.println("In the cat  class");
 }
}
class Override
{
 public static void main(String args[])
 {
  Cat c = new Cat();
  c.speak();
  Dog d = new Dog();
  d.speak();
 }
}