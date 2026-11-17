package ru.myspar.legacy.presentation.screen.notification;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {

    public static final class iobyxmoadg extends gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89330iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f89331iobyxmoadg;

        public ppxfxbqfkf(int i13) {
            super(null);
            this.f89331iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f89331iobyxmoadg == ((ppxfxbqfkf) obj).f89331iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f89331iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f89331iobyxmoadg;
        }

        public String toString() {
            return "OnPageSelected(pageId=" + this.f89331iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pc0.zoijcleaow f89332iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(pc0.zoijcleaow notification) {
            super(null);
            zdlpuopuiu.btonecajqb(notification, "notification");
            this.f89332iobyxmoadg = notification;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89332iobyxmoadg, ((zoijcleaow) obj).f89332iobyxmoadg);
        }

        public int hashCode() {
            return this.f89332iobyxmoadg.hashCode();
        }

        public final pc0.zoijcleaow iobyxmoadg() {
            return this.f89332iobyxmoadg;
        }

        public String toString() {
            return "OnNotificationClicked(notification=" + this.f89332iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gtknphoqwx(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gtknphoqwx() {
    }
}
