package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f10314btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private v2.ppxfxbqfkf f10315dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final BroadcastReceiver f10316eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wkgbmnqykc f10317gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f10318iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.iobyxmoadg f10319lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.ppxfxbqfkf f10320nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Handler f10321ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f10322wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f10323zoijcleaow;

    private final class eablkybsjg extends BroadcastReceiver {
        private eablkybsjg() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.eablkybsjg(context, intent, zoijcleaowVar.f10315dxjokdxxww, zoijcleaow.this.f10320nufgyqmvbu));
        }
    }

    public interface gxszxtbevo {
        void iobyxmoadg(androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVar);
    }

    private final class ppxfxbqfkf extends AudioDeviceCallback {
        private ppxfxbqfkf() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.gxszxtbevo(zoijcleaowVar.f10318iobyxmoadg, zoijcleaow.this.f10315dxjokdxxww, zoijcleaow.this.f10320nufgyqmvbu));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (stevsuqkhv.oxmwwwfdhm(audioDeviceInfoArr, zoijcleaow.this.f10320nufgyqmvbu)) {
                zoijcleaow.this.f10320nufgyqmvbu = null;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.gxszxtbevo(zoijcleaowVar.f10318iobyxmoadg, zoijcleaow.this.f10315dxjokdxxww, zoijcleaow.this.f10320nufgyqmvbu));
        }
    }

    private final class wkgbmnqykc extends ContentObserver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f10326iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Uri f10328zoijcleaow;

        public wkgbmnqykc(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f10326iobyxmoadg = contentResolver;
            this.f10328zoijcleaow = uri;
        }

        public void iobyxmoadg() {
            this.f10326iobyxmoadg.registerContentObserver(this.f10328zoijcleaow, false, this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z13) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.gxszxtbevo(zoijcleaowVar.f10318iobyxmoadg, zoijcleaow.this.f10315dxjokdxxww, zoijcleaow.this.f10320nufgyqmvbu));
        }

        public void zoijcleaow() {
            this.f10326iobyxmoadg.unregisterContentObserver(this);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C0165zoijcleaow {
        public static void iobyxmoadg(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            w2.eablkybsjg.ppxfxbqfkf(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void zoijcleaow(Context context, AudioDeviceCallback audioDeviceCallback) {
            w2.eablkybsjg.ppxfxbqfkf(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    zoijcleaow(Context context, gxszxtbevo gxszxtbevoVar, v2.ppxfxbqfkf ppxfxbqfkfVar, androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f10318iobyxmoadg = applicationContext;
        this.f10323zoijcleaow = (gxszxtbevo) y2.iobyxmoadg.eablkybsjg(gxszxtbevoVar);
        this.f10315dxjokdxxww = ppxfxbqfkfVar;
        this.f10320nufgyqmvbu = ppxfxbqfkfVar2;
        Handler handlerZynmafqrjb = stevsuqkhv.zynmafqrjb();
        this.f10321ppxfxbqfkf = handlerZynmafqrjb;
        Object[] objArr = 0;
        this.f10322wkgbmnqykc = stevsuqkhv.f123602iobyxmoadg >= 23 ? new ppxfxbqfkf() : null;
        this.f10316eablkybsjg = new eablkybsjg();
        Uri uriDxjokdxxww = androidx.media3.exoplayer.audio.iobyxmoadg.dxjokdxxww();
        this.f10317gxszxtbevo = uriDxjokdxxww != null ? new wkgbmnqykc(handlerZynmafqrjb, applicationContext.getContentResolver(), uriDxjokdxxww) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVar) {
        if (!this.f10314btonecajqb || iobyxmoadgVar.equals(this.f10319lqeggnwhkg)) {
            return;
        }
        this.f10319lqeggnwhkg = iobyxmoadgVar;
        this.f10323zoijcleaow.iobyxmoadg(iobyxmoadgVar);
    }

    public void btonecajqb() {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (this.f10314btonecajqb) {
            this.f10319lqeggnwhkg = null;
            if (stevsuqkhv.f123602iobyxmoadg >= 23 && (ppxfxbqfkfVar = this.f10322wkgbmnqykc) != null) {
                C0165zoijcleaow.zoijcleaow(this.f10318iobyxmoadg, ppxfxbqfkfVar);
            }
            this.f10318iobyxmoadg.unregisterReceiver(this.f10316eablkybsjg);
            wkgbmnqykc wkgbmnqykcVar = this.f10317gxszxtbevo;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.zoijcleaow();
            }
            this.f10314btonecajqb = false;
        }
    }

    public void dxjokdxxww(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar = this.f10320nufgyqmvbu;
        if (Objects.equals(audioDeviceInfo, ppxfxbqfkfVar == null ? null : ppxfxbqfkfVar.f10288iobyxmoadg)) {
            return;
        }
        androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.ppxfxbqfkf(audioDeviceInfo) : null;
        this.f10320nufgyqmvbu = ppxfxbqfkfVar2;
        gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.gxszxtbevo(this.f10318iobyxmoadg, this.f10315dxjokdxxww, ppxfxbqfkfVar2));
    }

    public androidx.media3.exoplayer.audio.iobyxmoadg lqeggnwhkg() {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (this.f10314btonecajqb) {
            return (androidx.media3.exoplayer.audio.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10319lqeggnwhkg);
        }
        this.f10314btonecajqb = true;
        wkgbmnqykc wkgbmnqykcVar = this.f10317gxszxtbevo;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg();
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 23 && (ppxfxbqfkfVar = this.f10322wkgbmnqykc) != null) {
            C0165zoijcleaow.iobyxmoadg(this.f10318iobyxmoadg, ppxfxbqfkfVar, this.f10321ppxfxbqfkf);
        }
        androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVarEablkybsjg = androidx.media3.exoplayer.audio.iobyxmoadg.eablkybsjg(this.f10318iobyxmoadg, this.f10318iobyxmoadg.registerReceiver(this.f10316eablkybsjg, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f10321ppxfxbqfkf), this.f10315dxjokdxxww, this.f10320nufgyqmvbu);
        this.f10319lqeggnwhkg = iobyxmoadgVarEablkybsjg;
        return iobyxmoadgVarEablkybsjg;
    }

    public void nufgyqmvbu(v2.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10315dxjokdxxww = ppxfxbqfkfVar;
        gxszxtbevo(androidx.media3.exoplayer.audio.iobyxmoadg.gxszxtbevo(this.f10318iobyxmoadg, ppxfxbqfkfVar, this.f10320nufgyqmvbu));
    }
}
