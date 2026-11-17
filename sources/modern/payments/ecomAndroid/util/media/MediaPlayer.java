package modern.payments.ecomAndroid.util.media;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/util/media/MediaPlayer;", "", "", "volume", "Lgg/wwaezpbzkn;", "setPlayerVolume", "(F)V", "playSuccessSound", "()V", "playUnsuccessfulSound", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MediaPlayer {
    void playSuccessSound();

    void playUnsuccessfulSound();

    void setPlayerVolume(float volume);
}
