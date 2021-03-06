package stanhebben.minetweaker.script.expressions;

import stanhebben.minetweaker.api.TweakerExecuteException;
import stanhebben.minetweaker.api.TweakerNameSpace;
import stanhebben.minetweaker.api.value.TweakerValue;
import stanhebben.minetweaker.script.TweakerFile;

public class TweakerExpressionSubAssign extends TweakerExpression {
	private TweakerExpression left;
	private TweakerExpression right;
	
	public TweakerExpressionSubAssign(TweakerFile file, int line, int offset, TweakerExpression left, TweakerExpression right) {
		super(file, line, offset);
		
		this.left = left;
		this.right = right;
	}

	@Override
	public TweakerValue executeInner(TweakerNameSpace namespace) {
		TweakerValue leftValue = left.execute(namespace);
		if (leftValue == null) throw new TweakerExecuteException("Cannot subtract from a null value");
		TweakerValue result = leftValue.subAssign(right.execute(namespace));
		left.assign(namespace, result);
		return result;
	}
}
