package yk0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.card.domain.model.UserCardData;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f125545iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f125545iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f125545iobyxmoadg == ((eablkybsjg) obj).f125545iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f125545iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f125545iobyxmoadg;
        }

        public String toString() {
            return "SetNeedActivateCard(isNeedActivateCard=" + this.f125545iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: yk0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3199gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125546iobyxmoadg;

        public C3199gxszxtbevo(String str) {
            this.f125546iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3199gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f125546iobyxmoadg, ((C3199gxszxtbevo) obj).f125546iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f125546iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125546iobyxmoadg;
        }

        public String toString() {
            return "SetScanResult(value=" + this.f125546iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f125547iobyxmoadg;

        public iobyxmoadg(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f125547iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f125547iobyxmoadg, ((iobyxmoadg) obj).f125547iobyxmoadg);
        }

        public int hashCode() {
            return this.f125547iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f125547iobyxmoadg;
        }

        public String toString() {
            return "ChangeCardNumber(value=" + this.f125547iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f125548iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1981936887;
        }

        public String toString() {
            return "ShowConfirmDialog";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserCardData f125549iobyxmoadg;

        public ppxfxbqfkf(UserCardData data) {
            zdlpuopuiu.btonecajqb(data, "data");
            this.f125549iobyxmoadg = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f125549iobyxmoadg, ((ppxfxbqfkf) obj).f125549iobyxmoadg);
        }

        public int hashCode() {
            return this.f125549iobyxmoadg.hashCode();
        }

        public final UserCardData iobyxmoadg() {
            return this.f125549iobyxmoadg;
        }

        public String toString() {
            return "PersonalCardDataFetched(data=" + this.f125549iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f125550iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f125550iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f125550iobyxmoadg == ((wkgbmnqykc) obj).f125550iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f125550iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f125550iobyxmoadg;
        }

        public String toString() {
            return "SetLoadingState(isLoading=" + this.f125550iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f125551iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 576817874;
        }

        public String toString() {
            return "HideConfirmDialog";
        }
    }
}
