package Parkhouse;

public class ParkplatzplanMock implements Plan {
	int[][] plan = { { 0, 1, 0, 0 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };


	@Override
	public boolean belegePosition(int x, int y) {
		if (plan[x][y] != 1) {
			plan[x][y] = 1;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean befreiePosition(int x, int y) {
		if (plan[x][y] != 0) {
			plan[x][y] = 0;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		String g="";
		for(int i = 0; i<plan.length; i++) {
			for (int j = 0; j< plan[i].length; j++) {
				g+=plan[i][j];
			}
		}
		return g;
	}
}
