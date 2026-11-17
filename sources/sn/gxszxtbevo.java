package sn;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rn.eablkybsjg f107722iobyxmoadg;

        public iobyxmoadg(rn.eablkybsjg eablkybsjgVar) {
            this.f107722iobyxmoadg = eablkybsjgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f107722iobyxmoadg == ((iobyxmoadg) obj).f107722iobyxmoadg;
        }

        public int hashCode() {
            rn.eablkybsjg eablkybsjgVar = this.f107722iobyxmoadg;
            if (eablkybsjgVar == null) {
                return 0;
            }
            return eablkybsjgVar.hashCode();
        }

        public final rn.eablkybsjg iobyxmoadg() {
            return this.f107722iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputWarning(warning=" + this.f107722iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f107723iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp searchInput) {
            zdlpuopuiu.btonecajqb(searchInput, "searchInput");
            this.f107723iobyxmoadg = searchInput;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107723iobyxmoadg, ((ppxfxbqfkf) obj).f107723iobyxmoadg);
        }

        public int hashCode() {
            return this.f107723iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f107723iobyxmoadg;
        }

        public String toString() {
            return "ChangeSearchInput(searchInput=" + this.f107723iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f107724iobyxmoadg;

        public wkgbmnqykc(Map shops) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f107724iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f107724iobyxmoadg, ((wkgbmnqykc) obj).f107724iobyxmoadg);
        }

        public int hashCode() {
            return this.f107724iobyxmoadg.hashCode();
        }

        public final Map iobyxmoadg() {
            return this.f107724iobyxmoadg;
        }

        public String toString() {
            return "ChangeShopsMap(shops=" + this.f107724iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f107725iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f107725iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f107725iobyxmoadg == ((zoijcleaow) obj).f107725iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f107725iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f107725iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoading(isLoading=" + this.f107725iobyxmoadg + ")";
        }
    }
}
