    public void isDataType(String[] p) {
        int n = 0;
        for(int i = 0; i < p.length; i++) {
            // switch statement that finds lexemes and tokens and add them to an arrayList
            String x = p[i];
            switch (x) {

                case "double":
                    lexemes.add("double");
                    tokens.add("DATA_TYPE");
                    break;

                case "int":
                    lexemes.add("int");
                    tokens.add("DATA_TYPE");
                    break;

                case "char":
                    lexemes.add("char");
                    tokens.add("DATA_TYPE");
                    break;

                case "String":
                    lexemes.add("String");
                    tokens.add("DATA_TYPE");
                    break;

                case "float":
                    lexemes.add("float");
                    tokens.add("DATA_TYPE");
                    break;

                case "=":
                    lexemes.add("=");
                    tokens.add("ASSIGN_OP");
                    break;

                case "-":
                    lexemes.add("-");
                    tokens.add("SUB_OP");
                    break;

                case "+":
                    lexemes.add("+");
                    tokens.add("ADD_OPP");
                    break;

                case "*":
                    lexemes.add("*");
                    tokens.add("MUL_OP");
                    break;

                case "/":
                    lexemes.add("/");
                    tokens.add("DIV_OP");
                    break;

                case "%":
                    lexemes.add("%");
                    tokens.add("MOD_OP");
                    break;

                case ">":
                    lexemes.add(">");
                    tokens.add("GREAT_OP");
                    break;

                case "<":
                    lexemes.add("<");
                    tokens.add("LESS_OP");
                    break;

                case "{":
                    lexemes.add("{");
                    tokens.add("OPEN_CURLB");
                    break;

                case "}":
                    lexemes.add("}");
                    tokens.add("OPEN_CULRB");
                    break;

                case "[":
                    lexemes.add("[");
                    tokens.add("OPEN_BRACK");
                    break;

                case "]":
                    lexemes.add("]");
                    tokens.add("CLOSED_BRACK");
                    break;

                case "(":
                    lexemes.add("(");
                    tokens.add("OPEN_PAR");
                    break;

                case ")":
                    lexemes.add(")");
                    tokens.add("CLOSED_PAR");
                    break;

                case ";":
                    lexemes.add(";");
                    tokens.add("SEMICOLON");
                    break;

                case ":":
                    lexemes.add(":");
                    tokens.add("COLON");
                    break;

                case ",":
                    lexemes.add(",");
                    tokens.add("COMMA");
                    break;

                default:
                    lexemes.add(x);
                    tokens.add("IDENT");
                    break;
            }
        }
    }
