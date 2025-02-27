package main.metamodel;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class State {
	private String name;
	private List<Transition> transitions;
	private Map<String, Integer> variables;

	public State(String name) {
		this.name = name;
		this.transitions = new ArrayList<>();
		this.variables = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public void addTransition(Transition transition) {
		transitions.add(transition);
	}

	public Map<String, Integer> getVariables() {
		return variables;
	}

	public void setVariableValue(String variable, int value) {
		variables.put(variable, value);
	}

	public void setVariables(Map<String, Integer> variables) {
		this.variables.clear();
		this.variables.putAll(variables);
	}

	public int getVariableValue(String variable) {
		return variables.getOrDefault(variable, 0);
	}

	public Transition getTransitionByEvent(String event) {
		for (Transition t : transitions) {
			if (t.getEvent().equals(event)) {
				return t;
			}
		}
		return null;
	}

}
