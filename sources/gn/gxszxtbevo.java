package gn;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37916iobyxmoadg;

        public btonecajqb(boolean z13) {
            this.f37916iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f37916iobyxmoadg == ((btonecajqb) obj).f37916iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37916iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37916iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f37916iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37917iobyxmoadg;

        public dxjokdxxww(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37917iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f37917iobyxmoadg, ((dxjokdxxww) obj).f37917iobyxmoadg);
        }

        public int hashCode() {
            return this.f37917iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37917iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputIntercom(input=" + this.f37917iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37918iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final hn.iobyxmoadg f37919zoijcleaow;

        public eablkybsjg(tzroggbefp input, hn.iobyxmoadg selectedAddressType) {
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(selectedAddressType, "selectedAddressType");
            this.f37918iobyxmoadg = input;
            this.f37919zoijcleaow = selectedAddressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f37918iobyxmoadg, eablkybsjgVar.f37918iobyxmoadg) && this.f37919zoijcleaow == eablkybsjgVar.f37919zoijcleaow;
        }

        public int hashCode() {
            return (this.f37918iobyxmoadg.hashCode() * 31) + this.f37919zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37918iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputCustomName(input=" + this.f37918iobyxmoadg + ", selectedAddressType=" + this.f37919zoijcleaow + ")";
        }

        public final hn.iobyxmoadg zoijcleaow() {
            return this.f37919zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: gn.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0859gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37920iobyxmoadg;

        public C0859gxszxtbevo(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37920iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0859gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f37920iobyxmoadg, ((C0859gxszxtbevo) obj).f37920iobyxmoadg);
        }

        public int hashCode() {
            return this.f37920iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37920iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputEntrance(input=" + this.f37920iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37921iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f37922ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37923zoijcleaow;

        public iobyxmoadg(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f37921iobyxmoadg = shortAddress;
            this.f37923zoijcleaow = fullAddress;
            this.f37922ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f37921iobyxmoadg, iobyxmoadgVar.f37921iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37923zoijcleaow, iobyxmoadgVar.f37923zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37922ppxfxbqfkf, iobyxmoadgVar.f37922ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f37921iobyxmoadg.hashCode() * 31) + this.f37923zoijcleaow.hashCode()) * 31) + this.f37922ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37923zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f37921iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressTextAndLocation(shortAddress=" + this.f37921iobyxmoadg + ", fullAddress=" + this.f37923zoijcleaow + ", location=" + this.f37922ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f37922ppxfxbqfkf;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37924iobyxmoadg;

        public lqeggnwhkg(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37924iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f37924iobyxmoadg, ((lqeggnwhkg) obj).f37924iobyxmoadg);
        }

        public int hashCode() {
            return this.f37924iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37924iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputFlat(input=" + this.f37924iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37925iobyxmoadg;

        public nufgyqmvbu(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37925iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f37925iobyxmoadg, ((nufgyqmvbu) obj).f37925iobyxmoadg);
        }

        public int hashCode() {
            return this.f37925iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37925iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputFloor(input=" + this.f37925iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37926iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f37926iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f37926iobyxmoadg == ((ppxfxbqfkf) obj).f37926iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37926iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37926iobyxmoadg;
        }

        public String toString() {
            return "ChangeCheckedGate(isChecked=" + this.f37926iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37927iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f37927iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f37927iobyxmoadg == ((wkgbmnqykc) obj).f37927iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37927iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37927iobyxmoadg;
        }

        public String toString() {
            return "ChangeCheckedPrivateHouse(isChecked=" + this.f37927iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hn.iobyxmoadg f37928iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37929zoijcleaow;

        public zoijcleaow(hn.iobyxmoadg iobyxmoadgVar, String customNameInputText) {
            zdlpuopuiu.btonecajqb(customNameInputText, "customNameInputText");
            this.f37928iobyxmoadg = iobyxmoadgVar;
            this.f37929zoijcleaow = customNameInputText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f37928iobyxmoadg == zoijcleaowVar.f37928iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f37929zoijcleaow, zoijcleaowVar.f37929zoijcleaow);
        }

        public int hashCode() {
            hn.iobyxmoadg iobyxmoadgVar = this.f37928iobyxmoadg;
            return ((iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31) + this.f37929zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37929zoijcleaow;
        }

        public String toString() {
            return "ChangeAddressType(type=" + this.f37928iobyxmoadg + ", customNameInputText=" + this.f37929zoijcleaow + ")";
        }

        public final hn.iobyxmoadg zoijcleaow() {
            return this.f37928iobyxmoadg;
        }
    }
}
