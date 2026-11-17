package ru.myspar.legacy.presentation.dialogs.specificpromotion;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88755iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2036ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2036ppxfxbqfkf f88756iobyxmoadg = new C2036ppxfxbqfkf();

        private C2036ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88757iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88757iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88757iobyxmoadg, ((zoijcleaow) obj).f88757iobyxmoadg);
        }

        public int hashCode() {
            return this.f88757iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88757iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88757iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
