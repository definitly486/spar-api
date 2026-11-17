package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class wypolnanlu implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19031iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f19032ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f19033zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19034iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f19035ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f19036zoijcleaow;

        public iobyxmoadg(String image, String title, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f19034iobyxmoadg = image;
            this.f19036zoijcleaow = title;
            this.f19035ppxfxbqfkf = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19034iobyxmoadg, iobyxmoadgVar.f19034iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19036zoijcleaow, iobyxmoadgVar.f19036zoijcleaow) && this.f19035ppxfxbqfkf == iobyxmoadgVar.f19035ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f19034iobyxmoadg.hashCode() * 31) + this.f19036zoijcleaow.hashCode()) * 31) + Long.hashCode(this.f19035ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f19034iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f19036zoijcleaow;
        }

        public String toString() {
            return "TimerData(image=" + this.f19034iobyxmoadg + ", title=" + this.f19036zoijcleaow + ", secondsTillEnd=" + this.f19035ppxfxbqfkf + ")";
        }

        public final long zoijcleaow() {
            return this.f19035ppxfxbqfkf;
        }
    }

    public wypolnanlu(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f19031iobyxmoadg = i13;
        this.f19033zoijcleaow = type;
        this.f19032ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wypolnanlu)) {
            return false;
        }
        wypolnanlu wypolnanluVar = (wypolnanlu) obj;
        return this.f19031iobyxmoadg == wypolnanluVar.f19031iobyxmoadg && this.f19033zoijcleaow == wypolnanluVar.f19033zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19032ppxfxbqfkf, wypolnanluVar.f19032ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19031iobyxmoadg) * 31) + this.f19033zoijcleaow.hashCode()) * 31) + this.f19032ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f19032ppxfxbqfkf;
    }

    public String toString() {
        return "TimerModel(index=" + this.f19031iobyxmoadg + ", type=" + this.f19033zoijcleaow + ", data=" + this.f19032ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f19031iobyxmoadg;
    }
}
