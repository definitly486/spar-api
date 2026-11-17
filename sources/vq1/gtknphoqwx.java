package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117758iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117759ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117760zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lereixgezr f117761iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117762zoijcleaow;

        public iobyxmoadg(lereixgezr orderType, String additionalField) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderType, "orderType");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalField, "additionalField");
            this.f117761iobyxmoadg = orderType;
            this.f117762zoijcleaow = additionalField;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f117761iobyxmoadg == iobyxmoadgVar.f117761iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117762zoijcleaow, iobyxmoadgVar.f117762zoijcleaow);
        }

        public int hashCode() {
            return (this.f117761iobyxmoadg.hashCode() * 31) + this.f117762zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117762zoijcleaow;
        }

        public String toString() {
            return "DataFormSpecialBanner(orderType=" + this.f117761iobyxmoadg + ", additionalField=" + this.f117762zoijcleaow + ")";
        }

        public final lereixgezr zoijcleaow() {
            return this.f117761iobyxmoadg;
        }
    }

    public gtknphoqwx(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117758iobyxmoadg = i13;
        this.f117760zoijcleaow = type;
        this.f117759ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f117758iobyxmoadg == gtknphoqwxVar.f117758iobyxmoadg && this.f117760zoijcleaow == gtknphoqwxVar.f117760zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117759ppxfxbqfkf, gtknphoqwxVar.f117759ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117758iobyxmoadg) * 31) + this.f117760zoijcleaow.hashCode()) * 31) + this.f117759ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117759ppxfxbqfkf;
    }

    public String toString() {
        return "FormSpecialBanner(index=" + this.f117758iobyxmoadg + ", type=" + this.f117760zoijcleaow + ", data=" + this.f117759ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117758iobyxmoadg;
    }
}
