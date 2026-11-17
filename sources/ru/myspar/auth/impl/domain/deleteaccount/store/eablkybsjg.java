package ru.myspar.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1906eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84422iobyxmoadg;

        public C1906eablkybsjg(boolean z13) {
            super(null);
            this.f84422iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1906eablkybsjg) && this.f84422iobyxmoadg == ((C1906eablkybsjg) obj).f84422iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84422iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84422iobyxmoadg;
        }

        public String toString() {
            return "SmsErrorChanged(needShowError=" + this.f84422iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f84423iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f84424zoijcleaow;

        public gxszxtbevo(int i13, int i14) {
            super(null);
            this.f84423iobyxmoadg = i13;
            this.f84424zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return this.f84423iobyxmoadg == gxszxtbevoVar.f84423iobyxmoadg && this.f84424zoijcleaow == gxszxtbevoVar.f84424zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f84423iobyxmoadg) * 31) + Integer.hashCode(this.f84424zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f84423iobyxmoadg;
        }

        public String toString() {
            return "SmsReceived(buttonTitleRes=" + this.f84423iobyxmoadg + ", hintRes=" + this.f84424zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f84424zoijcleaow;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84425iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String timerValue) {
            super(null);
            zdlpuopuiu.btonecajqb(timerValue, "timerValue");
            this.f84425iobyxmoadg = timerValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84425iobyxmoadg, ((iobyxmoadg) obj).f84425iobyxmoadg);
        }

        public int hashCode() {
            return this.f84425iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84425iobyxmoadg;
        }

        public String toString() {
            return "ChangeSmsRepeatRequestTimer(timerValue=" + this.f84425iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84426iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f84426iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f84426iobyxmoadg, ((lqeggnwhkg) obj).f84426iobyxmoadg);
        }

        public int hashCode() {
            return this.f84426iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84426iobyxmoadg;
        }

        public String toString() {
            return "SmsRetrieved(smsCode=" + this.f84426iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f84427iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f84428iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f84429zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(int i13, String phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f84428iobyxmoadg = i13;
            this.f84429zoijcleaow = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f84428iobyxmoadg == ppxfxbqfkfVar.f84428iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f84429zoijcleaow, ppxfxbqfkfVar.f84429zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f84428iobyxmoadg) * 31) + this.f84429zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f84428iobyxmoadg;
        }

        public String toString() {
            return "SetDefault(buttonTitleRes=" + this.f84428iobyxmoadg + ", phoneNumber=" + this.f84429zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f84429zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84430iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f84430iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f84430iobyxmoadg, ((wkgbmnqykc) obj).f84430iobyxmoadg);
        }

        public int hashCode() {
            return this.f84430iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84430iobyxmoadg;
        }

        public String toString() {
            return "SmsCodeChanged(smsCode=" + this.f84430iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84431iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f84431iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f84431iobyxmoadg == ((zoijcleaow) obj).f84431iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84431iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84431iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f84431iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
