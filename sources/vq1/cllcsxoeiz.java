package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cllcsxoeiz implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117702iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117703ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117704zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f117705iobyxmoadg;

        public iobyxmoadg(List items) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
            this.f117705iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117705iobyxmoadg, ((iobyxmoadg) obj).f117705iobyxmoadg);
        }

        public int hashCode() {
            return this.f117705iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f117705iobyxmoadg;
        }

        public String toString() {
            return "DataTableSpecialBanner(items=" + this.f117705iobyxmoadg + ")";
        }
    }

    public cllcsxoeiz(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117702iobyxmoadg = i13;
        this.f117704zoijcleaow = type;
        this.f117703ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return this.f117702iobyxmoadg == cllcsxoeizVar.f117702iobyxmoadg && this.f117704zoijcleaow == cllcsxoeizVar.f117704zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117703ppxfxbqfkf, cllcsxoeizVar.f117703ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117702iobyxmoadg) * 31) + this.f117704zoijcleaow.hashCode()) * 31) + this.f117703ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117703ppxfxbqfkf;
    }

    public String toString() {
        return "TableSpecialBanner(index=" + this.f117702iobyxmoadg + ", type=" + this.f117704zoijcleaow + ", data=" + this.f117703ppxfxbqfkf + ")";
    }
}
