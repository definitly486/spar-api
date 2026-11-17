package d61;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f27098iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f27099zoijcleaow;

        public iobyxmoadg(String filterId, boolean z13) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f27098iobyxmoadg = filterId;
            this.f27099zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f27098iobyxmoadg, iobyxmoadgVar.f27098iobyxmoadg) && this.f27099zoijcleaow == iobyxmoadgVar.f27099zoijcleaow;
        }

        public int hashCode() {
            return (this.f27098iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f27099zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f27098iobyxmoadg;
        }

        public String toString() {
            return "ChangeFilterCheckedState(filterId=" + this.f27098iobyxmoadg + ", isChecked=" + this.f27099zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f27099zoijcleaow;
        }
    }
}
