// 5. Write a program to print the pattern (Floyd's triangle)

/*
1
2 3
4 5 6
7 8 9 10
*/

class tri {
  public static void main(String args[]) {
    int c = 1, i, j;
    for (i = 1; i <= 4; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(c);
        c++;
      }
      System.out.println(" ");
    }
  }
}