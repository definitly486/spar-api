package ru.myspar.proloyalty.catalog.impl.pager.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {
        public abstract String iobyxmoadg();
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93153iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f93153iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93153iobyxmoadg, ((iobyxmoadg) obj).f93153iobyxmoadg);
        }

        public int hashCode() {
            return this.f93153iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93153iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckedDialog(id=" + this.f93153iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.pager.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2182ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f93154iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2182ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f93154iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2182ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f93154iobyxmoadg, ((C2182ppxfxbqfkf) obj).f93154iobyxmoadg);
        }

        public int hashCode() {
            return this.f93154iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f93154iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f93154iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {
        public abstract String iobyxmoadg();
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f93155iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1849432689;
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
