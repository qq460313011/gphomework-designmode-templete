package fw.templete;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 14:20
 * @Description:
 */
public class DefaultInvertPro extends InvertProTemplete {
    protected void CreateProject() {
        System.out.println("新建项目");
    }

    protected void DutyReport() {
        System.out.println("尽调投决");
    }

    protected void RiskReport() {
        System.out.println("风险报告");
    }

    protected void AuditMeeting() {
        System.out.println("投审会");
    }

    protected void ProInvest() {
        System.out.println("项目投资");
    }

    protected void InvestAfter() {
        System.out.println("投后管理");
    }

    protected void ProExit() {
        System.out.println("项目退出");
    }
}
