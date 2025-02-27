package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	private List<State> states;
	private State initialState;
	private List<String> variables;

	public Machine() {
		this.states = new ArrayList<>();
		this.variables = new ArrayList<>();
	}

	public List<State> getStates() {
		return states;
	}

	public void addState(State state) {
		this.states.add(state);
	}

	public void setInitialState(State state) {
		this.initialState = state;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String name) {
		return states.stream()
				.filter(state -> state.getName().equals(name))
				.findFirst()
				.orElse(null);
	}

	public void addInteger(String name) {
		variables.add(name);
	}

	public int numberOfIntegers() {
		return this.variables.size();
	}

	public boolean hasInteger(String name) {
		return this.variables.contains(name);
	}
}
