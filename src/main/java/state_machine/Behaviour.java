package state_machine;

public interface Behaviour<I, O> {
    O exec(I input);
}
