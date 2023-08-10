package com.problems;

public class Application {
    public static boolean isIsomorphic(String s, String t) {
        String encryptedFirst = encrypt(s);
        String encryptedSecond = encrypt(t);
        System.out.println(encryptedFirst + " == " + encryptedSecond);
        return encryptedFirst.equals(encryptedSecond);
    }

    private static String encrypt(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            strBuild.append(":");
            int position = s.indexOf(charArray[i]);
            if (position != -1) {
                strBuild.append(position);
            } else {
                strBuild.append(i);
            }
        }

        return strBuild.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzva";
        String b = "abcdefghijklmnopqrstuvwxyzck";

        boolean isomorphic = isIsomorphic(s, b);
        System.out.println(isomorphic);
    }
}
