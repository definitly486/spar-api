package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18965iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f18966ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18967zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f18968iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f18969zoijcleaow;

        public iobyxmoadg(List items, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
            this.f18968iobyxmoadg = items;
            this.f18969zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18968iobyxmoadg, iobyxmoadgVar.f18968iobyxmoadg) && this.f18969zoijcleaow == iobyxmoadgVar.f18969zoijcleaow;
        }

        public int hashCode() {
            return (this.f18968iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f18969zoijcleaow);
        }

        public final List iobyxmoadg() {
            return this.f18968iobyxmoadg;
        }

        public String toString() {
            return "DataMapSpecialBanner(items=" + this.f18968iobyxmoadg + ", hasMore=" + this.f18969zoijcleaow + ")";
        }
    }

    public oxmwwwfdhm(int i13, jpowsppfya type, iobyxmoadg data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18965iobyxmoadg = i13;
        this.f18967zoijcleaow = type;
        this.f18966ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm)) {
            return false;
        }
        oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
        return this.f18965iobyxmoadg == oxmwwwfdhmVar.f18965iobyxmoadg && this.f18967zoijcleaow == oxmwwwfdhmVar.f18967zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18966ppxfxbqfkf, oxmwwwfdhmVar.f18966ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18965iobyxmoadg) * 31) + this.f18967zoijcleaow.hashCode()) * 31) + this.f18966ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f18966ppxfxbqfkf;
    }

    public String toString() {
        return "MapSpecialBanner(index=" + this.f18965iobyxmoadg + ", type=" + this.f18967zoijcleaow + ", data=" + this.f18966ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18965iobyxmoadg;
    }
}
