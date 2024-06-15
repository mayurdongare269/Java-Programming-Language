import java.util.*;

public class starpatterns {
    // Normal Star Pattern(methon 1)
    public static void normal_starpattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     // Normal Star Pattern(methon 2)
     public static void normal_starpattern_2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i>=j) {  //row>=col
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
     }

    public static void inverted_starPattern(int n) { //method 1
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Top_Left_Triangle(int n) { //method 2
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i+j <= n+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void Top_Right_Triangle(int n) { 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i-j <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid_Num(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j );
            }
            System.err.println();
        }
    }

    public static void Half_Pyramid_character(int n) {
        char cha = 'A'; //here " " qoutes gives an error -> error: incompatible types: String cannot be converted to char
        for(int i=1; i<=n; i++) {
            for(int ch=1; ch<=i; ch++) {
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }
    }

    public static void Holo_Rectangle(int totRows, int totcols) {

        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totcols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totcols) {
                    System.out.print("*"); //System.out.print("* "); if you give space then output wrong ...........
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Inverted_Rotated_HalfPyramid(int n) { //method 1
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"); //System.out.print("* "); if you give here space the output like this..
            }
            System.out.println();
        }
    }
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

public static void Bottom_Right_Triangle(int n) { //method 2
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=n; j++) {
            if(i+j >= n+1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


    public static void Half_Pyramid_numbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Floyds_Triangle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void F0_1_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly_Pattern(int n) {
        // first half 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Solid_Rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Holo_Rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }

    public static void Diamond_Pattern(int n) {
        //first half
        for(int i = 1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i = n; i>=1; i--) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void X_Pattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                if(i==j || i+j == n+1) { // i-j==0
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void M_letter(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Print stars for the two outer vertical lines of 'M'
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                // Print stars for the diagonal lines of 'M'
                else if (i == j && j <= n / 2) {
                    System.out.print("*");
                } 
                else if (i + j == n && j > n / 2) {
                    System.out.print("*");
                } 
                // Print spaces for the rest
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void MIM_pattern(int n) {
        //print M
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Print stars for the two outer vertical lines of 'M'
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                // Print stars for the diagonal lines of 'M'
                else if (i == j && j <= n / 2) {
                    System.out.print("*");
                } 
                else if (i + j == n && j > n / 2) {
                    System.out.print("*");
                } 
                // Print spaces for the rest
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); // Space between 'M' and 'Y'

        

        //print Y
        for (int j = 0; j <= n; j++) {
            if (i == j && i < n / 2) {
                System.out.print("*");
            } else if (i + j == n && i < n / 2) {
                System.out.print("*");
            } else if (i >= n / 2 && j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("   "); // Space between 'Y' and 'M'

        //print M
       
            for (int j = 0; j <= n; j++) {
                // Print stars for the two outer vertical lines of 'M'
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                // Print stars for the diagonal lines of 'M'
                else if (i == j && j <= n / 2) {
                    System.out.print("*");
                } 
                else if (i + j == n && j > n / 2) {
                    System.out.print("*");
                } 
                // Print spaces for the rest
                else {
                    System.out.print(" ");
                }
            }
            // System.out.print("   "); // Space between 'M' and 'Y'
            System.out.println();
        }


    }

    public static void print_M(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j==1 || j==n){
                    System.out.print("*");
                } else if(i==j && j<=n/2) {
                    System.out.print("*");
                } else if(i+j==n+1 && j>n/2) {
                        System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n : ");
        int n = sc.nextInt();

        // normal_starpattern(n);
        // normal_starpattern_2(n);
        // inverted_starPattern(n);
        // Top_Left_Triangle(n);
        // Top_Right_Triangle(n);
        // Half_Pyramid_Num(n);
        // Half_Pyramid_character(n);
        // Holo_Rectangle(n);
        // Holo_Rectangle(4,5);
        // Inverted_Rotated_HalfPyramid(n);
        // Bottom_Right_Triangle(n);
        // Half_Pyramid_numbers(n);
        // Floyds_Triangle(n);
        // F0_1_triangle(n);
        // Butterfly_Pattern(n);
        // Solid_Rhombus(n);
        // Holo_Rhombus(n);
        // Diamond_Pattern(n);
        // X_Pattern(n);
        // M_letter(n);
        // MIM_pattern(n);
        print_M(n);

    }
}