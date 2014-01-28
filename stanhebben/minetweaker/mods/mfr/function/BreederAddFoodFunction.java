/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stanhebben.minetweaker.mods.mfr.function;

//#ifdef MC152
//+import net.minecraft.entity.EntityLiving;
//#else
import net.minecraft.entity.EntityLivingBase;
//#endif
import stanhebben.minetweaker.api.Tweaker;
import stanhebben.minetweaker.api.TweakerExecuteException;
import stanhebben.minetweaker.api.TweakerNameSpace;
import stanhebben.minetweaker.api.value.TweakerFunction;
import stanhebben.minetweaker.api.value.TweakerItem;
import stanhebben.minetweaker.api.value.TweakerValue;
import stanhebben.minetweaker.mods.mfr.action.BreederAddFoodAction;

/**
 *
 * @author Stanneke
 */
public class BreederAddFoodFunction extends TweakerFunction {
	public static final BreederAddFoodFunction INSTANCE = new BreederAddFoodFunction();
	
	private BreederAddFoodFunction() {}

	@Override
	public TweakerValue call(TweakerNameSpace namespace, TweakerValue... arguments) {
		if (arguments.length != 2) throw new TweakerExecuteException("breeder.addFood requires 2 arguments");
		try {
			Class<?> entityClass = Class.forName(notNull(arguments[0], "class cannot be null").toBasicString());
			//#ifdef MC152
			//+if (!EntityLiving.class.isAssignableFrom(entityClass)) {
			//#else
			if (!EntityLivingBase.class.isAssignableFrom(entityClass)) {
			//#endif
				throw new TweakerExecuteException("class is not an entity class");
			}
			TweakerItem item =
					notNull(arguments[1], "item cannot be null")
					.toItem("item must be an item");
			
			Tweaker.apply(new BreederAddFoodAction(entityClass, item));
			return null;
		} catch (ClassNotFoundException ex) {
			throw new TweakerExecuteException("entity class not found: " + arguments[0].toBasicString());
		}
	}

	@Override
	public String toString() {
		return "breeder.addFood";
	}
}
