package com.geekster.New_Patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class NewPatternsApplication {

	public static void main(String[] args) {
        /*Que-1
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        Que-2
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        Que-3
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        Que-4
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        Que-5
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("      ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
                System.out.print("     ");
            }
            System.out.println();
        }

        Que-6
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("        ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
                System.out.print("     ");
            }
            System.out.println();
        }

        Que-7
        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

        Que-8
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || i == n-j+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

        Que-9
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-10
		int n = 5;

		for (int i = n; i >= 1; i--) {
			for (int space = 0; space < n - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-11
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}

        Que-12
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

        Que-13
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-14
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-15
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("    ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("    ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-16
		int rows = 5;
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

        Que-23
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

        Que-24
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		Que-25 */
		int n = 5;
		int number = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(number + "   ");
				number++;
			}
			System.out.println();
		}
	}
}

