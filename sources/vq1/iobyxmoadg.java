package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117783iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117784ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117785zoijcleaow;

    /* JADX INFO: renamed from: vq1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2926iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f117786iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117787zoijcleaow;

        public C2926iobyxmoadg(String title, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f117786iobyxmoadg = title;
            this.f117787zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2926iobyxmoadg)) {
                return false;
            }
            C2926iobyxmoadg c2926iobyxmoadg = (C2926iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117786iobyxmoadg, c2926iobyxmoadg.f117786iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117787zoijcleaow, c2926iobyxmoadg.f117787zoijcleaow);
        }

        public int hashCode() {
            return (this.f117786iobyxmoadg.hashCode() * 31) + this.f117787zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f117787zoijcleaow;
        }

        public String toString() {
            return "DataAccordionSpecialBanner(title=" + this.f117786iobyxmoadg + ", text=" + this.f117787zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f117786iobyxmoadg;
        }
    }

    public iobyxmoadg(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117783iobyxmoadg = i13;
        this.f117785zoijcleaow = type;
        this.f117784ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f117783iobyxmoadg == iobyxmoadgVar.f117783iobyxmoadg && this.f117785zoijcleaow == iobyxmoadgVar.f117785zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117784ppxfxbqfkf, iobyxmoadgVar.f117784ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117783iobyxmoadg) * 31) + this.f117785zoijcleaow.hashCode()) * 31) + this.f117784ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117784ppxfxbqfkf;
    }

    public String toString() {
        return "AccordionSpecialBanner(index=" + this.f117783iobyxmoadg + ", type=" + this.f117785zoijcleaow + ", data=" + this.f117784ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117783iobyxmoadg;
    }
}
