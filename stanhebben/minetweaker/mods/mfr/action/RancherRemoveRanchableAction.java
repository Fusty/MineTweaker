/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stanhebben.minetweaker.mods.mfr.action;

import powercrystals.minefactoryreloaded.api.FactoryRegistry;
import powercrystals.minefactoryreloaded.api.IFactoryRanchable;
import stanhebben.minetweaker.api.IUndoableAction;
import stanhebben.minetweaker.mods.mfr.MFRHacks;

/**
 *
 * @author Stanneke
 */
public class RancherRemoveRanchableAction implements IUndoableAction {
	private final Class<?> clazz;
	private final IFactoryRanchable old;
	
	public RancherRemoveRanchableAction(Class<?> clazz) {
		this.clazz = clazz;
		
		old = MFRHacks.ranchables.get(clazz);
	}

	public void apply() {
		MFRHacks.ranchables.remove(clazz);
	}

	public boolean canUndo() {
		return true;
	}

	public void undo() {
		FactoryRegistry.registerRanchable(old);
	}

	public String describe() {
		return "Removing ranchable " + clazz.getCanonicalName();
	}

	public String describeUndo() {
		return "Restoring ranchable " + clazz.getCanonicalName();
	}
}
