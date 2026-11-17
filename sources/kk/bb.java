package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ zj f55963zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(zj zjVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55963zdlpuopuiu = zjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new bb(this.f55963zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new bb(this.f55963zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        sj.zynmafqrjb zynmafqrjbVar = this.f55963zdlpuopuiu.f59594gtknphoqwx;
        zynmafqrjbVar.setValue(hg.jyumaefscl.ipoelvxyzq((Iterable) zynmafqrjbVar.getValue(), hg.jyumaefscl.opjhrmiecq((List) this.f55963zdlpuopuiu.f59594gtknphoqwx.getValue())));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
