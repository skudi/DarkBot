package org.darkstorm.darkbot.mcwrapper.backend;

import joptsimple.OptionSet;

import org.darkstorm.darkbot.mcwrapper.MinecraftBotWrapper;
import org.darkstorm.darkbot.minecraftbot.MinecraftBot;

public class TcpBackend implements Backend {
	public final static String OPT_BIND = "tcp-backend";
	private final MinecraftBotWrapper bot;
	private int port = MinecraftBot.DEFAULT_PORT + 1;
	private void debugOut(String method, String msg) {
		System.out.println(this.getClass().getName() + "." + method + ": " + msg);
	}
	
	public TcpBackend(MinecraftBotWrapper bot, OptionSet options) {
		if (options.has(OPT_BIND)) {
			String bindspec = (String)options.valueOf(OPT_BIND);
			
		}
		debugOut("new", bot.toString());
		this.bot = bot;
	}
	
	@Override
	public void enable() {
		debugOut("enable", "");
	}

	@Override
	public void say(String message) {
		debugOut("say", message);
		
	}

	@Override
	public void disable() {
		debugOut("disable", "");
		
	}

}
