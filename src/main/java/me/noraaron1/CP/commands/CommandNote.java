/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.noraaron1.CP.commands;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author AARONCRAFT
 */
public class CommandNote extends JavaPlugin implements CPCommand{
    
      static CommandLoader plugin;

  public CommandNote(CommandLoader instance)
  {
    plugin = instance;
  }

    
    public void onEnable(){
          try {
              CreateConfig();
          } catch (IOException ex) {
              Logger.getLogger(CommandNote.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    /**
     *
     * @param player
     * @param event
     * @param file
     * @throws IOException
     */
    @EventHandler
    public void PlayerJoinEvent(Player player, Event event, File file){
        File config = new File(player +".dat");
        
        File reportFile = new File(plugin.getDataFolder() + File.separator + "PlayerNotes" + File.separator + config);
    if (!reportFile.exists()) {
            try {
                reportFile.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CommandNote.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    public void CreateConfig() throws IOException{
        
        File Notes = new File(plugin.getDataFolder() + File.separator + "PlayerNotes");
        
        
        if(!Notes.exists()){
            Notes.mkdir();
        }
    }
    
    @Override
    public boolean cmd(Server server, Player player, String label, Command cmd, String[] args) {
        Player targetPlayer = player.getServer().getPlayer(args [0]);
        if(cmd.getName().equalsIgnoreCase("note")){
            if(player.getName().equalsIgnoreCase("noraaron1")){
               File targetPlayerDat = new File(plugin.getDataFolder() + File.separator + "PlayerNotes" + File.separator + targetPlayer + ".dat");
               targetPlayerDat.renameTo((File) targetPlayer);
            }
        }
        return true;
        
    }

     public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, Player player) {
         Player targetPlayer = player.getServer().getPlayer(args [0]);
        if(cmd.getName().equalsIgnoreCase("note")){
            if(player.getName().equalsIgnoreCase("noraaron1")){
               File targetPlayerDat = new File(plugin.getDataFolder() + File.separator + "PlayerNotes" + File.separator + targetPlayer + ".dat");
               targetPlayerDat.renameTo((File) targetPlayer);
            }
        }
        return true;
    }
    
    

    
}
