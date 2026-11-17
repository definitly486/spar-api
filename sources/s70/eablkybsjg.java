package s70;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f105630iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f105631zoijcleaow;

        public iobyxmoadg(String filterId, boolean z13) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f105630iobyxmoadg = filterId;
            this.f105631zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f105630iobyxmoadg, iobyxmoadgVar.f105630iobyxmoadg) && this.f105631zoijcleaow == iobyxmoadgVar.f105631zoijcleaow;
        }

        public int hashCode() {
            return (this.f105630iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f105631zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f105630iobyxmoadg;
        }

        public String toString() {
            return "ChangeFilterCheckedState(filterId=" + this.f105630iobyxmoadg + ", isChecked=" + this.f105631zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f105631zoijcleaow;
        }
    }
}
