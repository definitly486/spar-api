package ru.myspar.proloyalty.notification.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98547iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98548zoijcleaow;

        public iobyxmoadg(String title, String message) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f98547iobyxmoadg = title;
            this.f98548zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f98547iobyxmoadg, iobyxmoadgVar.f98547iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98548zoijcleaow, iobyxmoadgVar.f98548zoijcleaow);
        }

        public int hashCode() {
            return (this.f98547iobyxmoadg.hashCode() * 31) + this.f98548zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98548zoijcleaow;
        }

        public String toString() {
            return "ShowNotificationDialog(title=" + this.f98547iobyxmoadg + ", message=" + this.f98548zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98547iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98549iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f98550ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98551zoijcleaow;

        public zoijcleaow(String title, String message, String reference) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f98549iobyxmoadg = title;
            this.f98551zoijcleaow = message;
            this.f98550ppxfxbqfkf = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f98549iobyxmoadg, zoijcleaowVar.f98549iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98551zoijcleaow, zoijcleaowVar.f98551zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f98550ppxfxbqfkf, zoijcleaowVar.f98550ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f98549iobyxmoadg.hashCode() * 31) + this.f98551zoijcleaow.hashCode()) * 31) + this.f98550ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98551zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f98549iobyxmoadg;
        }

        public String toString() {
            return "ShowQuizDialog(title=" + this.f98549iobyxmoadg + ", message=" + this.f98551zoijcleaow + ", reference=" + this.f98550ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f98550ppxfxbqfkf;
        }
    }
}
