package rl0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83064iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f83065ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83066zoijcleaow;

        public agtfadlqog(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f83064iobyxmoadg = shortAddress;
            this.f83066zoijcleaow = fullAddress;
            this.f83065ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f83064iobyxmoadg, agtfadlqogVar.f83064iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83066zoijcleaow, agtfadlqogVar.f83066zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83065ppxfxbqfkf, agtfadlqogVar.f83065ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f83064iobyxmoadg.hashCode() * 31) + this.f83066zoijcleaow.hashCode()) * 31) + this.f83065ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83066zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f83064iobyxmoadg;
        }

        public String toString() {
            return "OnMapScreenResult(shortAddress=" + this.f83064iobyxmoadg + ", fullAddress=" + this.f83066zoijcleaow + ", location=" + this.f83065ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f83065ppxfxbqfkf;
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83067iobyxmoadg;

        public btonecajqb(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83067iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f83067iobyxmoadg, ((btonecajqb) obj).f83067iobyxmoadg);
        }

        public int hashCode() {
            return this.f83067iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83067iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputFlat(input=" + this.f83067iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83068iobyxmoadg;

        public draadjrbmk(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83068iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f83068iobyxmoadg, ((draadjrbmk) obj).f83068iobyxmoadg);
        }

        public int hashCode() {
            return this.f83068iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83068iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputIntercom(input=" + this.f83068iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83069iobyxmoadg;

        public dxjokdxxww(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83069iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f83069iobyxmoadg, ((dxjokdxxww) obj).f83069iobyxmoadg);
        }

        public int hashCode() {
            return this.f83069iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83069iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputEntrance(input=" + this.f83069iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sl0.iobyxmoadg f83070iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83071zoijcleaow;

        public eablkybsjg(sl0.iobyxmoadg type, String inputText) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(inputText, "inputText");
            this.f83070iobyxmoadg = type;
            this.f83071zoijcleaow = inputText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f83070iobyxmoadg == eablkybsjgVar.f83070iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f83071zoijcleaow, eablkybsjgVar.f83071zoijcleaow);
        }

        public int hashCode() {
            return (this.f83070iobyxmoadg.hashCode() * 31) + this.f83071zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83071zoijcleaow;
        }

        public String toString() {
            return "OnChangeAddressType(type=" + this.f83070iobyxmoadg + ", inputText=" + this.f83071zoijcleaow + ")";
        }

        public final sl0.iobyxmoadg zoijcleaow() {
            return this.f83070iobyxmoadg;
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83072iobyxmoadg;

        public gtknphoqwx(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83072iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f83072iobyxmoadg, ((gtknphoqwx) obj).f83072iobyxmoadg);
        }

        public int hashCode() {
            return this.f83072iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83072iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputFloor(input=" + this.f83072iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83073iobyxmoadg;

        public gxszxtbevo(boolean z13) {
            this.f83073iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f83073iobyxmoadg == ((gxszxtbevo) obj).f83073iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83073iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83073iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCheckedGate(isChecked=" + this.f83073iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83074iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1384135557;
        }

        public String toString() {
            return "OnAddressTextClick";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83075iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f83075iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f83075iobyxmoadg == ((lqeggnwhkg) obj).f83075iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83075iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83075iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCheckedPrivateHouse(isChecked=" + this.f83075iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83076iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final sl0.iobyxmoadg f83077zoijcleaow;

        public nufgyqmvbu(tzroggbefp input, sl0.iobyxmoadg selectedAddressType) {
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(selectedAddressType, "selectedAddressType");
            this.f83076iobyxmoadg = input;
            this.f83077zoijcleaow = selectedAddressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f83076iobyxmoadg, nufgyqmvbuVar.f83076iobyxmoadg) && this.f83077zoijcleaow == nufgyqmvbuVar.f83077zoijcleaow;
        }

        public int hashCode() {
            return (this.f83076iobyxmoadg.hashCode() * 31) + this.f83077zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83076iobyxmoadg;
        }

        public String toString() {
            return "OnChangeInputCustomName(input=" + this.f83076iobyxmoadg + ", selectedAddressType=" + this.f83077zoijcleaow + ")";
        }

        public final sl0.iobyxmoadg zoijcleaow() {
            return this.f83077zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f83078iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1995207140;
        }

        public String toString() {
            return "OnBtnRemoveClick";
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f83079iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1681386553;
        }

        public String toString() {
            return "OnClearFocusInputCustomName";
        }
    }

    /* JADX INFO: renamed from: rl0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1864wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1864wkgbmnqykc f83080iobyxmoadg = new C1864wkgbmnqykc();

        private C1864wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1864wkgbmnqykc);
        }

        public int hashCode() {
            return 1890371267;
        }

        public String toString() {
            return "OnBtnSaveClick";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f83081iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 668796712;
        }

        public String toString() {
            return "OnBtnNavigateBackClick";
        }
    }
}
