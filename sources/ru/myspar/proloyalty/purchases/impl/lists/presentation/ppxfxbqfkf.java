package ru.myspar.proloyalty.purchases.impl.lists.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99833iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String listId) {
            super(null);
            zdlpuopuiu.btonecajqb(listId, "listId");
            this.f99833iobyxmoadg = listId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99833iobyxmoadg, ((iobyxmoadg) obj).f99833iobyxmoadg);
        }

        public int hashCode() {
            return this.f99833iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99833iobyxmoadg;
        }

        public String toString() {
            return "ShowConfirmDeleteDialog(listId=" + this.f99833iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.lists.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2398ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2398ppxfxbqfkf f99834iobyxmoadg = new C2398ppxfxbqfkf();

        private C2398ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2398ppxfxbqfkf);
        }

        public int hashCode() {
            return -736778872;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99835iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99835iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99835iobyxmoadg, ((zoijcleaow) obj).f99835iobyxmoadg);
        }

        public int hashCode() {
            return this.f99835iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99835iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99835iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
