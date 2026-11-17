package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class dsvhmnatus implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117727iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117728ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117729zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117730iobyxmoadg;

        public iobyxmoadg(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            this.f117730iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117730iobyxmoadg, ((iobyxmoadg) obj).f117730iobyxmoadg);
        }

        public int hashCode() {
            return this.f117730iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117730iobyxmoadg;
        }

        public String toString() {
            return "DataTextSpecialBanner(value=" + this.f117730iobyxmoadg + ")";
        }
    }

    public dsvhmnatus(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117727iobyxmoadg = i13;
        this.f117729zoijcleaow = type;
        this.f117728ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsvhmnatus)) {
            return false;
        }
        dsvhmnatus dsvhmnatusVar = (dsvhmnatus) obj;
        return this.f117727iobyxmoadg == dsvhmnatusVar.f117727iobyxmoadg && this.f117729zoijcleaow == dsvhmnatusVar.f117729zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117728ppxfxbqfkf, dsvhmnatusVar.f117728ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117727iobyxmoadg) * 31) + this.f117729zoijcleaow.hashCode()) * 31) + this.f117728ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117728ppxfxbqfkf;
    }

    public String toString() {
        return "TextSpecialBanner(index=" + this.f117727iobyxmoadg + ", type=" + this.f117729zoijcleaow + ", data=" + this.f117728ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117727iobyxmoadg;
    }
}
