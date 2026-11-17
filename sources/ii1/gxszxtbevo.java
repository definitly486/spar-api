package ii1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.user.domain.model.UserNews;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserBalance f44513iobyxmoadg;

        public iobyxmoadg(UserBalance balance) {
            zdlpuopuiu.btonecajqb(balance, "balance");
            this.f44513iobyxmoadg = balance;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44513iobyxmoadg, ((iobyxmoadg) obj).f44513iobyxmoadg);
        }

        public int hashCode() {
            return this.f44513iobyxmoadg.hashCode();
        }

        public final UserBalance iobyxmoadg() {
            return this.f44513iobyxmoadg;
        }

        public String toString() {
            return "BalanceFetched(balance=" + this.f44513iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserNews f44514iobyxmoadg;

        public ppxfxbqfkf(UserNews news) {
            zdlpuopuiu.btonecajqb(news, "news");
            this.f44514iobyxmoadg = news;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f44514iobyxmoadg, ((ppxfxbqfkf) obj).f44514iobyxmoadg);
        }

        public int hashCode() {
            return this.f44514iobyxmoadg.hashCode();
        }

        public final UserNews iobyxmoadg() {
            return this.f44514iobyxmoadg;
        }

        public String toString() {
            return "NewsFetched(news=" + this.f44514iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f44515iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f44515iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f44515iobyxmoadg == ((wkgbmnqykc) obj).f44515iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44515iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f44515iobyxmoadg;
        }

        public String toString() {
            return "ProfileLoadingChanged(isLoading=" + this.f44515iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f44516iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f44517ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f44518zoijcleaow;

        public zoijcleaow(boolean z13, boolean z14, boolean z15) {
            this.f44516iobyxmoadg = z13;
            this.f44518zoijcleaow = z14;
            this.f44517ppxfxbqfkf = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f44516iobyxmoadg == zoijcleaowVar.f44516iobyxmoadg && this.f44518zoijcleaow == zoijcleaowVar.f44518zoijcleaow && this.f44517ppxfxbqfkf == zoijcleaowVar.f44517ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f44516iobyxmoadg) * 31) + Boolean.hashCode(this.f44518zoijcleaow)) * 31) + Boolean.hashCode(this.f44517ppxfxbqfkf);
        }

        public final boolean iobyxmoadg() {
            return this.f44516iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f44518zoijcleaow;
        }

        public String toString() {
            return "FlagFetched(isMyDiscountEnabled=" + this.f44516iobyxmoadg + ", isSavedCardsEnabled=" + this.f44518zoijcleaow + ", isPurchasesListEnabled=" + this.f44517ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f44517ppxfxbqfkf;
        }
    }
}
