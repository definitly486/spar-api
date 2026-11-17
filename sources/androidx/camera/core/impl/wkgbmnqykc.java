package androidx.camera.core.impl;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends jyumaefscl.gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f3866eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lereixgezr.iwizpuwonk f3867gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DeferrableSurface f3868iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f3869ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f3870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f3871zoijcleaow;

    static final class zoijcleaow extends jyumaefscl.gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Integer f3872eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private lereixgezr.iwizpuwonk f3873gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private DeferrableSurface f3874iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f3875ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Integer f3876wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f3877zoijcleaow;

        zoijcleaow() {
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo.iobyxmoadg eablkybsjg(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f3877zoijcleaow = list;
            return this;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo.iobyxmoadg gxszxtbevo(int i13) {
            this.f3872eablkybsjg = Integer.valueOf(i13);
            return this;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo iobyxmoadg() {
            String str = "";
            if (this.f3874iobyxmoadg == null) {
                str = " surface";
            }
            if (this.f3877zoijcleaow == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f3876wkgbmnqykc == null) {
                str = str + " mirrorMode";
            }
            if (this.f3872eablkybsjg == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f3873gxszxtbevo == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new wkgbmnqykc(this.f3874iobyxmoadg, this.f3877zoijcleaow, this.f3875ppxfxbqfkf, this.f3876wkgbmnqykc.intValue(), this.f3872eablkybsjg.intValue(), this.f3873gxszxtbevo);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public jyumaefscl.gxszxtbevo.iobyxmoadg lqeggnwhkg(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f3874iobyxmoadg = deferrableSurface;
            return this;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo.iobyxmoadg ppxfxbqfkf(int i13) {
            this.f3876wkgbmnqykc = Integer.valueOf(i13);
            return this;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo.iobyxmoadg wkgbmnqykc(String str) {
            this.f3875ppxfxbqfkf = str;
            return this;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo.iobyxmoadg
        public jyumaefscl.gxszxtbevo.iobyxmoadg zoijcleaow(lereixgezr.iwizpuwonk iwizpuwonkVar) {
            if (iwizpuwonkVar == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3873gxszxtbevo = iwizpuwonkVar;
            return this;
        }
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public List eablkybsjg() {
        return this.f3871zoijcleaow;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jyumaefscl.gxszxtbevo)) {
            return false;
        }
        jyumaefscl.gxszxtbevo gxszxtbevoVar = (jyumaefscl.gxszxtbevo) obj;
        return this.f3868iobyxmoadg.equals(gxszxtbevoVar.gxszxtbevo()) && this.f3871zoijcleaow.equals(gxszxtbevoVar.eablkybsjg()) && ((str = this.f3869ppxfxbqfkf) != null ? str.equals(gxszxtbevoVar.wkgbmnqykc()) : gxszxtbevoVar.wkgbmnqykc() == null) && this.f3870wkgbmnqykc == gxszxtbevoVar.ppxfxbqfkf() && this.f3866eablkybsjg == gxszxtbevoVar.lqeggnwhkg() && this.f3867gxszxtbevo.equals(gxszxtbevoVar.zoijcleaow());
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public DeferrableSurface gxszxtbevo() {
        return this.f3868iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = (((this.f3868iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f3871zoijcleaow.hashCode()) * 1000003;
        String str = this.f3869ppxfxbqfkf;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3870wkgbmnqykc) * 1000003) ^ this.f3866eablkybsjg) * 1000003) ^ this.f3867gxszxtbevo.hashCode();
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public int lqeggnwhkg() {
        return this.f3866eablkybsjg;
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public int ppxfxbqfkf() {
        return this.f3870wkgbmnqykc;
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f3868iobyxmoadg + ", sharedSurfaces=" + this.f3871zoijcleaow + ", physicalCameraId=" + this.f3869ppxfxbqfkf + ", mirrorMode=" + this.f3870wkgbmnqykc + ", surfaceGroupId=" + this.f3866eablkybsjg + ", dynamicRange=" + this.f3867gxszxtbevo + "}";
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public String wkgbmnqykc() {
        return this.f3869ppxfxbqfkf;
    }

    @Override // androidx.camera.core.impl.jyumaefscl.gxszxtbevo
    public lereixgezr.iwizpuwonk zoijcleaow() {
        return this.f3867gxszxtbevo;
    }

    private wkgbmnqykc(DeferrableSurface deferrableSurface, List list, String str, int i13, int i14, lereixgezr.iwizpuwonk iwizpuwonkVar) {
        this.f3868iobyxmoadg = deferrableSurface;
        this.f3871zoijcleaow = list;
        this.f3869ppxfxbqfkf = str;
        this.f3870wkgbmnqykc = i13;
        this.f3866eablkybsjg = i14;
        this.f3867gxszxtbevo = iwizpuwonkVar;
    }
}
