package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import v2.iwizpuwonk;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements DefaultAudioSink.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f10203iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Boolean f10204zoijcleaow;

    private static final class iobyxmoadg {
        public static wkgbmnqykc iobyxmoadg(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z13) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? wkgbmnqykc.f10307wkgbmnqykc : new wkgbmnqykc.zoijcleaow().eablkybsjg(true).lqeggnwhkg(z13).wkgbmnqykc();
        }
    }

    private static final class zoijcleaow {
        public static wkgbmnqykc iobyxmoadg(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z13) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return wkgbmnqykc.f10307wkgbmnqykc;
            }
            return new wkgbmnqykc.zoijcleaow().eablkybsjg(true).gxszxtbevo(stevsuqkhv.f123602iobyxmoadg > 32 && playbackOffloadSupport == 2).lqeggnwhkg(z13).wkgbmnqykc();
        }
    }

    public dxjokdxxww(Context context) {
        this.f10203iobyxmoadg = context;
    }

    private boolean zoijcleaow(Context context) {
        Boolean bool = this.f10204zoijcleaow;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = w2.eablkybsjg.ppxfxbqfkf(context).getParameters("offloadVariableRateSupported");
            this.f10204zoijcleaow = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f10204zoijcleaow = Boolean.FALSE;
        }
        return this.f10204zoijcleaow.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.wkgbmnqykc
    public wkgbmnqykc iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar) {
        y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar);
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 < 29 || iobyxmoadgVar.f9759iozdgvuglv == -1) {
            return wkgbmnqykc.f10307wkgbmnqykc;
        }
        boolean zZoijcleaow = zoijcleaow(this.f10203iobyxmoadg);
        int iGxszxtbevo = iwizpuwonk.gxszxtbevo((String) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn), iobyxmoadgVar.f9754gtknphoqwx);
        if (iGxszxtbevo == 0 || i13 < stevsuqkhv.pkzmftpjix(iGxszxtbevo)) {
            return wkgbmnqykc.f10307wkgbmnqykc;
        }
        int iJpowsppfya = stevsuqkhv.jpowsppfya(iobyxmoadgVar.f9779yadqdtsiqt);
        if (iJpowsppfya == 0) {
            return wkgbmnqykc.f10307wkgbmnqykc;
        }
        try {
            AudioFormat audioFormatHcddaimhww = stevsuqkhv.hcddaimhww(iobyxmoadgVar.f9759iozdgvuglv, iJpowsppfya, iGxszxtbevo);
            return i13 >= 31 ? zoijcleaow.iobyxmoadg(audioFormatHcddaimhww, ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg, zZoijcleaow) : iobyxmoadg.iobyxmoadg(audioFormatHcddaimhww, ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg, zZoijcleaow);
        } catch (IllegalArgumentException unused) {
            return wkgbmnqykc.f10307wkgbmnqykc;
        }
    }
}
