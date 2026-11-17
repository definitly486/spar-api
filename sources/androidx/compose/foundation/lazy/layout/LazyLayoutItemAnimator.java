package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private z.zdlpuopuiu f4920btonecajqb;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f4928ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private yadqdtsiqt f4930zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f4925iobyxmoadg = androidx.collection.ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.collection.wypolnanlu f4929wkgbmnqykc = androidx.collection.jhduphickx.zoijcleaow();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f4922eablkybsjg = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f4924gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f4926lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List f4927nufgyqmvbu = new ArrayList();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f4921dxjokdxxww = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final androidx.compose.ui.wkgbmnqykc f4923gtknphoqwx = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$iobyxmoadg;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$iobyxmoadg;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$iobyxmoadg;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends z.ribwqtqdhb {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public void draadjrbmk(iobyxmoadg node) {
            node.H0(this.animator);
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg getNode() {
            return new iobyxmoadg(this.animator);
        }
    }

    public static final class eablkybsjg implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yadqdtsiqt f4932zdlpuopuiu;

        public eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
            this.f4932zdlpuopuiu = yadqdtsiqtVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(this.f4932zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj2).getKey())), Integer.valueOf(this.f4932zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj).getKey())));
        }
    }

    public static final class gxszxtbevo implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yadqdtsiqt f4933zdlpuopuiu;

        public gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
            this.f4933zdlpuopuiu = yadqdtsiqtVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(this.f4933zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj2).getKey())), Integer.valueOf(this.f4933zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj).getKey())));
        }
    }

    private static final class iobyxmoadg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.zdlpuopuiu {

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private LazyLayoutItemAnimator f4934ylkuphrtab;

        public iobyxmoadg(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f4934ylkuphrtab = lazyLayoutItemAnimator;
        }

        public final void H0(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4934ylkuphrtab, lazyLayoutItemAnimator) || !wflxmlrfwp().n0()) {
                return;
            }
            this.f4934ylkuphrtab.rgvfuqvkyq();
            lazyLayoutItemAnimator.f4920btonecajqb = this;
            this.f4934ylkuphrtab = lazyLayoutItemAnimator;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4934ylkuphrtab, ((iobyxmoadg) obj).f4934ylkuphrtab);
        }

        @Override // z.zdlpuopuiu
        public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) {
            List list = this.f4934ylkuphrtab.f4921dxjokdxxww;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                vdvldrhtss vdvldrhtssVar = (vdvldrhtss) list.get(i13);
                k.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = vdvldrhtssVar.rgvfuqvkyq();
                if (ppxfxbqfkfVarRgvfuqvkyq != null) {
                    float fDxjokdxxww = w0.agtfadlqog.dxjokdxxww(vdvldrhtssVar.ojitshcjhn());
                    float fBtonecajqb = w0.agtfadlqog.btonecajqb(vdvldrhtssVar.ojitshcjhn());
                    float fDxjokdxxww2 = fDxjokdxxww - w0.agtfadlqog.dxjokdxxww(ppxfxbqfkfVarRgvfuqvkyq.cqumvgiudr());
                    float fBtonecajqb2 = fBtonecajqb - w0.agtfadlqog.btonecajqb(ppxfxbqfkfVarRgvfuqvkyq.cqumvgiudr());
                    ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(fDxjokdxxww2, fBtonecajqb2);
                    try {
                        k.eablkybsjg.iobyxmoadg(ppxfxbqfkfVar, ppxfxbqfkfVarRgvfuqvkyq);
                        ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(-fDxjokdxxww2, -fBtonecajqb2);
                    } catch (Throwable th2) {
                        ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(-fDxjokdxxww2, -fBtonecajqb2);
                        throw th2;
                    }
                }
            }
            ppxfxbqfkfVar.b0();
        }

        public int hashCode() {
            return this.f4934ylkuphrtab.hashCode();
        }

        @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
        public void q0() {
            this.f4934ylkuphrtab.f4920btonecajqb = this;
        }

        @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
        public void r0() {
            this.f4934ylkuphrtab.rgvfuqvkyq();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f4934ylkuphrtab + ')';
        }
    }

    public static final class ppxfxbqfkf implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yadqdtsiqt f4935zdlpuopuiu;

        public ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
            this.f4935zdlpuopuiu = yadqdtsiqtVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(this.f4935zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj).getKey())), Integer.valueOf(this.f4935zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj2).getKey())));
        }
    }

    public static final class wkgbmnqykc implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ yadqdtsiqt f4936zdlpuopuiu;

        public wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
            this.f4936zdlpuopuiu = yadqdtsiqtVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(this.f4936zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj).getKey())), Integer.valueOf(this.f4936zdlpuopuiu.ppxfxbqfkf(((cllcsxoeiz) obj2).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f4938gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f4940lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f4942ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f4943wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private w0.zoijcleaow f4944zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private vdvldrhtss[] f4939iobyxmoadg = iwizpuwonk.f5023iobyxmoadg;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f4937eablkybsjg = 1;

        public zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn agtfadlqog(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            z.zdlpuopuiu zdlpuopuiuVar = lazyLayoutItemAnimator.f4920btonecajqb;
            if (zdlpuopuiuVar != null) {
                z.yggfygwlhe.iobyxmoadg(zdlpuopuiuVar);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        private final boolean dxjokdxxww() {
            for (vdvldrhtss vdvldrhtssVar : this.f4939iobyxmoadg) {
                if (vdvldrhtssVar != null && vdvldrhtssVar.cqumvgiudr()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void wflxmlrfwp(zoijcleaow zoijcleaowVar, cllcsxoeiz cllcsxoeizVar, pj.cllcsxoeiz cllcsxoeizVar2, h.auzgnhcxok auzgnhcxokVar, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 32) != 0) {
                i15 = LazyLayoutItemAnimator.this.gxszxtbevo(cllcsxoeizVar);
            }
            zoijcleaowVar.draadjrbmk(cllcsxoeizVar, cllcsxoeizVar2, auzgnhcxokVar, i13, i14, i15);
        }

        public final void btonecajqb(int i13) {
            this.f4943wkgbmnqykc = i13;
        }

        public final void draadjrbmk(cllcsxoeiz cllcsxoeizVar, pj.cllcsxoeiz cllcsxoeizVar2, h.auzgnhcxok auzgnhcxokVar, int i13, int i14, int i15) {
            if (!dxjokdxxww()) {
                this.f4938gxszxtbevo = i13;
                this.f4940lqeggnwhkg = i14;
            }
            int length = this.f4939iobyxmoadg.length;
            for (int iZoijcleaow = cllcsxoeizVar.zoijcleaow(); iZoijcleaow < length; iZoijcleaow++) {
                vdvldrhtss vdvldrhtssVar = this.f4939iobyxmoadg[iZoijcleaow];
                if (vdvldrhtssVar != null) {
                    vdvldrhtssVar.esjtqupxsv();
                }
            }
            if (this.f4939iobyxmoadg.length != cllcsxoeizVar.zoijcleaow()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f4939iobyxmoadg, cllcsxoeizVar.zoijcleaow());
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                this.f4939iobyxmoadg = (vdvldrhtss[]) objArrCopyOf;
            }
            this.f4944zoijcleaow = w0.zoijcleaow.iobyxmoadg(cllcsxoeizVar.ppxfxbqfkf());
            this.f4942ppxfxbqfkf = i15;
            this.f4943wkgbmnqykc = cllcsxoeizVar.agtfadlqog();
            this.f4937eablkybsjg = cllcsxoeizVar.gxszxtbevo();
            int iZoijcleaow2 = cllcsxoeizVar.zoijcleaow();
            final LazyLayoutItemAnimator lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i16 = 0; i16 < iZoijcleaow2; i16++) {
                dxjokdxxww dxjokdxxwwVarPpxfxbqfkf = iwizpuwonk.ppxfxbqfkf(cllcsxoeizVar.draadjrbmk(i16));
                if (dxjokdxxwwVarPpxfxbqfkf == null) {
                    vdvldrhtss vdvldrhtssVar2 = this.f4939iobyxmoadg[i16];
                    if (vdvldrhtssVar2 != null) {
                        vdvldrhtssVar2.esjtqupxsv();
                    }
                    this.f4939iobyxmoadg[i16] = null;
                } else {
                    vdvldrhtss vdvldrhtssVar3 = this.f4939iobyxmoadg[i16];
                    if (vdvldrhtssVar3 == null) {
                        vdvldrhtssVar3 = new vdvldrhtss(cllcsxoeizVar2, auzgnhcxokVar, new tg.iobyxmoadg() { // from class: androidx.compose.foundation.lazy.layout.jyumaefscl
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return LazyLayoutItemAnimator.zoijcleaow.agtfadlqog(lazyLayoutItemAnimator);
                            }
                        });
                        this.f4939iobyxmoadg[i16] = vdvldrhtssVar3;
                    }
                    vdvldrhtssVar3.istkbnxepw(dxjokdxxwwVarPpxfxbqfkf.H0());
                    vdvldrhtssVar3.ylkuphrtab(dxjokdxxwwVarPpxfxbqfkf.J0());
                    vdvldrhtssVar3.cdpycssgdh(dxjokdxxwwVarPpxfxbqfkf.I0());
                }
            }
        }

        public final int eablkybsjg() {
            return this.f4943wkgbmnqykc;
        }

        public final void gtknphoqwx(int i13) {
            this.f4937eablkybsjg = i13;
        }

        public final int gxszxtbevo() {
            return this.f4940lqeggnwhkg;
        }

        public final int lqeggnwhkg() {
            return this.f4938gxszxtbevo;
        }

        public final int nufgyqmvbu() {
            return this.f4937eablkybsjg;
        }

        public final w0.zoijcleaow ppxfxbqfkf() {
            return this.f4944zoijcleaow;
        }

        public final int wkgbmnqykc() {
            return this.f4942ppxfxbqfkf;
        }

        public final vdvldrhtss[] zoijcleaow() {
            return this.f4939iobyxmoadg;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[LOOP:0: B:7:0x0015->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[EDGE_INSN: B:26:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:7:0x0015->B:22:0x005b], SYNTHETIC] */
    private final void agtfadlqog() {
        if (this.f4925iobyxmoadg.dxjokdxxww()) {
            androidx.collection.dsvhmnatus dsvhmnatusVar = this.f4925iobyxmoadg;
            Object[] objArr = dsvhmnatusVar.f4300ppxfxbqfkf;
            long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                for (vdvldrhtss vdvldrhtssVar : ((zoijcleaow) objArr[(i13 << 3) + i15]).zoijcleaow()) {
                                    if (vdvldrhtssVar != null) {
                                        vdvldrhtssVar.esjtqupxsv();
                                    }
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 != length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            this.f4925iobyxmoadg.gtknphoqwx();
        }
    }

    static /* synthetic */ void draadjrbmk(LazyLayoutItemAnimator lazyLayoutItemAnimator, cllcsxoeiz cllcsxoeizVar, int i13, zoijcleaow zoijcleaowVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            Object objEablkybsjg = lazyLayoutItemAnimator.f4925iobyxmoadg.eablkybsjg(cllcsxoeizVar.getKey());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
            zoijcleaowVar = (zoijcleaow) objEablkybsjg;
        }
        lazyLayoutItemAnimator.gtknphoqwx(cllcsxoeizVar, i13, zoijcleaowVar);
    }

    private final void gtknphoqwx(cllcsxoeiz cllcsxoeizVar, int i13, zoijcleaow zoijcleaowVar) {
        int i14 = 0;
        long jWflxmlrfwp = cllcsxoeizVar.wflxmlrfwp(0);
        long jGxszxtbevo = cllcsxoeizVar.nufgyqmvbu() ? w0.agtfadlqog.gxszxtbevo(jWflxmlrfwp, 0, i13, 1, null) : w0.agtfadlqog.gxszxtbevo(jWflxmlrfwp, i13, 0, 2, null);
        vdvldrhtss[] vdvldrhtssVarArrZoijcleaow = zoijcleaowVar.zoijcleaow();
        int length = vdvldrhtssVarArrZoijcleaow.length;
        int i15 = 0;
        while (i14 < length) {
            vdvldrhtss vdvldrhtssVar = vdvldrhtssVarArrZoijcleaow[i14];
            int i16 = i15 + 1;
            if (vdvldrhtssVar != null) {
                vdvldrhtssVar.pkzmftpjix(w0.agtfadlqog.wflxmlrfwp(jGxszxtbevo, w0.agtfadlqog.draadjrbmk(cllcsxoeizVar.wflxmlrfwp(i15), jWflxmlrfwp)));
            }
            i14++;
            i15 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int gxszxtbevo(cllcsxoeiz cllcsxoeizVar) {
        long jWflxmlrfwp = cllcsxoeizVar.wflxmlrfwp(0);
        return !cllcsxoeizVar.nufgyqmvbu() ? w0.agtfadlqog.btonecajqb(jWflxmlrfwp) : w0.agtfadlqog.dxjokdxxww(jWflxmlrfwp);
    }

    private final int kcexrzcfyt(int[] iArr, cllcsxoeiz cllcsxoeizVar) {
        int iAgtfadlqog = cllcsxoeizVar.agtfadlqog();
        int iGxszxtbevo = cllcsxoeizVar.gxszxtbevo() + iAgtfadlqog;
        int iMax = 0;
        while (iAgtfadlqog < iGxszxtbevo) {
            int iGtknphoqwx = iArr[iAgtfadlqog] + cllcsxoeizVar.gtknphoqwx();
            iArr[iAgtfadlqog] = iGtknphoqwx;
            iMax = Math.max(iMax, iGtknphoqwx);
            iAgtfadlqog++;
        }
        return iMax;
    }

    private final boolean lqeggnwhkg(cllcsxoeiz cllcsxoeizVar) {
        int iZoijcleaow = cllcsxoeizVar.zoijcleaow();
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            if (iwizpuwonk.ppxfxbqfkf(cllcsxoeizVar.draadjrbmk(i13)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) {
        long jWflxmlrfwp = cllcsxoeizVar.wflxmlrfwp(0);
        return cllcsxoeizVar.nufgyqmvbu() ? w0.agtfadlqog.btonecajqb(jWflxmlrfwp) : w0.agtfadlqog.dxjokdxxww(jWflxmlrfwp);
    }

    private final void ojitshcjhn(Object obj) {
        vdvldrhtss[] vdvldrhtssVarArrZoijcleaow;
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f4925iobyxmoadg.yggfygwlhe(obj);
        if (zoijcleaowVar == null || (vdvldrhtssVarArrZoijcleaow = zoijcleaowVar.zoijcleaow()) == null) {
            return;
        }
        for (vdvldrhtss vdvldrhtssVar : vdvldrhtssVarArrZoijcleaow) {
            if (vdvldrhtssVar != null) {
                vdvldrhtssVar.esjtqupxsv();
            }
        }
    }

    static /* synthetic */ void oxmwwwfdhm(LazyLayoutItemAnimator lazyLayoutItemAnimator, cllcsxoeiz cllcsxoeizVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        lazyLayoutItemAnimator.vdvldrhtss(cllcsxoeizVar, z13);
    }

    private final void vdvldrhtss(cllcsxoeiz cllcsxoeizVar, boolean z13) {
        Object objEablkybsjg = this.f4925iobyxmoadg.eablkybsjg(cllcsxoeizVar.getKey());
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
        vdvldrhtss[] vdvldrhtssVarArrZoijcleaow = ((zoijcleaow) objEablkybsjg).zoijcleaow();
        int length = vdvldrhtssVarArrZoijcleaow.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            vdvldrhtss vdvldrhtssVar = vdvldrhtssVarArrZoijcleaow[i13];
            int i15 = i14 + 1;
            if (vdvldrhtssVar != null) {
                long jWflxmlrfwp = cllcsxoeizVar.wflxmlrfwp(i14);
                long jKcexrzcfyt = vdvldrhtssVar.kcexrzcfyt();
                if (!w0.agtfadlqog.nufgyqmvbu(jKcexrzcfyt, vdvldrhtss.f5142kcexrzcfyt.iobyxmoadg()) && !w0.agtfadlqog.nufgyqmvbu(jKcexrzcfyt, jWflxmlrfwp)) {
                    vdvldrhtssVar.wflxmlrfwp(w0.agtfadlqog.draadjrbmk(jWflxmlrfwp, jKcexrzcfyt), z13);
                }
                vdvldrhtssVar.pkzmftpjix(jWflxmlrfwp);
            }
            i13++;
            i14 = i15;
        }
    }

    public final androidx.compose.ui.wkgbmnqykc btonecajqb() {
        return this.f4923gtknphoqwx;
    }

    public final long dxjokdxxww() {
        long jIobyxmoadg = w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        List list = this.f4921dxjokdxxww;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) list.get(i13);
            k.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = vdvldrhtssVar.rgvfuqvkyq();
            if (ppxfxbqfkfVarRgvfuqvkyq != null) {
                int iMax = Math.max((int) (jIobyxmoadg >> 32), w0.agtfadlqog.dxjokdxxww(vdvldrhtssVar.kcexrzcfyt()) + ((int) (ppxfxbqfkfVarRgvfuqvkyq.iwizpuwonk() >> 32)));
                jIobyxmoadg = w0.oxmwwwfdhm.ppxfxbqfkf((((long) Math.max((int) (jIobyxmoadg & 4294967295L), w0.agtfadlqog.btonecajqb(vdvldrhtssVar.kcexrzcfyt()) + ((int) (ppxfxbqfkfVarRgvfuqvkyq.iwizpuwonk() & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32));
            }
        }
        return jIobyxmoadg;
    }

    public final vdvldrhtss eablkybsjg(Object obj, int i13) {
        vdvldrhtss[] vdvldrhtssVarArrZoijcleaow;
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f4925iobyxmoadg.eablkybsjg(obj);
        if (zoijcleaowVar == null || (vdvldrhtssVarArrZoijcleaow = zoijcleaowVar.zoijcleaow()) == null) {
            return null;
        }
        return vdvldrhtssVarArrZoijcleaow[i13];
    }

    public final void rgvfuqvkyq() {
        agtfadlqog();
        this.f4930zoijcleaow = null;
        this.f4928ppxfxbqfkf = -1;
    }

    public final void wflxmlrfwp(int i13, int i14, int i15, List list, yadqdtsiqt yadqdtsiqtVar, stevsuqkhv stevsuqkhvVar, boolean z13, boolean z14, int i16, boolean z15, int i17, int i18, pj.cllcsxoeiz cllcsxoeizVar, h.auzgnhcxok auzgnhcxokVar) {
        yadqdtsiqt yadqdtsiqtVar2;
        yadqdtsiqt yadqdtsiqtVar3;
        int[] iArr;
        boolean z16;
        int i19;
        int[] iArr2;
        int iGxszxtbevo;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        int[] iArr3;
        boolean z17;
        int i23;
        vdvldrhtss[] vdvldrhtssVarArr;
        int i24;
        yadqdtsiqt yadqdtsiqtVar4;
        int iPpxfxbqfkf;
        long[] jArr3;
        Object[] objArr3;
        int i25;
        List list2 = list;
        int i26 = i16;
        yadqdtsiqt yadqdtsiqtVar5 = this.f4930zoijcleaow;
        this.f4930zoijcleaow = yadqdtsiqtVar;
        int size = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size) {
                if (!this.f4925iobyxmoadg.nufgyqmvbu()) {
                    break;
                }
                agtfadlqog();
                return;
            } else if (lqeggnwhkg((cllcsxoeiz) list2.get(i27))) {
                break;
            } else {
                i27++;
            }
        }
        int i28 = this.f4928ppxfxbqfkf;
        cllcsxoeiz cllcsxoeizVar2 = (cllcsxoeiz) hg.jyumaefscl.weqkydbzbr(list);
        this.f4928ppxfxbqfkf = cllcsxoeizVar2 != null ? cllcsxoeizVar2.getIndex() : 0;
        long jWkgbmnqykc = z13 ? w0.agtfadlqog.wkgbmnqykc((4294967295L & ((long) i13)) | (((long) 0) << 32)) : w0.agtfadlqog.wkgbmnqykc((4294967295L & ((long) 0)) | (((long) i13) << 32));
        boolean z18 = z14 || !z15;
        androidx.collection.dsvhmnatus dsvhmnatusVar = this.f4925iobyxmoadg;
        Object[] objArr4 = dsvhmnatusVar.f4302zoijcleaow;
        long[] jArr4 = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i29 = 0;
            while (true) {
                long j13 = jArr4[i29];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8 - ((~(i29 - length)) >>> 31);
                    int i34 = 0;
                    while (i34 < i33) {
                        if ((j13 & 255) < 128) {
                            this.f4929wkgbmnqykc.nufgyqmvbu(objArr4[(i29 << 3) + i34]);
                        }
                        j13 >>= 8;
                        i34++;
                        objArr4 = objArr4;
                        jArr4 = jArr4;
                    }
                    jArr3 = jArr4;
                    objArr3 = objArr4;
                    i25 = 1;
                    if (i33 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                    objArr3 = objArr4;
                    i25 = 1;
                }
                if (i29 == length) {
                    break;
                }
                i29 += i25;
                objArr4 = objArr3;
                jArr4 = jArr3;
            }
        }
        int size2 = list.size();
        int i35 = 0;
        while (i35 < size2) {
            cllcsxoeiz cllcsxoeizVar3 = (cllcsxoeiz) list2.get(i35);
            this.f4929wkgbmnqykc.esjtqupxsv(cllcsxoeizVar3.getKey());
            if (lqeggnwhkg(cllcsxoeizVar3)) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f4925iobyxmoadg.eablkybsjg(cllcsxoeizVar3.getKey());
                if (yadqdtsiqtVar5 != null) {
                    yadqdtsiqtVar4 = yadqdtsiqtVar5;
                    iPpxfxbqfkf = yadqdtsiqtVar4.ppxfxbqfkf(cllcsxoeizVar3.getKey());
                } else {
                    yadqdtsiqtVar4 = yadqdtsiqtVar5;
                    iPpxfxbqfkf = -1;
                }
                boolean z19 = iPpxfxbqfkf == -1 && yadqdtsiqtVar4 != null;
                if (zoijcleaowVar == null) {
                    zoijcleaow zoijcleaowVar2 = new zoijcleaow();
                    zoijcleaow.wflxmlrfwp(zoijcleaowVar2, cllcsxoeizVar3, cllcsxoeizVar, auzgnhcxokVar, i17, i18, 0, 32, null);
                    this.f4925iobyxmoadg.cqumvgiudr(cllcsxoeizVar3.getKey(), zoijcleaowVar2);
                    if (cllcsxoeizVar3.getIndex() == iPpxfxbqfkf || iPpxfxbqfkf == -1) {
                        long jWflxmlrfwp = cllcsxoeizVar3.wflxmlrfwp(0);
                        gtknphoqwx(cllcsxoeizVar3, cllcsxoeizVar3.nufgyqmvbu() ? w0.agtfadlqog.btonecajqb(jWflxmlrfwp) : w0.agtfadlqog.dxjokdxxww(jWflxmlrfwp), zoijcleaowVar2);
                        if (z19) {
                            vdvldrhtss[] vdvldrhtssVarArrZoijcleaow = zoijcleaowVar2.zoijcleaow();
                            for (vdvldrhtss vdvldrhtssVar : vdvldrhtssVarArrZoijcleaow) {
                                if (vdvldrhtssVar != null) {
                                    vdvldrhtssVar.gtknphoqwx();
                                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                }
                            }
                        }
                        gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    } else if (iPpxfxbqfkf < i28) {
                        this.f4922eablkybsjg.add(cllcsxoeizVar3);
                    } else {
                        this.f4924gxszxtbevo.add(cllcsxoeizVar3);
                    }
                    i24 = i28;
                } else {
                    if (z18) {
                        zoijcleaow.wflxmlrfwp(zoijcleaowVar, cllcsxoeizVar3, cllcsxoeizVar, auzgnhcxokVar, i17, i18, 0, 32, null);
                        vdvldrhtss[] vdvldrhtssVarArrZoijcleaow2 = zoijcleaowVar.zoijcleaow();
                        int length2 = vdvldrhtssVarArrZoijcleaow2.length;
                        int i36 = 0;
                        while (i36 < length2) {
                            vdvldrhtss vdvldrhtssVar2 = vdvldrhtssVarArrZoijcleaow2[i36];
                            vdvldrhtss[] vdvldrhtssVarArr2 = vdvldrhtssVarArrZoijcleaow2;
                            int i37 = i28;
                            if (vdvldrhtssVar2 != null && !w0.agtfadlqog.nufgyqmvbu(vdvldrhtssVar2.kcexrzcfyt(), vdvldrhtss.f5142kcexrzcfyt.iobyxmoadg())) {
                                vdvldrhtssVar2.pkzmftpjix(w0.agtfadlqog.wflxmlrfwp(vdvldrhtssVar2.kcexrzcfyt(), jWkgbmnqykc));
                            }
                            i36++;
                            i28 = i37;
                            vdvldrhtssVarArrZoijcleaow2 = vdvldrhtssVarArr2;
                        }
                        i24 = i28;
                        if (z19) {
                            for (vdvldrhtss vdvldrhtssVar3 : zoijcleaowVar.zoijcleaow()) {
                                if (vdvldrhtssVar3 != null) {
                                    if (vdvldrhtssVar3.jyumaefscl()) {
                                        this.f4921dxjokdxxww.remove(vdvldrhtssVar3);
                                        z.zdlpuopuiu zdlpuopuiuVar = this.f4920btonecajqb;
                                        if (zdlpuopuiuVar != null) {
                                            z.yggfygwlhe.iobyxmoadg(zdlpuopuiuVar);
                                            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                        }
                                    }
                                    vdvldrhtssVar3.gtknphoqwx();
                                }
                            }
                        }
                        oxmwwwfdhm(this, cllcsxoeizVar3, false, 2, null);
                    } else {
                        i24 = i28;
                    }
                    gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } else {
                i24 = i28;
                size2 = size2;
                yadqdtsiqtVar4 = yadqdtsiqtVar5;
                ojitshcjhn(cllcsxoeizVar3.getKey());
                gg.wwaezpbzkn wwaezpbzknVar5 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            i35++;
            list2 = list;
            yadqdtsiqtVar5 = yadqdtsiqtVar4;
            i28 = i24;
            size2 = size2;
        }
        yadqdtsiqt yadqdtsiqtVar6 = yadqdtsiqtVar5;
        int[] iArr4 = new int[i26];
        if (!z18 || yadqdtsiqtVar6 == null) {
            yadqdtsiqtVar2 = yadqdtsiqtVar6;
        } else {
            if (this.f4922eablkybsjg.isEmpty()) {
                yadqdtsiqtVar2 = yadqdtsiqtVar6;
            } else {
                List list3 = this.f4922eablkybsjg;
                if (list3.size() > 1) {
                    hg.jyumaefscl.zynmafqrjb(list3, new eablkybsjg(yadqdtsiqtVar6));
                }
                List list4 = this.f4922eablkybsjg;
                int size3 = list4.size();
                int i38 = 0;
                while (i38 < size3) {
                    cllcsxoeiz cllcsxoeizVar4 = (cllcsxoeiz) list4.get(i38);
                    draadjrbmk(this, cllcsxoeizVar4, i17 - kcexrzcfyt(iArr4, cllcsxoeizVar4), null, 4, null);
                    oxmwwwfdhm(this, cllcsxoeizVar4, false, 2, null);
                    i38++;
                    yadqdtsiqtVar6 = yadqdtsiqtVar6;
                }
                yadqdtsiqtVar2 = yadqdtsiqtVar6;
                hg.agtfadlqog.zynmafqrjb(iArr4, 0, 0, 0, 6, null);
            }
            if (!this.f4924gxszxtbevo.isEmpty()) {
                List list5 = this.f4924gxszxtbevo;
                if (list5.size() > 1) {
                    hg.jyumaefscl.zynmafqrjb(list5, new ppxfxbqfkf(yadqdtsiqtVar2));
                }
                List list6 = this.f4924gxszxtbevo;
                int size4 = list6.size();
                for (int i39 = 0; i39 < size4; i39++) {
                    cllcsxoeiz cllcsxoeizVar5 = (cllcsxoeiz) list6.get(i39);
                    draadjrbmk(this, cllcsxoeizVar5, (i18 + kcexrzcfyt(iArr4, cllcsxoeizVar5)) - cllcsxoeizVar5.gtknphoqwx(), null, 4, null);
                    oxmwwwfdhm(this, cllcsxoeizVar5, false, 2, null);
                }
                hg.agtfadlqog.zynmafqrjb(iArr4, 0, 0, 0, 6, null);
            }
        }
        androidx.collection.wypolnanlu wypolnanluVar = this.f4929wkgbmnqykc;
        Object[] objArr5 = wypolnanluVar.f4398zoijcleaow;
        long[] jArr5 = wypolnanluVar.f4395iobyxmoadg;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i43 = 0;
            while (true) {
                long j14 = jArr5[i43];
                long[] jArr6 = jArr5;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i44 = 8 - ((~(i43 - length3)) >>> 31);
                    int i45 = 0;
                    while (i45 < i44) {
                        if ((j14 & 255) < 128) {
                            Object obj = objArr5[(i43 << 3) + i45];
                            zoijcleaow zoijcleaowVar3 = (zoijcleaow) this.f4925iobyxmoadg.eablkybsjg(obj);
                            if (zoijcleaowVar3 == null) {
                                objArr2 = objArr5;
                                jArr2 = jArr6;
                            } else {
                                objArr2 = objArr5;
                                int iPpxfxbqfkf2 = yadqdtsiqtVar.ppxfxbqfkf(obj);
                                jArr2 = jArr6;
                                zoijcleaowVar3.gtknphoqwx(Math.min(i26, zoijcleaowVar3.nufgyqmvbu()));
                                zoijcleaowVar3.btonecajqb(Math.min(i26 - zoijcleaowVar3.nufgyqmvbu(), zoijcleaowVar3.eablkybsjg()));
                                if (iPpxfxbqfkf2 == -1) {
                                    vdvldrhtss[] vdvldrhtssVarArrZoijcleaow3 = zoijcleaowVar3.zoijcleaow();
                                    int length4 = vdvldrhtssVarArrZoijcleaow3.length;
                                    int i46 = 0;
                                    boolean z23 = false;
                                    int i47 = 0;
                                    while (i46 < length4) {
                                        int i48 = length4;
                                        vdvldrhtss vdvldrhtssVar4 = vdvldrhtssVarArrZoijcleaow3[i46];
                                        int i49 = i47 + 1;
                                        if (vdvldrhtssVar4 != null) {
                                            if (vdvldrhtssVar4.jyumaefscl()) {
                                                gg.wwaezpbzkn wwaezpbzknVar6 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                                vdvldrhtssVarArr = vdvldrhtssVarArrZoijcleaow3;
                                                z23 = true;
                                            } else if (vdvldrhtssVar4.yggfygwlhe()) {
                                                vdvldrhtssVar4.esjtqupxsv();
                                                zoijcleaowVar3.zoijcleaow()[i47] = null;
                                                vdvldrhtssVarArr = vdvldrhtssVarArrZoijcleaow3;
                                                this.f4921dxjokdxxww.remove(vdvldrhtssVar4);
                                                z.zdlpuopuiu zdlpuopuiuVar2 = this.f4920btonecajqb;
                                                if (zdlpuopuiuVar2 != null) {
                                                    z.yggfygwlhe.iobyxmoadg(zdlpuopuiuVar2);
                                                    gg.wwaezpbzkn wwaezpbzknVar7 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                                }
                                            } else {
                                                vdvldrhtssVarArr = vdvldrhtssVarArrZoijcleaow3;
                                                if (vdvldrhtssVar4.rgvfuqvkyq() != null) {
                                                    vdvldrhtssVar4.draadjrbmk();
                                                }
                                                if (vdvldrhtssVar4.jyumaefscl()) {
                                                    this.f4921dxjokdxxww.add(vdvldrhtssVar4);
                                                    z.zdlpuopuiu zdlpuopuiuVar3 = this.f4920btonecajqb;
                                                    if (zdlpuopuiuVar3 != null) {
                                                        z.yggfygwlhe.iobyxmoadg(zdlpuopuiuVar3);
                                                        gg.wwaezpbzkn wwaezpbzknVar8 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                                    }
                                                    z23 = true;
                                                } else {
                                                    vdvldrhtssVar4.esjtqupxsv();
                                                    zoijcleaowVar3.zoijcleaow()[i47] = null;
                                                }
                                                gg.wwaezpbzkn wwaezpbzknVar9 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                            }
                                            i46++;
                                            vdvldrhtssVarArrZoijcleaow3 = vdvldrhtssVarArr;
                                            length4 = i48;
                                            i47 = i49;
                                        } else {
                                            vdvldrhtssVarArr = vdvldrhtssVarArrZoijcleaow3;
                                        }
                                        i46++;
                                        vdvldrhtssVarArrZoijcleaow3 = vdvldrhtssVarArr;
                                        length4 = i48;
                                        i47 = i49;
                                    }
                                    if (!z23) {
                                        ojitshcjhn(obj);
                                    }
                                    gg.wwaezpbzkn wwaezpbzknVar10 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                } else {
                                    w0.zoijcleaow zoijcleaowVarPpxfxbqfkf = zoijcleaowVar3.ppxfxbqfkf();
                                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVarPpxfxbqfkf);
                                    cllcsxoeiz cllcsxoeizVarIobyxmoadg = stevsuqkhvVar.iobyxmoadg(iPpxfxbqfkf2, zoijcleaowVar3.eablkybsjg(), zoijcleaowVar3.nufgyqmvbu(), zoijcleaowVarPpxfxbqfkf.vdvldrhtss());
                                    cllcsxoeizVarIobyxmoadg.wkgbmnqykc(true);
                                    vdvldrhtss[] vdvldrhtssVarArrZoijcleaow4 = zoijcleaowVar3.zoijcleaow();
                                    z17 = z18;
                                    int length5 = vdvldrhtssVarArrZoijcleaow4.length;
                                    iArr3 = iArr4;
                                    int i53 = 0;
                                    while (true) {
                                        if (i53 < length5) {
                                            vdvldrhtss vdvldrhtssVar5 = vdvldrhtssVarArrZoijcleaow4[i53];
                                            vdvldrhtss[] vdvldrhtssVarArr3 = vdvldrhtssVarArrZoijcleaow4;
                                            if (vdvldrhtssVar5 != null) {
                                                i23 = 1;
                                                if (vdvldrhtssVar5.iwizpuwonk()) {
                                                }
                                            } else {
                                                i23 = 1;
                                            }
                                            i53 += i23;
                                            length5 = length5;
                                            vdvldrhtssVarArrZoijcleaow4 = vdvldrhtssVarArr3;
                                        } else if (yadqdtsiqtVar2 != null && iPpxfxbqfkf2 == yadqdtsiqtVar2.ppxfxbqfkf(obj)) {
                                            ojitshcjhn(obj);
                                            gg.wwaezpbzkn wwaezpbzknVar11 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                        }
                                        zoijcleaowVar3.draadjrbmk(cllcsxoeizVarIobyxmoadg, cllcsxoeizVar, auzgnhcxokVar, i17, i18, zoijcleaowVar3.wkgbmnqykc());
                                        if (iPpxfxbqfkf2 < this.f4928ppxfxbqfkf) {
                                            this.f4926lqeggnwhkg.add(cllcsxoeizVarIobyxmoadg);
                                        } else {
                                            this.f4927nufgyqmvbu.add(cllcsxoeizVarIobyxmoadg);
                                        }
                                    }
                                }
                                j14 >>= 8;
                                i45++;
                                i26 = i16;
                                objArr5 = objArr2;
                                jArr6 = jArr2;
                                z18 = z17;
                                iArr4 = iArr3;
                            }
                        } else {
                            objArr2 = objArr5;
                            jArr2 = jArr6;
                        }
                        iArr3 = iArr4;
                        z17 = z18;
                        j14 >>= 8;
                        i45++;
                        i26 = i16;
                        objArr5 = objArr2;
                        jArr6 = jArr2;
                        z18 = z17;
                        iArr4 = iArr3;
                    }
                    yadqdtsiqtVar3 = yadqdtsiqtVar;
                    objArr = objArr5;
                    jArr = jArr6;
                    iArr = iArr4;
                    z16 = z18;
                    i19 = 1;
                    if (i44 != 8) {
                        break;
                    }
                } else {
                    yadqdtsiqtVar3 = yadqdtsiqtVar;
                    objArr = objArr5;
                    jArr = jArr6;
                    iArr = iArr4;
                    z16 = z18;
                    i19 = 1;
                }
                if (i43 == length3) {
                    break;
                }
                i43 += i19;
                i26 = i16;
                objArr5 = objArr;
                jArr5 = jArr;
                z18 = z16;
                iArr4 = iArr;
            }
        } else {
            yadqdtsiqtVar3 = yadqdtsiqtVar;
            iArr = iArr4;
            z16 = z18;
            i19 = 1;
        }
        if (this.f4926lqeggnwhkg.isEmpty()) {
            iArr2 = iArr;
        } else {
            List list7 = this.f4926lqeggnwhkg;
            if (list7.size() > i19) {
                hg.jyumaefscl.zynmafqrjb(list7, new gxszxtbevo(yadqdtsiqtVar3));
            }
            List list8 = this.f4926lqeggnwhkg;
            int size5 = list8.size();
            int i54 = 0;
            while (i54 < size5) {
                cllcsxoeiz cllcsxoeizVar6 = (cllcsxoeiz) list8.get(i54);
                Object objEablkybsjg = this.f4925iobyxmoadg.eablkybsjg(cllcsxoeizVar6.getKey());
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
                zoijcleaow zoijcleaowVar4 = (zoijcleaow) objEablkybsjg;
                int[] iArr5 = iArr;
                cllcsxoeizVar6.btonecajqb((z14 ? nufgyqmvbu((cllcsxoeiz) hg.jyumaefscl.opjhrmiecq(list)) : zoijcleaowVar4.lqeggnwhkg()) - kcexrzcfyt(iArr5, cllcsxoeizVar6), zoijcleaowVar4.wkgbmnqykc(), i14, i15);
                if (z16) {
                    vdvldrhtss(cllcsxoeizVar6, true);
                }
                i54++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            hg.agtfadlqog.zynmafqrjb(iArr2, 0, 0, 0, 6, null);
        }
        if (!this.f4927nufgyqmvbu.isEmpty()) {
            List list9 = this.f4927nufgyqmvbu;
            if (list9.size() > 1) {
                hg.jyumaefscl.zynmafqrjb(list9, new wkgbmnqykc(yadqdtsiqtVar3));
            }
            List list10 = this.f4927nufgyqmvbu;
            int size6 = list10.size();
            for (int i55 = 0; i55 < size6; i55++) {
                cllcsxoeiz cllcsxoeizVar7 = (cllcsxoeiz) list10.get(i55);
                Object objEablkybsjg2 = this.f4925iobyxmoadg.eablkybsjg(cllcsxoeizVar7.getKey());
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg2);
                zoijcleaow zoijcleaowVar5 = (zoijcleaow) objEablkybsjg2;
                int iKcexrzcfyt = kcexrzcfyt(iArr2, cllcsxoeizVar7);
                if (z14) {
                    cllcsxoeiz cllcsxoeizVar8 = (cllcsxoeiz) hg.jyumaefscl.skhdrjzrfn(list);
                    iGxszxtbevo = nufgyqmvbu(cllcsxoeizVar8) + cllcsxoeizVar8.gtknphoqwx();
                } else {
                    iGxszxtbevo = zoijcleaowVar5.gxszxtbevo();
                }
                cllcsxoeizVar7.btonecajqb((iGxszxtbevo - cllcsxoeizVar7.gtknphoqwx()) + iKcexrzcfyt, zoijcleaowVar5.wkgbmnqykc(), i14, i15);
                if (z16) {
                    vdvldrhtss(cllcsxoeizVar7, true);
                }
            }
        }
        List list11 = this.f4926lqeggnwhkg;
        hg.jyumaefscl.jlmebxxoox(list11);
        gg.wwaezpbzkn wwaezpbzknVar12 = gg.wwaezpbzkn.f37140iobyxmoadg;
        list.addAll(0, list11);
        list.addAll(this.f4927nufgyqmvbu);
        this.f4922eablkybsjg.clear();
        this.f4924gxszxtbevo.clear();
        this.f4926lqeggnwhkg.clear();
        this.f4927nufgyqmvbu.clear();
        this.f4929wkgbmnqykc.wflxmlrfwp();
    }
}
