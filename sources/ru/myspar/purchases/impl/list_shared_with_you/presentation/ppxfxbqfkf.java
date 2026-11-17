package ru.myspar.purchases.impl.list_shared_with_you.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102513iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_shared_with_you.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2477ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102514iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2477ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102514iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2477ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102514iobyxmoadg, ((C2477ppxfxbqfkf) obj).f102514iobyxmoadg);
        }

        public int hashCode() {
            return this.f102514iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102514iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102514iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102515iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purchasedListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchasedListId, "purchasedListId");
            this.f102515iobyxmoadg = purchasedListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102515iobyxmoadg, ((zoijcleaow) obj).f102515iobyxmoadg);
        }

        public int hashCode() {
            return this.f102515iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102515iobyxmoadg;
        }

        public String toString() {
            return "OnNavigateToDetailScreen(purchasedListId=" + this.f102515iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
