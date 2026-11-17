package ru.myspar.catalog.impl.pager.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {
        public abstract String iobyxmoadg();
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85227iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f85227iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85227iobyxmoadg, ((iobyxmoadg) obj).f85227iobyxmoadg);
        }

        public int hashCode() {
            return this.f85227iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85227iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckedDialog(id=" + this.f85227iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1940ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f85228iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1940ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f85228iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1940ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f85228iobyxmoadg, ((C1940ppxfxbqfkf) obj).f85228iobyxmoadg);
        }

        public int hashCode() {
            return this.f85228iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f85228iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f85228iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {
        public abstract String iobyxmoadg();
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f85229iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 798756020;
        }

        public String toString() {
            return "ShowChangeCityDialog";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
