class LongestName {
  public static String main(String[] names) {
    String longest = "";
    for (String name : names) {
      if (longest.length() < name) {
        longest = name;
      }
    }
    return longest;
  }  
}
