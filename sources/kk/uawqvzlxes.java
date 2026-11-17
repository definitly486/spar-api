package kk;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class uawqvzlxes extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f58807yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Throwable f58808zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uawqvzlxes(Throwable th2, b9 b9Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58808zdlpuopuiu = th2;
        this.f58807yggfygwlhe = b9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new uawqvzlxes(this.f58808zdlpuopuiu, this.f58807yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new uawqvzlxes(this.f58808zdlpuopuiu, this.f58807yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        StringWriter stringWriter = new StringWriter();
        this.f58808zdlpuopuiu.printStackTrace(new PrintWriter(stringWriter));
        this.f58807yggfygwlhe.f55943oxmwwwfdhm.iobyxmoadg(new ow(df0.EX_PAY, null, mp.EX, hg.tzroggbefp.draadjrbmk(gg.cqumvgiudr.iobyxmoadg("Exception", this.f58808zdlpuopuiu.toString()), gg.cqumvgiudr.iobyxmoadg("StackTrace", stringWriter.toString())), null, null, null, 114));
        pc pcVar = this.f58807yggfygwlhe.f55949wflxmlrfwp;
        String message = this.f58808zdlpuopuiu.getMessage();
        if (message == null) {
            message = "No exception message";
        }
        ((ve) pcVar).zoijcleaow(new g(new pv("UNCAUGHT_EXCEPTION : " + message)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
