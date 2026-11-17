package ru.myspar.purchases.impl.create_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102278iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1108369342;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2467ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f102279iobyxmoadg;

        public C2467ppxfxbqfkf(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f102279iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2467ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102279iobyxmoadg, ((C2467ppxfxbqfkf) obj).f102279iobyxmoadg);
        }

        public int hashCode() {
            return this.f102279iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f102279iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f102279iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102280iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -791771295;
        }

        public String toString() {
            return "OnCreateNewPurchaseList";
        }
    }
}
