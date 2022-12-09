class joinstrs {
  public static void main(String[] args) {
    String str1 = "I";
    String str2 = "love";
    String str3 = "Java";

    // join strings with space between them
    String joinedStr = String.join(" ", str1, str2, str3);

    System.out.println(joinedStr);
  }
}
