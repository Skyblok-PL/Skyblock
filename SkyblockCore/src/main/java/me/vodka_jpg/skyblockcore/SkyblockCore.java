package me.vodka_jpg.skyblockcore;

import me.vodka_jpg.skyblockcore.commands.FlyCommand;
import me.vodka_jpg.skyblockcore.commands.InfoPlayerCommand;
import me.vodka_jpg.skyblockcore.commands.TestCommand;
import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyblockCore extends JavaPlugin {
public static String prefixSB = "Skyblok.Pl-udekorowac prefix";


    @Override
    public void onEnable(){
        getCommand("island").setExecutor(this);
        getCommand("test").setExecutor(new TestCommand(this));
        getCommand("fly").setExecutor(new FlyCommand(this));
        getCommand("info").setExecutor(new InfoPlayerCommand(this));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Ta komenda jest dostępna tylko dla graczy.");
            return true;
        }

        Player player = (Player) sender;
        String worldName = "island";

        if (!getServer().getWorlds().contains(getServer().getWorld(worldName))) {
            WorldCreator creator = new WorldCreator(worldName);
            creator.createWorld();
        }

        player.teleport(getServer().getWorld(worldName).getSpawnLocation());
        return true;
    }
}