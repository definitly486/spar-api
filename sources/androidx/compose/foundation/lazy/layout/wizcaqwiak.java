package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.runtime.b0;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class wizcaqwiak {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f5202eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f5203iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fyldjkxazc f5204ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f5205wkgbmnqykc = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.ui.layout.istkbnxepw f5206zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    final class iobyxmoadg implements crxdokpmqz.zoijcleaow, fiwbwshyhd, crxdokpmqz.ppxfxbqfkf {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private boolean f5207agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f5208btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private boolean f5209draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f5210dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private w0.zoijcleaow f5211eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private Object f5212gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private androidx.compose.ui.layout.istkbnxepw.zoijcleaow f5213gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f5214iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private androidx.compose.ui.layout.istkbnxepw.iobyxmoadg f5216lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f5217nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private long f5218ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private boolean f5219oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final grlcpdaxtj f5220ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private long f5221rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private long f5222vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private C0089iobyxmoadg f5223wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final tg.draadjrbmk f5224wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final hszhottldk f5225zoijcleaow;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.wizcaqwiak$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private final class C0089iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private boolean f5226eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f5228iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private int f5229ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private int f5230wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final List[] f5231zoijcleaow;

            public C0089iobyxmoadg(List list) {
                this.f5228iobyxmoadg = list;
                this.f5231zoijcleaow = new List[list.size()];
                if (list.isEmpty()) {
                    rlfsiqarku.eablkybsjg.iobyxmoadg("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final void eablkybsjg(boolean z13) {
                this.f5226eablkybsjg = z13;
            }

            public final int iobyxmoadg() {
                List list = this.f5228iobyxmoadg;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i13 = 0; i13 < size; i13++) {
                    iMin = Math.min(iMin, ((crxdokpmqz) list.get(i13)).ppxfxbqfkf());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final boolean ppxfxbqfkf(ageimvtcrz ageimvtcrzVar, int i13, boolean z13) {
                if (this.f5229ppxfxbqfkf >= this.f5228iobyxmoadg.size()) {
                    return false;
                }
                if (iobyxmoadg.this.f5210dxjokdxxww) {
                    rlfsiqarku.eablkybsjg.ppxfxbqfkf("Should not execute nested prefetch on canceled request");
                }
                if (ikoacuggdj.esjtqupxsv.f44793lqeggnwhkg) {
                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                    try {
                        List list = this.f5228iobyxmoadg;
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            ((crxdokpmqz) list.get(i14)).draadjrbmk(i13);
                        }
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f5229ppxfxbqfkf < this.f5228iobyxmoadg.size()) {
                    try {
                        if (this.f5231zoijcleaow[this.f5229ppxfxbqfkf] == null) {
                            if (ageimvtcrzVar.iobyxmoadg() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.f5231zoijcleaow;
                            int i15 = this.f5229ppxfxbqfkf;
                            listArr[i15] = ((crxdokpmqz) this.f5228iobyxmoadg.get(i15)).zoijcleaow();
                        }
                        List list2 = this.f5231zoijcleaow[this.f5229ppxfxbqfkf];
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list2);
                        while (this.f5230wkgbmnqykc < list2.size()) {
                            fiwbwshyhd fiwbwshyhdVar = (fiwbwshyhd) list2.get(this.f5230wkgbmnqykc);
                            if (z13) {
                                iobyxmoadg iobyxmoadgVar = fiwbwshyhdVar instanceof iobyxmoadg ? (iobyxmoadg) fiwbwshyhdVar : null;
                                if (iobyxmoadgVar != null) {
                                    iobyxmoadgVar.iobyxmoadg();
                                }
                            }
                            this.f5226eablkybsjg = true;
                            if (fiwbwshyhdVar.wkgbmnqykc(ageimvtcrzVar)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f5230wkgbmnqykc++;
                        }
                        this.f5230wkgbmnqykc = 0;
                        this.f5229ppxfxbqfkf++;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                Trace.endSection();
                return false;
            }

            public final boolean wkgbmnqykc() {
                return this.f5226eablkybsjg;
            }

            public final int zoijcleaow() {
                List list = this.f5228iobyxmoadg;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i13 = 0; i13 < size; i13++) {
                    iMin = Math.min(iMin, ((crxdokpmqz) list.get(i13)).wkgbmnqykc());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }
        }

        public /* synthetic */ iobyxmoadg(wizcaqwiak wizcaqwiakVar, int i13, long j13, hszhottldk hszhottldkVar, grlcpdaxtj grlcpdaxtjVar, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(wizcaqwiakVar, i13, j13, hszhottldkVar, grlcpdaxtjVar, draadjrbmkVar);
        }

        private final void agtfadlqog(long j13) {
            if (this.f5210dxjokdxxww) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f5217nufgyqmvbu) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("Request was already measured!");
            }
            this.f5217nufgyqmvbu = true;
            androidx.compose.ui.layout.istkbnxepw.zoijcleaow zoijcleaowVar = this.f5213gxszxtbevo;
            if (zoijcleaowVar == null) {
                rlfsiqarku.eablkybsjg.zoijcleaow("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iZoijcleaow = zoijcleaowVar.zoijcleaow();
            for (int i13 = 0; i13 < iZoijcleaow; i13++) {
                zoijcleaowVar.eablkybsjg(i13, j13);
            }
        }

        private final void draadjrbmk() {
            androidx.compose.ui.layout.istkbnxepw.iobyxmoadg iobyxmoadgVar = this.f5216lqeggnwhkg;
            if (iobyxmoadgVar == null) {
                throw new IllegalArgumentException("Nothing to apply!");
            }
            this.f5213gxszxtbevo = iobyxmoadgVar.apply();
            this.f5216lqeggnwhkg = null;
            this.f5208btonecajqb = true;
        }

        private final boolean dxjokdxxww(ageimvtcrz ageimvtcrzVar) {
            y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:execute:item", btonecajqb());
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) wizcaqwiak.this.f5203iobyxmoadg.wkgbmnqykc().invoke();
            if (!this.f5210dxjokdxxww) {
                int iIobyxmoadg = zynmafqrjbVar.iobyxmoadg();
                int iBtonecajqb = btonecajqb();
                if (iBtonecajqb >= 0 && iBtonecajqb < iIobyxmoadg) {
                    Object objWkgbmnqykc = zynmafqrjbVar.wkgbmnqykc(btonecajqb());
                    Object obj = this.f5212gtknphoqwx;
                    if (obj != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objWkgbmnqykc, obj)) {
                        nufgyqmvbu();
                        return false;
                    }
                    Object objGxszxtbevo = zynmafqrjbVar.gxszxtbevo(btonecajqb());
                    ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = this.f5225zoijcleaow.iobyxmoadg(objGxszxtbevo);
                    boolean zGtknphoqwx = gtknphoqwx();
                    vdvldrhtss(ageimvtcrzVar.iobyxmoadg());
                    if (!gtknphoqwx()) {
                        if (ikoacuggdj.esjtqupxsv.f44791gxszxtbevo) {
                            if (zdlpuopuiu(this.f5218ojitshcjhn, ppxfxbqfkfVarIobyxmoadg.dxjokdxxww() + ppxfxbqfkfVarIobyxmoadg.nufgyqmvbu())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    ojitshcjhn(ageimvtcrzVar, objWkgbmnqykc, objGxszxtbevo, ppxfxbqfkfVarIobyxmoadg);
                                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        } else if (zdlpuopuiu(this.f5218ojitshcjhn, ppxfxbqfkfVarIobyxmoadg.eablkybsjg())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                wflxmlrfwp(objWkgbmnqykc, objGxszxtbevo);
                                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                Trace.endSection();
                                yggfygwlhe();
                                ppxfxbqfkfVarIobyxmoadg.gtknphoqwx(this.f5221rgvfuqvkyq);
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                        if (!gtknphoqwx()) {
                            return true;
                        }
                    }
                    if (this.f5216lqeggnwhkg != null) {
                        if (!zdlpuopuiu(this.f5218ojitshcjhn, ppxfxbqfkfVarIobyxmoadg.wkgbmnqykc())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            draadjrbmk();
                            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
                            Trace.endSection();
                            yggfygwlhe();
                            ppxfxbqfkfVarIobyxmoadg.btonecajqb(this.f5221rgvfuqvkyq);
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    if (!this.f5209draadjrbmk) {
                        if (this.f5218ojitshcjhn <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f5223wflxmlrfwp = oxmwwwfdhm();
                            this.f5209draadjrbmk = true;
                            gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                    C0089iobyxmoadg c0089iobyxmoadg = this.f5223wflxmlrfwp;
                    if (c0089iobyxmoadg != null ? c0089iobyxmoadg.ppxfxbqfkf(ageimvtcrzVar, ppxfxbqfkfVarIobyxmoadg.lqeggnwhkg(), this.f5207agtfadlqog) : false) {
                        return true;
                    }
                    C0089iobyxmoadg c0089iobyxmoadg2 = this.f5223wflxmlrfwp;
                    if (c0089iobyxmoadg2 != null && c0089iobyxmoadg2.wkgbmnqykc()) {
                        yggfygwlhe();
                        y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:execute:item", btonecajqb());
                        C0089iobyxmoadg c0089iobyxmoadg3 = this.f5223wflxmlrfwp;
                        if (c0089iobyxmoadg3 != null) {
                            c0089iobyxmoadg3.eablkybsjg(false);
                        }
                    }
                    w0.zoijcleaow zoijcleaowVar = this.f5211eablkybsjg;
                    if (!this.f5217nufgyqmvbu && zoijcleaowVar != null) {
                        if ((wizcaqwiak.this.gxszxtbevo() && !zGtknphoqwx) || !zdlpuopuiu(this.f5218ojitshcjhn, ppxfxbqfkfVarIobyxmoadg.gxszxtbevo())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            agtfadlqog(zoijcleaowVar.vdvldrhtss());
                            gg.wwaezpbzkn wwaezpbzknVar5 = gg.wwaezpbzkn.f37140iobyxmoadg;
                            Trace.endSection();
                            yggfygwlhe();
                            ppxfxbqfkfVarIobyxmoadg.draadjrbmk(this.f5221rgvfuqvkyq);
                            tg.draadjrbmk draadjrbmkVar = this.f5224wkgbmnqykc;
                            if (draadjrbmkVar != null) {
                                draadjrbmkVar.invoke(this);
                            }
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                    C0089iobyxmoadg c0089iobyxmoadg4 = this.f5223wflxmlrfwp;
                    if (ikoacuggdj.esjtqupxsv.f44793lqeggnwhkg && this.f5217nufgyqmvbu && this.f5209draadjrbmk && c0089iobyxmoadg4 != null) {
                        int iIobyxmoadg2 = c0089iobyxmoadg4.iobyxmoadg();
                        ppxfxbqfkfVarIobyxmoadg.wflxmlrfwp(iIobyxmoadg2);
                        if (c0089iobyxmoadg4.zoijcleaow() < iIobyxmoadg2) {
                            ppxfxbqfkfVarIobyxmoadg.ppxfxbqfkf();
                        }
                    }
                    return false;
                }
            }
            nufgyqmvbu();
            return false;
        }

        private final boolean gtknphoqwx() {
            if (this.f5208btonecajqb) {
                return true;
            }
            androidx.compose.ui.layout.istkbnxepw.iobyxmoadg iobyxmoadgVar = this.f5216lqeggnwhkg;
            return iobyxmoadgVar != null && iobyxmoadgVar.iobyxmoadg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z.fiwbwshyhd kcexrzcfyt(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, z.ageimvtcrz ageimvtcrzVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ageimvtcrzVar, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
            crxdokpmqz crxdokpmqzVarH0 = ((fmlbqenlif) ageimvtcrzVar).H0();
            List listKcexrzcfyt = (List) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (listKcexrzcfyt != null) {
                listKcexrzcfyt.add(crxdokpmqzVarH0);
            } else {
                listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(crxdokpmqzVarH0);
            }
            hkdspvbjdzVar.f60015zdlpuopuiu = listKcexrzcfyt;
            return z.fiwbwshyhd.SkipSubtreeAndContinueTraversal;
        }

        private final void nufgyqmvbu() {
            androidx.compose.ui.layout.istkbnxepw.iobyxmoadg iobyxmoadgVar = this.f5216lqeggnwhkg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.cancel();
            }
            this.f5216lqeggnwhkg = null;
            androidx.compose.ui.layout.istkbnxepw.zoijcleaow zoijcleaowVar = this.f5213gxszxtbevo;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.iobyxmoadg();
            }
            this.f5213gxszxtbevo = null;
            this.f5223wflxmlrfwp = null;
        }

        private final void ojitshcjhn(ageimvtcrz ageimvtcrzVar, Object obj, Object obj2, final ppxfxbqfkf ppxfxbqfkfVar) {
            androidx.compose.ui.layout.istkbnxepw.iobyxmoadg iobyxmoadgVarWkgbmnqykc = this.f5216lqeggnwhkg;
            if (iobyxmoadgVarWkgbmnqykc == null) {
                wizcaqwiak wizcaqwiakVar = wizcaqwiak.this;
                iobyxmoadgVarWkgbmnqykc = wizcaqwiakVar.f5206zoijcleaow.wkgbmnqykc(obj, wizcaqwiakVar.f5203iobyxmoadg.zoijcleaow(btonecajqb(), obj, obj2));
                this.f5216lqeggnwhkg = iobyxmoadgVarWkgbmnqykc;
                this.f5212gtknphoqwx = obj;
            }
            this.f5219oxmwwwfdhm = false;
            while (!iobyxmoadgVarWkgbmnqykc.iobyxmoadg() && !this.f5219oxmwwwfdhm) {
                iobyxmoadgVarWkgbmnqykc.zoijcleaow(new b0() { // from class: androidx.compose.foundation.lazy.layout.lxfrhoxuzk
                    @Override // androidx.compose.runtime.b0
                    public final boolean iobyxmoadg() {
                        return wizcaqwiak.iobyxmoadg.rgvfuqvkyq(this.f5067iobyxmoadg, ppxfxbqfkfVar);
                    }
                });
            }
            yggfygwlhe();
            if (this.f5219oxmwwwfdhm) {
                ppxfxbqfkfVar.agtfadlqog(this.f5221rgvfuqvkyq);
            } else {
                ppxfxbqfkfVar.ojitshcjhn(this.f5221rgvfuqvkyq);
            }
        }

        private final C0089iobyxmoadg oxmwwwfdhm() {
            androidx.compose.ui.layout.istkbnxepw.zoijcleaow zoijcleaowVar = this.f5213gxszxtbevo;
            if (zoijcleaowVar == null) {
                rlfsiqarku.eablkybsjg.zoijcleaow("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
            zoijcleaowVar.wkgbmnqykc("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.igdgnonuha
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return wizcaqwiak.iobyxmoadg.kcexrzcfyt(hkdspvbjdzVar, (z.ageimvtcrz) obj);
                }
            });
            List list = (List) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (list != null) {
                return new C0089iobyxmoadg(list);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean rgvfuqvkyq(iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
            if (!iobyxmoadgVar.f5219oxmwwwfdhm) {
                iobyxmoadgVar.yggfygwlhe();
                ppxfxbqfkfVar.ojitshcjhn(iobyxmoadgVar.f5221rgvfuqvkyq);
                iobyxmoadgVar.f5219oxmwwwfdhm = !iobyxmoadgVar.zdlpuopuiu(iobyxmoadgVar.f5218ojitshcjhn, ppxfxbqfkfVar.dxjokdxxww() + ppxfxbqfkfVar.nufgyqmvbu());
            }
            return iobyxmoadgVar.f5219oxmwwwfdhm;
        }

        private final void vdvldrhtss(long j13) {
            this.f5218ojitshcjhn = j13;
            this.f5222vdvldrhtss = nj.dxjokdxxww.f70169iobyxmoadg.iobyxmoadg();
            this.f5221rgvfuqvkyq = 0L;
            y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:available_time_nanos", j13);
        }

        private final void wflxmlrfwp(Object obj, Object obj2) {
            if (!(this.f5213gxszxtbevo == null)) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("Request was already composed!");
            }
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = wizcaqwiak.this.f5203iobyxmoadg.zoijcleaow(btonecajqb(), obj, obj2);
            this.f5212gtknphoqwx = obj;
            this.f5213gxszxtbevo = wizcaqwiak.this.f5206zoijcleaow.btonecajqb(obj, rgvfuqvkyqVarZoijcleaow);
            this.f5208btonecajqb = true;
        }

        private final void yggfygwlhe() {
            long jIobyxmoadg = nj.dxjokdxxww.f70169iobyxmoadg.iobyxmoadg();
            long jVdvldrhtss = nj.iobyxmoadg.vdvldrhtss(nj.dxjokdxxww.iobyxmoadg.zoijcleaow(jIobyxmoadg, this.f5222vdvldrhtss));
            this.f5221rgvfuqvkyq = jVdvldrhtss;
            long j13 = this.f5218ojitshcjhn - jVdvldrhtss;
            this.f5218ojitshcjhn = j13;
            this.f5222vdvldrhtss = jIobyxmoadg;
            y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:available_time_nanos", j13);
        }

        private final boolean zdlpuopuiu(long j13, long j14) {
            if (this.f5207agtfadlqog) {
                j14 = 0;
            }
            return j13 > j14;
        }

        public int btonecajqb() {
            return this.f5214iobyxmoadg;
        }

        @Override // androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow
        public void cancel() {
            if (this.f5210dxjokdxxww) {
                return;
            }
            this.f5210dxjokdxxww = true;
            nufgyqmvbu();
        }

        @Override // androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow
        public void iobyxmoadg() {
            this.f5207agtfadlqog = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.crxdokpmqz.ppxfxbqfkf
        public long ppxfxbqfkf(int i13) {
            androidx.compose.ui.layout.istkbnxepw.zoijcleaow zoijcleaowVar = this.f5213gxszxtbevo;
            return zoijcleaowVar != null ? zoijcleaowVar.ppxfxbqfkf(i13) : w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + btonecajqb() + ", constraints = " + this.f5211eablkybsjg + ", isComposed = " + gtknphoqwx() + ", isMeasured = " + this.f5217nufgyqmvbu + ", isCanceled = " + this.f5210dxjokdxxww + " }";
        }

        @Override // androidx.compose.foundation.lazy.layout.fiwbwshyhd
        public boolean wkgbmnqykc(ageimvtcrz ageimvtcrzVar) {
            boolean zDxjokdxxww;
            if (!wizcaqwiak.this.f5205wkgbmnqykc) {
                return false;
            }
            if (this.f5207agtfadlqog) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zDxjokdxxww = dxjokdxxww(ageimvtcrzVar);
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                zDxjokdxxww = dxjokdxxww(ageimvtcrzVar);
            }
            y0.zoijcleaow.iobyxmoadg("compose:lazy:prefetch:execute:item", -1L);
            return zDxjokdxxww;
        }

        @Override // androidx.compose.foundation.lazy.layout.crxdokpmqz.ppxfxbqfkf
        public int zoijcleaow() {
            androidx.compose.ui.layout.istkbnxepw.zoijcleaow zoijcleaowVar = this.f5213gxszxtbevo;
            if (zoijcleaowVar != null) {
                return zoijcleaowVar.zoijcleaow();
            }
            return 0;
        }

        public iobyxmoadg(int i13, hszhottldk hszhottldkVar, grlcpdaxtj grlcpdaxtjVar, tg.draadjrbmk draadjrbmkVar) {
            this.f5214iobyxmoadg = i13;
            this.f5225zoijcleaow = hszhottldkVar;
            this.f5220ppxfxbqfkf = grlcpdaxtjVar;
            this.f5224wkgbmnqykc = draadjrbmkVar;
            this.f5222vdvldrhtss = nj.dxjokdxxww.f70169iobyxmoadg.iobyxmoadg();
        }

        private iobyxmoadg(wizcaqwiak wizcaqwiakVar, int i13, long j13, hszhottldk hszhottldkVar, grlcpdaxtj grlcpdaxtjVar, tg.draadjrbmk draadjrbmkVar) {
            this(i13, hszhottldkVar, grlcpdaxtjVar, draadjrbmkVar);
            this.f5211eablkybsjg = w0.zoijcleaow.iobyxmoadg(j13);
        }
    }

    public wizcaqwiak(esjtqupxsv esjtqupxsvVar, androidx.compose.ui.layout.istkbnxepw istkbnxepwVar, fyldjkxazc fyldjkxazcVar) {
        this.f5203iobyxmoadg = esjtqupxsvVar;
        this.f5206zoijcleaow = istkbnxepwVar;
        this.f5204ppxfxbqfkf = fyldjkxazcVar;
    }

    public final void eablkybsjg(fyldjkxazc fyldjkxazcVar, fiwbwshyhd fiwbwshyhdVar, boolean z13) {
        if (!(fyldjkxazcVar instanceof grlcpdaxtj)) {
            fyldjkxazcVar.iobyxmoadg(fiwbwshyhdVar);
        } else if (z13) {
            ((grlcpdaxtj) fyldjkxazcVar).zoijcleaow(fiwbwshyhdVar);
        } else {
            ((grlcpdaxtj) fyldjkxazcVar).ppxfxbqfkf(fiwbwshyhdVar);
        }
    }

    public final boolean gxszxtbevo() {
        return this.f5202eablkybsjg;
    }

    public final void lqeggnwhkg() {
        this.f5205wkgbmnqykc = false;
    }

    public final crxdokpmqz.zoijcleaow nufgyqmvbu(int i13, long j13, hszhottldk hszhottldkVar, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        fyldjkxazc fyldjkxazcVar = this.f5204ppxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this, i13, j13, hszhottldkVar, fyldjkxazcVar instanceof grlcpdaxtj ? (grlcpdaxtj) fyldjkxazcVar : null, draadjrbmkVar, null);
        eablkybsjg(this.f5204ppxfxbqfkf, iobyxmoadgVar, z13);
        y0.zoijcleaow.iobyxmoadg("compose:lazy:schedule_prefetch:index", i13);
        return iobyxmoadgVar;
    }

    public final fiwbwshyhd wkgbmnqykc(int i13, hszhottldk hszhottldkVar) {
        fyldjkxazc fyldjkxazcVar = this.f5204ppxfxbqfkf;
        return new iobyxmoadg(i13, hszhottldkVar, fyldjkxazcVar instanceof grlcpdaxtj ? (grlcpdaxtj) fyldjkxazcVar : null, null);
    }
}
