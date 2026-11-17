package ah;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f1899ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final vdvldrhtss f1900wkgbmnqykc = new vdvldrhtss(null, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f1901iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f1902zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final vdvldrhtss iobyxmoadg(ojitshcjhn type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            return new vdvldrhtss(oxmwwwfdhm.IN, type);
        }

        public final vdvldrhtss ppxfxbqfkf() {
            return vdvldrhtss.f1900wkgbmnqykc;
        }

        public final vdvldrhtss wkgbmnqykc(ojitshcjhn type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            return new vdvldrhtss(oxmwwwfdhm.INVARIANT, type);
        }

        public final vdvldrhtss zoijcleaow(ojitshcjhn type) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            return new vdvldrhtss(oxmwwwfdhm.OUT, type);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f1903iobyxmoadg;

        static {
            int[] iArr = new int[oxmwwwfdhm.values().length];
            try {
                iArr[oxmwwwfdhm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oxmwwwfdhm.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oxmwwwfdhm.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1903iobyxmoadg = iArr;
        }
    }

    public vdvldrhtss(oxmwwwfdhm oxmwwwfdhmVar, ojitshcjhn ojitshcjhnVar) {
        String str;
        this.f1901iobyxmoadg = oxmwwwfdhmVar;
        this.f1902zoijcleaow = ojitshcjhnVar;
        if ((oxmwwwfdhmVar == null) == (ojitshcjhnVar == null)) {
            return;
        }
        if (oxmwwwfdhmVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + oxmwwwfdhmVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return this.f1901iobyxmoadg == vdvldrhtssVar.f1901iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f1902zoijcleaow, vdvldrhtssVar.f1902zoijcleaow);
    }

    public int hashCode() {
        oxmwwwfdhm oxmwwwfdhmVar = this.f1901iobyxmoadg;
        int iHashCode = (oxmwwwfdhmVar == null ? 0 : oxmwwwfdhmVar.hashCode()) * 31;
        ojitshcjhn ojitshcjhnVar = this.f1902zoijcleaow;
        return iHashCode + (ojitshcjhnVar != null ? ojitshcjhnVar.hashCode() : 0);
    }

    public final oxmwwwfdhm iobyxmoadg() {
        return this.f1901iobyxmoadg;
    }

    public final ojitshcjhn ppxfxbqfkf() {
        return this.f1902zoijcleaow;
    }

    public String toString() {
        oxmwwwfdhm oxmwwwfdhmVar = this.f1901iobyxmoadg;
        int i13 = oxmwwwfdhmVar == null ? -1 : zoijcleaow.f1903iobyxmoadg[oxmwwwfdhmVar.ordinal()];
        if (i13 == -1) {
            return "*";
        }
        if (i13 == 1) {
            return String.valueOf(this.f1902zoijcleaow);
        }
        if (i13 == 2) {
            return "in " + this.f1902zoijcleaow;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f1902zoijcleaow;
    }

    public final oxmwwwfdhm wkgbmnqykc() {
        return this.f1901iobyxmoadg;
    }

    public final ojitshcjhn zoijcleaow() {
        return this.f1902zoijcleaow;
    }
}
