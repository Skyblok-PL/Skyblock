package me.vodka_jpg.skyblockcore.commands;

import me.vodka_jpg.skyblockcore.Main.Core;
import me.vodka_jpg.skyblockcore.SkyblockCore;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class InfoPlayerCommand implements CommandExecutor {
    public InfoPlayerCommand(SkyblockCore skyblockCore){}
    private FlyCommand flyCommand;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (!player.hasPermission("Skyblok-infoPlayerCommand")){
                return false;
            }else {
                if (Bukkit.getPlayerExact(args[0])!= null){
                    Player target = Core.uuidToPlayer();
                    player.sendMessage(flyCommand.getListOfFlyingPlayers());
                }
                else {
                    player.sendMessage("tego gracza nie ma");
                }
            }
        }
        return false;
    }
}
