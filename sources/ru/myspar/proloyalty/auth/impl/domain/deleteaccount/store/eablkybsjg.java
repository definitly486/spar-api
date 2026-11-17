package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2149eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92425iobyxmoadg;

        public C2149eablkybsjg(boolean z13) {
            super(null);
            this.f92425iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2149eablkybsjg) && this.f92425iobyxmoadg == ((C2149eablkybsjg) obj).f92425iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92425iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92425iobyxmoadg;
        }

        public String toString() {
            return "SmsErrorChanged(needShowError=" + this.f92425iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f92426iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f92427ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f92428zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(int i13, int i14, String smsHash) {
            super(null);
            zdlpuopuiu.btonecajqb(smsHash, "smsHash");
            this.f92426iobyxmoadg = i13;
            this.f92428zoijcleaow = i14;
            this.f92427ppxfxbqfkf = smsHash;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return this.f92426iobyxmoadg == gxszxtbevoVar.f92426iobyxmoadg && this.f92428zoijcleaow == gxszxtbevoVar.f92428zoijcleaow && zdlpuopuiu.eablkybsjg(this.f92427ppxfxbqfkf, gxszxtbevoVar.f92427ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f92426iobyxmoadg) * 31) + Integer.hashCode(this.f92428zoijcleaow)) * 31) + this.f92427ppxfxbqfkf.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f92426iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f92427ppxfxbqfkf;
        }

        public String toString() {
            return "SmsReceived(buttonTitleRes=" + this.f92426iobyxmoadg + ", hintRes=" + this.f92428zoijcleaow + ", smsHash=" + this.f92427ppxfxbqfkf + ")";
        }

        public final int zoijcleaow() {
            return this.f92428zoijcleaow;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92429iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String timerValue) {
            super(null);
            zdlpuopuiu.btonecajqb(timerValue, "timerValue");
            this.f92429iobyxmoadg = timerValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92429iobyxmoadg, ((iobyxmoadg) obj).f92429iobyxmoadg);
        }

        public int hashCode() {
            return this.f92429iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92429iobyxmoadg;
        }

        public String toString() {
            return "ChangeSmsRepeatRequestTimer(timerValue=" + this.f92429iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92430iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f92430iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f92430iobyxmoadg, ((lqeggnwhkg) obj).f92430iobyxmoadg);
        }

        public int hashCode() {
            return this.f92430iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92430iobyxmoadg;
        }

        public String toString() {
            return "SmsRetrieved(smsCode=" + this.f92430iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f92431iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f92432iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f92433zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(int i13, String phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f92432iobyxmoadg = i13;
            this.f92433zoijcleaow = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f92432iobyxmoadg == ppxfxbqfkfVar.f92432iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f92433zoijcleaow, ppxfxbqfkfVar.f92433zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f92432iobyxmoadg) * 31) + this.f92433zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f92432iobyxmoadg;
        }

        public String toString() {
            return "SetDefault(buttonTitleRes=" + this.f92432iobyxmoadg + ", phoneNumber=" + this.f92433zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f92433zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92434iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f92434iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f92434iobyxmoadg, ((wkgbmnqykc) obj).f92434iobyxmoadg);
        }

        public int hashCode() {
            return this.f92434iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92434iobyxmoadg;
        }

        public String toString() {
            return "SmsCodeChanged(smsCode=" + this.f92434iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92435iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f92435iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f92435iobyxmoadg == ((zoijcleaow) obj).f92435iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92435iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92435iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f92435iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
