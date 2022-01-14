import java.util.Scanner;
import static java.lang.System.exit;

public class stack {
    Scanner masuk = new Scanner(System.in);

    int choice, i;
    char item;
    char arr_stack[] = new char[100];
    int count = 0;
    int keluar = 0;

    public void push(char item) {
        if (count == arr_stack.length) {
            System.out.print("\n# Stack Penuh");
        } else {
            arr_stack [count] = item;
            System.out.print("\n# PUSH No urut/index : " + count + ", Push :" + item);
            count++;
        }
    }


    public void pop() {
        if (count == 0) {
            System.out.print("\n## Stack kosong");
        } else {
            --count;
            System.out.print ( "\n##POP No urut/index : " + count + ", Value :" + arr_stack[count]);
        }
    }

    public void printAll() {
        System.out.print("\n## Stack Size : " + count);
        for (i = (count - 1); i >= 0; i--)
            System.out.print("\n## No Urut/index : " + i + ", Value :" + arr_stack[i]);
    }

    public void menu() {
        System.out.print("\nMasukkan operasi yang akan dilakukan (0: keluar 1:push, 2:pop, 3:print) : ");
        choice = masuk.nextInt();
        switch (choice) {
            case 0:
                exit(0);
            case 1: {
                System.out.print("\nMasukkan huruf yang akan dipush : ");
                item = masuk.next().charAt(0);
                push(item);
            }
            break;
            case 2:
                pop();
                break;
            case 3:
                printAll();
                break;
            default:
                System.out.print ( "\n0:keluar 1:push, 2:pop, 3:print\n");
                keluar = 0;
                break;
        }
    }

    public void main() {
        do{
            menu();
        } while (choice != 0);
    }
}

