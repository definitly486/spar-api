package qq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f80509iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f80510zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f80511iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f80512zoijcleaow;

        public iobyxmoadg(int i13, String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.f80511iobyxmoadg = i13;
            this.f80512zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f80511iobyxmoadg == iobyxmoadgVar.f80511iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f80512zoijcleaow, iobyxmoadgVar.f80512zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f80511iobyxmoadg) * 31) + this.f80512zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f80511iobyxmoadg;
        }

        public String toString() {
            return "Param(icon=" + this.f80511iobyxmoadg + ", text=" + this.f80512zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f80512zoijcleaow;
        }
    }

    public lqeggnwhkg(String str, List params) {
        zdlpuopuiu.btonecajqb(params, "params");
        this.f80509iobyxmoadg = str;
        this.f80510zoijcleaow = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f80509iobyxmoadg, lqeggnwhkgVar.f80509iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80510zoijcleaow, lqeggnwhkgVar.f80510zoijcleaow);
    }

    public int hashCode() {
        String str = this.f80509iobyxmoadg;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f80510zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f80509iobyxmoadg;
    }

    public String toString() {
        return "VivinoInfoUiModel(location=" + this.f80509iobyxmoadg + ", params=" + this.f80510zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f80510zoijcleaow;
    }
}
