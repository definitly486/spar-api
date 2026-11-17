package x;

/* JADX INFO: loaded from: classes.dex */
final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yadqdtsiqt f120863iobyxmoadg = new yadqdtsiqt();

    private static final class iobyxmoadg implements pmvmpeiblj {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final wkgbmnqykc f120864jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ppxfxbqfkf f120865yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final draadjrbmk f120866zdlpuopuiu;

        public iobyxmoadg(draadjrbmk draadjrbmkVar, ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f120866zdlpuopuiu = draadjrbmkVar;
            this.f120865yggfygwlhe = ppxfxbqfkfVar;
            this.f120864jyumaefscl = wkgbmnqykcVar;
        }

        @Override // x.draadjrbmk
        public int czzsidtyhn(int i13) {
            return this.f120866zdlpuopuiu.czzsidtyhn(i13);
        }

        @Override // x.draadjrbmk
        public Object lqeggnwhkg() {
            return this.f120866zdlpuopuiu.lqeggnwhkg();
        }

        @Override // x.pmvmpeiblj
        public androidx.compose.ui.layout.kcexrzcfyt sflfametgt(long j13) {
            if (this.f120864jyumaefscl == wkgbmnqykc.Width) {
                return new zoijcleaow(this.f120865yggfygwlhe == ppxfxbqfkf.Max ? this.f120866zdlpuopuiu.ydmasvzmpa(w0.zoijcleaow.gtknphoqwx(j13)) : this.f120866zdlpuopuiu.czzsidtyhn(w0.zoijcleaow.gtknphoqwx(j13)), w0.zoijcleaow.lqeggnwhkg(j13) ? w0.zoijcleaow.gtknphoqwx(j13) : 32767);
            }
            return new zoijcleaow(w0.zoijcleaow.nufgyqmvbu(j13) ? w0.zoijcleaow.draadjrbmk(j13) : 32767, this.f120865yggfygwlhe == ppxfxbqfkf.Max ? this.f120866zdlpuopuiu.yggfygwlhe(w0.zoijcleaow.draadjrbmk(j13)) : this.f120866zdlpuopuiu.wypolnanlu(w0.zoijcleaow.draadjrbmk(j13)));
        }

        @Override // x.draadjrbmk
        public int wypolnanlu(int i13) {
            return this.f120866zdlpuopuiu.wypolnanlu(i13);
        }

        @Override // x.draadjrbmk
        public int ydmasvzmpa(int i13) {
            return this.f120866zdlpuopuiu.ydmasvzmpa(i13);
        }

        @Override // x.draadjrbmk
        public int yggfygwlhe(int i13) {
            return this.f120866zdlpuopuiu.yggfygwlhe(i13);
        }
    }

    private enum ppxfxbqfkf {
        Min,
        Max;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f120867iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    private enum wkgbmnqykc {
        Width,
        Height;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f120871iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    private static final class zoijcleaow extends androidx.compose.ui.layout.kcexrzcfyt {
        public zoijcleaow(int i13, int i14) {
            f(w0.oxmwwwfdhm.ppxfxbqfkf((((long) i14) & 4294967295L) | (((long) i13) << 32)));
        }

        @Override // x.cdpycssgdh
        public int cllcsxoeiz(x.iobyxmoadg iobyxmoadgVar) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.kcexrzcfyt
        public void e(long j13, float f13, tg.draadjrbmk draadjrbmkVar) {
        }
    }

    private yadqdtsiqt() {
    }

    public final int iobyxmoadg(jyumaefscl jyumaefsclVar, wflxmlrfwp wflxmlrfwpVar, draadjrbmk draadjrbmkVar, int i13) {
        return jyumaefsclVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Max, wkgbmnqykc.Height), w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    public final int ppxfxbqfkf(jyumaefscl jyumaefsclVar, wflxmlrfwp wflxmlrfwpVar, draadjrbmk draadjrbmkVar, int i13) {
        return jyumaefsclVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Min, wkgbmnqykc.Height), w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    public final int wkgbmnqykc(jyumaefscl jyumaefsclVar, wflxmlrfwp wflxmlrfwpVar, draadjrbmk draadjrbmkVar, int i13) {
        return jyumaefsclVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Min, wkgbmnqykc.Width), w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }

    public final int zoijcleaow(jyumaefscl jyumaefsclVar, wflxmlrfwp wflxmlrfwpVar, draadjrbmk draadjrbmkVar, int i13) {
        return jyumaefsclVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Max, wkgbmnqykc.Width), w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }
}
