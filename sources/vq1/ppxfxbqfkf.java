package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117900iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117901ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117902zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117903iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117904zoijcleaow;

        public iobyxmoadg(String bonuses, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bonuses, "bonuses");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f117903iobyxmoadg = bonuses;
            this.f117904zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117903iobyxmoadg, iobyxmoadgVar.f117903iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117904zoijcleaow, iobyxmoadgVar.f117904zoijcleaow);
        }

        public int hashCode() {
            return (this.f117903iobyxmoadg.hashCode() * 31) + this.f117904zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117903iobyxmoadg;
        }

        public String toString() {
            return "BonusCardData(bonuses=" + this.f117903iobyxmoadg + ", text=" + this.f117904zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f117904zoijcleaow;
        }
    }

    public ppxfxbqfkf(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117900iobyxmoadg = i13;
        this.f117902zoijcleaow = type;
        this.f117901ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f117900iobyxmoadg == ppxfxbqfkfVar.f117900iobyxmoadg && this.f117902zoijcleaow == ppxfxbqfkfVar.f117902zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117901ppxfxbqfkf, ppxfxbqfkfVar.f117901ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117900iobyxmoadg) * 31) + this.f117902zoijcleaow.hashCode()) * 31) + this.f117901ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117901ppxfxbqfkf;
    }

    public String toString() {
        return "BonusCard(index=" + this.f117900iobyxmoadg + ", type=" + this.f117902zoijcleaow + ", data=" + this.f117901ppxfxbqfkf + ")";
    }
}
