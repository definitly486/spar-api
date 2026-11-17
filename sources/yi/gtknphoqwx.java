package yi;

/* JADX INFO: loaded from: classes3.dex */
public interface gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f125304iobyxmoadg = iobyxmoadg.f125305iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f125305iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final wkgbmnqykc iobyxmoadg(Runnable runnable, tg.draadjrbmk draadjrbmkVar) {
            return (runnable == null || draadjrbmkVar == null) ? new wkgbmnqykc(null, 1, null) : new ppxfxbqfkf(runnable, draadjrbmkVar);
        }
    }

    void lock();

    void unlock();
}
