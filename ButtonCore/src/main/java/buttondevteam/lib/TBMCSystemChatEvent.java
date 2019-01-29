package buttondevteam.lib;

import buttondevteam.core.component.channel.Channel;
import lombok.Getter;
import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;

/**
 * Make sure to only send the message to users who {@link #shouldSendTo(CommandSender)} returns true.
 * 
 * @author NorbiPeti
 *
 */
@Getter
public class TBMCSystemChatEvent extends TBMCChatEventBase {
	private final String[] exceptions;
	private boolean handled;

	public void setHandled() {
		handled = true;
	}

	public TBMCSystemChatEvent(Channel channel, String message, int score, String groupid, String[] exceptions) { // TODO: Rich message
		super(channel, message, score, groupid);
		this.exceptions = exceptions;
	}

	private static final HandlerList handlers = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
