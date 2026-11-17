package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.media.MediaPlayer;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaModule_ProvideMediaPlayerFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final iobyxmoadg ecomSdkOptionsRepositoryProvider;
    private final MediaModule module;
    private final iobyxmoadg trackerProvider;

    public MediaModule_ProvideMediaPlayerFactory(MediaModule mediaModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        this.module = mediaModule;
        this.contextProvider = iobyxmoadgVar;
        this.trackerProvider = iobyxmoadgVar2;
        this.ecomSdkOptionsRepositoryProvider = iobyxmoadgVar3;
    }

    public static MediaModule_ProvideMediaPlayerFactory create(MediaModule mediaModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3) {
        return new MediaModule_ProvideMediaPlayerFactory(mediaModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static MediaPlayer provideMediaPlayer(MediaModule mediaModule, Context context, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        return (MediaPlayer) dxjokdxxww.eablkybsjg(mediaModule.provideMediaPlayer(context, iTracker, ecomSdkOptionsRepository));
    }

    @Override // fg.iobyxmoadg
    public MediaPlayer get() {
        return provideMediaPlayer(this.module, (Context) this.contextProvider.get(), (ITracker) this.trackerProvider.get(), (EcomSdkOptionsRepository) this.ecomSdkOptionsRepositoryProvider.get());
    }
}
