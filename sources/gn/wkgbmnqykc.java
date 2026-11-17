package gn;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37950iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f37951ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37952zoijcleaow;

        public agtfadlqog(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f37950iobyxmoadg = shortAddress;
            this.f37952zoijcleaow = fullAddress;
            this.f37951ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f37950iobyxmoadg, agtfadlqogVar.f37950iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37952zoijcleaow, agtfadlqogVar.f37952zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37951ppxfxbqfkf, agtfadlqogVar.f37951ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f37950iobyxmoadg.hashCode() * 31) + this.f37952zoijcleaow.hashCode()) * 31) + this.f37951ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37952zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f37950iobyxmoadg;
        }

        public String toString() {
            return "OnMapScreenResult(shortAddress=" + this.f37950iobyxmoadg + ", fullAddress=" + this.f37952zoijcleaow + ", location=" + this.f37951ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f37951ppxfxbqfkf;
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37953iobyxmoadg;

        public btonecajqb(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37953iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f37953iobyxmoadg, ((btonecajqb) obj).f37953iobyxmoadg);
        }

        public int hashCode() {
            return this.f37953iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37953iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputFlat(input=" + this.f37953iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37954iobyxmoadg;

        public draadjrbmk(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37954iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f37954iobyxmoadg, ((draadjrbmk) obj).f37954iobyxmoadg);
        }

        public int hashCode() {
            return this.f37954iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37954iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputIntercom(input=" + this.f37954iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37955iobyxmoadg;

        public dxjokdxxww(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37955iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f37955iobyxmoadg, ((dxjokdxxww) obj).f37955iobyxmoadg);
        }

        public int hashCode() {
            return this.f37955iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37955iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputEntrance(input=" + this.f37955iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hn.iobyxmoadg f37956iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37957zoijcleaow;

        public eablkybsjg(hn.iobyxmoadg type, String inputText) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(inputText, "inputText");
            this.f37956iobyxmoadg = type;
            this.f37957zoijcleaow = inputText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f37956iobyxmoadg == eablkybsjgVar.f37956iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f37957zoijcleaow, eablkybsjgVar.f37957zoijcleaow);
        }

        public int hashCode() {
            return (this.f37956iobyxmoadg.hashCode() * 31) + this.f37957zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37957zoijcleaow;
        }

        public String toString() {
            return "OnChangeAddressType(type=" + this.f37956iobyxmoadg + ", inputText=" + this.f37957zoijcleaow + ")";
        }

        public final hn.iobyxmoadg zoijcleaow() {
            return this.f37956iobyxmoadg;
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37958iobyxmoadg;

        public gtknphoqwx(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f37958iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f37958iobyxmoadg, ((gtknphoqwx) obj).f37958iobyxmoadg);
        }

        public int hashCode() {
            return this.f37958iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37958iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputFloor(input=" + this.f37958iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37959iobyxmoadg;

        public gxszxtbevo(boolean z13) {
            this.f37959iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f37959iobyxmoadg == ((gxszxtbevo) obj).f37959iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37959iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37959iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCheckedGate(isChecked=" + this.f37959iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f37960iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1454938882;
        }

        public String toString() {
            return "OnAddressTextClick";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37961iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f37961iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f37961iobyxmoadg == ((lqeggnwhkg) obj).f37961iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37961iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37961iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCheckedPrivateHouse(isChecked=" + this.f37961iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f37962iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final hn.iobyxmoadg f37963zoijcleaow;

        public nufgyqmvbu(tzroggbefp input, hn.iobyxmoadg selectedAddressType) {
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(selectedAddressType, "selectedAddressType");
            this.f37962iobyxmoadg = input;
            this.f37963zoijcleaow = selectedAddressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f37962iobyxmoadg, nufgyqmvbuVar.f37962iobyxmoadg) && this.f37963zoijcleaow == nufgyqmvbuVar.f37963zoijcleaow;
        }

        public int hashCode() {
            return (this.f37962iobyxmoadg.hashCode() * 31) + this.f37963zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f37962iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputCustomName(input=" + this.f37962iobyxmoadg + ", selectedAddressType=" + this.f37963zoijcleaow + ")";
        }

        public final hn.iobyxmoadg zoijcleaow() {
            return this.f37963zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f37964iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1606454433;
        }

        public String toString() {
            return "OnBtnRemoveClick";
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f37965iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -668379484;
        }

        public String toString() {
            return "OnClearFocusInputCustomName";
        }
    }

    /* JADX INFO: renamed from: gn.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0861wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0861wkgbmnqykc f37966iobyxmoadg = new C0861wkgbmnqykc();

        private C0861wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0861wkgbmnqykc);
        }

        public int hashCode() {
            return 889659590;
        }

        public String toString() {
            return "OnBtnSaveClick";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f37967iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1106596309;
        }

        public String toString() {
            return "OnBtnNavigateBackClick";
        }
    }
}
