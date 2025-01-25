package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author {
    private String authorName;
    private int authorAge;
    String nationality;

    public Author(String authorName, int authorAge) {
        //this.authorName = authorName;
        setAuthorName(authorName);
        //this.authorAge = authorAge;
        setAuthorAge(authorAge);
    }


    public void setAuthorName(String authorName) {

        String result = "";

        if (authorName.split(" ").length == 2) {

            for (String each : authorName.split(" ")){

                result += StringUtil.fixFormat(each) + " ";

            }

            this.authorName = result.trim();
        }

    }

    public void setAuthorAge(int authorAge) {
        if (authorAge > 4) {
            this.authorAge = authorAge;
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}