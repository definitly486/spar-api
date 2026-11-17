package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18839iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18840ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18841zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lereixgezr f18842iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18843zoijcleaow;

        public iobyxmoadg(lereixgezr orderType, String additionalField) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderType, "orderType");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(additionalField, "additionalField");
            this.f18842iobyxmoadg = orderType;
            this.f18843zoijcleaow = additionalField;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f18842iobyxmoadg == iobyxmoadgVar.f18842iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18843zoijcleaow, iobyxmoadgVar.f18843zoijcleaow);
        }

        public int hashCode() {
            return (this.f18842iobyxmoadg.hashCode() * 31) + this.f18843zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18843zoijcleaow;
        }

        public String toString() {
            return "DataFormSpecialBanner(orderType=" + this.f18842iobyxmoadg + ", additionalField=" + this.f18843zoijcleaow + ")";
        }

        public final lereixgezr zoijcleaow() {
            return this.f18842iobyxmoadg;
        }
    }

    public gtknphoqwx(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18839iobyxmoadg = i13;
        this.f18841zoijcleaow = type;
        this.f18840ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f18839iobyxmoadg == gtknphoqwxVar.f18839iobyxmoadg && this.f18841zoijcleaow == gtknphoqwxVar.f18841zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18840ppxfxbqfkf, gtknphoqwxVar.f18840ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18839iobyxmoadg) * 31) + this.f18841zoijcleaow.hashCode()) * 31) + this.f18840ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18840ppxfxbqfkf;
    }

    public String toString() {
        return "FormSpecialBanner(index=" + this.f18839iobyxmoadg + ", type=" + this.f18841zoijcleaow + ", data=" + this.f18840ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18839iobyxmoadg;
    }
}
