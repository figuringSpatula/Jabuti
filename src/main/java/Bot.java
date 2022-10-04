import net.dv8tion.jda.api.JDA;
import Events.OwnerReact;
import Features.Status;
import Commands.DiscordServerCommands;
import Commands.MinecraftServerCommands;
import Events.MemeEvents;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

// 
// Decompiled by Procyon v0.5.36
// 

/**
 * @author Immedicable
 * @version 1.0.0
 */
public class Bot extends ListenerAdapter
{
    public static void main(final String[] args) throws Exception {

        final JDA jda = JDABuilder.createDefault(args[0]).enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT).build();
        jda.addEventListener(new MemeEvents());
        jda.addEventListener(new MinecraftServerCommands());
        jda.addEventListener(new DiscordServerCommands());
        jda.addEventListener(new Status());
        jda.addEventListener(new OwnerReact());



    }
}
