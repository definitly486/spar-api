package ru.myspar.proloyalty.legacy.presentation.screen.review;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f97264iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f97264iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f97264iobyxmoadg == ((iobyxmoadg) obj).f97264iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f97264iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f97264iobyxmoadg;
        }

        public String toString() {
            return "OnComplete(isComplete=" + this.f97264iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2294ppxfxbqfkf extends ppxfxbqfkf {
        public abstract Throwable iobyxmoadg();
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97265iobyxmoadg = new zoijcleaow();

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
