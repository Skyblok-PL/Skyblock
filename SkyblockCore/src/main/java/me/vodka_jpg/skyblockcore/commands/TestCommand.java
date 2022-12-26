package me.vodka_jpg.skyblockcore.commands;

import me.vodka_jpg.skyblockcore.SkyblockCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.UUID;

public class TestCommand implements CommandExecutor {
    private HashMap<UUID, Long> cooldown;
    private SkyblockCore skyblockCore;

    public TestCommand(SkyblockCore skyblockCore){
        this.cooldown= new HashMap<>();
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            UUID uuid = player.getUniqueId();
            if (!this.cooldown.containsKey(uuid)){
                this.cooldown.put(uuid,System.currentTimeMillis());
                player.sendMessage("wykonało sie..fasdasdasd");
            }
            else {
                Long TimeElapsed = System.currentTimeMillis() - cooldown.get(uuid);
                player.sendMessage("Trzeba poczekac jeszcze: "+ TimeElapsed);
            }
        }
        return false;
    }


}
