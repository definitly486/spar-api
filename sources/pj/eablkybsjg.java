package pj;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76686zoijcleaow = AtomicIntegerFieldUpdater.newUpdater(eablkybsjg.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ntlheqmsrt[] f76687iobyxmoadg;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    private final class iobyxmoadg extends igdgnonuha {

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f76688pmvmpeiblj = AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final agtfadlqog f76689cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public jztzpxfvev f76690esjtqupxsv;

        public iobyxmoadg(agtfadlqog agtfadlqogVar) {
            this.f76689cqumvgiudr = agtfadlqogVar;
        }

        public final zoijcleaow esjtqupxsv() {
            return (zoijcleaow) f76688pmvmpeiblj.get(this);
        }

        public final void istkbnxepw(jztzpxfvev jztzpxfvevVar) {
            this.f76690esjtqupxsv = jztzpxfvevVar;
        }

        @Override // pj.igdgnonuha
        public void iwizpuwonk(Throwable th2) {
            if (th2 != null) {
                Object objLmojexxdyd = this.f76689cqumvgiudr.lmojexxdyd(th2);
                if (objLmojexxdyd != null) {
                    this.f76689cqumvgiudr.metgxyhuhe(objLmojexxdyd);
                    zoijcleaow zoijcleaowVarEsjtqupxsv = esjtqupxsv();
                    if (zoijcleaowVarEsjtqupxsv != null) {
                        zoijcleaowVarEsjtqupxsv.iobyxmoadg();
                        return;
                    }
                    return;
                }
                return;
            }
            if (eablkybsjg.wkgbmnqykc().decrementAndGet(eablkybsjg.this) == 0) {
                agtfadlqog agtfadlqogVar = this.f76689cqumvgiudr;
                ntlheqmsrt[] ntlheqmsrtVarArr = eablkybsjg.this.f76687iobyxmoadg;
                ArrayList arrayList = new ArrayList(ntlheqmsrtVarArr.length);
                for (ntlheqmsrt ntlheqmsrtVar : ntlheqmsrtVarArr) {
                    arrayList.add(ntlheqmsrtVar.draadjrbmk());
                }
                agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(arrayList));
            }
        }

        @Override // pj.igdgnonuha
        public boolean jyumaefscl() {
            return false;
        }

        public final jztzpxfvev lereixgezr() {
            jztzpxfvev jztzpxfvevVar = this.f76690esjtqupxsv;
            if (jztzpxfvevVar != null) {
                return jztzpxfvevVar;
            }
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("handle");
            return null;
        }

        public final void zynmafqrjb(zoijcleaow zoijcleaowVar) {
            f76688pmvmpeiblj.set(this, zoijcleaowVar);
        }
    }

    private final class zoijcleaow implements wflxmlrfwp {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final iobyxmoadg[] f76693zdlpuopuiu;

        public zoijcleaow(iobyxmoadg[] iobyxmoadgVarArr) {
            this.f76693zdlpuopuiu = iobyxmoadgVarArr;
        }

        public final void iobyxmoadg() {
            for (iobyxmoadg iobyxmoadgVar : this.f76693zdlpuopuiu) {
                iobyxmoadgVar.lereixgezr().iobyxmoadg();
            }
        }

        @Override // pj.wflxmlrfwp
        public void ppxfxbqfkf(Throwable th2) {
            iobyxmoadg();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f76693zdlpuopuiu + ']';
        }
    }

    public eablkybsjg(ntlheqmsrt[] ntlheqmsrtVarArr) {
        this.f76687iobyxmoadg = ntlheqmsrtVarArr;
        this.notCompletedCount$volatile = ntlheqmsrtVarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater wkgbmnqykc() {
        return f76686zoijcleaow;
    }

    public final Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        int length = this.f76687iobyxmoadg.length;
        iobyxmoadg[] iobyxmoadgVarArr = new iobyxmoadg[length];
        for (int i13 = 0; i13 < length; i13++) {
            ntlheqmsrt ntlheqmsrtVar = this.f76687iobyxmoadg[i13];
            ntlheqmsrtVar.start();
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(rgvfuqvkyqVar);
            iobyxmoadgVar.istkbnxepw(skhdrjzrfn.wflxmlrfwp(ntlheqmsrtVar, false, iobyxmoadgVar, 1, null));
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVarArr[i13] = iobyxmoadgVar;
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVarArr);
        for (int i14 = 0; i14 < length; i14++) {
            iobyxmoadgVarArr[i14].zynmafqrjb(zoijcleaowVar);
        }
        if (rgvfuqvkyqVar.agtfadlqog()) {
            zoijcleaowVar.iobyxmoadg();
        } else {
            oxmwwwfdhm.ppxfxbqfkf(rgvfuqvkyqVar, zoijcleaowVar);
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }
}
