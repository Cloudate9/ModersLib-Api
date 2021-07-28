package me.awesomemoder316.lib.api;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.net.URL;
import java.util.*;

@SuppressWarnings("unused")
public class ModersLibApi {

    public ModersLibApi() {}
    //The actual code for the methods are in ModersLib

    /**
     * Github update check, using Github tags.
     * This only works properly if the tag version is the same as the corresponding version's plugin.yml.
     * Users will not asked to update if the tag version contains "alpha" or "beta".
     *
     * @author awesomemoder316
     * @since June 30th, 2021
     *
     * @param githubUsername    The Github username the project is owned by.
     * @param githubProjectName The Github repository name of the project.
     * @param downloadURL       The url where the updated plugin can be fetched.
     * @param requesterPlugin   The plugin that calls this method.
     */
    public void githubUpdateCheck(String githubUsername, String githubProjectName, URL downloadURL, Plugin requesterPlugin) {}

    /**
     *
     * This only works if your plugin is hosted on Spigot. If it is hosted somewhere else, use detailedUpdateCheck()
     *
     * @author awesomemoder316
     * @since June 30th, 2021
     *
     * @param resourceId            The resourceId of your plugin, which can be found on spigot. Only use this if your plugin is hosted on Spigot.
     * @param requesterPlugin       The plugin that calls this method.
     * @param downloadURL           The url where the updated plugin can be fetched.
     */

    public void spigotUpdateCheck(int resourceId, Plugin requesterPlugin, URL downloadURL) {}

    /**
     * updateDetected contains the books with update info for plugins with updates.
     *
     * @author awesomemoder316
     * @since June 30th, 2021
     *
     * @return HashMap updateDetected.
     *
     */
    public HashMap<Plugin, ItemStack> getUpdateDetected() {return new HashMap<>();}

    /**
     * pastFirstCheck contains plugins using ModersLib that have done the first update check.
     *
     * @author awesomemoder316
     * @since June 30th, 2021
     *
     * @return HashMap pastFirstCheck.
     *
     */
    public ArrayList<Plugin> getpastFirstCheck() {return new ArrayList<>();}

}
