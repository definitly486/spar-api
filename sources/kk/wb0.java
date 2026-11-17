package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wb0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ vu f59124yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ String f59125zdlpuopuiu;

    public wb0(lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wb0 wb0Var = new wb0((lg.gxszxtbevo) obj3);
        wb0Var.f59125zdlpuopuiu = (String) obj;
        wb0Var.f59124yggfygwlhe = (vu) obj2;
        return wb0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        String str = this.f59125zdlpuopuiu;
        vu vuVar = this.f59124yggfygwlhe;
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(str != null && str.length() == 5 && (vuVar == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vuVar, zv.zoijcleaow(R.string.spay_empty_string))));
    }
}
