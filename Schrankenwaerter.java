package Parkhouse;

public class Schrankenwaerter implements SchrankenwaerterInformationssystem {

	@Override
	public boolean pruefeAuto(int[] auto) {
		return auto[1]==1;
	}

}
