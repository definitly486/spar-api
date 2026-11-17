package ru.myspar.proloyalty.purchases.impl.create_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99570iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -945001541;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.create_list.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2385ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f99571iobyxmoadg;

        public C2385ppxfxbqfkf(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f99571iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2385ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99571iobyxmoadg, ((C2385ppxfxbqfkf) obj).f99571iobyxmoadg);
        }

        public int hashCode() {
            return this.f99571iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f99571iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f99571iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99572iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -48399586;
        }

        public String toString() {
            return "OnCreateNewPurchaseList";
        }
    }
}
