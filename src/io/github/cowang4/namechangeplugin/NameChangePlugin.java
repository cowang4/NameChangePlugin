
package io.github.cowang4.namechangeplugin;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author Greg
 */
public final class NameChangePlugin extends JavaPlugin{

    @Override
    public void onEnable()
    {
        getLogger().info("onEnable has been invoked!");
        this.saveDefaultConfig();
        getLogger().info("saved Default Config");
        this.getConfig().addDefault("Players", "Players");
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
    
    @Override
    public void onDisable()
    {
         getLogger().info("onDisable has been invoked!");
         this.saveConfig();
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {
        if(cmd.getName().equalsIgnoreCase("namechange"))
        {
            if(args.length > 2){
                sender.sendMessage("Too many arguments!");
                return false;
            }
            if(!(sender instanceof Player) && args[1].contentEquals(null))
            {
                sender.sendMessage("Must specify a player");
                return false;//chacks for a console command with no player specified
            }
            
            Player target = (Bukkit.getServer().getPlayer(args[1]));
            if (target == null && !(args[1] == null)){
                sender.sendMessage(args[1] + " is not an online player.");
                return false;
            }
            
            
            //do stuff
            return true;
        }
        
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void sendInfoToLogger(String text)
    {
        getLogger().info(text);
    }
}
