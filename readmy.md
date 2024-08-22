```
Task:
Develop a Casino Slot Machine Service
 
Objective:
Develop a microservice for a casino slot machine. The service should provide an API for a frontend to interact with. The API will allow users to get information about the slot machine and perform spin actions, receiving responses based on the spin results.
 
Requirements:
1. Technology Stack:
• Java
• Spring Boot
• Maven
• RESTful API design
• Groovy Spock for testing (can be anything else)
2. API Endpoints:
• Get Slot Info
• Spin
3. Business Logic:
• The slot machine has 3 reels
• Each reel can have one of the following symbols: A, B, C, D, E
• Each symbol has it’s own multiplier applied if was won
• User should be able to choose the bet he wants to play with
• Win combination is 3 the same symbols in one line
• The spin result should be randomly generated
• If the spin result is a winning combination, the user wins an amount calculated as betAmount * multiplier
4. Algorithm for Reels Randomization
• Implement a randomization algorithm that generates the result for the 3 reels independently
• Ensure fairness in the randomization process
5. Testing
• Define and implement all required level of testing
6. Expectations
• Only result matters. All available tools can be used to receive the final code as soon as possible.
```