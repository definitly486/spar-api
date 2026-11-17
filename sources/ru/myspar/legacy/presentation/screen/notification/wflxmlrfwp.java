package ru.myspar.legacy.presentation.screen.notification;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {

    public static final class iobyxmoadg extends wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89335iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String promoCode) {
            super(null);
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f89335iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89335iobyxmoadg, ((iobyxmoadg) obj).f89335iobyxmoadg);
        }

        public int hashCode() {
            return this.f89335iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89335iobyxmoadg;
        }

        public String toString() {
            return "CopyPromoCode(promoCode=" + this.f89335iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pc0.zoijcleaow f89336iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(pc0.zoijcleaow notification) {
            super(null);
            zdlpuopuiu.btonecajqb(notification, "notification");
            this.f89336iobyxmoadg = notification;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89336iobyxmoadg, ((ppxfxbqfkf) obj).f89336iobyxmoadg);
        }

        public int hashCode() {
            return this.f89336iobyxmoadg.hashCode();
        }

        public final pc0.zoijcleaow iobyxmoadg() {
            return this.f89336iobyxmoadg;
        }

        public String toString() {
            return "ShowQuizDialog(notification=" + this.f89336iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89337iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f89338zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String title, String message) {
            super(null);
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f89337iobyxmoadg = title;
            this.f89338zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f89337iobyxmoadg, zoijcleaowVar.f89337iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89338zoijcleaow, zoijcleaowVar.f89338zoijcleaow);
        }

        public int hashCode() {
            return (this.f89337iobyxmoadg.hashCode() * 31) + this.f89338zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89338zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f89337iobyxmoadg + ", message=" + this.f89338zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f89337iobyxmoadg;
        }
    }

    public /* synthetic */ wflxmlrfwp(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wflxmlrfwp() {
    }
}
