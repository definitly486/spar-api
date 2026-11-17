package fl0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final cm0.eablkybsjg f34321iobyxmoadg;

        public iobyxmoadg(cm0.eablkybsjg eablkybsjgVar) {
            this.f34321iobyxmoadg = eablkybsjgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f34321iobyxmoadg == ((iobyxmoadg) obj).f34321iobyxmoadg;
        }

        public int hashCode() {
            cm0.eablkybsjg eablkybsjgVar = this.f34321iobyxmoadg;
            if (eablkybsjgVar == null) {
                return 0;
            }
            return eablkybsjgVar.hashCode();
        }

        public final cm0.eablkybsjg iobyxmoadg() {
            return this.f34321iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputWarning(warning=" + this.f34321iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f34322iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp newInput) {
            zdlpuopuiu.btonecajqb(newInput, "newInput");
            this.f34322iobyxmoadg = newInput;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34322iobyxmoadg, ((ppxfxbqfkf) obj).f34322iobyxmoadg);
        }

        public int hashCode() {
            return this.f34322iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f34322iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchInput(newInput=" + this.f34322iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f34323iobyxmoadg;

        public wkgbmnqykc(List addressesList) {
            zdlpuopuiu.btonecajqb(addressesList, "addressesList");
            this.f34323iobyxmoadg = addressesList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f34323iobyxmoadg, ((wkgbmnqykc) obj).f34323iobyxmoadg);
        }

        public int hashCode() {
            return this.f34323iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f34323iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchedAddresses(addressesList=" + this.f34323iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34324iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f34324iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f34324iobyxmoadg == ((zoijcleaow) obj).f34324iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34324iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34324iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f34324iobyxmoadg + ")";
        }
    }
}
