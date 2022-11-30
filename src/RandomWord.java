public class RandomWord {
    private String word1;
    private String word2;
    private String randWord;

    public RandomWord(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
        randWord = "";
    }

    public String randomLetter(int n) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int randomNum;
        String randomChar;

        if (n == 1) {
            randomNum = (int) (Math.random() * word1Len);
            randomChar = word1.charAt(randomNum) + "";
        } else {
            randomNum = (int) (Math.random() * word2Len);
            randomChar = word2.charAt(randomNum) + "";
        }
        randWord += randomChar;

        return randomChar;
    }

    public void resetWord() {
        randWord = "";
    }

    public String getNewWord() {
        return randWord;
    }
}