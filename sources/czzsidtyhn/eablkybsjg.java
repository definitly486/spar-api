package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f26292iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final InterfaceC0470eablkybsjg f26297zoijcleaow = new gtknphoqwx();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final InterfaceC0470eablkybsjg f26295ppxfxbqfkf = new wkgbmnqykc();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final wflxmlrfwp f26296wkgbmnqykc = new draadjrbmk();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final wflxmlrfwp f26290eablkybsjg = new zoijcleaow();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final gxszxtbevo f26291gxszxtbevo = new ppxfxbqfkf();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final gxszxtbevo f26293lqeggnwhkg = new dxjokdxxww();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final gxszxtbevo f26294nufgyqmvbu = new nufgyqmvbu();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final gxszxtbevo f26289dxjokdxxww = new lqeggnwhkg();

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f26298iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final tg.rgvfuqvkyq f26299ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f26300wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f26301zoijcleaow;

        public /* synthetic */ btonecajqb(float f13, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(f13, z13, rgvfuqvkyqVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return w0.nufgyqmvbu.dxjokdxxww(this.f26298iobyxmoadg, btonecajqbVar.f26298iobyxmoadg) && this.f26301zoijcleaow == btonecajqbVar.f26301zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26299ppxfxbqfkf, btonecajqbVar.f26299ppxfxbqfkf);
        }

        public int hashCode() {
            int iBtonecajqb = ((w0.nufgyqmvbu.btonecajqb(this.f26298iobyxmoadg) * 31) + Boolean.hashCode(this.f26301zoijcleaow)) * 31;
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f26299ppxfxbqfkf;
            return iBtonecajqb + (rgvfuqvkyqVar == null ? 0 : rgvfuqvkyqVar.hashCode());
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg, czzsidtyhn.eablkybsjg.wflxmlrfwp
        public float iobyxmoadg() {
            return this.f26300wkgbmnqykc;
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            int i14;
            int i15;
            if (iArr.length == 0) {
                return;
            }
            int iHszhottldk = wkgbmnqykcVar.hszhottldk(this.f26298iobyxmoadg);
            boolean z13 = this.f26301zoijcleaow && zdlpuopuiuVar == w0.zdlpuopuiu.Rtl;
            eablkybsjg eablkybsjgVar = eablkybsjg.f26292iobyxmoadg;
            if (z13) {
                int length = iArr.length - 1;
                i14 = 0;
                i15 = 0;
                while (-1 < length) {
                    int i16 = iArr[length];
                    int iMin = Math.min(i14, i13 - i16);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iHszhottldk, (i13 - iMin) - i16);
                    int i17 = iArr2[length] + i16 + iMin2;
                    length--;
                    i15 = iMin2;
                    i14 = i17;
                }
            } else {
                int length2 = iArr.length;
                int i18 = 0;
                i14 = 0;
                i15 = 0;
                int i19 = 0;
                while (i18 < length2) {
                    int i23 = iArr[i18];
                    int iMin3 = Math.min(i14, i13 - i23);
                    iArr2[i19] = iMin3;
                    int iMin4 = Math.min(iHszhottldk, (i13 - iMin3) - i23);
                    int i24 = iArr2[i19] + i23 + iMin4;
                    i18++;
                    i19++;
                    i15 = iMin4;
                    i14 = i24;
                }
            }
            int i25 = i14 - i15;
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f26299ppxfxbqfkf;
            if (rgvfuqvkyqVar == null || i25 >= i13) {
                return;
            }
            int iIntValue = ((Number) rgvfuqvkyqVar.invoke(Integer.valueOf(i13 - i25), zdlpuopuiuVar)).intValue();
            int length3 = iArr2.length;
            for (int i26 = 0; i26 < length3; i26++) {
                iArr2[i26] = iArr2[i26] + iIntValue;
            }
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f26301zoijcleaow ? "" : "Absolute");
            sb3.append("Arrangement#spacedAligned(");
            sb3.append((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26298iobyxmoadg));
            sb3.append(", ");
            sb3.append(this.f26299ppxfxbqfkf);
            sb3.append(')');
            return sb3.toString();
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            ppxfxbqfkf(wkgbmnqykcVar, i13, iArr, w0.zdlpuopuiu.Ltr, iArr2);
        }

        private btonecajqb(float f13, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f26298iobyxmoadg = f13;
            this.f26301zoijcleaow = z13;
            this.f26299ppxfxbqfkf = rgvfuqvkyqVar;
            this.f26300wkgbmnqykc = f13;
        }
    }

    public static final class draadjrbmk implements wflxmlrfwp {
        draadjrbmk() {
        }

        public String toString() {
            return "Arrangement#Top";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.gtknphoqwx(iArr, iArr2, false);
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f26302iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(0);

        dxjokdxxww() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg, czzsidtyhn.eablkybsjg.wflxmlrfwp
        public float iobyxmoadg() {
            return this.f26302iobyxmoadg;
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.ojitshcjhn(i13, iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.ojitshcjhn(i13, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.ojitshcjhn(i13, iArr, iArr2, false);
        }
    }

    /* JADX INFO: renamed from: czzsidtyhn.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public interface InterfaceC0470eablkybsjg {
        default float iobyxmoadg() {
            return w0.nufgyqmvbu.lqeggnwhkg(0);
        }

        void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2);
    }

    public static final class gtknphoqwx implements InterfaceC0470eablkybsjg {
        gtknphoqwx() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.gtknphoqwx(iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.draadjrbmk(i13, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    public interface gxszxtbevo extends InterfaceC0470eablkybsjg, wflxmlrfwp {
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f26305iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26309zoijcleaow = new zoijcleaow();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26307ppxfxbqfkf = new C0472iobyxmoadg();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26308wkgbmnqykc = new ppxfxbqfkf();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26303eablkybsjg = new C0471eablkybsjg();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26304gxszxtbevo = new gxszxtbevo();

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static final InterfaceC0470eablkybsjg f26306lqeggnwhkg = new wkgbmnqykc();

        /* JADX INFO: renamed from: czzsidtyhn.eablkybsjg$iobyxmoadg$eablkybsjg, reason: collision with other inner class name */
        public static final class C0471eablkybsjg implements InterfaceC0470eablkybsjg {
            C0471eablkybsjg() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.agtfadlqog(i13, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class gxszxtbevo implements InterfaceC0470eablkybsjg {
            gxszxtbevo() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.ojitshcjhn(i13, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        /* JADX INFO: renamed from: czzsidtyhn.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0472iobyxmoadg implements InterfaceC0470eablkybsjg {
            C0472iobyxmoadg() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.btonecajqb(i13, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        public static final class ppxfxbqfkf implements InterfaceC0470eablkybsjg {
            ppxfxbqfkf() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.draadjrbmk(i13, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class wkgbmnqykc implements InterfaceC0470eablkybsjg {
            wkgbmnqykc() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.wflxmlrfwp(i13, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class zoijcleaow implements InterfaceC0470eablkybsjg {
            zoijcleaow() {
            }

            @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
            public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
                eablkybsjg.f26292iobyxmoadg.gtknphoqwx(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        private iobyxmoadg() {
        }

        public final InterfaceC0470eablkybsjg iobyxmoadg() {
            return f26309zoijcleaow;
        }

        public final InterfaceC0470eablkybsjg ppxfxbqfkf() {
            return f26303eablkybsjg;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final gxszxtbevo wkgbmnqykc(float f13) {
            return new btonecajqb(f13, false, null, 0 == true ? 1 : 0);
        }

        public final InterfaceC0470eablkybsjg zoijcleaow() {
            return f26308wkgbmnqykc;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f26310iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(0);

        lqeggnwhkg() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg, czzsidtyhn.eablkybsjg.wflxmlrfwp
        public float iobyxmoadg() {
            return this.f26310iobyxmoadg;
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.wflxmlrfwp(i13, iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.wflxmlrfwp(i13, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.wflxmlrfwp(i13, iArr, iArr2, false);
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f26311iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(0);

        nufgyqmvbu() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg, czzsidtyhn.eablkybsjg.wflxmlrfwp
        public float iobyxmoadg() {
            return this.f26311iobyxmoadg;
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.agtfadlqog(i13, iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.agtfadlqog(i13, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.agtfadlqog(i13, iArr, iArr2, false);
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f26312iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(0);

        ppxfxbqfkf() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg, czzsidtyhn.eablkybsjg.wflxmlrfwp
        public float iobyxmoadg() {
            return this.f26312iobyxmoadg;
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.btonecajqb(i13, iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.btonecajqb(i13, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.btonecajqb(i13, iArr, iArr2, false);
        }
    }

    public interface wflxmlrfwp {
        default float iobyxmoadg() {
            return w0.nufgyqmvbu.lqeggnwhkg(0);
        }

        void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2);
    }

    public static final class wkgbmnqykc implements InterfaceC0470eablkybsjg {
        wkgbmnqykc() {
        }

        @Override // czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg
        public void ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, w0.zdlpuopuiu zdlpuopuiuVar, int[] iArr2) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                eablkybsjg.f26292iobyxmoadg.draadjrbmk(i13, iArr, iArr2, false);
            } else {
                eablkybsjg.f26292iobyxmoadg.gtknphoqwx(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    public static final class zoijcleaow implements wflxmlrfwp {
        zoijcleaow() {
        }

        public String toString() {
            return "Arrangement#Bottom";
        }

        @Override // czzsidtyhn.eablkybsjg.wflxmlrfwp
        public void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int[] iArr, int[] iArr2) {
            eablkybsjg.f26292iobyxmoadg.draadjrbmk(i13, iArr, iArr2, false);
        }
    }

    private eablkybsjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vdvldrhtss(int i13, w0.zdlpuopuiu zdlpuopuiuVar) {
        return a.eablkybsjg.f20iobyxmoadg.gtknphoqwx().iobyxmoadg(0, i13, zdlpuopuiuVar);
    }

    public final void agtfadlqog(int i13, int[] iArr, int[] iArr2, boolean z13) {
        if (iArr.length == 0) {
            return;
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float fMax = (i13 - i15) / Math.max(hg.agtfadlqog.oipsdeybqn(iArr), 1);
        float f13 = (z13 && iArr.length == 1) ? fMax : 0.0f;
        if (z13) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i17 = iArr[length];
                iArr2[length] = Math.round(f13);
                f13 += i17 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i18 = 0;
        while (i14 < length2) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f13);
            f13 += i19 + fMax;
            i14++;
            i18++;
        }
    }

    public final void btonecajqb(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float f13 = (i13 - i15) / 2;
        if (!z13) {
            int length = iArr.length;
            int i17 = 0;
            while (i14 < length) {
                int i18 = iArr[i14];
                iArr2[i17] = Math.round(f13);
                f13 += i18;
                i14++;
                i17++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i19 = iArr[length2];
            iArr2[length2] = Math.round(f13);
            f13 += i19;
        }
    }

    public final void draadjrbmk(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        int i17 = i13 - i15;
        if (!z13) {
            int length = iArr.length;
            int i18 = 0;
            while (i14 < length) {
                int i19 = iArr[i14];
                iArr2[i18] = i17;
                i17 += i19;
                i14++;
                i18++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i23 = iArr[length2];
            iArr2[length2] = i17;
            i17 += i23;
        }
    }

    public final wflxmlrfwp dxjokdxxww() {
        return f26296wkgbmnqykc;
    }

    public final gxszxtbevo eablkybsjg() {
        return f26289dxjokdxxww;
    }

    public final void gtknphoqwx(int[] iArr, int[] iArr2, boolean z13) {
        int i13 = 0;
        if (!z13) {
            int length = iArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = iArr[i13];
                iArr2[i14] = i15;
                i15 += i16;
                i13++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i17;
        }
    }

    public final gxszxtbevo gxszxtbevo() {
        return f26294nufgyqmvbu;
    }

    public final gxszxtbevo lqeggnwhkg() {
        return f26293lqeggnwhkg;
    }

    public final InterfaceC0470eablkybsjg nufgyqmvbu() {
        return f26297zoijcleaow;
    }

    public final void ojitshcjhn(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = (i13 - i15) / (iArr.length + 1);
        if (z13) {
            float f13 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                iArr2[length2] = Math.round(f13);
                f13 += i17 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f14 = length;
        int i18 = 0;
        while (i14 < length3) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f14);
            f14 += i19 + length;
            i14++;
            i18++;
        }
    }

    public final gxszxtbevo ppxfxbqfkf() {
        return f26291gxszxtbevo;
    }

    public final gxszxtbevo rgvfuqvkyq(float f13) {
        return new btonecajqb(f13, true, new tg.rgvfuqvkyq() { // from class: czzsidtyhn.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(eablkybsjg.vdvldrhtss(((Integer) obj).intValue(), (w0.zdlpuopuiu) obj2));
            }
        }, null);
    }

    public final void wflxmlrfwp(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = !(iArr.length == 0) ? (i13 - i15) / iArr.length : 0.0f;
        float f13 = length / 2;
        if (z13) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                iArr2[length2] = Math.round(f13);
                f13 += i17 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i18 = 0;
        while (i14 < length3) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f13);
            f13 += i19 + length;
            i14++;
            i18++;
        }
    }

    public final InterfaceC0470eablkybsjg wkgbmnqykc() {
        return f26295ppxfxbqfkf;
    }

    public final wflxmlrfwp zoijcleaow() {
        return f26290eablkybsjg;
    }
}
