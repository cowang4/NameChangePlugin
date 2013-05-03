/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.cowang4.namechangeplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author Greg
 */
public class ChatListener implements Listener{
    @EventHandler
    public void onChatMesage(AsyncPlayerChatEvent evt)
    {
        Player speaker = evt.getPlayer();
        String message = evt.getMessage();
        
        if (evt.getPlayer().getName().equals("Awesomewin4"))
        {
            evt.setMessage(ChatColor.GREEN + message);
            evt.getPlayer().setCustomName("Greg");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Greg");
        }
        else if (evt.getPlayer().getName().equals("T12Caboose"))
        {
            evt.setMessage(ChatColor.RED + message);
            evt.getPlayer().setCustomName("Alex");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Alex");
        }
        else if (evt.getPlayer().getName().equals("Arunto"))
        {
            evt.setMessage(ChatColor.WHITE + message);
            evt.getPlayer().setCustomName("Jeff");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Jeff");
        }
        else if (evt.getPlayer().getName().equals("Bakaiyu"))
        {
            evt.setMessage(ChatColor.DARK_PURPLE + message);
            evt.getPlayer().setCustomName("Ryan");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Ryan");
        }
        else if (evt.getPlayer().getName().equals("Mrassassin"))
        {
            evt.setMessage(ChatColor.AQUA + message);
            evt.getPlayer().setCustomName("Patrick");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Patrick");
        }
        else if (evt.getPlayer().getName().equals("Matttheripper"))
        {
            evt.setMessage(ChatColor.YELLOW + message);
            evt.getPlayer().setCustomName("Matt");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Matt");
        }
        else if (evt.getPlayer().getName().equalsIgnoreCase("Wildcard123"))
        {
            evt.setMessage(ChatColor.DARK_GREEN + message);
            evt.getPlayer().setCustomName("Jake");//this doent work...
            evt.getPlayer().setCustomNameVisible(true);
            evt.getPlayer().setDisplayName("Jake");
        }
        else
        {
            evt.setMessage("You Suck.");
        }
        
    }
    
    
}
