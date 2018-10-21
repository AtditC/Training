package ch.atdit.training.Commands;

import ch.atdit.training.Training;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class TrainingCommands {

    private Training instance;

    public TrainingCommands(Training main) {
        this.instance = main;
    }

    @Command(aliases = "training", desc = "Manage the Training plugin", min = 2, max = 2, usage = "<config|settings> [value|on|off]")
    public static void training(CommandContext cmd, CommandSender sender) {
        sender.sendMessage(ChatColor.RED + "This command is in development.");
    }
}
