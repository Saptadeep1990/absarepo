
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
         Scanner s = new Scanner(System.in);
     int n =  s.nextInt();
      String v = null;
      for ( int i = 0 ; i < n ; i++ ) {
          v = s.nextLine();
          if (v.length() > 10) {
              System.out.println(v.charAt(0)+""+v.length()-2+""+v.charAt(v.length()-1));
          }
          else {
              System.out.println(v);
          }
      }
    }
}
from sys import stdin
t = int(stdin.readline())
for _ in range(t):
    n = int(stdin.readline())
    s = stdin.readline(n)
    stdin.readline(1)
    ss = sorted(s)
    ans = 0
    for i in range(n):
        if s[i] != ss[i]:
            ans += 1
    print(ans)
