package main.metamodel;

public class Transition {
	private String event;
	private State target;
	private String operationVariable;
	private Integer operationValue;
	private boolean isIncrement;
	private boolean isDecrement;
	private String conditionVariable;
	private Integer conditionValue;
	private String conditionOperator;

	public Transition(String event) {
		this.event = event;
	}

	public boolean hasSetOperation() {
		return operationVariable != null && operationValue != null && !isIncrement && !isDecrement;
	}

	public boolean hasIncrementOperation() {
		return isIncrement;
	}

	public boolean hasDecrementOperation() {
		return isDecrement;
	}

	public String getEvent() {
		return event;
	}

	public State getTarget() {
		return this.target;
	}

	public void setTarget(State target) {
		this.target = target;
	}

	public void setOperation(String variable, int value) {
		this.operationVariable = variable;
		this.operationValue = value;
		this.isIncrement = false;
		this.isDecrement = false;
	}

	public void incrementOperation(String variable) {
		this.operationVariable = variable;
		this.operationValue = 1;
		this.isIncrement = true;
		this.isDecrement = false;
	}

	public void decrementOperation(String variable) {
		this.operationVariable = variable;
		this.operationValue = -1;
		this.isIncrement = false;
		this.isDecrement = true;
	}

	public boolean hasOperation() {
		return operationVariable != null;
	}

	public int getOperationValue() {
		return operationValue != null ? operationValue : 0;
	}

	public String getOperationVariableName() {
		return operationVariable;
	}

	public void addCondition(String variable, int value, String operator) {
		this.conditionVariable = variable;
		this.conditionValue = value;
		this.conditionOperator = operator;
	}

	public boolean isConditional() {
		return conditionVariable != null;
	}

	public String getConditionVariableName() {
		return conditionVariable;
	}

	public Integer getConditionValue() {
		return conditionValue;
	}

	public Integer getConditionComparedValue() {
		return conditionValue;
	}

	public String getConditionOperator() {
		return conditionOperator;
	}

	public boolean isConditionEqual() {
		return "=".equals(conditionOperator);
	}

	public boolean isConditionGreaterThan() {
		return ">".equals(conditionOperator);
	}

	public boolean isConditionLessThan() {
		return "<".equals(conditionOperator);
	}
}