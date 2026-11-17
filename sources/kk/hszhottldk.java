package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class hszhottldk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ boolean f56956zdlpuopuiu;

    public hszhottldk(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        hszhottldk hszhottldkVar = new hszhottldk(gxszxtbevoVar);
        hszhottldkVar.f56956zdlpuopuiu = ((Boolean) obj).booleanValue();
        return hszhottldkVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        hszhottldk hszhottldkVar = new hszhottldk((lg.gxszxtbevo) obj2);
        hszhottldkVar.f56956zdlpuopuiu = bool.booleanValue();
        return hszhottldkVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f56956zdlpuopuiu);
    }
}
