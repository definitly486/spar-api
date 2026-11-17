package z;

/* JADX INFO: loaded from: classes.dex */
public final class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final uwvvkdfqfp f127306iobyxmoadg = new uwvvkdfqfp();

    public interface eablkybsjg {
        x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13);
    }

    private static final class iobyxmoadg implements x.pmvmpeiblj {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final wkgbmnqykc f127307jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ppxfxbqfkf f127308yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final x.draadjrbmk f127309zdlpuopuiu;

        public iobyxmoadg(x.draadjrbmk draadjrbmkVar, ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f127309zdlpuopuiu = draadjrbmkVar;
            this.f127308yggfygwlhe = ppxfxbqfkfVar;
            this.f127307jyumaefscl = wkgbmnqykcVar;
        }

        @Override // x.draadjrbmk
        public int czzsidtyhn(int i13) {
            return this.f127309zdlpuopuiu.czzsidtyhn(i13);
        }

        @Override // x.draadjrbmk
        public Object lqeggnwhkg() {
            return this.f127309zdlpuopuiu.lqeggnwhkg();
        }

        @Override // x.pmvmpeiblj
        public androidx.compose.ui.layout.kcexrzcfyt sflfametgt(long j13) {
            if (this.f127307jyumaefscl == wkgbmnqykc.Width) {
                return new zoijcleaow(this.f127308yggfygwlhe == ppxfxbqfkf.Max ? this.f127309zdlpuopuiu.ydmasvzmpa(w0.zoijcleaow.gtknphoqwx(j13)) : this.f127309zdlpuopuiu.czzsidtyhn(w0.zoijcleaow.gtknphoqwx(j13)), w0.zoijcleaow.lqeggnwhkg(j13) ? w0.zoijcleaow.gtknphoqwx(j13) : 32767);
            }
            return new zoijcleaow(w0.zoijcleaow.nufgyqmvbu(j13) ? w0.zoijcleaow.draadjrbmk(j13) : 32767, this.f127308yggfygwlhe == ppxfxbqfkf.Max ? this.f127309zdlpuopuiu.yggfygwlhe(w0.zoijcleaow.draadjrbmk(j13)) : this.f127309zdlpuopuiu.wypolnanlu(w0.zoijcleaow.draadjrbmk(j13)));
        }

        @Override // x.draadjrbmk
        public int wypolnanlu(int i13) {
            return this.f127309zdlpuopuiu.wypolnanlu(i13);
        }

        @Override // x.draadjrbmk
        public int ydmasvzmpa(int i13) {
            return this.f127309zdlpuopuiu.ydmasvzmpa(i13);
        }

        @Override // x.draadjrbmk
        public int yggfygwlhe(int i13) {
            return this.f127309zdlpuopuiu.yggfygwlhe(i13);
        }
    }

    private enum ppxfxbqfkf {
        Min,
        Max;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f127310iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    private enum wkgbmnqykc {
        Width,
        Height;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f127314iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    private static final class zoijcleaow extends androidx.compose.ui.layout.kcexrzcfyt {
        public zoijcleaow(int i13, int i14) {
            f(w0.oxmwwwfdhm.ppxfxbqfkf((((long) i14) & 4294967295L) | (((long) i13) << 32)));
        }

        @Override // x.cdpycssgdh
        public int cllcsxoeiz(x.iobyxmoadg iobyxmoadgVar) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.kcexrzcfyt
        protected void e(long j13, float f13, tg.draadjrbmk draadjrbmkVar) {
        }
    }

    private uwvvkdfqfp() {
    }

    public final int iobyxmoadg(eablkybsjg eablkybsjgVar, x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return eablkybsjgVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Max, wkgbmnqykc.Height), w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    public final int ppxfxbqfkf(eablkybsjg eablkybsjgVar, x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return eablkybsjgVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Min, wkgbmnqykc.Height), w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    public final int wkgbmnqykc(eablkybsjg eablkybsjgVar, x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return eablkybsjgVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Min, wkgbmnqykc.Width), w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }

    public final int zoijcleaow(eablkybsjg eablkybsjgVar, x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return eablkybsjgVar.gxszxtbevo(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), new iobyxmoadg(draadjrbmkVar, ppxfxbqfkf.Max, wkgbmnqykc.Width), w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }
}
