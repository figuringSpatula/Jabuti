// 
// Decompiled by Procyon v0.5.36
// 

package Commands;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
//import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


/**
 * @author Immedicable
 * @version 1.0.0
 */
public class DiscordServerCommands extends ListenerAdapter
{
    @Override
    public void onMessageReceived(final MessageReceivedEvent event) {
        final String input = event.getMessage().getContentRaw();
        if (isValidCommand(input)) {
            if (input.equalsIgnoreCase(".report unfunny")) {
                event.getChannel().sendMessage("<:unfunnybanned:762045145893830697>\n").queue();
            }
            else if (input.equalsIgnoreCase(".seagull") || input.equalsIgnoreCase(".iaxii")) {
                event.getChannel().sendMessage("*omg a black man*").queue();
            }
            else if (input.equalsIgnoreCase(".help")) {
                event.getChannel().sendMessageFormat("Help is not coming.%nYou're next.", new Object[0]).queue();
            }
            else if (input.equalsIgnoreCase(".quote")) {
                final String[] randomQuote = this.generateRandomQuote();
                event.getChannel().sendMessageFormat("%s%n%s", randomQuote[0], randomQuote[1]).queue();
            }
            else if (input.equalsIgnoreCase(".based")) {
                event.getChannel().sendMessage("Based? Based on what? In your dick? Please shut the fuck up and use words properly you fuckin troglodyte, do you think God gave us a freedom of speech just to spew random words that have no meaning that doesn't even correllate to the topic of the conversation? Like please you always complain about why no one talks to you or no one expresses their opinions on you because you're always spewing random shit like poggers based cringe and when you try to explain what it is and you just say that it's funny like what? What the fuck is funny about that do you think you'll just become a stand-up comedian that will get a standing ovation just because you said \"cum\" in the stage? HELL NO YOU FUCKIN IDIOT, so please shut the fuck up and use words properly you dumb bitch\n").queue();
            }
            else if (input.equalsIgnoreCase(".mistake")) {
                event.getChannel().sendMessageFormat("you dumb NIGGER %nYOU SPELT A WORD WRONG %nYOU FUCKING SUCK %nOH MY GOD %n**KILL YOURSELF**", new Object[0]).queue();
            }
            else if (this.isNotOtherCommand(input)) {
                event.getChannel().sendMessage("*idk what that means, " + event.getMember().getUser().getName()  + "*").queue();
            }
        }
    }
    
    private String[] generateRandomQuote() {
        final List<String> quotes = new ArrayList<String>();
        final List<String> correspondingAuthors = new ArrayList<String>();
        quotes.add("*sarah and i fuck all the time*");
        correspondingAuthors.add("--GronkWizard");
        quotes.add("*omg a black man*");
        correspondingAuthors.add("--Seagull2");
        quotes.add("*why are there discord rules if its anarchy smh*");
        correspondingAuthors.add("--onion");
        quotes.add("*Don't forget, the facesitting Contest starts next weekend!*");
        correspondingAuthors.add("--Weiss");
        quotes.add("*i hope black pete dreams of pretzels*");
        correspondingAuthors.add("--Weiss");
        quotes.add("*Friendly reminder that he*");
        correspondingAuthors.add("--he");
        quotes.add("*i can put my dick in ur cunt pls?*");
        correspondingAuthors.add("--Mark147");
        quotes.add("*yeah but theyre arabs they have no rights*");
        correspondingAuthors.add("--Seagull2");
        quotes.add("*Oldfacs is just 2b2t with less spam and more Allah*");
        correspondingAuthors.add("--Black Pete");
        quotes.add("*Fix your AntiCheat nerd. Getting kicked for AutoTotem.*");
        correspondingAuthors.add("--GratixxGD");
        final Random random = new Random();
        final int number = random.nextInt(quotes.size());
        final String[] output = { quotes.get(number), correspondingAuthors.get(number) };
        return output;
    }
    
    private boolean isNotOtherCommand(final String input) {
        return !input.equalsIgnoreCase(".ip") && !input.equalsIgnoreCase(".version") && !input.equalsIgnoreCase(".rules");
    }
    
    public static boolean isValidCommand(final String input) {
        return input.charAt(0) == '.' && input.length() > 1;
    }
}
