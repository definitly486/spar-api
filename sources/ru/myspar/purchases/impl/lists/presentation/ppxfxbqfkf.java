package ru.myspar.purchases.impl.lists.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102547iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String listId) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            this.f102547iobyxmoadg = listId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102547iobyxmoadg, ((iobyxmoadg) obj).f102547iobyxmoadg);
        }

        public int hashCode() {
            return this.f102547iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102547iobyxmoadg;
        }

        public String toString() {
            return "ShowConfirmDeleteDialog(listId=" + this.f102547iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.lists.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2480ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2480ppxfxbqfkf f102548iobyxmoadg = new C2480ppxfxbqfkf();

        private C2480ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2480ppxfxbqfkf);
        }

        public int hashCode() {
            return -1716486709;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102549iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102549iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102549iobyxmoadg, ((zoijcleaow) obj).f102549iobyxmoadg);
        }

        public int hashCode() {
            return this.f102549iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102549iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102549iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
