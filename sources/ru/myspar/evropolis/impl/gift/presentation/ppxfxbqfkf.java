package ru.myspar.evropolis.impl.gift.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88329iobyxmoadg;

        public eablkybsjg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88329iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f88329iobyxmoadg, ((eablkybsjg) obj).f88329iobyxmoadg);
        }

        public int hashCode() {
            return this.f88329iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88329iobyxmoadg;
        }

        public String toString() {
            return "ShowLimitAddedMessage(message=" + this.f88329iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f88330iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88331iobyxmoadg;

        public iobyxmoadg(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.f88331iobyxmoadg = text;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88331iobyxmoadg, ((iobyxmoadg) obj).f88331iobyxmoadg);
        }

        public int hashCode() {
            return this.f88331iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88331iobyxmoadg;
        }

        public String toString() {
            return "CopyToClipboard(text=" + this.f88331iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f88332iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }
    }

    /* JADX INFO: renamed from: ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2025ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddProductParams f88333iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88334zoijcleaow;

        public C2025ppxfxbqfkf(AddProductParams params, String message) {
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f88333iobyxmoadg = params;
            this.f88334zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2025ppxfxbqfkf)) {
                return false;
            }
            C2025ppxfxbqfkf c2025ppxfxbqfkf = (C2025ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f88333iobyxmoadg, c2025ppxfxbqfkf.f88333iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88334zoijcleaow, c2025ppxfxbqfkf.f88334zoijcleaow);
        }

        public int hashCode() {
            return (this.f88333iobyxmoadg.hashCode() * 31) + this.f88334zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88334zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f88333iobyxmoadg + ", message=" + this.f88334zoijcleaow + ")";
        }

        public final AddProductParams zoijcleaow() {
            return this.f88333iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88335iobyxmoadg;

        public wkgbmnqykc(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88335iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88335iobyxmoadg, ((wkgbmnqykc) obj).f88335iobyxmoadg);
        }

        public int hashCode() {
            return this.f88335iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88335iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88335iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88336iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }
    }
}
