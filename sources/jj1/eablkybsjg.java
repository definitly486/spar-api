package jj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.create_list.domain.store.CreatePurchaseListsFragmentArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f51601iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1797110910;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f51602iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -897944143;
        }

        public String toString() {
            return "OnSuccessAddedProductToList";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f51603iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f51603iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f51603iobyxmoadg, ((wkgbmnqykc) obj).f51603iobyxmoadg);
        }

        public int hashCode() {
            return this.f51603iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f51603iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f51603iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CreatePurchaseListsFragmentArgs f51604iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(CreatePurchaseListsFragmentArgs fragmentArgs) {
            super(null);
            zdlpuopuiu.btonecajqb(fragmentArgs, "fragmentArgs");
            this.f51604iobyxmoadg = fragmentArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51604iobyxmoadg, ((zoijcleaow) obj).f51604iobyxmoadg);
        }

        public int hashCode() {
            return this.f51604iobyxmoadg.hashCode();
        }

        public final CreatePurchaseListsFragmentArgs iobyxmoadg() {
            return this.f51604iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCreateNewPurchaseListScreen(fragmentArgs=" + this.f51604iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
