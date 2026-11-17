package um;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rn.eablkybsjg f113925iobyxmoadg;

        public iobyxmoadg(rn.eablkybsjg eablkybsjgVar) {
            this.f113925iobyxmoadg = eablkybsjgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f113925iobyxmoadg == ((iobyxmoadg) obj).f113925iobyxmoadg;
        }

        public int hashCode() {
            rn.eablkybsjg eablkybsjgVar = this.f113925iobyxmoadg;
            if (eablkybsjgVar == null) {
                return 0;
            }
            return eablkybsjgVar.hashCode();
        }

        public final rn.eablkybsjg iobyxmoadg() {
            return this.f113925iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputWarning(warning=" + this.f113925iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f113926iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp newInput) {
            zdlpuopuiu.btonecajqb(newInput, "newInput");
            this.f113926iobyxmoadg = newInput;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113926iobyxmoadg, ((ppxfxbqfkf) obj).f113926iobyxmoadg);
        }

        public int hashCode() {
            return this.f113926iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f113926iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchInput(newInput=" + this.f113926iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f113927iobyxmoadg;

        public wkgbmnqykc(List addressesList) {
            zdlpuopuiu.btonecajqb(addressesList, "addressesList");
            this.f113927iobyxmoadg = addressesList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f113927iobyxmoadg, ((wkgbmnqykc) obj).f113927iobyxmoadg);
        }

        public int hashCode() {
            return this.f113927iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f113927iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchedAddresses(addressesList=" + this.f113927iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f113928iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f113928iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f113928iobyxmoadg == ((zoijcleaow) obj).f113928iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f113928iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f113928iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f113928iobyxmoadg + ")";
        }
    }
}
