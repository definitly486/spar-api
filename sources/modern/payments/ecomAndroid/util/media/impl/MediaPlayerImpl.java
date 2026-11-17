package modern.payments.ecomAndroid.util.media.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.media.MediaPlayer;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/util/media/impl/MediaPlayerImpl;", "Lmodern/payments/ecomAndroid/util/media/MediaPlayer;", "Landroid/content/Context;", "context", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/tracker/ITracker;", "tracker", "<init>", "(Landroid/content/Context;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/tracker/ITracker;)V", "Landroid/content/res/AssetFileDescriptor;", "afd", "Lgg/wwaezpbzkn;", "playSound", "(Landroid/content/res/AssetFileDescriptor;)V", "", "volume", "setPlayerVolume", "(F)V", "playSuccessSound", "()V", "playUnsuccessfulSound", "Landroid/content/Context;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/tracker/ITracker;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaPlayerImpl implements MediaPlayer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FAILURE_SOUND = "failure_payment_sound.mp3";

    @Deprecated
    public static final String SUCCESS_SOUND = "success_payment_sound.mp3";
    private final Context context;
    private final android.media.MediaPlayer mediaPlayer;
    private final EcomSdkOptionsRepository optionsRepository;
    private final ITracker tracker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/util/media/impl/MediaPlayerImpl$Companion;", "", "()V", "FAILURE_SOUND", "", "SUCCESS_SOUND", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    public MediaPlayerImpl(Context context, EcomSdkOptionsRepository optionsRepository, ITracker tracker) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.context = context;
        this.optionsRepository = optionsRepository;
        this.tracker = tracker;
        this.mediaPlayer = new android.media.MediaPlayer();
    }

    private final void playSound(AssetFileDescriptor afd) throws IOException {
        final android.media.MediaPlayer mediaPlayer = this.mediaPlayer;
        mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        mediaPlayer.setLooping(false);
        mediaPlayer.prepare();
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: modern.payments.ecomAndroid.util.media.impl.iobyxmoadg
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(android.media.MediaPlayer mediaPlayer2) {
                MediaPlayerImpl.playSound$lambda$7$lambda$6(mediaPlayer, mediaPlayer2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playSound$lambda$7$lambda$6(android.media.MediaPlayer this_apply, android.media.MediaPlayer mediaPlayer) {
        zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this_apply.reset();
    }

    @Override // modern.payments.ecomAndroid.util.media.MediaPlayer
    public void playSuccessSound() {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            AssetFileDescriptor assetFileDescriptorOpenFd = this.context.getAssets().openFd(SUCCESS_SOUND);
            zdlpuopuiu.dxjokdxxww(assetFileDescriptorOpenFd, "openFd(...)");
            playSound(assetFileDescriptorOpenFd);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ITracker.DefaultImpls.track$default(this.tracker, "MediaPlayer playSuccessSound()", thDxjokdxxww, null, null, 12, null);
        }
    }

    @Override // modern.payments.ecomAndroid.util.media.MediaPlayer
    public void playUnsuccessfulSound() {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            AssetFileDescriptor assetFileDescriptorOpenFd = this.context.getAssets().openFd(FAILURE_SOUND);
            zdlpuopuiu.dxjokdxxww(assetFileDescriptorOpenFd, "openFd(...)");
            playSound(assetFileDescriptorOpenFd);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ITracker.DefaultImpls.track$default(this.tracker, "MediaPlayer playUnsuccessfulSound()", thDxjokdxxww, null, null, 12, null);
        }
    }

    @Override // modern.payments.ecomAndroid.util.media.MediaPlayer
    public void setPlayerVolume(float volume) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            this.mediaPlayer.setVolume(volume, volume);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ITracker.DefaultImpls.track$default(this.tracker, "MediaPlayer setPlayerVolume()", thDxjokdxxww, null, null, 12, null);
        }
    }
}
