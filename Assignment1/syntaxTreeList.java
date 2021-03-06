//u15132847 and u15011713
//Keegan Ferrett and Nikki Constancon
class syntaxTreeList {
	private int idCounter;
	public syntaxToken head;

	public syntaxTreeList() {
		idCounter = 0;
		head = null;
	}

	public syntaxToken pop(){
		syntaxToken temp = head;
		head = head.next;
		return temp;
	}

	public void addNode(String _input, String _descrp, String _type) {
		String id = String.format("%08d", idCounter++);
		syntaxToken temp = new syntaxToken(_input, _descrp, _type, id);

		if (head == null) {
			head = temp;
			return;
		}

		syntaxToken trans = head;
		while(trans.next != null) {
			trans = trans.next;
		}
		trans.next = temp;
	}

	public String toString() {
		String temp = "";
		syntaxToken trans = head;

		while (trans != null) {
			temp = temp + trans.toString();
			trans = trans.next;
		}

		return temp;
	}

	//Test main
	public static void main(String[] args) {
		syntaxTreeList test = new syntaxTreeList();

		test.addNode("Prog", "Non-Terminal Node", "-");
		test.addNode("Code", "Non-Terminal Node", "-");
		test.addNode("Instruction", "Non-Terminal Node", "-");
		test.addNode("Halt", "Terminal Node", "Special Command");
		test.addNode(";", "Terminal Node", "Grouping Symbol");

		System.out.println(test.toString());
	}
}