package w2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import y2.draadjrbmk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static AudioManager f118568iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Context f118569zoijcleaow;

    public static int dxjokdxxww(AudioManager audioManager, iobyxmoadg iobyxmoadgVar) {
        return stevsuqkhv.f123602iobyxmoadg >= 26 ? audioManager.requestAudioFocus(iobyxmoadgVar.ppxfxbqfkf()) : audioManager.requestAudioFocus(iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.zoijcleaow().zoijcleaow(), iobyxmoadgVar.eablkybsjg());
    }

    public static int eablkybsjg(AudioManager audioManager, int i13) {
        if (stevsuqkhv.f123602iobyxmoadg >= 28) {
            return audioManager.getStreamMinVolume(i13);
        }
        return 0;
    }

    public static int gxszxtbevo(AudioManager audioManager, int i13) {
        try {
            return audioManager.getStreamVolume(i13);
        } catch (RuntimeException e13) {
            kcexrzcfyt.dxjokdxxww("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i13, e13);
            return audioManager.getStreamMaxVolume(i13);
        }
    }

    public static boolean lqeggnwhkg(AudioManager audioManager, int i13) {
        if (stevsuqkhv.f123602iobyxmoadg >= 23) {
            return audioManager.isStreamMute(i13);
        }
        return gxszxtbevo(audioManager, i13) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nufgyqmvbu(Context context, draadjrbmk draadjrbmkVar) {
        f118568iobyxmoadg = (AudioManager) context.getSystemService("audio");
        draadjrbmkVar.eablkybsjg();
    }

    public static synchronized AudioManager ppxfxbqfkf(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f118569zoijcleaow != applicationContext) {
                f118568iobyxmoadg = null;
            }
            AudioManager audioManager = f118568iobyxmoadg;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final draadjrbmk draadjrbmkVar = new draadjrbmk();
                y2.ppxfxbqfkf.iobyxmoadg().execute(new Runnable() { // from class: w2.wkgbmnqykc
                    @Override // java.lang.Runnable
                    public final void run() {
                        eablkybsjg.nufgyqmvbu(applicationContext, draadjrbmkVar);
                    }
                });
                draadjrbmkVar.zoijcleaow();
                return (AudioManager) y2.iobyxmoadg.eablkybsjg(f118568iobyxmoadg);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f118568iobyxmoadg = audioManager2;
            return (AudioManager) y2.iobyxmoadg.eablkybsjg(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int wkgbmnqykc(AudioManager audioManager, int i13) {
        return audioManager.getStreamMaxVolume(i13);
    }

    public static int zoijcleaow(AudioManager audioManager, iobyxmoadg iobyxmoadgVar) {
        return stevsuqkhv.f123602iobyxmoadg >= 26 ? audioManager.abandonAudioFocusRequest(iobyxmoadgVar.ppxfxbqfkf()) : audioManager.abandonAudioFocus(iobyxmoadgVar.gxszxtbevo());
    }
}
