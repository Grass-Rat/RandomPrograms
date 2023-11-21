// Follows a github tut that signs a bot in and says pong when somebody says ping
public class botTestA {

    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "your token";

        Object Intent;
        DiscordApi api = ((Object) new DiscordApi()).setToken(token).addIntent(Intent.MESSAGE_CONTENT).login().join();
          DiscordApi api = ((Object) new DiscordApi()).setToken(token).login().join();
          
        api.addSlashCommandCreateListener(event -> {
            SlashCommandInteraction slashCommandInteraction = event.getSlashCommandInteraction();
            if (slashCommandInteraction.getCommandName().equals("ping")) {
                slashCommandInteraction.createImmediateResponder()
                    .setContent("Pong!")
                    .setFlags(MessageFlag.EPHEMERAL) // Only visible for the user which invoked the command
                    .respond();
            }
        });

        SlashCommand.with("ping", "A simple ping pong command!").createGlobal(api).join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }

}