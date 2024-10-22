package winlyps.noInsomnia

import org.bukkit.plugin.java.JavaPlugin

class NoInsomnia : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doInsomnia", "false")
        }
        logger.info("NoInsomnia plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoInsomnia plugin has been disabled.")
    }
}