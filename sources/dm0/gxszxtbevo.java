package dm0;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final cm0.eablkybsjg f29143iobyxmoadg;

        public iobyxmoadg(cm0.eablkybsjg eablkybsjgVar) {
            this.f29143iobyxmoadg = eablkybsjgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f29143iobyxmoadg == ((iobyxmoadg) obj).f29143iobyxmoadg;
        }

        public int hashCode() {
            cm0.eablkybsjg eablkybsjgVar = this.f29143iobyxmoadg;
            if (eablkybsjgVar == null) {
                return 0;
            }
            return eablkybsjgVar.hashCode();
        }

        public final cm0.eablkybsjg iobyxmoadg() {
            return this.f29143iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputWarning(warning=" + this.f29143iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f29144iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp searchInput) {
            zdlpuopuiu.btonecajqb(searchInput, "searchInput");
            this.f29144iobyxmoadg = searchInput;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29144iobyxmoadg, ((ppxfxbqfkf) obj).f29144iobyxmoadg);
        }

        public int hashCode() {
            return this.f29144iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f29144iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchInput(searchInput=" + this.f29144iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f29145iobyxmoadg;

        public wkgbmnqykc(Map shops) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f29145iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29145iobyxmoadg, ((wkgbmnqykc) obj).f29145iobyxmoadg);
        }

        public int hashCode() {
            return this.f29145iobyxmoadg.hashCode();
        }

        public final Map iobyxmoadg() {
            return this.f29145iobyxmoadg;
        }

        public String toString() {
            return "ChangeShopsMap(shops=" + this.f29145iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f29146iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f29146iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f29146iobyxmoadg == ((zoijcleaow) obj).f29146iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29146iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f29146iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f29146iobyxmoadg + ")";
        }
    }
}
