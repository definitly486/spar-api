package sj;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow extends wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final tg.rgvfuqvkyq f107136cqumvgiudr;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f107137iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107139yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107140zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107139yggfygwlhe = obj;
            this.f107137iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.eablkybsjg(null, this);
        }
    }

    public /* synthetic */ zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(rgvfuqvkyqVar, (i14 & 2) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 4) != 0 ? -2 : i13, (i14 & 8) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.wkgbmnqykc, tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f107137iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f107137iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f107139yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f107137iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar.f107140zdlpuopuiu = zdlpuopuiuVar;
            iobyxmoadgVar.f107137iwizpuwonk = 1;
            if (super.eablkybsjg(zdlpuopuiuVar, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiuVar = (rj.zdlpuopuiu) iobyxmoadgVar.f107140zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (zdlpuopuiuVar.zdlpuopuiu()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // sj.wkgbmnqykc, tj.wkgbmnqykc
    protected tj.wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new zoijcleaow(this.f107136cqumvgiudr, btonecajqbVar, i13, iobyxmoadgVar);
    }

    public zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(rgvfuqvkyqVar, btonecajqbVar, i13, iobyxmoadgVar);
        this.f107136cqumvgiudr = rgvfuqvkyqVar;
    }
}
