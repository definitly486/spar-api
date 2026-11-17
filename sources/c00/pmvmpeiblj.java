package c00;

import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class pmvmpeiblj implements p00.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final na0.zoijcleaow f18161iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p00.iobyxmoadg.InterfaceC1646iobyxmoadg f18162zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18163iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18165yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18166zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18165yggfygwlhe = obj;
            this.f18163iwizpuwonk |= Integer.MIN_VALUE;
            return pmvmpeiblj.this.iobyxmoadg(this);
        }
    }

    public pmvmpeiblj(na0.zoijcleaow remoteConfig, p00.iobyxmoadg.InterfaceC1646iobyxmoadg semiVersionBuilder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteConfig, "remoteConfig");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        this.f18161iobyxmoadg = remoteConfig;
        this.f18162zoijcleaow = semiVersionBuilder;
    }

    private final p00.ppxfxbqfkf.iobyxmoadg zoijcleaow(p00.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, ma0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.iobyxmoadg() ? iobyxmoadgVar.ppxfxbqfkf() : iobyxmoadgVar.eablkybsjg();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p00.zoijcleaow
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        pmvmpeiblj pmvmpeibljVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18163iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18163iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objDraadjrbmk = iobyxmoadgVar.f18165yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18163iwizpuwonk;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
                na0.zoijcleaow zoijcleaowVar = this.f18161iobyxmoadg;
                iobyxmoadgVar.f18166zdlpuopuiu = this;
                iobyxmoadgVar.f18163iwizpuwonk = 1;
                objDraadjrbmk = zoijcleaowVar.draadjrbmk(iobyxmoadgVar);
                if (objDraadjrbmk == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                pmvmpeibljVar = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pmvmpeibljVar = (pmvmpeiblj) iobyxmoadgVar.f18166zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
            }
            ma0.wkgbmnqykc wkgbmnqykcVar = (ma0.wkgbmnqykc) objDraadjrbmk;
            p00.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new p00.ppxfxbqfkf.iobyxmoadg(null, null, null, null, null, null, 63, null);
            if (wkgbmnqykcVar.eablkybsjg()) {
                pmvmpeibljVar.zoijcleaow(iobyxmoadgVar2, wkgbmnqykcVar);
            } else {
                iobyxmoadgVar2.wkgbmnqykc();
            }
            iobyxmoadgVar2.lqeggnwhkg(wkgbmnqykcVar.zoijcleaow());
            iobyxmoadgVar2.gxszxtbevo(wkgbmnqykcVar.ppxfxbqfkf());
            iobyxmoadgVar2.nufgyqmvbu(pmvmpeibljVar.f18162zoijcleaow.iobyxmoadg(wkgbmnqykcVar.wkgbmnqykc()).build());
            return iobyxmoadgVar2.iobyxmoadg();
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return new p00.ppxfxbqfkf.iobyxmoadg(null, null, null, null, null, null, 63, null).zoijcleaow();
        }
    }
}
