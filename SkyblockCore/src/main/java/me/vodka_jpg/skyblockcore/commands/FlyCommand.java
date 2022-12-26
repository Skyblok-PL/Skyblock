package me.vodka_jpg.skyblockcore.commands;

import me.vodka_jpg.skyblockcore.SkyblockCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

//Dodanie komendy do latania
public class FlyCommand implements CommandExecutor {
    private  SkyblockCore skyblockCore;
    private ArrayList<String> listOfFlyingPlayers = new ArrayList<String>();
    public FlyCommand(SkyblockCore skyblockCore){
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
Player player = (Player) sender;
if (!player.hasPermission("Skyblok-Command-Fly")){
    player.sendMessage("nie masz wymaganych upa");
    return false;
}else {
    listOfFlyingPlayers.add(player.getName());
    player.setFlying(true);
    player.sendMessage(listOfFlyingPlayers.get(0));

}

        }
        return false;
    }
    public  String getListOfFlyingPlayers(){
        for (String n:listOfFlyingPlayers) {

            
        }
        return null;
    }
}
