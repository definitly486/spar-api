package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements opjhrmiecq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Throwable f5602jyumaefscl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.iobyxmoadg f5604zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f5603yggfygwlhe = new Object();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ezmngbhpjk.iobyxmoadg f5601iwizpuwonk = iobyxmoadg.zoijcleaow();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private androidx.collection.jpowsppfya f5599cqumvgiudr = new androidx.collection.jpowsppfya(0, 1, null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private androidx.collection.jpowsppfya f5600esjtqupxsv = new androidx.collection.jpowsppfya(0, 1, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0103iobyxmoadg f5605iobyxmoadg = new C0103iobyxmoadg(null);

        /* JADX INFO: renamed from: androidx.compose.runtime.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0103iobyxmoadg {
            public /* synthetic */ C0103iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C0103iobyxmoadg() {
            }
        }

        private static ezmngbhpjk.iobyxmoadg ppxfxbqfkf(ezmngbhpjk.iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int wkgbmnqykc(ezmngbhpjk.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
            return ((i13 & 15) << 27) | (134217727 & i14);
        }

        public static ezmngbhpjk.iobyxmoadg zoijcleaow() {
            return ppxfxbqfkf(new ezmngbhpjk.iobyxmoadg(0));
        }
    }

    static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hcddaimhww f5606jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f5607yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f5608zdlpuopuiu;

        ppxfxbqfkf(zoijcleaow zoijcleaowVar, eablkybsjg eablkybsjgVar, kotlin.jvm.internal.hcddaimhww hcddaimhwwVar) {
            this.f5608zdlpuopuiu = zoijcleaowVar;
            this.f5607yggfygwlhe = eablkybsjgVar;
            this.f5606jyumaefscl = hcddaimhwwVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            int i13;
            this.f5608zdlpuopuiu.iobyxmoadg();
            ezmngbhpjk.iobyxmoadg iobyxmoadgVar = this.f5607yggfygwlhe.f5601iwizpuwonk;
            int i14 = this.f5606jyumaefscl.f60014zdlpuopuiu;
            do {
                i13 = iobyxmoadgVar.get();
            } while (!iobyxmoadgVar.compareAndSet(i13, ((i13 >>> 27) & 15) == i14 ? i13 - 1 : i13));
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private tg.draadjrbmk f5609iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pj.agtfadlqog f5610zoijcleaow;

        public zoijcleaow(tg.draadjrbmk draadjrbmkVar, pj.agtfadlqog agtfadlqogVar) {
            this.f5609iobyxmoadg = draadjrbmkVar;
            this.f5610zoijcleaow = agtfadlqogVar;
        }

        public final void iobyxmoadg() {
            this.f5609iobyxmoadg = null;
            this.f5610zoijcleaow = null;
        }

        public final void ppxfxbqfkf(Throwable th2) {
            pj.agtfadlqog agtfadlqogVar = this.f5610zoijcleaow;
            if (agtfadlqogVar != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2)));
            }
        }

        public final void zoijcleaow(long j13) {
            pj.agtfadlqog agtfadlqogVar;
            Object objWkgbmnqykc;
            tg.draadjrbmk draadjrbmkVar = this.f5609iobyxmoadg;
            if (draadjrbmkVar == null || (agtfadlqogVar = this.f5610zoijcleaow) == null) {
                return;
            }
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(draadjrbmkVar.invoke(Long.valueOf(j13)));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            agtfadlqogVar.resumeWith(objWkgbmnqykc);
        }
    }

    public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
        this.f5604zdlpuopuiu = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wflxmlrfwp(Throwable th2) {
        int i13;
        synchronized (this.f5603yggfygwlhe) {
            try {
                if (this.f5602jyumaefscl != null) {
                    return;
                }
                this.f5602jyumaefscl = th2;
                androidx.collection.jpowsppfya jpowsppfyaVar = this.f5599cqumvgiudr;
                Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
                int i14 = jpowsppfyaVar.f4344zoijcleaow;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((zoijcleaow) objArr[i15]).ppxfxbqfkf(th2);
                }
                this.f5599cqumvgiudr.yggfygwlhe();
                ezmngbhpjk.iobyxmoadg iobyxmoadgVar = this.f5601iwizpuwonk;
                do {
                    i13 = iobyxmoadgVar.get();
                } while (!iobyxmoadgVar.compareAndSet(i13, iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, ((i13 >>> 27) & 15) + 1, 0)));
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return opjhrmiecq.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return opjhrmiecq.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    public final void kcexrzcfyt(long j13) {
        int i13;
        int i14;
        synchronized (this.f5603yggfygwlhe) {
            try {
                androidx.collection.jpowsppfya jpowsppfyaVar = this.f5599cqumvgiudr;
                this.f5599cqumvgiudr = this.f5600esjtqupxsv;
                this.f5600esjtqupxsv = jpowsppfyaVar;
                ezmngbhpjk.iobyxmoadg iobyxmoadgVar = this.f5601iwizpuwonk;
                do {
                    i13 = iobyxmoadgVar.get();
                } while (!iobyxmoadgVar.compareAndSet(i13, iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, ((i13 >>> 27) & 15) + 1, 0)));
                int iEablkybsjg = jpowsppfyaVar.eablkybsjg();
                for (i14 = 0; i14 < iEablkybsjg; i14++) {
                    ((zoijcleaow) jpowsppfyaVar.wkgbmnqykc(i14)).zoijcleaow(j13);
                }
                jpowsppfyaVar.yggfygwlhe();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.opjhrmiecq
    public Object mbcevpiqjq(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        int i13;
        int i14;
        boolean z13 = true;
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        zoijcleaow zoijcleaowVar = new zoijcleaow(draadjrbmkVar, rgvfuqvkyqVar);
        kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = new kotlin.jvm.internal.hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = -1;
        synchronized (this.f5603yggfygwlhe) {
            Throwable th2 = this.f5602jyumaefscl;
            if (th2 != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2)));
            } else {
                ezmngbhpjk.iobyxmoadg iobyxmoadgVar2 = this.f5601iwizpuwonk;
                do {
                    i13 = iobyxmoadgVar2.get();
                    i14 = i13 + 1;
                } while (!iobyxmoadgVar2.compareAndSet(i13, i14));
                if ((134217727 & i14) != 1) {
                    z13 = false;
                }
                hcddaimhwwVar.f60014zdlpuopuiu = (i14 >>> 27) & 15;
                this.f5599cqumvgiudr.agtfadlqog(zoijcleaowVar);
                rgvfuqvkyqVar.stevsuqkhv(new ppxfxbqfkf(zoijcleaowVar, this, hcddaimhwwVar));
                if (z13 && this.f5604zdlpuopuiu != null) {
                    try {
                        this.f5604zdlpuopuiu.invoke();
                    } catch (Throwable th3) {
                        wflxmlrfwp(th3);
                    }
                }
            }
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return opjhrmiecq.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    public final boolean oxmwwwfdhm() {
        return (this.f5601iwizpuwonk.get() & 134217727) > 0;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return opjhrmiecq.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }
}
