package ru.myspar.proloyalty.notification.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.push.NotificationModel;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98513iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1232022268;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NotificationModel f98514iobyxmoadg;

        public ppxfxbqfkf(NotificationModel notification) {
            zdlpuopuiu.btonecajqb(notification, "notification");
            this.f98514iobyxmoadg = notification;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f98514iobyxmoadg, ((ppxfxbqfkf) obj).f98514iobyxmoadg);
        }

        public int hashCode() {
            return this.f98514iobyxmoadg.hashCode();
        }

        public final NotificationModel iobyxmoadg() {
            return this.f98514iobyxmoadg;
        }

        public String toString() {
            return "OpenQuiz(notification=" + this.f98514iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98515iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98516zoijcleaow;

        public zoijcleaow(String title, String message) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f98515iobyxmoadg = title;
            this.f98516zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f98515iobyxmoadg, zoijcleaowVar.f98515iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98516zoijcleaow, zoijcleaowVar.f98516zoijcleaow);
        }

        public int hashCode() {
            return (this.f98515iobyxmoadg.hashCode() * 31) + this.f98516zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98516zoijcleaow;
        }

        public String toString() {
            return "OpenNotification(title=" + this.f98515iobyxmoadg + ", message=" + this.f98516zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98515iobyxmoadg;
        }
    }
}
