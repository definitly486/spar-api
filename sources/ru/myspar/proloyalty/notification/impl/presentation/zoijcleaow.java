package ru.myspar.proloyalty.notification.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98552iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -511745203;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jf1.iobyxmoadg f98553iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98554zoijcleaow;

        public ppxfxbqfkf(jf1.iobyxmoadg type, String id2) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f98553iobyxmoadg = type;
            this.f98554zoijcleaow = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f98553iobyxmoadg == ppxfxbqfkfVar.f98553iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f98554zoijcleaow, ppxfxbqfkfVar.f98554zoijcleaow);
        }

        public int hashCode() {
            return (this.f98553iobyxmoadg.hashCode() * 31) + this.f98554zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98554zoijcleaow;
        }

        public String toString() {
            return "OnNotificationClick(type=" + this.f98553iobyxmoadg + ", id=" + this.f98554zoijcleaow + ")";
        }

        public final jf1.iobyxmoadg zoijcleaow() {
            return this.f98553iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2356zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jf1.iobyxmoadg f98555iobyxmoadg;

        public C2356zoijcleaow(jf1.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f98555iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2356zoijcleaow) && this.f98555iobyxmoadg == ((C2356zoijcleaow) obj).f98555iobyxmoadg;
        }

        public int hashCode() {
            return this.f98555iobyxmoadg.hashCode();
        }

        public final jf1.iobyxmoadg iobyxmoadg() {
            return this.f98555iobyxmoadg;
        }

        public String toString() {
            return "OnChangeTab(type=" + this.f98555iobyxmoadg + ")";
        }
    }
}
