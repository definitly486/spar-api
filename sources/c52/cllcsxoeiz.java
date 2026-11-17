package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cllcsxoeiz implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18783iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18784ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18785zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f18786iobyxmoadg;

        public iobyxmoadg(List items) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
            this.f18786iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18786iobyxmoadg, ((iobyxmoadg) obj).f18786iobyxmoadg);
        }

        public int hashCode() {
            return this.f18786iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f18786iobyxmoadg;
        }

        public String toString() {
            return "DataTableSpecialBanner(items=" + this.f18786iobyxmoadg + ")";
        }
    }

    public cllcsxoeiz(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18783iobyxmoadg = i13;
        this.f18785zoijcleaow = type;
        this.f18784ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return this.f18783iobyxmoadg == cllcsxoeizVar.f18783iobyxmoadg && this.f18785zoijcleaow == cllcsxoeizVar.f18785zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18784ppxfxbqfkf, cllcsxoeizVar.f18784ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18783iobyxmoadg) * 31) + this.f18785zoijcleaow.hashCode()) * 31) + this.f18784ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18784ppxfxbqfkf;
    }

    public String toString() {
        return "TableSpecialBanner(index=" + this.f18783iobyxmoadg + ", type=" + this.f18785zoijcleaow + ", data=" + this.f18784ppxfxbqfkf + ")";
    }
}
