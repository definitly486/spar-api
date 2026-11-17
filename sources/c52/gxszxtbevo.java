package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18844iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18845ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18846zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f18847iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18848ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f18849wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18850zoijcleaow;

        public iobyxmoadg(boolean z13, String title, String str, String str2) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f18847iobyxmoadg = z13;
            this.f18850zoijcleaow = title;
            this.f18848ppxfxbqfkf = str;
            this.f18849wkgbmnqykc = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f18847iobyxmoadg == iobyxmoadgVar.f18847iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18850zoijcleaow, iobyxmoadgVar.f18850zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18848ppxfxbqfkf, iobyxmoadgVar.f18848ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18849wkgbmnqykc, iobyxmoadgVar.f18849wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f18847iobyxmoadg) * 31) + this.f18850zoijcleaow.hashCode()) * 31;
            String str = this.f18848ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18849wkgbmnqykc;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f18848ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18850zoijcleaow;
        }

        public String toString() {
            return "DataButtonParticipateBanner(isActive=" + this.f18847iobyxmoadg + ", title=" + this.f18850zoijcleaow + ", colorButton=" + this.f18848ppxfxbqfkf + ", colorText=" + this.f18849wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f18847iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f18849wkgbmnqykc;
        }
    }

    public gxszxtbevo(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18844iobyxmoadg = i13;
        this.f18846zoijcleaow = type;
        this.f18845ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f18844iobyxmoadg == gxszxtbevoVar.f18844iobyxmoadg && this.f18846zoijcleaow == gxszxtbevoVar.f18846zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18845ppxfxbqfkf, gxszxtbevoVar.f18845ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18844iobyxmoadg) * 31) + this.f18846zoijcleaow.hashCode()) * 31) + this.f18845ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18845ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonParticipateBanner(index=" + this.f18844iobyxmoadg + ", type=" + this.f18846zoijcleaow + ", data=" + this.f18845ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18844iobyxmoadg;
    }
}
