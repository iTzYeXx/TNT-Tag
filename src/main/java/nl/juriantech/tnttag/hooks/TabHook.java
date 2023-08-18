package nl.juriantech.tnttag.hooks;

import me.neznamy.tab.api.TabAPI;

import java.util.Objects;
import java.util.UUID;

public class TabHook {

    private final TabAPI tabAPI;

    public TabHook() {
        this.tabAPI = TabAPI.getInstance();
    }
    public void hidePlayerName(UUID playerUUID) {
        if (tabAPI.getNameTagManager() == null) return;

        tabAPI.getNameTagManager().hideNameTag(Objects.requireNonNull(tabAPI.getPlayer(playerUUID)));
    }

    public void showPlayerName(UUID playerUUID) {
        if (tabAPI.getNameTagManager() == null) return;

        tabAPI.getNameTagManager().showNameTag(Objects.requireNonNull(tabAPI.getPlayer(playerUUID)));
    }
}