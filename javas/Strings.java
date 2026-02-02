public class Strings {
    public static void main(String[] args){
        String str = "  ABAx atsoaa A ats ai AIII  ";
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        String str3 = str.trim();
        String str4 = str.substring(5);
        String str5 = str.substring(5,9);
        String str6 = str.replace('a', 'ç');
        String str7 = str.replace("ats", "rou");
        int str8 = str.indexOf("at");
        int str9 = str.lastIndexOf("at");

        String s = "batata maca pera kiwi";
        String[] vec = s.split(" ");

        System.out.println("Original: -"+ str+"-");
        System.out.println("toLowerCase(): -"+ str1+"-");
        System.out.println("toUpperCase(): -"+ str2+"-");
        System.out.println("trim(): -"+ str3+"-");
        System.out.println("substring(5): -"+ str4+"-");
        System.out.println("substring(5,9): -"+ str5+"-");
        System.out.println("replace('a', 'ç'): -"+ str6+"-");
        System.out.println("replace(\"ats\", \"rou\"): -"+ str7+"-");
        System.out.println("indexOf(\"at\"): -"+ str8+"-");
        System.out.println("lastIndexOf(\"at\"): -"+ str9+"-\n");

        for(int x = 0; x < vec.length;x++){
            System.out.printf("vec[%d] = %s\n",x,vec[x]);
        }
        
    }
}
