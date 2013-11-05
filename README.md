DTAS
====

This repository is only for better collaborating to do first project for server app technology on Adam Mickiewicz University in 2013 

To launch chat on your pc do this instruction:
1) Open terminal window
2) Navigate to place where you have you source files
3) Run command: javac *.java
4) Run command: rmic Implementations
5) Run command: rmiregistry
6) Open new terminal window
7) Run command: java Server 4444 (4444 is number of port on which server whil run)
8) Open new terminal window
9) Run command: java Client 127.0.0.1 4444 (this is address of localhost and port on which server run)

In repository is a little mess. For that moment the good code is in files:
- ChatInterface.java
- Implementations.java
- Server.java
- Client.java
