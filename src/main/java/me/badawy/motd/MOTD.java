package me.badawy.motd;

import dev.velix.imperat.BukkitImperat;
import org.bukkit.plugin.java.JavaPlugin;

public final class MOTD extends JavaPlugin {
    private BukkitImperat imperat;
    public static String message;
    private static MOTD plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new SeverPingListener(), this);
        message = getConfig().getString("MOTD");
        imperat = BukkitImperat.builder(this)
                .dependencyResolver(MOTD.class, () -> MOTD.this)
                .build();
        imperat.registerCommand(new ChangeMessageCommand());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static MOTD Getplugin() {
    return plugin;
    }
}
