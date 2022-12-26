package me.vodka_jpg.skyblockcore.Main;

import com.sun.naming.internal.ObjectFactoriesFilter;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Core {
    public static String uuidToName(UUID uuid){
        return Bukkit.getOfflinePlayer(uuid).getName();
    }
    public static Player uuidToPlayer(UUID uuid){
        return Bukkit.getPlayer(uuid);
    }
    public static OfflinePlayer uuidToOfflinePlayer(UUID uuid){
        return Bukkit.getOfflinePlayer(uuid);
    }
    
}
