// 
// Decompiled by Procyon v0.5.36
// 

package Features;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author Immedicable
 * @version 1.0.0
 * Sets the activity of the bot (discord status)
 */
public class Status extends ListenerAdapter
{
    @Override
    public void onReady(final ReadyEvent event) {
        event.getJDA().getPresence().setActivity(Activity.playing("OldFacs"));
    }
}
