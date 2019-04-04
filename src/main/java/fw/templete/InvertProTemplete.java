package fw.templete;

/**
 * 投资项目模板
 * @Auther: Administrator
 * @Date: 2019/4/4 14:12
 * @Description:
 */
public abstract class InvertProTemplete {

    private boolean isReCreate=false;

    protected void setReCreate(boolean isReCreate){
        this.isReCreate=isReCreate;
    }

    //新建项目
    protected abstract void CreateProject();

    //尽调投决
    protected abstract void DutyReport();

    //风险报告
    protected abstract void RiskReport();

    //投审会
    protected abstract void AuditMeeting();

    //项目投资
    protected abstract void ProInvest();

    //项目投后
    protected abstract void InvestAfter();

    //项目退出
    protected abstract void ProExit();


    public final void Run()
    {
        CreateProject();
        if (isReCreate)
        {
            System.out.println("二次上会跳过投决风控阶段");
            AuditMeeting();
            ProInvest();
            InvestAfter();
            ProExit();
        }
        else {
            DutyReport();
            RiskReport();
            AuditMeeting();
            ProInvest();
            InvestAfter();
            ProExit();
        }

    }
}
