package me.badawy.motd;

import dev.velix.imperat.BukkitSource;
import dev.velix.imperat.annotations.*;

@Command("motd")
@Permission("motd.set")
public class ChangeMessageCommand  {

    @Usage
    public void Usage(BukkitSource source) {
        source.reply("&7The message of the day is &a "+ MOTD.message);
        source.reply("&f (you can change the message by using &a/motd set <message>");
    }

    @SubCommand("set")
    public void change(BukkitSource source,@Named("Message") @Greedy String motd) {
        MOTD.message = motd;
        source.reply("&aThe message of the day has been set to &b" + motd);
        MOTD.Getplugin().getConfig().set("MOTD", motd);
        MOTD.Getplugin().saveConfig();
    }

}
