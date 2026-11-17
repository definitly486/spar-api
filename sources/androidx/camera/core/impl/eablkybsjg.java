package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final btonecajqb f3773eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f3774gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lereixgezr.iwizpuwonk f3775ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Range f3776wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Size f3777zoijcleaow;

    static final class zoijcleaow extends iwizpuwonk.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Boolean f3778eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Size f3779iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Range f3780ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private btonecajqb f3781wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private lereixgezr.iwizpuwonk f3782zoijcleaow;

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg eablkybsjg(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f3779iobyxmoadg = size;
            return this;
        }

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg gxszxtbevo(boolean z13) {
            this.f3778eablkybsjg = Boolean.valueOf(z13);
            return this;
        }

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk iobyxmoadg() {
            String str = "";
            if (this.f3779iobyxmoadg == null) {
                str = " resolution";
            }
            if (this.f3782zoijcleaow == null) {
                str = str + " dynamicRange";
            }
            if (this.f3780ppxfxbqfkf == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f3778eablkybsjg == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new eablkybsjg(this.f3779iobyxmoadg, this.f3782zoijcleaow, this.f3780ppxfxbqfkf, this.f3781wkgbmnqykc, this.f3778eablkybsjg.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg ppxfxbqfkf(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f3780ppxfxbqfkf = range;
            return this;
        }

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg wkgbmnqykc(btonecajqb btonecajqbVar) {
            this.f3781wkgbmnqykc = btonecajqbVar;
            return this;
        }

        @Override // androidx.camera.core.impl.iwizpuwonk.iobyxmoadg
        public iwizpuwonk.iobyxmoadg zoijcleaow(lereixgezr.iwizpuwonk iwizpuwonkVar) {
            if (iwizpuwonkVar == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3782zoijcleaow = iwizpuwonkVar;
            return this;
        }

        zoijcleaow() {
        }

        private zoijcleaow(iwizpuwonk iwizpuwonkVar) {
            this.f3779iobyxmoadg = iwizpuwonkVar.eablkybsjg();
            this.f3782zoijcleaow = iwizpuwonkVar.zoijcleaow();
            this.f3780ppxfxbqfkf = iwizpuwonkVar.ppxfxbqfkf();
            this.f3781wkgbmnqykc = iwizpuwonkVar.wkgbmnqykc();
            this.f3778eablkybsjg = Boolean.valueOf(iwizpuwonkVar.gxszxtbevo());
        }
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public Size eablkybsjg() {
        return this.f3777zoijcleaow;
    }

    public boolean equals(Object obj) {
        btonecajqb btonecajqbVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return this.f3777zoijcleaow.equals(iwizpuwonkVar.eablkybsjg()) && this.f3775ppxfxbqfkf.equals(iwizpuwonkVar.zoijcleaow()) && this.f3776wkgbmnqykc.equals(iwizpuwonkVar.ppxfxbqfkf()) && ((btonecajqbVar = this.f3773eablkybsjg) != null ? btonecajqbVar.equals(iwizpuwonkVar.wkgbmnqykc()) : iwizpuwonkVar.wkgbmnqykc() == null) && this.f3774gxszxtbevo == iwizpuwonkVar.gxszxtbevo();
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public boolean gxszxtbevo() {
        return this.f3774gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = (((((this.f3777zoijcleaow.hashCode() ^ 1000003) * 1000003) ^ this.f3775ppxfxbqfkf.hashCode()) * 1000003) ^ this.f3776wkgbmnqykc.hashCode()) * 1000003;
        btonecajqb btonecajqbVar = this.f3773eablkybsjg;
        return ((iHashCode ^ (btonecajqbVar == null ? 0 : btonecajqbVar.hashCode())) * 1000003) ^ (this.f3774gxszxtbevo ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public iwizpuwonk.iobyxmoadg lqeggnwhkg() {
        return new zoijcleaow(this);
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public Range ppxfxbqfkf() {
        return this.f3776wkgbmnqykc;
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f3777zoijcleaow + ", dynamicRange=" + this.f3775ppxfxbqfkf + ", expectedFrameRateRange=" + this.f3776wkgbmnqykc + ", implementationOptions=" + this.f3773eablkybsjg + ", zslDisabled=" + this.f3774gxszxtbevo + "}";
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public btonecajqb wkgbmnqykc() {
        return this.f3773eablkybsjg;
    }

    @Override // androidx.camera.core.impl.iwizpuwonk
    public lereixgezr.iwizpuwonk zoijcleaow() {
        return this.f3775ppxfxbqfkf;
    }

    private eablkybsjg(Size size, lereixgezr.iwizpuwonk iwizpuwonkVar, Range range, btonecajqb btonecajqbVar, boolean z13) {
        this.f3777zoijcleaow = size;
        this.f3775ppxfxbqfkf = iwizpuwonkVar;
        this.f3776wkgbmnqykc = range;
        this.f3773eablkybsjg = btonecajqbVar;
        this.f3774gxszxtbevo = z13;
    }
}
