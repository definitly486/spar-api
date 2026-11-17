package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117763iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117764ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117765zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f117766iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f117767ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f117768wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117769zoijcleaow;

        public iobyxmoadg(boolean z13, String title, String str, String str2) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f117766iobyxmoadg = z13;
            this.f117769zoijcleaow = title;
            this.f117767ppxfxbqfkf = str;
            this.f117768wkgbmnqykc = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f117766iobyxmoadg == iobyxmoadgVar.f117766iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117769zoijcleaow, iobyxmoadgVar.f117769zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117767ppxfxbqfkf, iobyxmoadgVar.f117767ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117768wkgbmnqykc, iobyxmoadgVar.f117768wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f117766iobyxmoadg) * 31) + this.f117769zoijcleaow.hashCode()) * 31;
            String str = this.f117767ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117768wkgbmnqykc;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f117767ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f117769zoijcleaow;
        }

        public String toString() {
            return "DataButtonParticipateBanner(isActive=" + this.f117766iobyxmoadg + ", title=" + this.f117769zoijcleaow + ", colorButton=" + this.f117767ppxfxbqfkf + ", colorText=" + this.f117768wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f117766iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f117768wkgbmnqykc;
        }
    }

    public gxszxtbevo(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117763iobyxmoadg = i13;
        this.f117765zoijcleaow = type;
        this.f117764ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f117763iobyxmoadg == gxszxtbevoVar.f117763iobyxmoadg && this.f117765zoijcleaow == gxszxtbevoVar.f117765zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117764ppxfxbqfkf, gxszxtbevoVar.f117764ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117763iobyxmoadg) * 31) + this.f117765zoijcleaow.hashCode()) * 31) + this.f117764ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117764ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonParticipateBanner(index=" + this.f117763iobyxmoadg + ", type=" + this.f117765zoijcleaow + ", data=" + this.f117764ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117763iobyxmoadg;
    }
}
