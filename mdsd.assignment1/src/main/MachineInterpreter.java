package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
    private Machine machine;
    private State currentState;

    public void run(Machine m) {
        this.machine = m;
        this.currentState = machine.getInitialState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void processEvent(String event) {
        if (this.currentState == null) {
            return;
        }
        List<Transition> transitions = this.machine.getState(this.currentState.getName()).getTransitions();
        List<Transition> matchingTransitions = new ArrayList<>();
        for (Transition t : transitions) {
            if (t.getEvent().equals(event)) {
                matchingTransitions.add(t);
            }
        }
        for (Transition transition : matchingTransitions) {
            if (transition != null) {
                Map<String, Integer> currentVariables = new HashMap<>(currentState.getVariables());
                if (transition.isConditional()) {
                    int currentValue = currentState.getVariableValue(transition.getConditionVariableName());
                    int comparedValue = transition.getConditionComparedValue();
                    if (transition.isConditionEqual() && currentValue != comparedValue) {
                        continue;
                    }
                    if (transition.isConditionGreaterThan() && currentValue <= comparedValue) {
                        continue;
                    }
                    if (transition.isConditionLessThan() && currentValue >= comparedValue) {
                        continue;
                    }
                }
                if (transition.hasSetOperation()) {
                    currentVariables.put(transition.getOperationVariableName(), transition.getOperationValue());
                } else if (transition.hasIncrementOperation()) {
                    String varName = transition.getOperationVariableName();
                    int currentValue = currentState.getVariableValue(varName);
                    currentVariables.put(varName, currentValue + 1);
                } else if (transition.hasDecrementOperation()) {
                    String varName = transition.getOperationVariableName();
                    int currentValue = currentState.getVariableValue(varName);
                    currentVariables.put(varName, currentValue - 1);
                }
                this.currentState = transition.getTarget();
                this.currentState.setVariables(currentVariables);
                break;
            }
        }
    }

    public int getInteger(String variable) {
        return currentState.getVariableValue(variable);
    }
}