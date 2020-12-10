package com.koreait.first.starcraft;

public class AttackUnit extends Unit{
	protected final int ATTACK_POINT;

	public AttackUnit(int hp, int attackpoint) {
		super(hp);
		this.ATTACK_POINT = attackpoint;
	}
	
	public void attack(Unit unit) {
		unit.hp -= ATTACK_POINT;
	}
}
