public void print(){
        operations.print(lexemes, tokens);
    }

    public static void print(ArrayList<String> lex, ArrayList<String> tok) {
        String heading1 = "Lexemes";
        String heading2 = "Tokens";
        String divider = "------------------------------------";
        System.out.printf( "%-15s %-15s %n", heading1, heading2);
        System.out.println(divider);
        for (int i = 0; i < lex.size(); i++) {
            System.out.printf( "%-15s %-15s %n", lex.get(i), tok.get(i));
        }
        System.out.println(divider);
    }
