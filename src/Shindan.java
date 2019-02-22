import java.util.Scanner;

public class Shindan{


        int kaitou(String str)

    {
        int ret = Integer.parseInt(str);


        if(ret < 1 || ret > 4) throw new IllegalArgumentException("入力された文字が範囲外");
        return ret;
    }

    public static void main(String[] args){


            String[] question = new String[10];
            question[0] = "私は体育より国語の方が好きである。";
            question[1] = "1.当てはまる 2.少し当てはまる 3.あまり当てはまらない 4.全く当てはまらない";
            question[2] = "遊びには誘うより誘われる方が多い。";
            question[3] = "1.当てはまる 2.少し当てはまる 3.あまり当てはまらない 4.全く当てはまらない";
            question[4] = "本を読むことが好きである。";
            question[5] = "1.当てはまる 2.少し当てはまる 3.あまり当てはまらない 4.全く当てはまらない";
            question[6] = "ついついネットで買い物を済ませてしまうことが多い";
            question[7] = "1.当てはまる 2.少し当てはまる 3.あまり当てはまらない 4.全く当てはまらない";
            question[8] = "旅行では名所を歩き回るより宿でゆっくりしたい。";
            question[9] = "1.当てはまる 2.少し当てはまる 3.あまり当てはまらない 4.全く当てはまらない";

            System.out.println(question[0]);
            System.out.println(question[1]);
            System.out.println(question[2]);
            System.out.println(question[3]);
            System.out.println(question[4]);
            System.out.println(question[5]);
            System.out.println(question[6]);
            System.out.println(question[7]);
            System.out.println(question[8]);
            System.out.println(question[9]);


            String kotae = "回答は上から順に当てはまる数字を入れてね（全部で五つ）";
            System.out.println(kotae);



        Scanner cin = new Scanner(System.in);
        Shindan shindan = new Shindan();
        int ans = 0;
        String kekka = "";

        try{
            for(int i=0;i<5;i++){

                ans += shindan.kaitou(cin.next());
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
            System.exit(1);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            System.exit(1);
        }

        if(ans <= 8) kekka = "とことんアウトドア派、少しは家にいろ";
        else if(ans <= 12) kekka = "アウトドア派、たまには勉強しろ";
        else if(ans <= 16) kekka = "インドア派、たまには運動しろ";
        else if(ans <= 20) kekka = "とことんインドア派、....なんかあったか";

        System.out.println(kekka);
    }
}
