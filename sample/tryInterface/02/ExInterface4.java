public class ExInterface4 {
    void showBasic(ProfileInterface pi) {
        pi.showDate();
        pi.showName("Miki");
        pi.showAddress("HCMC");
    }
    public static void main(String[] args) {
        ShowProfile sp = new ShowProfile();
        ExInterface4 object1 = new ExInterface4();
        object1.showBasic(sp);
    }
}
