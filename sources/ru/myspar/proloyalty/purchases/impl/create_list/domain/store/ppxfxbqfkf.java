package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99545iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 132193232;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2383ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f99546iobyxmoadg;

        public C2383ppxfxbqfkf(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f99546iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2383ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99546iobyxmoadg, ((C2383ppxfxbqfkf) obj).f99546iobyxmoadg);
        }

        public int hashCode() {
            return this.f99546iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f99546iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f99546iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99547iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -34024205;
        }

        public String toString() {
            return "OnCreateNewPurchaseList";
        }
    }
}
