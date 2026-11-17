package sj;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg implements lqeggnwhkg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final tg.rgvfuqvkyq f106847jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final tg.draadjrbmk f106848yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f106849zdlpuopuiu;

    static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f106850jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f106851yggfygwlhe;

        /* JADX INFO: renamed from: sj.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2617iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f106853jyumaefscl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106855zdlpuopuiu;

            C2617iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106855zdlpuopuiu = obj;
                this.f106853jyumaefscl |= Integer.MIN_VALUE;
                return iobyxmoadg.this.emit(null, this);
            }
        }

        iobyxmoadg(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, nufgyqmvbu nufgyqmvbuVar) {
            this.f106851yggfygwlhe = hkdspvbjdzVar;
            this.f106850jyumaefscl = nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C2617iobyxmoadg c2617iobyxmoadg;
            if (gxszxtbevoVar instanceof C2617iobyxmoadg) {
                c2617iobyxmoadg = (C2617iobyxmoadg) gxszxtbevoVar;
                int i13 = c2617iobyxmoadg.f106853jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2617iobyxmoadg.f106853jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    c2617iobyxmoadg = new C2617iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2617iobyxmoadg = new C2617iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = c2617iobyxmoadg.f106855zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2617iobyxmoadg.f106853jyumaefscl;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                Object objInvoke = eablkybsjg.this.f106848yggfygwlhe.invoke(obj);
                Object obj3 = this.f106851yggfygwlhe.f60015zdlpuopuiu;
                if (obj3 != tj.kcexrzcfyt.f110690iobyxmoadg && ((Boolean) eablkybsjg.this.f106847jyumaefscl.invoke(obj3, objInvoke)).booleanValue()) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                this.f106851yggfygwlhe.f60015zdlpuopuiu = objInvoke;
                nufgyqmvbu nufgyqmvbuVar = this.f106850jyumaefscl;
                c2617iobyxmoadg.f106853jyumaefscl = 1;
                if (nufgyqmvbuVar.emit(obj, c2617iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public eablkybsjg(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f106849zdlpuopuiu = lqeggnwhkgVar;
        this.f106848yggfygwlhe = draadjrbmkVar;
        this.f106847jyumaefscl = rgvfuqvkyqVar;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = tj.kcexrzcfyt.f110690iobyxmoadg;
        Object objCollect = this.f106849zdlpuopuiu.collect(new iobyxmoadg(hkdspvbjdzVar, nufgyqmvbuVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
