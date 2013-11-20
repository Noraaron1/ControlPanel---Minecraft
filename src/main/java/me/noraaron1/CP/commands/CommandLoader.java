/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.noraaron1.CP.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author AARONCRAFT
 */
public class CommandLoader extends JavaPlugin{
    
    
    
    public void onEnable(){
       start();
    }
    
    private void start(){

//Assigns the commands
        /*/
getCommand("note").setExecutor( new me.noraaron1.CP.commands.CommandNote(this));
        /*/  
}   
}
