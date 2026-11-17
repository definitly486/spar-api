package hn1;

import m9.wkgbmnqykc;
import ru.myspar.proloyalty.scan.api.model.ScanScreenPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C0946iobyxmoadg f40825iobyxmoadg = C0946iobyxmoadg.f40826iobyxmoadg;

    /* JADX INFO: renamed from: hn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0946iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C0946iobyxmoadg f40826iobyxmoadg = new C0946iobyxmoadg();

        private C0946iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc iobyxmoadg(iobyxmoadg iobyxmoadgVar, ScanScreenPayload scanScreenPayload, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanScreen");
        }
        if ((i13 & 1) != 0) {
            scanScreenPayload = new ScanScreenPayload(in1.iobyxmoadg.Product);
        }
        return iobyxmoadgVar.zoijcleaow(scanScreenPayload);
    }

    wkgbmnqykc zoijcleaow(ScanScreenPayload scanScreenPayload);
}
