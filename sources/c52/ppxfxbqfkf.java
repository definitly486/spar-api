package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18980iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18981ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18982zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f18983iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18984zoijcleaow;

        public iobyxmoadg(double d13, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f18983iobyxmoadg = d13;
            this.f18984zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Double.compare(this.f18983iobyxmoadg, iobyxmoadgVar.f18983iobyxmoadg) == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18984zoijcleaow, iobyxmoadgVar.f18984zoijcleaow);
        }

        public int hashCode() {
            return (Double.hashCode(this.f18983iobyxmoadg) * 31) + this.f18984zoijcleaow.hashCode();
        }

        public final double iobyxmoadg() {
            return this.f18983iobyxmoadg;
        }

        public String toString() {
            return "BonusCardData(bonuses=" + this.f18983iobyxmoadg + ", text=" + this.f18984zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18984zoijcleaow;
        }
    }

    public ppxfxbqfkf(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18980iobyxmoadg = i13;
        this.f18982zoijcleaow = type;
        this.f18981ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f18980iobyxmoadg == ppxfxbqfkfVar.f18980iobyxmoadg && this.f18982zoijcleaow == ppxfxbqfkfVar.f18982zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18981ppxfxbqfkf, ppxfxbqfkfVar.f18981ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18980iobyxmoadg) * 31) + this.f18982zoijcleaow.hashCode()) * 31) + this.f18981ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18981ppxfxbqfkf;
    }

    public String toString() {
        return "BonusCard(index=" + this.f18980iobyxmoadg + ", type=" + this.f18982zoijcleaow + ", data=" + this.f18981ppxfxbqfkf + ")";
    }
}
