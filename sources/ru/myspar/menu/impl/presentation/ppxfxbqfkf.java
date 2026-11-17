package ru.myspar.menu.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import o00.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f90473iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(nufgyqmvbu type) {
            super(null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f90473iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f90473iobyxmoadg == ((eablkybsjg) obj).f90473iobyxmoadg;
        }

        public int hashCode() {
            return this.f90473iobyxmoadg.hashCode();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return this.f90473iobyxmoadg;
        }

        public String toString() {
            return "OnSocialMediaClicked(type=" + this.f90473iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.menu.impl.presentation.zoijcleaow.iobyxmoadg f90474iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ru.myspar.menu.impl.presentation.zoijcleaow.iobyxmoadg source) {
            super(null);
            zdlpuopuiu.btonecajqb(source, "source");
            this.f90474iobyxmoadg = source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f90474iobyxmoadg, ((iobyxmoadg) obj).f90474iobyxmoadg);
        }

        public int hashCode() {
            return this.f90474iobyxmoadg.hashCode();
        }

        public final ru.myspar.menu.impl.presentation.zoijcleaow.iobyxmoadg iobyxmoadg() {
            return this.f90474iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(source=" + this.f90474iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.menu.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2079ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90475iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2079ppxfxbqfkf(String menuItemId) {
            super(null);
            zdlpuopuiu.btonecajqb(menuItemId, "menuItemId");
            this.f90475iobyxmoadg = menuItemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2079ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f90475iobyxmoadg, ((C2079ppxfxbqfkf) obj).f90475iobyxmoadg);
        }

        public int hashCode() {
            return this.f90475iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90475iobyxmoadg;
        }

        public String toString() {
            return "OnMenuItemClicked(menuItemId=" + this.f90475iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f90476iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f90476iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f90476iobyxmoadg == ((wkgbmnqykc) obj).f90476iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f90476iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f90476iobyxmoadg;
        }

        public String toString() {
            return "OnRateSuccess(isPositiveRate=" + this.f90476iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f90477iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
