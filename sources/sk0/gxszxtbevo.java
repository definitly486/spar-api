package sk0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserState;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f107233iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f107233iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f107233iobyxmoadg == ((iobyxmoadg) obj).f107233iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f107233iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f107233iobyxmoadg;
        }

        public String toString() {
            return "ProfileLoadingChanged(isLoading=" + this.f107233iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserState f107234iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f107235ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f107236wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f107237zoijcleaow;

        public zoijcleaow(UserState userState, boolean z13, boolean z14, boolean z15) {
            zdlpuopuiu.btonecajqb(userState, "userState");
            this.f107234iobyxmoadg = userState;
            this.f107237zoijcleaow = z13;
            this.f107235ppxfxbqfkf = z14;
            this.f107236wkgbmnqykc = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f107234iobyxmoadg, zoijcleaowVar.f107234iobyxmoadg) && this.f107237zoijcleaow == zoijcleaowVar.f107237zoijcleaow && this.f107235ppxfxbqfkf == zoijcleaowVar.f107235ppxfxbqfkf && this.f107236wkgbmnqykc == zoijcleaowVar.f107236wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f107234iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f107237zoijcleaow)) * 31) + Boolean.hashCode(this.f107235ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f107236wkgbmnqykc);
        }

        public final UserState iobyxmoadg() {
            return this.f107234iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f107236wkgbmnqykc;
        }

        public String toString() {
            return "UserStateFetched(userState=" + this.f107234iobyxmoadg + ", isMyDiscountEnabled=" + this.f107237zoijcleaow + ", isSavedCardsEnabled=" + this.f107235ppxfxbqfkf + ", isPurchasesListEnabled=" + this.f107236wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f107235ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f107237zoijcleaow;
        }
    }
}
