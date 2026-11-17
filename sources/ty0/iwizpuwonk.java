package ty0;

import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class iwizpuwonk implements hz0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final t81.iobyxmoadg f111953iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hz0.iobyxmoadg.InterfaceC0966iobyxmoadg f111954zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111955iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111957yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111958zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111957yggfygwlhe = obj;
            this.f111955iwizpuwonk |= Integer.MIN_VALUE;
            return iwizpuwonk.this.iobyxmoadg(this);
        }
    }

    public iwizpuwonk(t81.iobyxmoadg featureManager, hz0.iobyxmoadg.InterfaceC0966iobyxmoadg semiVersionBuilder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        this.f111953iobyxmoadg = featureManager;
        this.f111954zoijcleaow = semiVersionBuilder;
    }

    private final hz0.ppxfxbqfkf.iobyxmoadg zoijcleaow(hz0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, s81.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.iobyxmoadg() ? iobyxmoadgVar.ppxfxbqfkf() : iobyxmoadgVar.eablkybsjg();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hz0.zoijcleaow
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        iwizpuwonk iwizpuwonkVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f111955iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f111955iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f111957yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f111955iwizpuwonk;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                t81.iobyxmoadg iobyxmoadgVar2 = this.f111953iobyxmoadg;
                iobyxmoadgVar.f111958zdlpuopuiu = this;
                iobyxmoadgVar.f111955iwizpuwonk = 1;
                objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iwizpuwonkVar = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iwizpuwonkVar = (iwizpuwonk) iobyxmoadgVar.f111958zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            s81.zoijcleaow zoijcleaowVar = (s81.zoijcleaow) objIobyxmoadg;
            hz0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new hz0.ppxfxbqfkf.iobyxmoadg(null, null, null, null, null, null, 63, null);
            if (zoijcleaowVar.eablkybsjg()) {
                iwizpuwonkVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
            } else {
                iobyxmoadgVar3.wkgbmnqykc();
            }
            iobyxmoadgVar3.lqeggnwhkg(zoijcleaowVar.zoijcleaow());
            iobyxmoadgVar3.gxszxtbevo(zoijcleaowVar.ppxfxbqfkf());
            iobyxmoadgVar3.nufgyqmvbu(iwizpuwonkVar.f111954zoijcleaow.iobyxmoadg(zoijcleaowVar.wkgbmnqykc()).build());
            return iobyxmoadgVar3.iobyxmoadg();
        } catch (Throwable th2) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return new hz0.ppxfxbqfkf.iobyxmoadg(null, null, null, null, null, null, 63, null).zoijcleaow();
        }
    }
}
