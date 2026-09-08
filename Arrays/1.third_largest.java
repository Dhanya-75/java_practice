import java.util.*;
class Main 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int first = a[0];
        int second = a[0];
        int third = a[0];
        for (int i = 0; i < n; i++)
          {
            if (a[i] > first)
            {
                third = second;
                second = first;
                first = a[i];
            }
            else if (a[i] > second)
            {
                third = second;
                second = a[i];
            }
            else if (a[i] > third)
            {
                third = a[i];
            }
        }
        System.out.println(third);
    }
}
