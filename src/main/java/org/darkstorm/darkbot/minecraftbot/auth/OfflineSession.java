package org.darkstorm.darkbot.minecraftbot.auth;

public class OfflineSession extends Session {
	public OfflineSession(String username) {
		super(username, null);
	}

	public OfflineSession(String username, String password) {
		super(username, password);
	}
	@Override
	public boolean isValidForLogin() {
		return false;
	}

	@Override
	public boolean isValidForAuthentication() {
		return false;
	}

	@Override
	public String toString() {
		return String.format("OfflineSession{username=%s, password=%s}", getUsername(), getPassword());
	}
}
