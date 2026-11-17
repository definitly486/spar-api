package ru.myspar.proloyalty.purchases.impl.list_shared_with_you.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99799iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_shared_with_you.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2395ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99800iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2395ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99800iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2395ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99800iobyxmoadg, ((C2395ppxfxbqfkf) obj).f99800iobyxmoadg);
        }

        public int hashCode() {
            return this.f99800iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99800iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99800iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99801iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purchasedListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchasedListId, "purchasedListId");
            this.f99801iobyxmoadg = purchasedListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99801iobyxmoadg, ((zoijcleaow) obj).f99801iobyxmoadg);
        }

        public int hashCode() {
            return this.f99801iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99801iobyxmoadg;
        }

        public String toString() {
            return "OnNavigateToDetailScreen(purchasedListId=" + this.f99801iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
