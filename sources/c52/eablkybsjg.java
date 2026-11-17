package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18823iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18824ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18825zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18826iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18827zoijcleaow;

        public iobyxmoadg(String title, String url) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            this.f18826iobyxmoadg = title;
            this.f18827zoijcleaow = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18826iobyxmoadg, iobyxmoadgVar.f18826iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18827zoijcleaow, iobyxmoadgVar.f18827zoijcleaow);
        }

        public int hashCode() {
            return (this.f18826iobyxmoadg.hashCode() * 31) + this.f18827zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18826iobyxmoadg;
        }

        public String toString() {
            return "DataButtonLinkSpecialBanner(title=" + this.f18826iobyxmoadg + ", url=" + this.f18827zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18827zoijcleaow;
        }
    }

    public eablkybsjg(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18823iobyxmoadg = i13;
        this.f18825zoijcleaow = type;
        this.f18824ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f18823iobyxmoadg == eablkybsjgVar.f18823iobyxmoadg && this.f18825zoijcleaow == eablkybsjgVar.f18825zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18824ppxfxbqfkf, eablkybsjgVar.f18824ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18823iobyxmoadg) * 31) + this.f18825zoijcleaow.hashCode()) * 31) + this.f18824ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18824ppxfxbqfkf;
    }

    public String toString() {
        return "ButtonLinkSpecialBanner(index=" + this.f18823iobyxmoadg + ", type=" + this.f18825zoijcleaow + ", data=" + this.f18824ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18823iobyxmoadg;
    }
}
