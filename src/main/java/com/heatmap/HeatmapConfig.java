package com.heatmap;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("heatmap")
public interface HeatmapConfig extends Config
{
	@ConfigItem(
		keyName = "tutorial",
		name = "Show Heatmap Tutorial",
		description = "Show Heatmap Tutorial",
		position = 1
	)
	default boolean showTutorial()
	{
		return true;
	}

	@ConfigItem(
			keyName = "Quintile",
			name = "Group By Quintile",
			description = "Groups item cost by quintile, so that outliers don't skew the display",
			position = 2
	)
	default boolean groupQuintile() { return false; }
	@ConfigItem(
		keyName = "tutorial",
		name = "",
		description = ""
	)
	void setTutorial(boolean tutorial);
}
