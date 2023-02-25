**1. If you encounter a dropdown that does not have a standard HTML tag or option element. What should we do?**
- Use JavaScript: You can use JavaScript to interact with the dropdown and select items from it. For example, you can execute a JavaScript command that sets the selected value of the dropdown to the desired option.  ![selenium-1](https://user-images.githubusercontent.com/124520513/220393702-ae21d860-5ff6-454d-a75b-2285266f696b.png)

- Use Actions class: The Actions class in Selenium provides a way ![Uploading selenium-1.png…]()
to perform complex user interactions, including selecting items from non-standard dropdowns. You can use the moveToElement method to move the mouse cursor over the dropdown and then use the click method to select the desired option. ![selenium-2](https://user-images.githubusercontent.com/124520513/220393730-f2592a4b-cefa-49dd-b94c-7563cd40196a.png)

**2. What is used of Actions class?**
- Actions class is a part of the Selenium WebDriver API in Java, and it provides a way to perform complex user interactions with web applications, such as drag and drop, double-clicking, and right-clicking. It allows you to simulate a series of actions that a user might perform on a web page, and it's particularly useful for automating testing scenarios that involve mouse movements and clicks.

**3. Can you explain build() and perform()?**
- Yes, build() and perform() are two methods that are commonly used in the Actions class in Selenium WebDriver.

- The build() method is used to create a composite action consisting of a series of individual actions. You can use this method to chain together multiple actions, such as moving the mouse pointer to an element, clicking on it, and then typing some text into a text box. Once you've built the composite action using the build() method, you can then execute it using the perform() method.

- Here's an example that shows how to use the build() and perform() methods to perform a series of actions:
![selenium-3](https://user-images.githubusercontent.com/124520513/220680807-a46c9a87-67ad-402a-a512-bb368ebb34ce.png)
- In summary, the build() method is used to construct a composite action consisting of multiple individual actions, while the perform() method is used to execute the composite action.


