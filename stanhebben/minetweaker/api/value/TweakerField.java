package stanhebben.minetweaker.api.value;

import java.util.HashMap;

/**
 * Field enumerator with all field names used in minetweaker. Used extensively
 * when selecting members of built-in types.
 * 
 * @author Stan Hebben
 */
public enum TweakerField {
	ABS,
	ADD,
	ADDBLACKLIST,
	ADDCONTAINER,
	ADDCRATING,
	ADDDROP,
	ADDFERTILIZABLE,
	ADDFERTILIZER,
	ADDFOOD,
	ADDFRUIT,
	ADDFUEL,
	ADDGRINDABLE,
	ADDHARVESTABLE,
	ADDLOG,
	ADDORE,
	ADDPLANTABLE,
	ADDPREFERREDORE,
	ADDRAINITEM,
	ADDRANCHABLE,
	ADDRECIPE,
	ADDRECIPEFUELCAN,
	ADDSHAPED,
	ADDSHAPELESS,
	ADDSMELTING,
	ADDSTOPITEM,
	ADDTOOL,
	ALLOYSMELTER,
	AMOUNT,
	ANY,
	ASSEMBLER,
	ASSEMBLYTABLE,
	AUTOSPAWNER,
	BEES,
	BIOGASENGINE,
	BIOGENERATOR,
	BLACKLIST,
	BLASTFURNACE,
	BOTTLER,
	BREAKUNDO,
	BREEDER,
	BYTEARRAY,
	CANCLEAR,
	CANNER,
	CARPENTER,
	CENTRIFUGE,
	CHEMICAL,
	CLEAR,
	COKEOVEN,
	COMPRESSOR,
	CONTAINS,
	COOLANTS,
	COOLING,
	CUTTER,
	CUTTING,
	DAMAGE,
	DAMAGED,
	DENSEFLUIDGENERATOR,
	DENSITY,
	DIESELGENERATOR,
	DISPLAYNAME,
	DISTILLATIONTOWER,
	ELECTROLYZER,
	EXTRACTOR,
	EXTRUDING,
	FABRICATOR,
	FERMENTER,
	FERTILIZER,
	FLUID,
	FRUITPICKER,
	FUEL,
	FUELS,
	FUSIONREACTOR,
	GASEOUS,
	GASTURBINE,
	GRINDER,
	HARVESTER,
	ID,
	IMPLOSIONCOMPRESSOR,
	INDEXOF,
	INTARRAY,
	ISINFINITE,
	ISNAN,
	ITEM,
	ITEMS,
	LATHE,
	LENGTH,
	LIQUID,
	LISTDROPS,
	LUMINOSITY,
	MACERATOR,
	MAGICGENERATOR,
	MATCHES,
	MATTERAMPLIFIER,
	MAXDAMAGE,
	META,
	METALFORMER,
	MININGLASER,
	MODIFYARMORDAMAGE,
	MOISTENER,
	NAME,
	ONLY,
	OREWASHINGPLANT,
	PEATFIREDENGINE,
	PLANTER,
	PLASMAGENERATOR,
	PLATEBENDER,
	POWERPERCYCLE,
	PRINTGENES,
	RAINMAKER,
	RANCHER,
	REFINERY,
	REMOVE,
	REMOVEBLACKLIST,
	REMOVECONTAINER,
	REMOVEDROP,
	REMOVEFERTILIZABLE,
	REMOVEFERTILIZER,
	REMOVEFOOD,
	REMOVEFRUIT,
	REMOVEFUEL,
	REMOVEGRINDABLE,
	REMOVEHARVESTABLE,
	REMOVEITEM,
	REMOVELOG,
	REMOVEORE,
	REMOVEPLANTABLE,
	REMOVEPREFERREDORE,
	REMOVERANCHABLE,
	REMOVERECIPE,
	REMOVESHAPED,
	REMOVESHAPELESS,
	REMOVETOOL,
	ROLLING,
	ROCKCRUSHER,
	ROLLINGMACHINE,
	RUBBERTREE,
	SAFARINET,
	SAWMILL,
	SETADMINS,
	SETDISPLAYNAME,
	SETENERGY,
	SETSOFTBLOCK,
	SETTOOLCLASS,
	SLUDGEBOILER,
	SPLIT,
	SQUEEZER,
	STILL,
	SUBS,
	SUBSTRING,
	TAG,
	TEMPERATURE,
	THERMALCENTRIFUGE,
	THERMALGENERATOR,
	TOTALBURNINGTIME,
	VACUUMFREEZER,
	WIREMILL,
	WITHDAMAGE,
	_INVALID_;
	
	private static final HashMap<String, TweakerField> fieldForName;
	
