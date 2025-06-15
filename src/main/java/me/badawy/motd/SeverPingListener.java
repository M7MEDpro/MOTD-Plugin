package me.badawy.motd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class SeverPingListener implements Listener {

    @EventHandler
    public void onseverPing(ServerListPingEvent e) {
        e.setMotd(MOTD.message);
    }
}
