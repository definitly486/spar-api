package ru.myspar.proloyalty.notification.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98543iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1429870808;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b01.iobyxmoadg f98544iobyxmoadg;

        public ppxfxbqfkf(b01.iobyxmoadg type) {
            zdlpuopuiu.btonecajqb(type, "type");
            this.f98544iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f98544iobyxmoadg == ((ppxfxbqfkf) obj).f98544iobyxmoadg;
        }

        public int hashCode() {
            return this.f98544iobyxmoadg.hashCode();
        }

        public final b01.iobyxmoadg iobyxmoadg() {
            return this.f98544iobyxmoadg;
        }

        public String toString() {
            return "RefreshNotifications(type=" + this.f98544iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b01.iobyxmoadg f98545iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98546zoijcleaow;

        public zoijcleaow(b01.iobyxmoadg type, String id2) {
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f98545iobyxmoadg = type;
            this.f98546zoijcleaow = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f98545iobyxmoadg == zoijcleaowVar.f98545iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f98546zoijcleaow, zoijcleaowVar.f98546zoijcleaow);
        }

        public int hashCode() {
            return (this.f98545iobyxmoadg.hashCode() * 31) + this.f98546zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98546zoijcleaow;
        }

        public String toString() {
            return "ProcessActionNotification(type=" + this.f98545iobyxmoadg + ", id=" + this.f98546zoijcleaow + ")";
        }

        public final b01.iobyxmoadg zoijcleaow() {
            return this.f98545iobyxmoadg;
        }
    }
}
