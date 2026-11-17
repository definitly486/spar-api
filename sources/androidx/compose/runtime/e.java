package androidx.compose.runtime;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a0, c {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f5575eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.collection.hcddaimhww f5576gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private g f5577iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.collection.dsvhmnatus f5578lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zoijcleaow f5579ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private tg.rgvfuqvkyq f5580wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f5581zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f5574nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f5573dxjokdxxww = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final void iobyxmoadg(h0 h0Var, List list, g gVar) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object objB = h0Var.b((zoijcleaow) list.get(i13), 0);
                e eVar = objB instanceof e ? (e) objB : null;
                if (eVar != null) {
                    eVar.ppxfxbqfkf(gVar);
                }
            }
        }

        private iobyxmoadg() {
        }
    }

    public e(g gVar) {
        this.f5577iobyxmoadg = gVar;
    }

    private final void cllcsxoeiz(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 16 : i13 & (-17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[LOOP:0: B:11:0x0020->B:35:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[EDGE_INSN: B:39:0x0084->B:36:0x0084 BREAK  A[LOOP:0: B:11:0x0020->B:35:0x0081], SYNTHETIC] */
    public static final gg.wwaezpbzkn lqeggnwhkg(e eVar, int i13, androidx.collection.hcddaimhww hcddaimhwwVar, iwizpuwonk iwizpuwonkVar) {
        int i14;
        if (eVar.f5575eablkybsjg == i13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hcddaimhwwVar, eVar.f5576gxszxtbevo) && (iwizpuwonkVar instanceof pmvmpeiblj)) {
            long[] jArr = hcddaimhwwVar.f4326iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j13 = jArr[i15];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((255 & j13) < 128) {
                                int i19 = (i15 << 3) + i18;
                                Object obj = hcddaimhwwVar.f4329zoijcleaow[i19];
                                boolean z13 = hcddaimhwwVar.f4327ppxfxbqfkf[i19] != i13;
                                if (z13) {
                                    pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) iwizpuwonkVar;
                                    pmvmpeibljVar.sopmlzcsov(obj, eVar);
                                    if (obj instanceof kegysxyocb) {
                                        pmvmpeibljVar.ulzqkzuiru((kegysxyocb) obj);
                                        androidx.collection.dsvhmnatus dsvhmnatusVar = eVar.f5578lqeggnwhkg;
                                        if (dsvhmnatusVar != null) {
                                            dsvhmnatusVar.yggfygwlhe(obj);
                                        }
                                    }
                                }
                                if (z13) {
                                    hcddaimhwwVar.kcexrzcfyt(i19);
                                }
                                i14 = 8;
                            } else {
                                i14 = i16;
                            }
                            j13 >>= i14;
                            i18++;
                            i16 = i14;
                        }
                        if (i17 != i16) {
                            break;
                        }
                        if (i15 != length) {
                            break;
                        }
                        i15++;
                    }
                }
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean ojitshcjhn() {
        return (this.f5581zoijcleaow & 32) != 0;
    }

    private final void pkzmftpjix(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 32 : i13 & (-33);
    }

    private final boolean wkgbmnqykc(kegysxyocb kegysxyocbVar, androidx.collection.dsvhmnatus dsvhmnatusVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        u0 u0VarEablkybsjg = kegysxyocbVar.eablkybsjg();
        if (u0VarEablkybsjg == null) {
            u0VarEablkybsjg = v0.rgvfuqvkyq();
        }
        return !u0VarEablkybsjg.zoijcleaow(kegysxyocbVar.sopmlzcsov().iobyxmoadg(), dsvhmnatusVar.eablkybsjg(kegysxyocbVar));
    }

    public final boolean agtfadlqog() {
        return (this.f5581zoijcleaow & 8) != 0;
    }

    public final boolean btonecajqb() {
        return (this.f5581zoijcleaow & 2) != 0;
    }

    public final void cdpycssgdh(zoijcleaow zoijcleaowVar) {
        this.f5579ppxfxbqfkf = zoijcleaowVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[LOOP:0: B:18:0x002f->B:32:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    public final boolean cqumvgiudr(Object obj) {
        androidx.collection.dsvhmnatus dsvhmnatusVar;
        if (obj == null || (dsvhmnatusVar = this.f5578lqeggnwhkg) == null) {
            return true;
        }
        if (obj instanceof kegysxyocb) {
            return wkgbmnqykc((kegysxyocb) obj, dsvhmnatusVar);
        }
        if (!(obj instanceof androidx.collection.vipkmwdibw)) {
            return true;
        }
        androidx.collection.vipkmwdibw vipkmwdibwVar = (androidx.collection.vipkmwdibw) obj;
        if (vipkmwdibwVar.eablkybsjg()) {
            Object[] objArr = vipkmwdibwVar.f4398zoijcleaow;
            long[] jArr = vipkmwdibwVar.f4395iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                Object obj2 = objArr[(i13 << 3) + i15];
                                if (!(obj2 instanceof kegysxyocb) || wkgbmnqykc((kegysxyocb) obj2, dsvhmnatusVar)) {
                                    return true;
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i14 == 8) {
                            if (i13 != length) {
                                i13++;
                            }
                        }
                    } else if (i13 != length) {
                        i13++;
                    }
                }
            }
        }
        return false;
    }

    public final boolean draadjrbmk() {
        return (this.f5581zoijcleaow & 64) != 0;
    }

    public final void dsvhmnatus(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 1 : i13 & (-2);
    }

    public final boolean dxjokdxxww() {
        return this.f5580wkgbmnqykc != null;
    }

    public final void eablkybsjg(draadjrbmk draadjrbmkVar) {
        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f5580wkgbmnqykc;
        if (rgvfuqvkyqVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        rgvfuqvkyqVar.invoke(draadjrbmkVar, 1);
    }

    public final void esjtqupxsv(kegysxyocb kegysxyocbVar, Object obj) {
        androidx.collection.dsvhmnatus dsvhmnatusVar = this.f5578lqeggnwhkg;
        if (dsvhmnatusVar == null) {
            dsvhmnatusVar = new androidx.collection.dsvhmnatus(0, 1, null);
            this.f5578lqeggnwhkg = dsvhmnatusVar;
        }
        dsvhmnatusVar.cqumvgiudr(kegysxyocbVar, obj);
    }

    public final boolean gtknphoqwx() {
        return (this.f5581zoijcleaow & 4) != 0;
    }

    public final tg.draadjrbmk gxszxtbevo(final int i13) {
        final androidx.collection.hcddaimhww hcddaimhwwVar = this.f5576gxszxtbevo;
        if (hcddaimhwwVar == null || kcexrzcfyt()) {
            return null;
        }
        Object[] objArr = hcddaimhwwVar.f4329zoijcleaow;
        int[] iArr = hcddaimhwwVar.f4327ppxfxbqfkf;
        long[] jArr = hcddaimhwwVar.f4326iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i14 = 0;
        while (true) {
            long j13 = jArr[i14];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j13) < 128) {
                        int i17 = (i14 << 3) + i16;
                        Object obj = objArr[i17];
                        if (iArr[i17] != i13) {
                            return new tg.draadjrbmk() { // from class: androidx.compose.runtime.d
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj2) {
                                    return e.lqeggnwhkg(this.f5553zdlpuopuiu, i13, hcddaimhwwVar, (iwizpuwonk) obj2);
                                }
                            };
                        }
                    }
                    j13 >>= 8;
                }
                if (i15 != 8) {
                    return null;
                }
            }
            if (i14 == length) {
                return null;
            }
            i14++;
        }
    }

    public final void hcddaimhww(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | UserVerificationMethods.USER_VERIFY_ALL : i13 & (-1025);
    }

    public final void hkdspvbjdz(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | UserVerificationMethods.USER_VERIFY_PATTERN : i13 & (-129);
    }

    @Override // androidx.compose.runtime.c
    public void invalidate() {
        g gVar = this.f5577iobyxmoadg;
        if (gVar != null) {
            gVar.lqeggnwhkg(this, null);
        }
    }

    @Override // androidx.compose.runtime.a0
    public void iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f5580wkgbmnqykc = rgvfuqvkyqVar;
    }

    public final void iozdgvuglv(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 4 : i13 & (-5);
    }

    public final void istkbnxepw() {
        if (oxmwwwfdhm()) {
            return;
        }
        cllcsxoeiz(true);
    }

    public final boolean iwizpuwonk() {
        return this.f5578lqeggnwhkg != null;
    }

    public final void jpowsppfya(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | UserVerificationMethods.USER_VERIFY_NONE : i13 & (-513);
    }

    public final czzsidtyhn jyumaefscl(Object obj) {
        czzsidtyhn czzsidtyhnVarLqeggnwhkg;
        g gVar = this.f5577iobyxmoadg;
        return (gVar == null || (czzsidtyhnVarLqeggnwhkg = gVar.lqeggnwhkg(this, obj)) == null) ? czzsidtyhn.IGNORED : czzsidtyhnVarLqeggnwhkg;
    }

    public final boolean kcexrzcfyt() {
        return (this.f5581zoijcleaow & 16) != 0;
    }

    public final boolean lereixgezr(Object obj) {
        int i13 = 0;
        if (ojitshcjhn()) {
            return false;
        }
        androidx.collection.hcddaimhww hcddaimhwwVar = this.f5576gxszxtbevo;
        int i14 = 1;
        if (hcddaimhwwVar == null) {
            hcddaimhwwVar = new androidx.collection.hcddaimhww(i13, i14, null);
            this.f5576gxszxtbevo = hcddaimhwwVar;
        }
        return hcddaimhwwVar.vdvldrhtss(obj, this.f5575eablkybsjg, -1) == this.f5575eablkybsjg;
    }

    public final void lmojexxdyd(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 64 : i13 & (-65);
    }

    public final zoijcleaow nufgyqmvbu() {
        return this.f5579ppxfxbqfkf;
    }

    public final boolean oxmwwwfdhm() {
        return (this.f5581zoijcleaow & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    public final void pmvmpeiblj() {
        g gVar = this.f5577iobyxmoadg;
        if (gVar != null) {
            gVar.eablkybsjg(this);
        }
        this.f5577iobyxmoadg = null;
        this.f5576gxszxtbevo = null;
        this.f5578lqeggnwhkg = null;
        this.f5580wkgbmnqykc = null;
    }

    public final void ppxfxbqfkf(g gVar) {
        this.f5577iobyxmoadg = gVar;
    }

    public final boolean rgvfuqvkyq() {
        return (this.f5581zoijcleaow & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    public final boolean vdvldrhtss() {
        return (this.f5581zoijcleaow & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    public final boolean wflxmlrfwp() {
        return (this.f5581zoijcleaow & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
    }

    public final void wwaezpbzkn(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | UserVerificationMethods.USER_VERIFY_HANDPRINT : i13 & (-257);
    }

    public final void wypolnanlu(int i13) {
        this.f5575eablkybsjg = i13;
        cllcsxoeiz(false);
    }

    public final void yadqdtsiqt(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 2 : i13 & (-3);
    }

    public final boolean yggfygwlhe() {
        if (this.f5577iobyxmoadg == null) {
            return false;
        }
        zoijcleaow zoijcleaowVar = this.f5579ppxfxbqfkf;
        return zoijcleaowVar != null ? zoijcleaowVar.zoijcleaow() : false;
    }

    public final void ylkuphrtab(boolean z13) {
        int i13 = this.f5581zoijcleaow;
        this.f5581zoijcleaow = z13 ? i13 | 8 : i13 & (-9);
    }

    public final boolean zdlpuopuiu() {
        return (this.f5581zoijcleaow & 1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[EDGE_INSN: B:31:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void zynmafqrjb() {
        androidx.collection.hcddaimhww hcddaimhwwVar;
        g gVar = this.f5577iobyxmoadg;
        if (gVar == null || (hcddaimhwwVar = this.f5576gxszxtbevo) == null) {
            return;
        }
        pkzmftpjix(true);
        try {
            Object[] objArr = hcddaimhwwVar.f4329zoijcleaow;
            int[] iArr = hcddaimhwwVar.f4327ppxfxbqfkf;
            long[] jArr = hcddaimhwwVar.f4326iobyxmoadg;
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
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                int i17 = iArr[i16];
                                gVar.ppxfxbqfkf(obj);
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
        } finally {
            pkzmftpjix(false);
        }
    }
}
