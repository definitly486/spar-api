package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18959iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18960ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18961zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18962iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18963ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18964zoijcleaow;

        public iobyxmoadg(String file, String desc, String adv) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
            this.f18962iobyxmoadg = file;
            this.f18964zoijcleaow = desc;
            this.f18963ppxfxbqfkf = adv;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18962iobyxmoadg, iobyxmoadgVar.f18962iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18964zoijcleaow, iobyxmoadgVar.f18964zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18963ppxfxbqfkf, iobyxmoadgVar.f18963ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f18962iobyxmoadg.hashCode() * 31) + this.f18964zoijcleaow.hashCode()) * 31) + this.f18963ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18963ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18962iobyxmoadg;
        }

        public String toString() {
            return "DataImageSpecialBanner(file=" + this.f18962iobyxmoadg + ", desc=" + this.f18964zoijcleaow + ", adv=" + this.f18963ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f18964zoijcleaow;
        }
    }

    public ojitshcjhn(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18959iobyxmoadg = i13;
        this.f18961zoijcleaow = type;
        this.f18960ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return this.f18959iobyxmoadg == ojitshcjhnVar.f18959iobyxmoadg && this.f18961zoijcleaow == ojitshcjhnVar.f18961zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18960ppxfxbqfkf, ojitshcjhnVar.f18960ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18959iobyxmoadg) * 31) + this.f18961zoijcleaow.hashCode()) * 31) + this.f18960ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18960ppxfxbqfkf;
    }

    public String toString() {
        return "ImageSpecialBanner(index=" + this.f18959iobyxmoadg + ", type=" + this.f18961zoijcleaow + ", data=" + this.f18960ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18959iobyxmoadg;
    }
}
