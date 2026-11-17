package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vipkmwdibw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59030zdlpuopuiu;

    public vipkmwdibw(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        vipkmwdibw vipkmwdibwVar = new vipkmwdibw(gxszxtbevoVar);
        vipkmwdibwVar.f59030zdlpuopuiu = obj;
        return vipkmwdibwVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        vipkmwdibw vipkmwdibwVar = new vipkmwdibw((lg.gxszxtbevo) obj2);
        vipkmwdibwVar.f59030zdlpuopuiu = (ln) obj;
        return vipkmwdibwVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        hl hlVar = ((ln) this.f59030zdlpuopuiu).f57485iobyxmoadg;
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((hlVar instanceof i2) || ((hlVar instanceof a40) && (((a40) hlVar).f55773iobyxmoadg instanceof vi))) ? false : true);
    }
}
