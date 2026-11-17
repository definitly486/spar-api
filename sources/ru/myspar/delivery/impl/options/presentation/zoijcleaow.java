package ru.myspar.delivery.impl.options.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f87690iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1220165415;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f87691iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f87692zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String groupCode, String commentCode) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(commentCode, "commentCode");
            this.f87691iobyxmoadg = groupCode;
            this.f87692zoijcleaow = commentCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f87691iobyxmoadg, ppxfxbqfkfVar.f87691iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87692zoijcleaow, ppxfxbqfkfVar.f87692zoijcleaow);
        }

        public int hashCode() {
            return (this.f87691iobyxmoadg.hashCode() * 31) + this.f87692zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f87692zoijcleaow;
        }

        public String toString() {
            return "OnCommentCheckedChange(groupCode=" + this.f87691iobyxmoadg + ", commentCode=" + this.f87692zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f87691iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f87693iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -743047475;
        }

        public String toString() {
            return "OnDoneClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.delivery.impl.options.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2001zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f87694iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f87695ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f87696wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f87697zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2001zoijcleaow(String groupCode, String code, boolean z13, String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f87694iobyxmoadg = groupCode;
            this.f87697zoijcleaow = code;
            this.f87695ppxfxbqfkf = z13;
            this.f87696wkgbmnqykc = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2001zoijcleaow)) {
                return false;
            }
            C2001zoijcleaow c2001zoijcleaow = (C2001zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f87694iobyxmoadg, c2001zoijcleaow.f87694iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f87697zoijcleaow, c2001zoijcleaow.f87697zoijcleaow) && this.f87695ppxfxbqfkf == c2001zoijcleaow.f87695ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f87696wkgbmnqykc, c2001zoijcleaow.f87696wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f87694iobyxmoadg.hashCode() * 31) + this.f87697zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f87695ppxfxbqfkf)) * 31) + this.f87696wkgbmnqykc.hashCode();
        }

        public final boolean iobyxmoadg() {
            return this.f87695ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f87696wkgbmnqykc;
        }

        public String toString() {
            return "OnCommentChanged(groupCode=" + this.f87694iobyxmoadg + ", code=" + this.f87697zoijcleaow + ", checked=" + this.f87695ppxfxbqfkf + ", comment=" + this.f87696wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f87694iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f87697zoijcleaow;
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
