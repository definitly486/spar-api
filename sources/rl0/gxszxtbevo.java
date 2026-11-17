package rl0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83030iobyxmoadg;

        public btonecajqb(boolean z13) {
            this.f83030iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f83030iobyxmoadg == ((btonecajqb) obj).f83030iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83030iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83030iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f83030iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83031iobyxmoadg;

        public dxjokdxxww(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83031iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f83031iobyxmoadg, ((dxjokdxxww) obj).f83031iobyxmoadg);
        }

        public int hashCode() {
            return this.f83031iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83031iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputIntercom(input=" + this.f83031iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83032iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final sl0.iobyxmoadg f83033zoijcleaow;

        public eablkybsjg(tzroggbefp input, sl0.iobyxmoadg selectedAddressType) {
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(selectedAddressType, "selectedAddressType");
            this.f83032iobyxmoadg = input;
            this.f83033zoijcleaow = selectedAddressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f83032iobyxmoadg, eablkybsjgVar.f83032iobyxmoadg) && this.f83033zoijcleaow == eablkybsjgVar.f83033zoijcleaow;
        }

        public int hashCode() {
            return (this.f83032iobyxmoadg.hashCode() * 31) + this.f83033zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83032iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputCustomName(input=" + this.f83032iobyxmoadg + ", selectedAddressType=" + this.f83033zoijcleaow + ")";
        }

        public final sl0.iobyxmoadg zoijcleaow() {
            return this.f83033zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: rl0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1862gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83034iobyxmoadg;

        public C1862gxszxtbevo(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83034iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1862gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f83034iobyxmoadg, ((C1862gxszxtbevo) obj).f83034iobyxmoadg);
        }

        public int hashCode() {
            return this.f83034iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83034iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputEntrance(input=" + this.f83034iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83035iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f83036ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83037zoijcleaow;

        public iobyxmoadg(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f83035iobyxmoadg = shortAddress;
            this.f83037zoijcleaow = fullAddress;
            this.f83036ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f83035iobyxmoadg, iobyxmoadgVar.f83035iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83037zoijcleaow, iobyxmoadgVar.f83037zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83036ppxfxbqfkf, iobyxmoadgVar.f83036ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f83035iobyxmoadg.hashCode() * 31) + this.f83037zoijcleaow.hashCode()) * 31) + this.f83036ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83037zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f83035iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressTextAndLocation(shortAddress=" + this.f83035iobyxmoadg + ", fullAddress=" + this.f83037zoijcleaow + ", location=" + this.f83036ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f83036ppxfxbqfkf;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83038iobyxmoadg;

        public lqeggnwhkg(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83038iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f83038iobyxmoadg, ((lqeggnwhkg) obj).f83038iobyxmoadg);
        }

        public int hashCode() {
            return this.f83038iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83038iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputFlat(input=" + this.f83038iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83039iobyxmoadg;

        public nufgyqmvbu(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f83039iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f83039iobyxmoadg, ((nufgyqmvbu) obj).f83039iobyxmoadg);
        }

        public int hashCode() {
            return this.f83039iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83039iobyxmoadg;
        }

        public String toString() {
            return "ChangeInputFloor(input=" + this.f83039iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83040iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f83040iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f83040iobyxmoadg == ((ppxfxbqfkf) obj).f83040iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83040iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83040iobyxmoadg;
        }

        public String toString() {
            return "ChangeCheckedGate(isChecked=" + this.f83040iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83041iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f83041iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f83041iobyxmoadg == ((wkgbmnqykc) obj).f83041iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83041iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83041iobyxmoadg;
        }

        public String toString() {
            return "ChangeCheckedPrivateHouse(isChecked=" + this.f83041iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sl0.iobyxmoadg f83042iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83043zoijcleaow;

        public zoijcleaow(sl0.iobyxmoadg iobyxmoadgVar, String customNameInputText) {
            zdlpuopuiu.btonecajqb(customNameInputText, "customNameInputText");
            this.f83042iobyxmoadg = iobyxmoadgVar;
            this.f83043zoijcleaow = customNameInputText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f83042iobyxmoadg == zoijcleaowVar.f83042iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f83043zoijcleaow, zoijcleaowVar.f83043zoijcleaow);
        }

        public int hashCode() {
            sl0.iobyxmoadg iobyxmoadgVar = this.f83042iobyxmoadg;
            return ((iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31) + this.f83043zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83043zoijcleaow;
        }

        public String toString() {
            return "ChangeAddressType(type=" + this.f83042iobyxmoadg + ", customNameInputText=" + this.f83043zoijcleaow + ")";
        }

        public final sl0.iobyxmoadg zoijcleaow() {
            return this.f83042iobyxmoadg;
        }
    }
}
