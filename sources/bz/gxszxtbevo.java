package bz;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo extends cllcsxoeiz {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private AudioFocusRequest f17428dxjokdxxww;

    gxszxtbevo(AudioManager audioManager, t6.weqkydbzbr weqkydbzbrVar) {
        super(audioManager, weqkydbzbrVar);
    }

    @Override // bz.cllcsxoeiz
    void pmvmpeiblj(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (this.f17428dxjokdxxww != null) {
            lqeggnwhkg().abandonAudioFocusRequest(this.f17428dxjokdxxww);
            this.f17428dxjokdxxww = null;
        }
    }

    @Override // bz.cllcsxoeiz
    int zdlpuopuiu(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f17428dxjokdxxww = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(10).setContentType(4).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener, eablkybsjg()).build();
        return lqeggnwhkg().requestAudioFocus(this.f17428dxjokdxxww);
    }
}
