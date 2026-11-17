package modern.payments.tracker.impl;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.tracker.util.logging.ILogTree;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackerImpl_Factory implements wkgbmnqykc {
    private final iobyxmoadg logTreeProvider;

    public TrackerImpl_Factory(iobyxmoadg iobyxmoadgVar) {
        this.logTreeProvider = iobyxmoadgVar;
    }

    public static TrackerImpl_Factory create(iobyxmoadg iobyxmoadgVar) {
        return new TrackerImpl_Factory(iobyxmoadgVar);
    }

    public static TrackerImpl newInstance(ILogTree iLogTree) {
        return new TrackerImpl(iLogTree);
    }

    @Override // fg.iobyxmoadg
    public TrackerImpl get() {
        return newInstance((ILogTree) this.logTreeProvider.get());
    }
}
