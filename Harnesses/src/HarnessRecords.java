import java.util.ArrayList;

public class HarnessRecords {

	private ArrayList<Harness> harnessList;

	public HarnessRecords() {

		harnessList = new ArrayList<Harness>();

	}

	public HarnessRecords(String input) {

		harnessList = new ArrayList<Harness>();

	}

	public boolean isEmpty() {

		return harnessList.isEmpty();

	}

	public void addHarness(Harness inputHarness) {

		harnessList.add(inputHarness);

	}

	public Harness findHarness(String makeModel) {

		Harness harness;

		for (int i = 0; i < harnessList.size(); i++) {
			harness = harnessList.get(i);
			if (harness.getMakeModel().equals(makeModel)) {

				return harness;

			}

		}

		return null;
	}

	public Harness checkHarness(String instructor, String makeModel) {

		Harness harness;

		for (int i = 0; i < harnessList.size(); i++) {

			harness = harnessList.get(i);
			if (harness.getMakeModel().equals(makeModel)) {

				harness.checkHarness(instructor);
				return harness;
			}

		}

		return null;

	}

	public Harness loanHarness(String member) {

		Harness harness;

		for (int i = 0; i < harnessList.size(); i++) {

			harness = harnessList.get(i);

			if (!harness.onLoan) {

				harness.loanHarness(member);
				harnessList.set(i, harness);
				return harness;

			}

		}

		return null;

	}

	public Harness returnHarness(String makeModel) {

		Harness harness;

		for (int i = 0; i < harnessList.size(); i++) {

			harness = harnessList.get(i);

			if (harness.onLoan) {

				harness.returnHarness();
				harnessList.set(i, harness);
				return harness;

			}

		}

		return null;

	}

	public Harness removeHarness(String makeModel) {

		for (int i = 0; i < harnessList.size(); i++) {

			Harness harness = harnessList.get(i);

			if (harness.getMakeModel().equals(makeModel)) {

				harnessList.remove(harness);
				return harness;

			}

		}

		return null;

	}
	
	public String toString() {
		
		String string = "";
		
		for (int i = 0; i < harnessList.size(); i++) {

			
			Harness harness = harnessList.get(i);

			string += harness;


		}

		return string;

	}

}
