// 
// Decompiled by Procyon v0.5.36
// 

package Events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
//import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author Immedicable
 * @version 1.0.0
 * Emoji reactions to owner names
 */
public class OwnerReact extends ListenerAdapter
{
    public static final Emoji immedicable = Emoji.fromFormatted("<:immedicable:600447154233802847>");
    public static final Emoji azzy = Emoji.fromFormatted("<:void:641631494527254539>");
    @Override
    public void onMessageReceived(final MessageReceivedEvent event) {
        final String[] split;
        split = event.getMessage().getContentRaw().split("\\s+");
        for (final String element : split) {
            if (element.equalsIgnoreCase("immedicable")) {
                final Message message2 = event.getMessage();
                message2.addReaction(immedicable).queue();
            }
            else if (element.equalsIgnoreCase("void")) {
                final Message message2 = event.getMessage();
                message2.addReaction(azzy).queue();
            }
        }
    }
}
