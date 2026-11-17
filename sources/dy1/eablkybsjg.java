package dy1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.create_list.domain.store.CreatePurchaseListsFragmentArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29942iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2009994939;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f29943iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -2070870898;
        }

        public String toString() {
            return "OnSuccessAddedProductToList";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f29944iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f29944iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29944iobyxmoadg, ((wkgbmnqykc) obj).f29944iobyxmoadg);
        }

        public int hashCode() {
            return this.f29944iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f29944iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f29944iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CreatePurchaseListsFragmentArgs f29945iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(CreatePurchaseListsFragmentArgs fragmentArgs) {
            super(null);
            zdlpuopuiu.btonecajqb(fragmentArgs, "fragmentArgs");
            this.f29945iobyxmoadg = fragmentArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29945iobyxmoadg, ((zoijcleaow) obj).f29945iobyxmoadg);
        }

        public int hashCode() {
            return this.f29945iobyxmoadg.hashCode();
        }

        public final CreatePurchaseListsFragmentArgs iobyxmoadg() {
            return this.f29945iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCreateNewPurchaseListScreen(fragmentArgs=" + this.f29945iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
