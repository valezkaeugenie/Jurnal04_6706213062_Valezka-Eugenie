public class ListPlayer {
    private String judulLagu, namaPenyanyi;

    public ListPlayer(String judulLagu, String namaPenyanyi) {

        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

            public String getNamaPenyanyi() {
                return namaPenyanyi;
            }

    @Override

    public String toString() {
        return "ListPlayer{" +
                "judulLagu='" + judulLagu + '\'' +
                ", namaPenyanyi='" + namaPenyanyi + '\'' +
                '}';
    }
}
