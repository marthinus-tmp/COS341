class compiler {
	public static void main(String[] args) {
		//Will call both lexer and syntax from here
		tokenList tokens;

		lexer lexer = new lexer();
		tokens = lexer.parseFile("../Tests/" + args[0]);
		if(tokens == null){
			return;
		}
		System.out.println(tokens.toString());
	}
}