// 
// Decompiled by Procyon v0.5.36
// 

package Events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
//import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author Immedicable
 * @version 1.0.0
 * Funny responses
 */
public class MemeEvents extends ListenerAdapter
{
    @Override
    public void onMessageReceived(final MessageReceivedEvent event) {
        final String input = event.getMessage().getContentRaw();

        // Pick out each word from the message, removing the whitespaces
        final String[] messageReceived = input.split("\\s+");
        final String name = event.getMember().getUser().getName();
        for (final String messageElement : messageReceived) {
            // Bot doesn't reply to itself (unfunny)
            if (!event.getMember().getUser().isBot()) {
                if (messageElement.equalsIgnoreCase("sex")) {
                    event.getChannel().sendMessage("*Sex is not enabled on this server, " + name + "*").queue();
                    break;
                }
                if (messageElement.equalsIgnoreCase("bearlit")) {
                    event.getChannel().sendMessage("FUCK BEARLIT").queue();
                    break;
                }
            }
        }
        if (input.equalsIgnoreCase("black pete moment")) {
            event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/494257951402491938/777605592163287080/black.mp4").queue();
        }
    }
}
