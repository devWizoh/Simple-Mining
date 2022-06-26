package simple.mining.blocks;

import simple.mining.apis.ActionBar;
import simple.mining.inicializer.*;

import org.bukkit.event.block.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.block.*;
import org.bukkit.event.*;

public class fObsidian implements Listener {
    public fObsidian() {
        super();
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void blocks(final BlockBreakEvent event) {
        if (!event.isCancelled()) {
            final Player player = event.getPlayer();
            final Block bloco = event.getBlock();
            if (player.getWorld().getName().equalsIgnoreCase("Minas") && bloco.getType() == Material.OBSIDIAN) {
                bloco.setType(Material.AIR);
                if (player.hasPermission("bonus.membro")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 75D); /* sem multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$65 §fem sua conta. §c[Sem Bônus]");
                }
                if (player.hasPermission("bonus.vip")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 78D); /* com multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$68 §fem sua conta. §7[Bônus de 1.1x]");
                }
                if (player.hasPermission("bonus.vip+")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 80D); /* com multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$70 §fem sua conta. §7[Bônus de 1.5x]");
                }
                if (player.hasPermission("bonus.mvp")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 85D); /* com multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$75 §fem sua conta. §7[Bônus de 1.9x]");
                }
                if (player.hasPermission("bonus.mvp+")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 88D); /* com multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$78 §fem sua conta. §7[Bônus de 2.0x]");
                }
                if (player.hasPermission("bonus.magic")) {
                    Core.economy.depositPlayer((OfflinePlayer) player, 90D); /* com multiplicador */
                    ActionBar.sendActionBarMessage(player, "§e§lMINERAÇÃO §7§l▏ §fForam adicionados §a+$80 §fem sua conta. §7[Bônus de 2.5x]");
                }
            }
        }
    }
}
