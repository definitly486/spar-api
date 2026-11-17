package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18864iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18865ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18866zoijcleaow;

    /* JADX INFO: renamed from: c52.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0343iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18867iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18868zoijcleaow;

        public C0343iobyxmoadg(String title, String text) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
            this.f18867iobyxmoadg = title;
            this.f18868zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0343iobyxmoadg)) {
                return false;
            }
            C0343iobyxmoadg c0343iobyxmoadg = (C0343iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18867iobyxmoadg, c0343iobyxmoadg.f18867iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18868zoijcleaow, c0343iobyxmoadg.f18868zoijcleaow);
        }

        public int hashCode() {
            return (this.f18867iobyxmoadg.hashCode() * 31) + this.f18868zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18868zoijcleaow;
        }

        public String toString() {
            return "DataAccordionSpecialBanner(title=" + this.f18867iobyxmoadg + ", text=" + this.f18868zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18867iobyxmoadg;
        }
    }

    public iobyxmoadg(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18864iobyxmoadg = i13;
        this.f18866zoijcleaow = type;
        this.f18865ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f18864iobyxmoadg == iobyxmoadgVar.f18864iobyxmoadg && this.f18866zoijcleaow == iobyxmoadgVar.f18866zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18865ppxfxbqfkf, iobyxmoadgVar.f18865ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18864iobyxmoadg) * 31) + this.f18866zoijcleaow.hashCode()) * 31) + this.f18865ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18865ppxfxbqfkf;
    }

    public String toString() {
        return "AccordionSpecialBanner(index=" + this.f18864iobyxmoadg + ", type=" + this.f18866zoijcleaow + ", data=" + this.f18865ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18864iobyxmoadg;
    }
}
