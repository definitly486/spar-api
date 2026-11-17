package ru.myspar.proloyalty.menu.impl.presentation;

import gz0.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f98083iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(nufgyqmvbu type) {
            super(null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f98083iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f98083iobyxmoadg == ((eablkybsjg) obj).f98083iobyxmoadg;
        }

        public int hashCode() {
            return this.f98083iobyxmoadg.hashCode();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return this.f98083iobyxmoadg;
        }

        public String toString() {
            return "OnSocialMediaClicked(type=" + this.f98083iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.iobyxmoadg f98084iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.iobyxmoadg source) {
            super(null);
            zdlpuopuiu.btonecajqb(source, "source");
            this.f98084iobyxmoadg = source;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98084iobyxmoadg, ((iobyxmoadg) obj).f98084iobyxmoadg);
        }

        public int hashCode() {
            return this.f98084iobyxmoadg.hashCode();
        }

        public final ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.iobyxmoadg iobyxmoadg() {
            return this.f98084iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(source=" + this.f98084iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2324ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98085iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2324ppxfxbqfkf(String menuItemId) {
            super(null);
            zdlpuopuiu.btonecajqb(menuItemId, "menuItemId");
            this.f98085iobyxmoadg = menuItemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2324ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f98085iobyxmoadg, ((C2324ppxfxbqfkf) obj).f98085iobyxmoadg);
        }

        public int hashCode() {
            return this.f98085iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98085iobyxmoadg;
        }

        public String toString() {
            return "OnMenuItemClicked(menuItemId=" + this.f98085iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98086iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f98086iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f98086iobyxmoadg == ((wkgbmnqykc) obj).f98086iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98086iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98086iobyxmoadg;
        }

        public String toString() {
            return "OnRateSuccess(isPositiveRate=" + this.f98086iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f98087iobyxmoadg = new zoijcleaow();

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
