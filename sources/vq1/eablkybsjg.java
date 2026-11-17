package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117742iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117743ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117744zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117745iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117746zoijcleaow;

        public iobyxmoadg(String title, String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f117745iobyxmoadg = title;
            this.f117746zoijcleaow = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117745iobyxmoadg, iobyxmoadgVar.f117745iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117746zoijcleaow, iobyxmoadgVar.f117746zoijcleaow);
        }

        public int hashCode() {
            return (this.f117745iobyxmoadg.hashCode() * 31) + this.f117746zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117745iobyxmoadg;
        }

        public String toString() {
            return "DataButtonLinkSpecialBanner(title=" + this.f117745iobyxmoadg + ", url=" + this.f117746zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f117746zoijcleaow;
        }
    }

    public eablkybsjg(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117742iobyxmoadg = i13;
        this.f117744zoijcleaow = type;
        this.f117743ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f117742iobyxmoadg == eablkybsjgVar.f117742iobyxmoadg && this.f117744zoijcleaow == eablkybsjgVar.f117744zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117743ppxfxbqfkf, eablkybsjgVar.f117743ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117742iobyxmoadg) * 31) + this.f117744zoijcleaow.hashCode()) * 31) + this.f117743ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117743ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonLinkSpecialBanner(index=" + this.f117742iobyxmoadg + ", type=" + this.f117744zoijcleaow + ", data=" + this.f117743ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117742iobyxmoadg;
    }
}
