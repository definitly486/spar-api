package ru.myspar.proloyalty.delivery.impl.options.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f95472iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1693078154;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f95473iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f95474zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String groupCode, String commentCode) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(commentCode, "commentCode");
            this.f95473iobyxmoadg = groupCode;
            this.f95474zoijcleaow = commentCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f95473iobyxmoadg, ppxfxbqfkfVar.f95473iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95474zoijcleaow, ppxfxbqfkfVar.f95474zoijcleaow);
        }

        public int hashCode() {
            return (this.f95473iobyxmoadg.hashCode() * 31) + this.f95474zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f95474zoijcleaow;
        }

        public String toString() {
            return "OnCommentCheckedChange(groupCode=" + this.f95473iobyxmoadg + ", commentCode=" + this.f95474zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f95473iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f95475iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1451855600;
        }

        public String toString() {
            return "OnDoneClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.delivery.impl.options.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2238zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f95476iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f95477ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f95478wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f95479zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2238zoijcleaow(String groupCode, String code, boolean z13, String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f95476iobyxmoadg = groupCode;
            this.f95479zoijcleaow = code;
            this.f95477ppxfxbqfkf = z13;
            this.f95478wkgbmnqykc = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2238zoijcleaow)) {
                return false;
            }
            C2238zoijcleaow c2238zoijcleaow = (C2238zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f95476iobyxmoadg, c2238zoijcleaow.f95476iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f95479zoijcleaow, c2238zoijcleaow.f95479zoijcleaow) && this.f95477ppxfxbqfkf == c2238zoijcleaow.f95477ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f95478wkgbmnqykc, c2238zoijcleaow.f95478wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f95476iobyxmoadg.hashCode() * 31) + this.f95479zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f95477ppxfxbqfkf)) * 31) + this.f95478wkgbmnqykc.hashCode();
        }

        public final boolean iobyxmoadg() {
            return this.f95477ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f95478wkgbmnqykc;
        }

        public String toString() {
            return "OnCommentChanged(groupCode=" + this.f95476iobyxmoadg + ", code=" + this.f95479zoijcleaow + ", checked=" + this.f95477ppxfxbqfkf + ", comment=" + this.f95478wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f95476iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f95479zoijcleaow;
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
