import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    static String[][][] symbol = {
            {{" ", " ", "*", "*", "*", " ", " "},
                    {" ", "*", " ", " ", " ", "*", " "},
                    {"*", " ", " ", " ", " ", " ", "*"},
                    {"*", " ", " ", " ", " ", " ", "*"},
                    {"*", " ", " ", " ", " ", " ", "*"},
                    {" ", "*", " ", " ", " ", "*", " "},
                    {" ", " ", "*", "*", "*", " ", " "}
            },

            {
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", "*", "*", " ", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", "*", "*", "*", " ", " "
                    }
            },

            {
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", "*", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", " ", "*", "*", "*", "*", "*"
                    }
            },

            {
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    }
            },

            {
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", "*", "*", " ", " "
                    },
                    {
                            " ", " ", "*", " ", "*", " ", " "
                    },
                    {
                            " ", "*", " ", " ", "*", " ", " "
                    },
                    {
                            " ", "*", "*", "*", "*", "*", "*"
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    }
            },

            {
                    {
                            " ", " ", "*", "*", "*", "*", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    }
            },

            {
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", " ", "*", "*", "*", "*", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", "*", "*", "*", " "
                    }
            },

            {
                    {
                            " ", "*", "*", "*", "*", "*", " "
                    },
                    {
                            " ", " ", " ", " ", " ", "*", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", "*", " ", " ", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", " "
                    },
                    {
                            " ", "*", " ", " ", " ", " ", " "
                    },
                    {
                            " ", "*", " ", " ", " ", " ", " "
                    }
            },

            {
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", "*", " ", " ", " ", "*"
                    },
                    {
                            " ", " ", " ", "*", "*", "*", " "
                    }
            },

            {
                    {
                            " ", "*", "*", "*", "*", " ", " "
                    },
                    {
                            "*", " ", " ", " ", "*", " ", " "
                    },
                    {
                            "*", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", "*", "*", "*", "*", " ", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    },
                    {
                            " ", " ", " ", " ", "*", " ", " "
                    }
            }

    };
    public static void main(String[] args) throws IOException {
        //int number = Integer.parseInt(args[0]);
        String input = "41072819";
        int[] digit = new int [input.length()];
        for(int i = 0; i < input.length(); i++){
            digit[i] = input.charAt(i) - '0';
        }
        for(int i = 0; i < 7; i++ ){
            for(int j = 0; j < input.length(); j++){
                for(int k = 0; k < 7; k++){
                    System.out.print(symbol[digit[j]][i][k]);
                }
            }
            System.out.println();
        }
    }
}