	static {
		fieldForName = new HashMap<String, TweakerField>();
		fieldForName.put("abs", ABS);
		fieldForName.put("add", ADD);
		fieldForName.put("addBlacklist", ADDBLACKLIST);
		fieldForName.put("addContainer", ADDCONTAINER);
		fieldForName.put("addCrating", ADDCRATING);
		fieldForName.put("addDrop", ADDDROP);
		fieldForName.put("addFertilizable", ADDFERTILIZABLE);
		fieldForName.put("addFertilizer", ADDFERTILIZER);
		fieldForName.put("addFood", ADDFOOD);
		fieldForName.put("addFruit", ADDFRUIT);
		fieldForName.put("addFuel", ADDFUEL);
		fieldForName.put("addGrindable", ADDGRINDABLE);
		fieldForName.put("addHarvestable", ADDHARVESTABLE);
		fieldForName.put("addLog", ADDLOG);
		fieldForName.put("addOre", ADDORE);
		fieldForName.put("addPlantable", ADDPLANTABLE);
		fieldForName.put("addPreferredOre", ADDPREFERREDORE);
		fieldForName.put("addRainItem", ADDRAINITEM);
		fieldForName.put("addRanchable", ADDRANCHABLE);
		fieldForName.put("addRecipe", ADDRECIPE);
		fieldForName.put("addRecipeFuelCan", ADDRECIPEFUELCAN);
		fieldForName.put("addShaped", ADDSHAPED);
		fieldForName.put("addShapeless", ADDSHAPELESS);
		fieldForName.put("addSmelting", ADDSMELTING);
		fieldForName.put("addStopItem", ADDSTOPITEM);
		fieldForName.put("addTool", ADDTOOL);
		fieldForName.put("alloySmelter", ALLOYSMELTER);
		fieldForName.put("amount", AMOUNT);
		fieldForName.put("any", ANY);
		fieldForName.put("assembler", ASSEMBLER);
		fieldForName.put("assemblyTable", ASSEMBLYTABLE);
		fieldForName.put("autoSpawner", AUTOSPAWNER);
		fieldForName.put("bees", BEES);
		fieldForName.put("biogasEngine", BIOGASENGINE);
		fieldForName.put("bioGenerator", BIOGENERATOR);
		fieldForName.put("blacklist", BLACKLIST);
		fieldForName.put("blastFurnace", BLASTFURNACE);
		fieldForName.put("bottler", BOTTLER);
		fieldForName.put("breeder", BREEDER);
		fieldForName.put("byteArray", BYTEARRAY);
		fieldForName.put("canClear", CANCLEAR);
		fieldForName.put("canner", CANNER);
		fieldForName.put("carpenter", CARPENTER);
		fieldForName.put("centrifuge", CENTRIFUGE);
		fieldForName.put("chemical", CHEMICAL);
		fieldForName.put("clear", CLEAR);
		fieldForName.put("cokeOven", COKEOVEN);
		fieldForName.put("compressor", COMPRESSOR);
		fieldForName.put("contains", CONTAINS);
		fieldForName.put("coolants", COOLANTS);
		fieldForName.put("cooling", COOLING);
		fieldForName.put("cutter", CUTTER);
		fieldForName.put("damage", DAMAGE);
		fieldForName.put("damaged", DAMAGED);
		fieldForName.put("denseFluidGenerator", DENSEFLUIDGENERATOR);
		fieldForName.put("dieselGenerator", DIESELGENERATOR);
		fieldForName.put("displayName", DISPLAYNAME);
		fieldForName.put("distillationTower", DISTILLATIONTOWER);
		fieldForName.put("density", DENSITY);
		fieldForName.put("electrolyzer", ELECTROLYZER);
		fieldForName.put("extractor", EXTRACTOR);
		fieldForName.put("fabricator", FABRICATOR);
		fieldForName.put("fermenter", FERMENTER);
		fieldForName.put("fertilizer", FERTILIZER);
		fieldForName.put("fluid", FLUID);
		fieldForName.put("fruitPicker", FRUITPICKER);
		fieldForName.put("fuel", FUEL);
		fieldForName.put("fuels", FUELS);
		fieldForName.put("fusionReactor", FUSIONREACTOR);
		fieldForName.put("gaseous", GASEOUS);
		fieldForName.put("gasTurbine", GASTURBINE);
		fieldForName.put("grinder", GRINDER);
		fieldForName.put("harvester", HARVESTER);
		fieldForName.put("id", ID);
		fieldForName.put("indexOf", INDEXOF);
		fieldForName.put("intArray", INTARRAY);
		fieldForName.put("implosionCompressor", IMPLOSIONCOMPRESSOR);
		fieldForName.put("isInfinite", ISINFINITE);
		fieldForName.put("isNaN", ISNAN);
		fieldForName.put("item", ITEM);
		fieldForName.put("lathe", LATHE);
		fieldForName.put("length", LENGTH);
		fieldForName.put("liquid", LIQUID);
		fieldForName.put("listDrops", LISTDROPS);
		fieldForName.put("luminosity", LUMINOSITY);
		fieldForName.put("macerator", MACERATOR);
		fieldForName.put("magicGenerator", MAGICGENERATOR);
		fieldForName.put("matches", MATCHES);
		fieldForName.put("matterAmplifier", MATTERAMPLIFIER);
		fieldForName.put("maxDamage", MAXDAMAGE);
		fieldForName.put("meta", META);
		fieldForName.put("miningLaser", MININGLASER);
		fieldForName.put("modifyArmorDamage", MODIFYARMORDAMAGE);
		fieldForName.put("moistener", MOISTENER);
		fieldForName.put("name", NAME);
		fieldForName.put("only", ONLY);
		fieldForName.put("oreWashingPlant", OREWASHINGPLANT);
		fieldForName.put("peatFiredEngine", PEATFIREDENGINE);
		fieldForName.put("planter", PLANTER);
		fieldForName.put("plasmaGenerator", PLASMAGENERATOR);
		fieldForName.put("plateBender", PLATEBENDER);
		fieldForName.put("printGenes", PRINTGENES);
		fieldForName.put("powerPerCycle", POWERPERCYCLE);
		fieldForName.put("rainmaker", RAINMAKER);
		fieldForName.put("rancher", RANCHER);
		fieldForName.put("refinery", REFINERY);
		fieldForName.put("remove", REMOVE);
		fieldForName.put("removeBlacklist", REMOVEBLACKLIST);
		fieldForName.put("removeContainer", REMOVECONTAINER);
		fieldForName.put("removeDrop", REMOVEDROP);
		fieldForName.put("removeFertilizable", REMOVEFERTILIZABLE);
		fieldForName.put("removeFertilizer", REMOVEFERTILIZER);
		fieldForName.put("removeFood", REMOVEFOOD);
		fieldForName.put("removeFruit", REMOVEFRUIT);
		fieldForName.put("removeFuel", REMOVEFUEL);
		fieldForName.put("removeGrindable", REMOVEGRINDABLE);
		fieldForName.put("removeHarvestable", REMOVEHARVESTABLE);
		fieldForName.put("removeItem", REMOVEITEM);
		fieldForName.put("removeLog", REMOVELOG);
		fieldForName.put("removeOre", REMOVEORE);
		fieldForName.put("removePlantable", REMOVEPLANTABLE);
		fieldForName.put("removePreferredOre", REMOVEPREFERREDORE);
		fieldForName.put("removeRanchable", REMOVERANCHABLE);
		fieldForName.put("removeRecipe", REMOVERECIPE);
		fieldForName.put("removeShaped", REMOVESHAPED);
		fieldForName.put("removeShapeless", REMOVESHAPELESS);
		fieldForName.put("removeTool", REMOVETOOL);
		fieldForName.put("rockCrusher", ROCKCRUSHER);
		fieldForName.put("rollingMachine", ROLLINGMACHINE);
		fieldForName.put("rubberTree", RUBBERTREE);
		fieldForName.put("safariNet", SAFARINET);
		fieldForName.put("setAdmins", SETADMINS);
		fieldForName.put("setDisplayName", SETDISPLAYNAME);
		fieldForName.put("setEnergy", SETENERGY);
		fieldForName.put("setSoftBlock", SETSOFTBLOCK);
		fieldForName.put("setToolClass", SETTOOLCLASS);
		fieldForName.put("sludgeBoiler", SLUDGEBOILER);
		fieldForName.put("split", SPLIT);
		fieldForName.put("squeezer", SQUEEZER);
		fieldForName.put("still", STILL);
		fieldForName.put("substring", SUBSTRING);
		fieldForName.put("subs", SUBS);
		fieldForName.put("sawmill", SAWMILL);
		fieldForName.put("tag", TAG);
		fieldForName.put("temperature", TEMPERATURE);
		fieldForName.put("thermalCentrifuge", THERMALCENTRIFUGE);
		fieldForName.put("thermalGenerator", THERMALGENERATOR);
		fieldForName.put("totalBurningTime", TOTALBURNINGTIME);
		fieldForName.put("vacuumFreezer", VACUUMFREEZER);
		fieldForName.put("wiremill", WIREMILL);
		fieldForName.put("withDamage", WITHDAMAGE);
	}
	
	public static TweakerField get(String value) {
		TweakerField result = fieldForName.get(value);
		if (result == null) return _INVALID_;
		return result;
	}
}
