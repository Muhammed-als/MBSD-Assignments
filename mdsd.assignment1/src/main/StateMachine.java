package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private Machine machine;
	private State currentState;
	private Transition currentTransition;
	private Map<String, State> stateMap;
	private List<String> variables;

	public StateMachine() {
		this.machine = new Machine();
		this.stateMap = new HashMap<>();
		this.variables = new ArrayList<>();
	}

	public Machine build() {
		for (String variable : variables) {
			machine.addInteger(variable);
		}
		return this.machine;
	}

	public StateMachine state(String string) {
		currentState = new State(string);
		stateMap.put(string, currentState);
		machine.addState(currentState);
		return this;
	}

	public StateMachine initial() {
		machine.setInitialState(currentState);
		return this;
	}

	public StateMachine when(String event) {
		currentTransition = new Transition(event);
		currentState.addTransition(currentTransition);
		return this;
	}

	public StateMachine to(String targetStateName) {
		State targetState = stateMap.get(targetStateName);
		if (targetState == null) {
			targetState = new State(targetStateName);
			stateMap.put(targetStateName, targetState);
		}
		currentTransition.setTarget(targetState);
		return this;
	}

	public StateMachine integer(String string) {
		variables.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTransition.setOperation(string, i);
		return this;
	}

	public StateMachine increment(String string) {
		currentTransition.incrementOperation(string);
		return this;
	}

	public StateMachine decrement(String string) {
		currentTransition.decrementOperation(string);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTransition.addCondition(string, i, "=");
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentTransition.addCondition(string, i, ">");
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentTransition.addCondition(string, i, "<");
		return this;
	}
}
