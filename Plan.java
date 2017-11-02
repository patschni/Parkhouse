package Parkhouse;

public interface Plan {
	public boolean belegePosition(int x, int y);
	public boolean befreiePosition(int x, int y);
	public String toString();
}
