package modern.payments.ecomAndroid.util.media.impl;

import ag.wkgbmnqykc;
import android.content.Context;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaPlayerImpl_Factory implements wkgbmnqykc {
    private final fg.iobyxmoadg contextProvider;
    private final fg.iobyxmoadg optionsRepositoryProvider;
    private final fg.iobyxmoadg trackerProvider;

    public MediaPlayerImpl_Factory(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.contextProvider = iobyxmoadgVar;
        this.optionsRepositoryProvider = iobyxmoadgVar2;
        this.trackerProvider = iobyxmoadgVar3;
    }

    public static MediaPlayerImpl_Factory create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        return new MediaPlayerImpl_Factory(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static MediaPlayerImpl newInstance(Context context, EcomSdkOptionsRepository ecomSdkOptionsRepository, ITracker iTracker) {
        return new MediaPlayerImpl(context, ecomSdkOptionsRepository, iTracker);
    }

    @Override // fg.iobyxmoadg
    public MediaPlayerImpl get() {
        return newInstance((Context) this.contextProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get(), (ITracker) this.trackerProvider.get());
    }
}
