package v0;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f115021ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final vdvldrhtss f115022wkgbmnqykc = new vdvldrhtss(1.0f, 0.0f);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f115023iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f115024zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final vdvldrhtss iobyxmoadg() {
            return vdvldrhtss.f115022wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public vdvldrhtss(float f13, float f14) {
        this.f115023iobyxmoadg = f13;
        this.f115024zoijcleaow = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return this.f115023iobyxmoadg == vdvldrhtssVar.f115023iobyxmoadg && this.f115024zoijcleaow == vdvldrhtssVar.f115024zoijcleaow;
    }

    public int hashCode() {
        return (Float.hashCode(this.f115023iobyxmoadg) * 31) + Float.hashCode(this.f115024zoijcleaow);
    }

    public final float ppxfxbqfkf() {
        return this.f115024zoijcleaow;
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f115023iobyxmoadg + ", skewX=" + this.f115024zoijcleaow + ')';
    }

    public final float zoijcleaow() {
        return this.f115023iobyxmoadg;
    }
}
