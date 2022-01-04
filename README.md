# state-machine
An easy to use implementation of a state-machine. 

# How to use
Implement the `State<I, O>` interface for every state, and override the methods. 

Then, create a `StateMachine<I, O>` object with the initial state passed in the constructor. 

Finaly, call `stateMachineObject.exec(I input)` to execute one step in the state machine. 
