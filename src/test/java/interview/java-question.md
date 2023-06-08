**Question 1: How to create a constructor in java?**

- Answer:  A constructor in Java is a special method that is called when an object of a class is created.
    It is used to initialize the object's state.
    The constructor has the same name as the class and has no return type (not even void).

**Question 2: The constructor is static or non-static?**
- Answer: A constructor can be either static or non-static.
    A non-static constructor is used to create instances of an object and initialize their state.
    It is automatically called when you create an object of the class using the new operator.

- A static constructor, on the other hand, is used to initialize the class itself.
    It is called once when the class is loaded into memory and is commonly used to perform one-time setup tasks for the class,
    such as initializing static fields or creating resources that are shared by all instances of the class.
    
    ![example4](https://user-images.githubusercontent.com/124520513/218731256-c45cbcee-cf82-4e23-bae7-c0225bf755bb.png)


![2023-02-10_21-06-24](https://user-images.githubusercontent.com/124520513/218487881-81059375-4c85-4a0c-a302-8c4023e8c987.png)

    
 **Question 3: What is the different between method overloading and constructor overloading?**
- Answer: In summary, method overloading is used to define multiple methods with the same name but different parameters, while constructor overloading is used to define multiple constructors with different parameter lists.


![example3](https://user-images.githubusercontent.com/124520513/218729273-d68067bc-0ea6-4c31-9db8-1e1345aba193.png)

 **Question 4: What is the different between method overloading and method overriding?**
- Answer: In summary, method overloading allows defining multiple methods with the same name but different parameters, while method overriding allows a subclass to provide its own implementation of a method that is already defined in its parent class.
 
 ![example4](https://user-images.githubusercontent.com/124520513/218731615-3ac217a2-1372-4279-8c13-4ce8f216c6d4.png)
 
  **Question 5: What is the use of final keywork?**

- Answer:  the final keyword is used in Java to indicate that a variable, method, or class cannot be modified once it has been declared or defined. This can be useful to prevent accidental changes or to ensure the integrity of critical components in a program
 
  **Question 6: What is the difference between final and finally?**
- Answer: In summary, final is a keyword that is used to declare a variable, method or class that cannot be modified, while finally is a keyword that is used in a try-catch-finally block to define a block of code that will be executed regardless of whether an exception is thrown or not
 
 ![example6](https://user-images.githubusercontent.com/124520513/218734448-0757dfb7-30d2-4ce7-9e2d-36225c867fcc.png)

 **Question 7: What is the difference between list and set?**
 - Duplication of elements: Lists allow duplicate elements, while Sets do not.
 - Ordering of elements: Lists maintain the order of elements in which they are inserted, while Sets do not guarantee the order of elements.
 - Choosing between List and Set depends on the specific requirements of your use case. If you need to maintain the order of elements and allow duplicates, then a List is a better choice. If you need to ensure that each element is unique, and the order of elements is not important, then a Set is a better choice
    
 **Question 8: How do you get items in List or Set?**
 - List: you can retrieve items from a List using either an index or a for-each loop![8-List](https://user-images.githubusercontent.com/124520513/219931758-cde60926-fea4-4221-8792-2b4e348fbb70.png)

 - Set: you can retrieve items from a Set using either an iterator or a for-each loop.
![8](https://user-images.githubusercontent.com/124520513/219931699-b9a4a7df-6a6e-43c6-a9c2-7e1422a47bb4.png)

 **Question 9: Where you have used list and set collection in selenium?**
 - Answer: both List and Set collections are commonly used to store and manipulate web elements
 - Lists: 
    - Storing a collection of web elements: You can use a List to store a collection of web elements returned by a findElements method call, such as driver.findElements(By.xpath("//a")). You can then loop through the List to perform actions on each web element.
    - Selecting multiple options from a dropdown: If you need to select multiple options from a dropdown, you can use a List to store the options to be selected, and then loop through the List to select each option.
 - Set:
    - Removing duplicates: If you have a collection of web elements that may contain duplicates, you can use a Set to remove duplicates before performing any actions on the web elements.
    - Verifying the absence of an element: You can use a Set to store a collection of web elements that should not be present on a page. After performing some action on the page, you can use the Set to verify that the expected elements are not present.
