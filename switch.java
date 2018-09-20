
public int isDataType(String[] p) {
        int n = 0;
        String x = p[n];
        // switch statment that finds lexemes and tokens and add them to an arrayList
        switch (x) {

            case "double":
                lexemes.add("double");
                tokens.add("DATA_TYPE");
                n++;
                break;

            case "int":
                lexemes.add("int");
                tokens.add("DATA_TYPE");
                n++;
                break;

            case "char":
                lexemes.add("char");
                tokens.add("DATA_TYPE");
                n++;
                break;

            case "String":
                lexemes.add("String");
                tokens.add("DATA_TYPE");
                n++;
                break;

            case "float":
                lexemes.add("float");
                tokens.add("DATA_TYPE");
                n++;
                break;

            case "=":
                lexemes.add("=");
                tokens.add("ASSIGN_OP");
                n++;
                break;

            case "-":
                lexemes.add("-");
                tokens.add("SUB_OP");
                n++;
                break;

            case "+":
                lexemes.add("+");
                tokens.add("ADD_OPP");
                n++;
                break;

            case "*":
                lexemes.add("*");
                tokens.add("MUL_OP");
                n++;
                break;

            case "/":
                lexemes.add("/");
                tokens.add("DIV_OP");
                n++;
                break;

            case "%":
                lexemes.add("%");
                tokens.add("MOD_OP");
                n++;
                break;

            case ">":
                lexemes.add(">");
                tokens.add("GREAT_OP");
                n++;
                break;

            case "<":
                lexemes.add("<");
                tokens.add("LESS_OP");
                n++;
                break;

            case "{":
                lexemes.add("{");
                tokens.add("OPEN_CURLB");
                n++;
                break;

            case "}":
                lexemes.add("}");
                tokens.add("OPEN_CULRB");
                n++;
                break;

            case "[":
                lexemes.add("[");
                tokens.add("OPEN_BRACK");
                n++;
                break;

            case "]":
                lexemes.add("]");
                tokens.add("CLOSED_BRACK");
                n++;
                break;

            case "(":
                lexemes.add("(");
                tokens.add("OPEN_PAR");
                n++;
                break;

            case ")":
                lexemes.add(")");
                tokens.add("CLOSED_PAR");
                n++;
                break;

            case ";":
                lexemes.add(";");
                tokens.add("SEMICOLON");
                n++;
                break;

            case ":":
                lexemes.add(":");
                tokens.add("COLON");
                n++;
                break;

            case ",":
                lexemes.add(",");
                tokens.add("COMMA");
                n++;
                break;

            default:
                lexemes.add(x);
                tokens.add("IDENT");
                n++;
                break;
        }
        return n;
    }
