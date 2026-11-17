package ru.myspar.purchases.impl.list_add_product.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.create_list.domain.store.CreatePurchaseListsFragmentArgs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102389iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_add_product.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2471ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2471ppxfxbqfkf f102390iobyxmoadg = new C2471ppxfxbqfkf();

        private C2471ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102391iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102391iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f102391iobyxmoadg, ((wkgbmnqykc) obj).f102391iobyxmoadg);
        }

        public int hashCode() {
            return this.f102391iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102391iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102391iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CreatePurchaseListsFragmentArgs f102392iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(CreatePurchaseListsFragmentArgs fragmentArgs) {
            super(null);
            zdlpuopuiu.btonecajqb(fragmentArgs, "fragmentArgs");
            this.f102392iobyxmoadg = fragmentArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102392iobyxmoadg, ((zoijcleaow) obj).f102392iobyxmoadg);
        }

        public int hashCode() {
            return this.f102392iobyxmoadg.hashCode();
        }

        public final CreatePurchaseListsFragmentArgs iobyxmoadg() {
            return this.f102392iobyxmoadg;
        }

        public String toString() {
            return "NavigateToCreateNewPurchaseListScreen(fragmentArgs=" + this.f102392iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
