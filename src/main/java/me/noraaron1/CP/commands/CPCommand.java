/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.noraaron1.CP.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 *
 * @author AARONCRAFT
 */
public interface CPCommand{
    
    /**
     *
     * @param server
     * @param player
     * @param label
     * @param cmd
     * @param args
     * @return true
     */
    boolean cmd(Server server, Player player, String label, Command cmd, String[] args);
    
    
}
