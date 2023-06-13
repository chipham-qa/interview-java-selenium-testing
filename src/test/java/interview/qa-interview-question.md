**1. What is a bug?**
- A bug is any kind of error, mistake or failure in software code that prevent the software function from executing properly. 

**2. What is the difference between severity and priority?**
- These are important distinctions that must be known for proper time management. Severity is how difficult the issue is to fix. Priority is how important the issue is to fix. 
- Just because an issue is high severity doesn’t necessarily mean it’s high priority and vice versa.
- Here’s an example of a high-severity, low-priority issue:
  - The application crashes when a rarely used function is run on legacy software that most users can’t access.
- Here’s an example of a low-severity, high-priority issue:
  - The wrong company logo is displayed on startup. 

**3. What are the advantages of automated testing?**
- Faster execution: Automated tests can be run significantly faster than manual tests, enabling faster feedback on the software's quality.
- Reusability: Test scripts developed for automation can be reused across multiple test cycles, saving time and effort in the long run.
- Increased test coverage: With automated tests, it becomes feasible to execute a large number of test cases and cover a wider range of scenarios, leading to more comprehensive testing.
- Improved accuracy: Automated tests are less prone to human errors, ensuring consistent and reliable test results.
- Regression testing: Automated tests are ideal for performing regression testing, as they can quickly verify that existing functionalities still work after changes or additions to the software.

**4. What are some common challenges in test automation?**
- Test script maintenance: As the software evolves, test scripts may require frequent updates to keep up with changes, making maintenance an ongoing task.
- Initial setup effort: Setting up the automation framework, environment, and test data can be time-consuming and resource-intensive.
- Test case selection: Identifying the right test cases for automation is crucial. Not all test cases are suitable for automation, and selecting the wrong ones can lead to inefficient test suites.
- Tool selection: Choosing the right automation tool that fits the project requirements and team's expertise can be a challenge, as there are numerous options available in the market.
- False positives/negatives: Automated tests may produce false positives (indicating a failure when the functionality is actually working) or false negatives (missing actual failures). It requires careful analysis and tuning to minimize these issues.

**5. What is the difference between Assert and Verify commands in test automation?**
- Assert: The "Assert" command is used to validate an expected condition. If the condition is true, the test execution continues without interruption. However, if the condition is false, the assertion fails, and the test execution is immediately halted, marking the test as failed. It acts as a critical checkpoint, indicating that something unexpected has occurred and the test cannot proceed further.

- Verify: The "Verify" command is used to validate an expected condition as well, but it does not halt the test execution if the condition fails. Even if the verification fails, the test continues executing, and the failure is recorded. It acts as a non-critical checkpoint, providing information about the failure while allowing the test to proceed and potentially capture additional failures.

- In summary, "Assert" is used for critical validations that must pass for the test to continue, while "Verify" is used for non-critical validations that provide information about failures but do not interrupt the test execution. The choice between the two depends on the specific requirements of the test case and the desired behavior when a validation fails.

**6. What is the difference between Quality Assurance and Quality Control?**
- Key Points:
  -  In QA, processes are planned to evade the defects
  - QC agreements with the discovery of the defects and modifying them while making the product
  - QA detects weakness
  - QC detects defects
  - QA is process oriented
  - QC is product oriented
  - QA is a failure prevention system
  - QC is a failure detection system.
  - QA & QC both are different from each other and required as part of quality management. They should not be misunderstood as interchangeable terms. QA is process focused while QC is end-product focused.

- Quality control is inspecting something (a product or a service) to ensure that it is working fine. If the product or service is not working fine, then the issue needs to be fixed or eliminated in order to meet conformance standards. So, it aims at detecting and correcting issues.

**7. What is the QA testing life cycle?**
- You can talk about the testing process that you're most familiar with, but here is a standard version: 
**Requirements** 
-> **Planning**  
-> **Analysis** 
-> **Design** 
-> **Implementation** 
-> **Execution** 
-> **Conclusion** 
-> **Closure** 

**8. What is a Test Strategy**
- The test strategy outlines the plan for the testing stage of software development.
- Unlike the test plan, which describes one specific test, the test strategy covers the entire testing phase of development and includes a description of the testing tools, test groups, test priorities, test record maintenance, and the test summary. 

 **9. What is a test plan? **
- A [test plan](https://theqalead.com/topics/leadership-in-test-test-planning/) is a document that outlines the details of the intended test. It states before testing begins the required roles, potential risks and solutions, and resources it will use.

**10. What is a good test case?**
A good test case clearly states the parameters in which the test will be performed and the bugs it hopes to find. 

**11. What is the difference between functional and nonfunctional testing?**
- Functional testing tests the key parts of the software to ensure it matches requirements and specifications. Nonfunctional testing tests important but not crucial aspects of the software such as load times, stress, and overall performance. 

**12. When you find a bug in production, how do you ensure the bug gets resolved?**
- The best course of action is to immediately write a test case for the bug and run a regression test. That way any future tests performed on the software should check specifically for that bug. 

**13. What did you do in your last project?**
- There are no clear answers, only guidelines, for this one. It's common for interviewers to ask about your career trajectory and previous projects, so make a quick list of points in advance so you can speak to the projects that you think best represent your work.
- The biggest piece of advice I can give is to answer as honestly as possible. Don’t exaggerate or undervalue your contribution in previous teams. Highlight moments when you took on QA project manager work outside of your responsibilities to demonstrate your ownership. Tell them what your day-to-day role was, what tools you used, and how the QA testing went. 



<h3> -----REFERENCES------ </h3>
https://theqalead.com/managing-leading/qa-interview-questions/
https://www.softwaretestinghelp.com/manual-testing-tutorial-1/
https://www.guru99.com/software-testing.html

