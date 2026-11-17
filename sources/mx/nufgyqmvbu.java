package mx;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f68035eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f68036gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f68037iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final tzroggbefp f68038ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f68039wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f68040zoijcleaow;

        public iobyxmoadg(boolean z13, tzroggbefp contactName, tzroggbefp contactPhone, boolean z14, boolean z15, boolean z16) {
            zdlpuopuiu.btonecajqb(contactName, "contactName");
            zdlpuopuiu.btonecajqb(contactPhone, "contactPhone");
            this.f68037iobyxmoadg = z13;
            this.f68040zoijcleaow = contactName;
            this.f68038ppxfxbqfkf = contactPhone;
            this.f68039wkgbmnqykc = z14;
            this.f68035eablkybsjg = z15;
            this.f68036gxszxtbevo = z16;
        }

        public final boolean eablkybsjg() {
            return this.f68039wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f68037iobyxmoadg == iobyxmoadgVar.f68037iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f68040zoijcleaow, iobyxmoadgVar.f68040zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f68038ppxfxbqfkf, iobyxmoadgVar.f68038ppxfxbqfkf) && this.f68039wkgbmnqykc == iobyxmoadgVar.f68039wkgbmnqykc && this.f68035eablkybsjg == iobyxmoadgVar.f68035eablkybsjg && this.f68036gxszxtbevo == iobyxmoadgVar.f68036gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f68037iobyxmoadg;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.f68037iobyxmoadg) * 31) + this.f68040zoijcleaow.hashCode()) * 31) + this.f68038ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f68039wkgbmnqykc)) * 31) + Boolean.hashCode(this.f68035eablkybsjg)) * 31) + Boolean.hashCode(this.f68036gxszxtbevo);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f68040zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f68035eablkybsjg;
        }

        public String toString() {
            return "EditContact(isLoading=" + this.f68037iobyxmoadg + ", contactName=" + this.f68040zoijcleaow + ", contactPhone=" + this.f68038ppxfxbqfkf + ", isBtnAcceptEnabled=" + this.f68039wkgbmnqykc + ", showInputNameError=" + this.f68035eablkybsjg + ", showInputPhoneError=" + this.f68036gxszxtbevo + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f68036gxszxtbevo;
        }

        public final tzroggbefp zoijcleaow() {
            return this.f68038ppxfxbqfkf;
        }
    }

    public static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f68041iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f68042ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f68043wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f68044zoijcleaow;

        public ppxfxbqfkf(boolean z13, tzroggbefp searchText, List list, boolean z14) {
            zdlpuopuiu.btonecajqb(searchText, "searchText");
            this.f68041iobyxmoadg = z13;
            this.f68044zoijcleaow = searchText;
            this.f68042ppxfxbqfkf = list;
            this.f68043wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f68041iobyxmoadg == ppxfxbqfkfVar.f68041iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f68044zoijcleaow, ppxfxbqfkfVar.f68044zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f68042ppxfxbqfkf, ppxfxbqfkfVar.f68042ppxfxbqfkf) && this.f68043wkgbmnqykc == ppxfxbqfkfVar.f68043wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f68041iobyxmoadg) * 31) + this.f68044zoijcleaow.hashCode()) * 31;
            List list = this.f68042ppxfxbqfkf;
            return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f68043wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f68043wkgbmnqykc;
        }

        public final tzroggbefp ppxfxbqfkf() {
            return this.f68044zoijcleaow;
        }

        public String toString() {
            return "SelectContact(isLoading=" + this.f68041iobyxmoadg + ", searchText=" + this.f68044zoijcleaow + ", contactsList=" + this.f68042ppxfxbqfkf + ", approveEnable=" + this.f68043wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f68041iobyxmoadg;
        }

        public final List zoijcleaow() {
            return this.f68042ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f68045iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1313452296;
        }

        public String toString() {
            return "EmptyContacts";
        }
    }
}
