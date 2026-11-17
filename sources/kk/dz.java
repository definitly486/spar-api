package kk;

import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class dz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ PayStrategy f56360yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ vu f56361zdlpuopuiu;

    public dz(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dz dzVar = new dz((lg.gxszxtbevo) obj3);
        dzVar.f56361zdlpuopuiu = (vu) obj;
        dzVar.f56360yggfygwlhe = (PayStrategy) obj2;
        return dzVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        vu vuVar = this.f56361zdlpuopuiu;
        if (this.f56360yggfygwlhe instanceof PayStrategy.PayWithPaymentAccount) {
            return zv.zoijcleaow(R.string.spay_empty_string);
        }
        return vuVar == null ? zv.zoijcleaow(R.string.spay_pay_text) : vuVar;
    }
}
