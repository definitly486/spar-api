package em;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final AtomicReference f31490iobyxmoadg = new AtomicReference();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final wkgbmnqykc f31491iobyxmoadg = iobyxmoadg();

        static wkgbmnqykc iobyxmoadg() {
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(wkgbmnqykc.f31490iobyxmoadg, null, new nufgyqmvbu());
            return (wkgbmnqykc) wkgbmnqykc.f31490iobyxmoadg.get();
        }
    }

    static wkgbmnqykc zoijcleaow() {
        return iobyxmoadg.f31491iobyxmoadg;
    }

    public abstract String ppxfxbqfkf(gm.nufgyqmvbu nufgyqmvbuVar, long j13, dxjokdxxww dxjokdxxwwVar, Locale locale);
}
