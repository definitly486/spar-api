package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class wypolnanlu implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117951iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117952ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117953zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117954iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f117955ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117956zoijcleaow;

        public iobyxmoadg(String image, String title, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(image, "image");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            this.f117954iobyxmoadg = image;
            this.f117956zoijcleaow = title;
            this.f117955ppxfxbqfkf = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117954iobyxmoadg, iobyxmoadgVar.f117954iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117956zoijcleaow, iobyxmoadgVar.f117956zoijcleaow) && this.f117955ppxfxbqfkf == iobyxmoadgVar.f117955ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f117954iobyxmoadg.hashCode() * 31) + this.f117956zoijcleaow.hashCode()) * 31) + Long.hashCode(this.f117955ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f117954iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f117956zoijcleaow;
        }

        public String toString() {
            return "TimerData(image=" + this.f117954iobyxmoadg + ", title=" + this.f117956zoijcleaow + ", secondsTillEnd=" + this.f117955ppxfxbqfkf + ")";
        }

        public final long zoijcleaow() {
            return this.f117955ppxfxbqfkf;
        }
    }

    public wypolnanlu(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117951iobyxmoadg = i13;
        this.f117953zoijcleaow = type;
        this.f117952ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wypolnanlu)) {
            return false;
        }
        wypolnanlu wypolnanluVar = (wypolnanlu) obj;
        return this.f117951iobyxmoadg == wypolnanluVar.f117951iobyxmoadg && this.f117953zoijcleaow == wypolnanluVar.f117953zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117952ppxfxbqfkf, wypolnanluVar.f117952ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117951iobyxmoadg) * 31) + this.f117953zoijcleaow.hashCode()) * 31) + this.f117952ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117952ppxfxbqfkf;
    }

    public String toString() {
        return "TimerModel(index=" + this.f117951iobyxmoadg + ", type=" + this.f117953zoijcleaow + ", data=" + this.f117952ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117951iobyxmoadg;
    }
}
