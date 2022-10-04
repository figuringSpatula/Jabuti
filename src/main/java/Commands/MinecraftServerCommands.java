// 
// Decompiled by Procyon v0.5.36
// 

package Commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
//import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author Immedicable
 * @version 1.0.0
 */
public class MinecraftServerCommands extends ListenerAdapter
{
    @Override
    public void onMessageReceived(final MessageReceivedEvent event) {
        String input = event.getMessage().getContentDisplay();

        if (isValidCommand(input)) {
            if (input.equalsIgnoreCase(".ip")) {
                event.getChannel().sendMessage("*The IP of OldFacs is 51.68.102.222:25578*").queue();
            }
            else if (input.equalsIgnoreCase(".version")) {
                event.getChannel().sendMessage("*The server is currently running on 1.19.2*").queue();
            }
            else if (input.equalsIgnoreCase(".rules")) {
                event.getChannel().sendMessage("*The* **Minecraft server** *has* **no** *rules. But the Discord server* **does:** <#705002346274488364>").queue();
            }
        }
    }
    
    public static boolean isValidCommand(final String input) {
        return input.charAt(0) == '.' && input.length() > 1;
    }
}
