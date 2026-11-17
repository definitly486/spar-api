package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk implements DefaultAudioSink.gxszxtbevo {
    private AudioAttributes eablkybsjg(v2.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        return z13 ? gxszxtbevo() : ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg;
    }

    private AudioAttributes gxszxtbevo() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void lqeggnwhkg(AudioTrack.Builder builder, boolean z13) {
        builder.setOffloadedPlayback(z13);
    }

    private AudioTrack ppxfxbqfkf(AudioSink.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(eablkybsjg(ppxfxbqfkfVar, iobyxmoadgVar.f10089wkgbmnqykc)).setAudioFormat(stevsuqkhv.hcddaimhww(iobyxmoadgVar.f10090zoijcleaow, iobyxmoadgVar.f10088ppxfxbqfkf, iobyxmoadgVar.f10087iobyxmoadg)).setTransferMode(1).setBufferSizeInBytes(iobyxmoadgVar.f10086gxszxtbevo).setSessionId(i13);
        if (stevsuqkhv.f123602iobyxmoadg >= 29) {
            lqeggnwhkg(sessionId, iobyxmoadgVar.f10085eablkybsjg);
        }
        return wkgbmnqykc(sessionId).build();
    }

    private AudioTrack zoijcleaow(AudioSink.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return new AudioTrack(eablkybsjg(ppxfxbqfkfVar, iobyxmoadgVar.f10089wkgbmnqykc), stevsuqkhv.hcddaimhww(iobyxmoadgVar.f10090zoijcleaow, iobyxmoadgVar.f10088ppxfxbqfkf, iobyxmoadgVar.f10087iobyxmoadg), iobyxmoadgVar.f10086gxszxtbevo, 1, i13);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.gxszxtbevo
    public final AudioTrack iobyxmoadg(AudioSink.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return stevsuqkhv.f123602iobyxmoadg >= 23 ? ppxfxbqfkf(iobyxmoadgVar, ppxfxbqfkfVar, i13) : zoijcleaow(iobyxmoadgVar, ppxfxbqfkfVar, i13);
    }

    protected AudioTrack.Builder wkgbmnqykc(AudioTrack.Builder builder) {
        return builder;
    }
}
