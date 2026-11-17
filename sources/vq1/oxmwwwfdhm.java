package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117885iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f117886ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117887zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f117888iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f117889zoijcleaow;

        public iobyxmoadg(List items, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
            this.f117888iobyxmoadg = items;
            this.f117889zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117888iobyxmoadg, iobyxmoadgVar.f117888iobyxmoadg) && this.f117889zoijcleaow == iobyxmoadgVar.f117889zoijcleaow;
        }

        public int hashCode() {
            return (this.f117888iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f117889zoijcleaow);
        }

        public final List iobyxmoadg() {
            return this.f117888iobyxmoadg;
        }

        public String toString() {
            return "DataMapSpecialBanner(items=" + this.f117888iobyxmoadg + ", hasMore=" + this.f117889zoijcleaow + ")";
        }
    }

    public oxmwwwfdhm(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117885iobyxmoadg = i13;
        this.f117887zoijcleaow = type;
        this.f117886ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm)) {
            return false;
        }
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
        return this.f117885iobyxmoadg == oxmwwwfdhmVar.f117885iobyxmoadg && this.f117887zoijcleaow == oxmwwwfdhmVar.f117887zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117886ppxfxbqfkf, oxmwwwfdhmVar.f117886ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117885iobyxmoadg) * 31) + this.f117887zoijcleaow.hashCode()) * 31) + this.f117886ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f117886ppxfxbqfkf;
    }

    public String toString() {
        return "MapSpecialBanner(index=" + this.f117885iobyxmoadg + ", type=" + this.f117887zoijcleaow + ", data=" + this.f117886ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117885iobyxmoadg;
    }
}
