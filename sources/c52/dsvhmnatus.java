package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class dsvhmnatus implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18808iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18809ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18810zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18811iobyxmoadg;

        public iobyxmoadg(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            this.f18811iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18811iobyxmoadg, ((iobyxmoadg) obj).f18811iobyxmoadg);
        }

        public int hashCode() {
            return this.f18811iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18811iobyxmoadg;
        }

        public String toString() {
            return "DataTextSpecialBanner(value=" + this.f18811iobyxmoadg + ")";
        }
    }

    public dsvhmnatus(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18808iobyxmoadg = i13;
        this.f18810zoijcleaow = type;
        this.f18809ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsvhmnatus)) {
            return false;
        }
        dsvhmnatus dsvhmnatusVar = (dsvhmnatus) obj;
        return this.f18808iobyxmoadg == dsvhmnatusVar.f18808iobyxmoadg && this.f18810zoijcleaow == dsvhmnatusVar.f18810zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18809ppxfxbqfkf, dsvhmnatusVar.f18809ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18808iobyxmoadg) * 31) + this.f18810zoijcleaow.hashCode()) * 31) + this.f18809ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18809ppxfxbqfkf;
    }

    public String toString() {
        return "TextSpecialBanner(index=" + this.f18808iobyxmoadg + ", type=" + this.f18810zoijcleaow + ", data=" + this.f18809ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18808iobyxmoadg;
    }
}
