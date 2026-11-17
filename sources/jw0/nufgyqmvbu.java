package jw0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f52464eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f52465gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f52466iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final tzroggbefp f52467ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f52468wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f52469zoijcleaow;

        public iobyxmoadg(boolean z13, tzroggbefp contactName, tzroggbefp contactPhone, boolean z14, boolean z15, boolean z16) {
            zdlpuopuiu.btonecajqb(contactName, "contactName");
            zdlpuopuiu.btonecajqb(contactPhone, "contactPhone");
            this.f52466iobyxmoadg = z13;
            this.f52469zoijcleaow = contactName;
            this.f52467ppxfxbqfkf = contactPhone;
            this.f52468wkgbmnqykc = z14;
            this.f52464eablkybsjg = z15;
            this.f52465gxszxtbevo = z16;
        }

        public final boolean eablkybsjg() {
            return this.f52468wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f52466iobyxmoadg == iobyxmoadgVar.f52466iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f52469zoijcleaow, iobyxmoadgVar.f52469zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f52467ppxfxbqfkf, iobyxmoadgVar.f52467ppxfxbqfkf) && this.f52468wkgbmnqykc == iobyxmoadgVar.f52468wkgbmnqykc && this.f52464eablkybsjg == iobyxmoadgVar.f52464eablkybsjg && this.f52465gxszxtbevo == iobyxmoadgVar.f52465gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f52466iobyxmoadg;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.f52466iobyxmoadg) * 31) + this.f52469zoijcleaow.hashCode()) * 31) + this.f52467ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f52468wkgbmnqykc)) * 31) + Boolean.hashCode(this.f52464eablkybsjg)) * 31) + Boolean.hashCode(this.f52465gxszxtbevo);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f52469zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f52464eablkybsjg;
        }

        public String toString() {
            return "EditContact(isLoading=" + this.f52466iobyxmoadg + ", contactName=" + this.f52469zoijcleaow + ", contactPhone=" + this.f52467ppxfxbqfkf + ", isBtnAcceptEnabled=" + this.f52468wkgbmnqykc + ", showInputNameError=" + this.f52464eablkybsjg + ", showInputPhoneError=" + this.f52465gxszxtbevo + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f52465gxszxtbevo;
        }

        public final tzroggbefp zoijcleaow() {
            return this.f52467ppxfxbqfkf;
        }
    }

    public static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f52470iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f52471ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f52472wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f52473zoijcleaow;

        public ppxfxbqfkf(boolean z13, tzroggbefp searchText, List list, boolean z14) {
            zdlpuopuiu.btonecajqb(searchText, "searchText");
            this.f52470iobyxmoadg = z13;
            this.f52473zoijcleaow = searchText;
            this.f52471ppxfxbqfkf = list;
            this.f52472wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f52470iobyxmoadg == ppxfxbqfkfVar.f52470iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f52473zoijcleaow, ppxfxbqfkfVar.f52473zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f52471ppxfxbqfkf, ppxfxbqfkfVar.f52471ppxfxbqfkf) && this.f52472wkgbmnqykc == ppxfxbqfkfVar.f52472wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f52470iobyxmoadg) * 31) + this.f52473zoijcleaow.hashCode()) * 31;
            List list = this.f52471ppxfxbqfkf;
            return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f52472wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f52472wkgbmnqykc;
        }

        public final tzroggbefp ppxfxbqfkf() {
            return this.f52473zoijcleaow;
        }

        public String toString() {
            return "SelectContact(isLoading=" + this.f52470iobyxmoadg + ", searchText=" + this.f52473zoijcleaow + ", contactsList=" + this.f52471ppxfxbqfkf + ", approveEnable=" + this.f52472wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f52470iobyxmoadg;
        }

        public final List zoijcleaow() {
            return this.f52471ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f52474iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1990933707;
        }

        public String toString() {
            return "EmptyContacts";
        }
    }
}
