package bs;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16977iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f16978zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f16979iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f16980zoijcleaow;

        public iobyxmoadg(int i13, String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.f16979iobyxmoadg = i13;
            this.f16980zoijcleaow = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f16979iobyxmoadg == iobyxmoadgVar.f16979iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f16980zoijcleaow, iobyxmoadgVar.f16980zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f16979iobyxmoadg) * 31) + this.f16980zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f16979iobyxmoadg;
        }

        public String toString() {
            return "Param(icon=" + this.f16979iobyxmoadg + ", text=" + this.f16980zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f16980zoijcleaow;
        }
    }

    public lqeggnwhkg(String str, List params) {
        zdlpuopuiu.btonecajqb(params, "params");
        this.f16977iobyxmoadg = str;
        this.f16978zoijcleaow = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f16977iobyxmoadg, lqeggnwhkgVar.f16977iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16978zoijcleaow, lqeggnwhkgVar.f16978zoijcleaow);
    }

    public int hashCode() {
        String str = this.f16977iobyxmoadg;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f16978zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f16977iobyxmoadg;
    }

    public String toString() {
        return "VivinoInfoUiModel(location=" + this.f16977iobyxmoadg + ", params=" + this.f16978zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f16978zoijcleaow;
    }
}
