package group2.lesson8;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {3, 6, 9, 3, 1, 5, 8, 44, 63, 21};

        //սորտավորել հետևյալ մասիվը փոքրից մեծ
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;




        //պետք է տպել տրված n թվի ինդեքսը։
        //եթե այդ թիվը մասիվում չկա՝ տպի -1
//        int n = 44;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == n) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

    }
}
