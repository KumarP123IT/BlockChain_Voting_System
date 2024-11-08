# Blockchain-Based Election Voting System 🗳️
  Welcome to the Blockchain-Based Election Voting System project! This Java application allows users to securely cast votes for their preferred political parties, utilizing blockchain technology to ensure transparency, immutability, and security. Originally built as a traditional voting system, this project has been upgraded with blockchain to address concerns around vote tampering and to showcase the power of decentralized solutions.

## Features
 - Blockchain Integration: Each vote is recorded as a block in a blockchain, providing a secure, tamper-proof ledger.
 - Voter Eligibility Verification: Age verification ensures only eligible users can participate.
 - User Information Collection: Captures essential user details to authenticate voters.
 - Party Selection and Voting: Allows users to vote for multiple parties, with clear instructions for participation.
 - Real-time Vote Tallying: Shows live results and counts votes transparently.
 - Results Display: Users can view final results to see each party's vote count.
   
## How It Works
 - Eligibility Check: Users are prompted to enter their age, with voting restricted to those 18 and older.
 - User Details Collection: Eligible users provide details like name, father's name, address, and a 10-digit phone number.
 - Party Voting: Users choose from a list of political parties, and the vote is securely added to the blockchain.
 - Blockchain Storage: Each vote is stored as an individual block in the blockchain, creating a transparent, immutable record.
 - Result Display: After voting, users have the option to view the cumulative voting results.
   
 ## Future Enhancements
 - Persistent Vote Storage: Implementing persistent storage to save votes even if the application is restarted.
 - Enhanced Input Validation: Improving validation to handle edge cases and ensure data integrity.
 - Code Refactoring: Modularizing the code for better readability and maintainability.
   
### Getting Started
## Prerequisites

Java 8+: This project requires Java Development Kit (JDK) version 8 or higher.

## Installation

Clone the repository:

 ```bash
   git clone https://github.com/yourusername/blockchain-voting-system.git
   cd blockchain-voting-system
 ```
## Compile the code:

 ```bash
    javac Election.java
 ```
## Run the application:

 ```bash
    java Election
 ```
## Usage
-  Follow on-screen instructions to verify eligibility, enter details, and cast votes.
 - After casting a vote, view the blockchain to see each securely stored voting transaction.
 - Choose to display voting results for a summary of each party’s votes.
 - 
## Project Structure
 - Election.java: Main class containing the application logic for voter authentication, voting, and result display.
 - Blockchain.java: Implements a simple blockchain to store and verify votes.
 - 
## Contributing
Contributions are welcome! If you have ideas to improve the project, please feel free to fork the repository and submit a pull request.
