package kk;

import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ iozdgvuglv f59180yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59181zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(iozdgvuglv iozdgvuglvVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f59180yggfygwlhe = iozdgvuglvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new wkgbmnqykc(this.f59180yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new wkgbmnqykc(this.f59180yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        kz pmVar;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59181zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f59181zdlpuopuiu = 1;
            if (pj.crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        iozdgvuglv iozdgvuglvVar = this.f59180yggfygwlhe;
        pc pcVar = iozdgvuglvVar.f57077eablkybsjg;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) iozdgvuglvVar.f56063zoijcleaow).btonecajqb(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
            pmVar = jk.f57203iobyxmoadg;
        } else {
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) iozdgvuglvVar.f56063zoijcleaow;
            if (auzgnhcxokVar.f55845cqumvgiudr == HelperScenario.BNPL) {
                PayStrategy.PartsStartPay status = PayStrategy.PartsStartPay.INSTANCE;
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(status, "status");
                auzgnhcxokVar.f55871yadqdtsiqt.setValue(status);
                pmVar = jk.f57203iobyxmoadg;
            } else {
                pmVar = new pm((gl) iozdgvuglvVar.f57080lqeggnwhkg.iobyxmoadg(iozdgvuglvVar, iozdgvuglv.f57074draadjrbmk[0]), false);
            }
        }
        ((ve) pcVar).zoijcleaow(pmVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
