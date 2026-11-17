package n0;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f68249iobyxmoadg = iobyxmoadg.zoijcleaow(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.pmvmpeiblj f68252zoijcleaow = new androidx.collection.pmvmpeiblj(16);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f68250ppxfxbqfkf = androidx.collection.ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final s0.yggfygwlhe f68251wkgbmnqykc = new s0.yggfygwlhe();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f68253iobyxmoadg;

        private /* synthetic */ iobyxmoadg(Object obj) {
            this.f68253iobyxmoadg = obj;
        }

        public static final boolean eablkybsjg(Object obj) {
            return obj == null;
        }

        public static String gxszxtbevo(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public static final /* synthetic */ iobyxmoadg iobyxmoadg(Object obj) {
            return new iobyxmoadg(obj);
        }

        public static boolean ppxfxbqfkf(Object obj, Object obj2) {
            return (obj2 instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, ((iobyxmoadg) obj2).lqeggnwhkg());
        }

        public static int wkgbmnqykc(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static Object zoijcleaow(Object obj) {
            return obj;
        }

        public boolean equals(Object obj) {
            return ppxfxbqfkf(this.f68253iobyxmoadg, obj);
        }

        public int hashCode() {
            return wkgbmnqykc(this.f68253iobyxmoadg);
        }

        public final /* synthetic */ Object lqeggnwhkg() {
            return this.f68253iobyxmoadg;
        }

        public String toString() {
            return gxszxtbevo(this.f68253iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f68254cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f68256jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f68257yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f68258zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68256jyumaefscl = obj;
            this.f68254cqumvgiudr |= Integer.MIN_VALUE;
            return dxjokdxxww.this.lqeggnwhkg(null, null, false, null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final draadjrbmk f68259iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object f68260zoijcleaow;

        public zoijcleaow(draadjrbmk draadjrbmkVar, Object obj) {
            this.f68259iobyxmoadg = draadjrbmkVar;
            this.f68260zoijcleaow = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68259iobyxmoadg, zoijcleaowVar.f68259iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68260zoijcleaow, zoijcleaowVar.f68260zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f68259iobyxmoadg.hashCode() * 31;
            Object obj = this.f68260zoijcleaow;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f68259iobyxmoadg + ", loaderKey=" + this.f68260zoijcleaow + ')';
        }
    }

    public static /* synthetic */ void gxszxtbevo(dxjokdxxww dxjokdxxwwVar, draadjrbmk draadjrbmkVar, jpowsppfya jpowsppfyaVar, Object obj, boolean z13, int i13, Object obj2) {
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        dxjokdxxwwVar.eablkybsjg(draadjrbmkVar, jpowsppfyaVar, obj, z13);
    }

    public final void eablkybsjg(draadjrbmk draadjrbmkVar, jpowsppfya jpowsppfyaVar, Object obj, boolean z13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(draadjrbmkVar, jpowsppfyaVar.iobyxmoadg());
        synchronized (this.f68251wkgbmnqykc) {
            try {
                if (obj == null) {
                    this.f68250ppxfxbqfkf.cqumvgiudr(zoijcleaowVar, iobyxmoadg.iobyxmoadg(this.f68249iobyxmoadg));
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } else if (z13) {
                    this.f68250ppxfxbqfkf.cqumvgiudr(zoijcleaowVar, iobyxmoadg.iobyxmoadg(iobyxmoadg.zoijcleaow(obj)));
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    this.f68252zoijcleaow.put(zoijcleaowVar, iobyxmoadg.iobyxmoadg(iobyxmoadg.zoijcleaow(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lqeggnwhkg(draadjrbmk draadjrbmkVar, jpowsppfya jpowsppfyaVar, boolean z13, tg.draadjrbmk draadjrbmkVar2, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f68254cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f68254cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f68256jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f68254cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(draadjrbmkVar, jpowsppfyaVar.iobyxmoadg());
            synchronized (this.f68251wkgbmnqykc) {
                try {
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f68252zoijcleaow.get(zoijcleaowVar2);
                    if (iobyxmoadgVar == null) {
                        iobyxmoadgVar = (iobyxmoadg) this.f68250ppxfxbqfkf.eablkybsjg(zoijcleaowVar2);
                    }
                    if (iobyxmoadgVar != null) {
                        return iobyxmoadgVar.lqeggnwhkg();
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    ppxfxbqfkfVar.f68257yggfygwlhe = zoijcleaowVar2;
                    ppxfxbqfkfVar.f68258zdlpuopuiu = z13;
                    ppxfxbqfkfVar.f68254cqumvgiudr = 1;
                    Object objInvoke = draadjrbmkVar2.invoke(ppxfxbqfkfVar);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj = objInvoke;
                    zoijcleaowVar = zoijcleaowVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = ppxfxbqfkfVar.f68258zdlpuopuiu;
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f68257yggfygwlhe;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        synchronized (this.f68251wkgbmnqykc) {
            try {
                if (obj == null) {
                    this.f68250ppxfxbqfkf.cqumvgiudr(zoijcleaowVar, iobyxmoadg.iobyxmoadg(this.f68249iobyxmoadg));
                } else if (z13) {
                    this.f68250ppxfxbqfkf.cqumvgiudr(zoijcleaowVar, iobyxmoadg.iobyxmoadg(iobyxmoadg.zoijcleaow(obj)));
                } else {
                    this.f68252zoijcleaow.put(zoijcleaowVar, iobyxmoadg.iobyxmoadg(iobyxmoadg.zoijcleaow(obj)));
                }
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    public final iobyxmoadg wkgbmnqykc(draadjrbmk draadjrbmkVar, jpowsppfya jpowsppfyaVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar = new zoijcleaow(draadjrbmkVar, jpowsppfyaVar.iobyxmoadg());
        synchronized (this.f68251wkgbmnqykc) {
            iobyxmoadgVar = (iobyxmoadg) this.f68252zoijcleaow.get(zoijcleaowVar);
            if (iobyxmoadgVar == null) {
                iobyxmoadgVar = (iobyxmoadg) this.f68250ppxfxbqfkf.eablkybsjg(zoijcleaowVar);
            }
        }
        return iobyxmoadgVar;
    }
}
