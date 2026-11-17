package o0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71495iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f71496zoijcleaow;

    public ppxfxbqfkf(String str, boolean z13) {
        this.f71495iobyxmoadg = str;
        this.f71496zoijcleaow = z13;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

    public final boolean iobyxmoadg() {
        return this.f71496zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f71495iobyxmoadg;
    }

    public /* synthetic */ ppxfxbqfkf(String str, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? true : z13);
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71497iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f71498ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f71499wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f71500zoijcleaow;

        private iobyxmoadg(String str, String str2, List list, int i13) {
            this.f71497iobyxmoadg = str;
            this.f71500zoijcleaow = str2;
            this.f71498ppxfxbqfkf = list;
            this.f71499wkgbmnqykc = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71497iobyxmoadg, iobyxmoadgVar.f71497iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71500zoijcleaow, iobyxmoadgVar.f71500zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71498ppxfxbqfkf, iobyxmoadgVar.f71498ppxfxbqfkf) && this.f71499wkgbmnqykc == iobyxmoadgVar.f71499wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f71497iobyxmoadg.hashCode() * 31) + this.f71500zoijcleaow.hashCode()) * 31;
            List list = this.f71498ppxfxbqfkf;
            return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f71499wkgbmnqykc;
        }

        public final List iobyxmoadg() {
            return this.f71498ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f71497iobyxmoadg;
        }

        public final String wkgbmnqykc() {
            return this.f71500zoijcleaow;
        }

        public final int zoijcleaow() {
            return this.f71499wkgbmnqykc;
        }

        public iobyxmoadg(String str, String str2, int i13) {
            this(str, str2, null, i13);
        }
    }
}
