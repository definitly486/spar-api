package kk;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f58587yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58588zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(lrnfpwlwnk lrnfpwlwnkVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58587yggfygwlhe = lrnfpwlwnkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new sw(this.f58587yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new sw(this.f58587yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58588zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f58588zdlpuopuiu = 1;
            if (pj.crxdokpmqz.zoijcleaow(300L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        sj.zynmafqrjb zynmafqrjbVar = this.f58587yggfygwlhe.f57510istkbnxepw;
        zynmafqrjbVar.setValue(hg.ikoacuggdj.gtknphoqwx((Set) zynmafqrjbVar.getValue(), hg.jyumaefscl.bfopjjpdmp((Iterable) this.f58587yggfygwlhe.f57510istkbnxepw.getValue())));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
