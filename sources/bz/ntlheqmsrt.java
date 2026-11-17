package bz;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ntlheqmsrt {

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f17537iobyxmoadg;

        static {
            int[] iArr = new int[pc2.zoijcleaow.values().length];
            f17537iobyxmoadg = iArr;
            try {
                iArr[pc2.zoijcleaow.RequestAudioFocus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17537iobyxmoadg[pc2.zoijcleaow.Timer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17537iobyxmoadg[pc2.zoijcleaow.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static t6.weqkydbzbr eablkybsjg() {
        return new t6.nuxfzjnpeb();
    }

    public static wizcaqwiak iobyxmoadg(Context context, AudioManager audioManager, pc2.zoijcleaow zoijcleaowVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return new wypolnanlu(audioManager);
        }
        int i13 = iobyxmoadg.f17537iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? ppxfxbqfkf(audioManager) : zoijcleaow(context, audioManager, eablkybsjg());
        }
        return wkgbmnqykc(audioManager, eablkybsjg());
    }

    private static wizcaqwiak ppxfxbqfkf(AudioManager audioManager) {
        return new iwizpuwonk(audioManager);
    }

    private static wizcaqwiak wkgbmnqykc(AudioManager audioManager, t6.weqkydbzbr weqkydbzbrVar) {
        return new gxszxtbevo(audioManager, weqkydbzbrVar);
    }

    private static wizcaqwiak zoijcleaow(Context context, AudioManager audioManager, t6.weqkydbzbr weqkydbzbrVar) {
        return new iyctptxqzt(context, audioManager, weqkydbzbrVar);
    }
}
