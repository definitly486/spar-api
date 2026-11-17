package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yj.iobyxmoadg f43230iobyxmoadg = yj.lqeggnwhkg.zoijcleaow(false, 1, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43231zoijcleaow = androidx.compose.runtime.c1.ppxfxbqfkf(null, null, 2, null);

    private static final class iobyxmoadg implements z2 {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f43232iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final b3 f43233ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final pj.agtfadlqog f43234wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f43235zoijcleaow;

        public iobyxmoadg(String str, String str2, b3 b3Var, pj.agtfadlqog agtfadlqogVar) {
            this.f43232iobyxmoadg = str;
            this.f43235zoijcleaow = str2;
            this.f43233ppxfxbqfkf = b3Var;
            this.f43234wkgbmnqykc = agtfadlqogVar;
        }

        @Override // igdgnonuha.z2
        public void dismiss() {
            if (this.f43234wkgbmnqykc.isActive()) {
                pj.agtfadlqog agtfadlqogVar = this.f43234wkgbmnqykc;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(u3.Dismissed));
            }
        }

        @Override // igdgnonuha.z2
        public b3 iobyxmoadg() {
            return this.f43233ppxfxbqfkf;
        }

        @Override // igdgnonuha.z2
        public String ppxfxbqfkf() {
            return this.f43235zoijcleaow;
        }

        @Override // igdgnonuha.z2
        public void wkgbmnqykc() {
            if (this.f43234wkgbmnqykc.isActive()) {
                pj.agtfadlqog agtfadlqogVar = this.f43234wkgbmnqykc;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(u3.ActionPerformed));
            }
        }

        @Override // igdgnonuha.z2
        public String zoijcleaow() {
            return this.f43232iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f43236cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f43237esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f43238iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f43239jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f43241pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f43242yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f43243zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f43237esjtqupxsv = obj;
            this.f43241pmvmpeiblj |= Integer.MIN_VALUE;
            return k3.this.wkgbmnqykc(null, null, null, this);
        }
    }

    public static /* synthetic */ Object eablkybsjg(k3 k3Var, String str, String str2, b3 b3Var, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            b3Var = b3.Short;
        }
        return k3Var.wkgbmnqykc(str, str2, b3Var, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ppxfxbqfkf(z2 z2Var) {
        this.f43231zoijcleaow.setValue(z2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object wkgbmnqykc(String str, String str2, b3 b3Var, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        yj.iobyxmoadg iobyxmoadgVar;
        String str3;
        yj.iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f43241pmvmpeiblj;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f43241pmvmpeiblj = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f43237esjtqupxsv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f43241pmvmpeiblj;
        try {
            try {
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = this.f43230iobyxmoadg;
                    zoijcleaowVar.f43243zdlpuopuiu = str;
                    zoijcleaowVar.f43242yggfygwlhe = str2;
                    zoijcleaowVar.f43239jyumaefscl = b3Var;
                    zoijcleaowVar.f43238iwizpuwonk = iobyxmoadgVar;
                    zoijcleaowVar.f43241pmvmpeiblj = 1;
                    if (iobyxmoadgVar.iobyxmoadg(null, zoijcleaowVar) == objGxszxtbevo) {
                        str3 = str;
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (yj.iobyxmoadg) zoijcleaowVar.f43238iwizpuwonk;
                        try {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            ppxfxbqfkf(null);
                            iobyxmoadgVar2.eablkybsjg(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            ppxfxbqfkf(null);
                            throw th;
                        }
                    }
                    yj.iobyxmoadg iobyxmoadgVar3 = (yj.iobyxmoadg) zoijcleaowVar.f43238iwizpuwonk;
                    b3Var = (b3) zoijcleaowVar.f43239jyumaefscl;
                    str2 = (String) zoijcleaowVar.f43242yggfygwlhe;
                    String str4 = (String) zoijcleaowVar.f43243zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar = iobyxmoadgVar3;
                    str3 = str4;
                }
                str3 = str;
                zoijcleaowVar.f43243zdlpuopuiu = str3;
                zoijcleaowVar.f43242yggfygwlhe = str2;
                zoijcleaowVar.f43239jyumaefscl = b3Var;
                zoijcleaowVar.f43238iwizpuwonk = iobyxmoadgVar;
                zoijcleaowVar.f43236cqumvgiudr = zoijcleaowVar;
                zoijcleaowVar.f43241pmvmpeiblj = 2;
                pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(zoijcleaowVar), 1);
                rgvfuqvkyqVar.lereixgezr();
                ppxfxbqfkf(new iobyxmoadg(str3, str2, b3Var, rgvfuqvkyqVar));
                Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(zoijcleaowVar);
                }
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                yj.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar;
                obj = objZdlpuopuiu;
                iobyxmoadgVar2 = iobyxmoadgVar4;
                ppxfxbqfkf(null);
                iobyxmoadgVar2.eablkybsjg(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                ppxfxbqfkf(null);
                throw th;
            }
        } catch (Throwable th4) {
            str.eablkybsjg(null);
            throw th4;
        }
    }

    public final z2 zoijcleaow() {
        return (z2) this.f43231zoijcleaow.getValue();
    }
}
