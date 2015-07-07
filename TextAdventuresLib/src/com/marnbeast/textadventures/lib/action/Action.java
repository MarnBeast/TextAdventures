package com.marnbeast.textadventures.lib.action;

import com.marnbeast.textadventures.lib.Player;


public abstract class Action {


	private Player m_player;
	
	public Player getPlayer() {
		return m_player;
	}

	public void setPlayer(Player player) {
		this.m_player = player;
	}

	
	
	
	public Action(Player player) {
		setPlayer(player);
	}
	
	
	abstract public boolean Execute();

}
