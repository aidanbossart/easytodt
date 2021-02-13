package com.aidanbossart.runelite.plugins;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import com.aidanbossart.runelite.plugins.EasytodtPlugin;

public class EasytodtPluginTest
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(EasytodtPlugin.class);
        RuneLite.main(args);
    }
}
