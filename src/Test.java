import kr.teamcook.vod.Controller.VodController;

public class Test {
    public static void main(String[] args) {
        VodController ctrl = new VodController();

        ctrl.Insert();
        ctrl.Show();
        System.out.println(ctrl);
    }
}
