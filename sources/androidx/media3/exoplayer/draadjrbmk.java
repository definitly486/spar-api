package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk implements jrbgnlbqoe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jrbgnlbqoe f10360iobyxmoadg;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf implements jrbgnlbqoe {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final RouteDiscoveryPreference f10361eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private MediaRouter2 f10362iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f10363ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private y2.lqeggnwhkg f10364wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private MediaRouter2$RouteCallback f10365zoijcleaow;

        class iobyxmoadg extends MediaRouter2$RouteCallback {
            iobyxmoadg() {
            }
        }

        class zoijcleaow extends MediaRouter2$ControllerCallback {
            zoijcleaow() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                ppxfxbqfkf.this.f10364wkgbmnqykc.dxjokdxxww(Boolean.valueOf(ppxfxbqfkf.gtknphoqwx(ppxfxbqfkf.this.f10362iobyxmoadg)));
            }
        }

        static {
            f3.agtfadlqog.iobyxmoadg();
            f10361eablkybsjg = f3.eablkybsjg.iobyxmoadg(com.google.common.collect.zdlpuopuiu.zynmafqrjb(), false).build();
        }

        private ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void agtfadlqog(Context context) {
            y2.iobyxmoadg.eablkybsjg(this.f10364wkgbmnqykc);
            this.f10362iobyxmoadg = MediaRouter2.getInstance(context);
            this.f10365zoijcleaow = new iobyxmoadg();
            final y2.lqeggnwhkg lqeggnwhkgVar = this.f10364wkgbmnqykc;
            Objects.requireNonNull(lqeggnwhkgVar);
            Executor executor = new Executor() { // from class: f3.iwizpuwonk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    lqeggnwhkgVar.nufgyqmvbu(runnable);
                }
            };
            this.f10362iobyxmoadg.registerRouteCallback(executor, this.f10365zoijcleaow, f10361eablkybsjg);
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            this.f10363ppxfxbqfkf = zoijcleaowVar;
            this.f10362iobyxmoadg.registerControllerCallback(executor, zoijcleaowVar);
            this.f10364wkgbmnqykc.dxjokdxxww(Boolean.valueOf(gtknphoqwx(this.f10362iobyxmoadg)));
        }

        private static boolean btonecajqb(MediaRoute2Info mediaRoute2Info, int i13, boolean z13) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i13 == 1 || i13 == 2) && z13;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk() {
            f3.kcexrzcfyt.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f10362iobyxmoadg)).unregisterControllerCallback(f3.zdlpuopuiu.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f10363ppxfxbqfkf)));
            this.f10363ppxfxbqfkf = null;
            this.f10362iobyxmoadg.unregisterRouteCallback(f3.jyumaefscl.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(this.f10365zoijcleaow)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean gtknphoqwx(MediaRouter2 mediaRouter2) {
            int transferReason = f3.kcexrzcfyt.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (btonecajqb(f3.draadjrbmk.iobyxmoadg(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void wflxmlrfwp(jrbgnlbqoe.iobyxmoadg iobyxmoadgVar, Boolean bool, Boolean bool2) {
            iobyxmoadgVar.iobyxmoadg(bool2.booleanValue());
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public void gxszxtbevo() {
            ((y2.lqeggnwhkg) y2.iobyxmoadg.dxjokdxxww(this.f10364wkgbmnqykc)).nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.rgvfuqvkyq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10939zdlpuopuiu.draadjrbmk();
                }
            });
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public void iobyxmoadg(final jrbgnlbqoe.iobyxmoadg iobyxmoadgVar, final Context context, Looper looper, Looper looper2, y2.dxjokdxxww dxjokdxxwwVar) {
            y2.lqeggnwhkg lqeggnwhkgVar = new y2.lqeggnwhkg(Boolean.TRUE, looper2, looper, dxjokdxxwwVar, new y2.lqeggnwhkg.iobyxmoadg() { // from class: androidx.media3.exoplayer.vdvldrhtss
                @Override // y2.lqeggnwhkg.iobyxmoadg
                public final void iobyxmoadg(Object obj, Object obj2) {
                    draadjrbmk.ppxfxbqfkf.wflxmlrfwp(iobyxmoadgVar, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.f10364wkgbmnqykc = lqeggnwhkgVar;
            lqeggnwhkgVar.nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.oxmwwwfdhm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10935zdlpuopuiu.agtfadlqog(context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public boolean zoijcleaow() {
            y2.lqeggnwhkg lqeggnwhkgVar = this.f10364wkgbmnqykc;
            if (lqeggnwhkgVar == null) {
                return true;
            }
            return ((Boolean) lqeggnwhkgVar.wkgbmnqykc()).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow implements jrbgnlbqoe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private AudioManager f10368iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private y2.lqeggnwhkg f10369ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private AudioDeviceCallback f10370zoijcleaow;

        class iobyxmoadg extends AudioDeviceCallback {
            iobyxmoadg() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                zoijcleaow.this.f10369ppxfxbqfkf.dxjokdxxww(Boolean.valueOf(zoijcleaow.this.dxjokdxxww()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                zoijcleaow.this.f10369ppxfxbqfkf.dxjokdxxww(Boolean.valueOf(zoijcleaow.this.dxjokdxxww()));
            }
        }

        private zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void btonecajqb() {
            AudioManager audioManager = this.f10368iobyxmoadg;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) y2.iobyxmoadg.eablkybsjg(this.f10370zoijcleaow));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(Context context) {
            AudioManager audioManager;
            y2.iobyxmoadg.eablkybsjg(this.f10369ppxfxbqfkf);
            if (y2.stevsuqkhv.fiwbwshyhd(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                this.f10368iobyxmoadg = audioManager;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                this.f10370zoijcleaow = iobyxmoadgVar;
                audioManager.registerAudioDeviceCallback(iobyxmoadgVar, new Handler((Looper) y2.iobyxmoadg.eablkybsjg(Looper.myLooper())));
                this.f10369ppxfxbqfkf.dxjokdxxww(Boolean.valueOf(dxjokdxxww()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean dxjokdxxww() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) y2.iobyxmoadg.dxjokdxxww(this.f10368iobyxmoadg)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i13 = y2.stevsuqkhv.f123602iobyxmoadg;
                if (i13 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i13 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i13 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i13 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void gtknphoqwx(jrbgnlbqoe.iobyxmoadg iobyxmoadgVar, Boolean bool, Boolean bool2) {
            iobyxmoadgVar.iobyxmoadg(bool2.booleanValue());
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public void gxszxtbevo() {
            ((y2.lqeggnwhkg) y2.iobyxmoadg.eablkybsjg(this.f10369ppxfxbqfkf)).nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.wflxmlrfwp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11612zdlpuopuiu.btonecajqb();
                }
            });
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public void iobyxmoadg(final jrbgnlbqoe.iobyxmoadg iobyxmoadgVar, final Context context, Looper looper, Looper looper2, y2.dxjokdxxww dxjokdxxwwVar) {
            y2.lqeggnwhkg lqeggnwhkgVar = new y2.lqeggnwhkg(Boolean.TRUE, looper2, looper, dxjokdxxwwVar, new y2.lqeggnwhkg.iobyxmoadg() { // from class: androidx.media3.exoplayer.agtfadlqog
                @Override // y2.lqeggnwhkg.iobyxmoadg
                public final void iobyxmoadg(Object obj, Object obj2) {
                    draadjrbmk.zoijcleaow.gtknphoqwx(iobyxmoadgVar, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.f10369ppxfxbqfkf = lqeggnwhkgVar;
            lqeggnwhkgVar.nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.ojitshcjhn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10928zdlpuopuiu.draadjrbmk(context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.jrbgnlbqoe
        public boolean zoijcleaow() {
            y2.lqeggnwhkg lqeggnwhkgVar = this.f10369ppxfxbqfkf;
            if (lqeggnwhkgVar == null) {
                return true;
            }
            return ((Boolean) lqeggnwhkgVar.wkgbmnqykc()).booleanValue();
        }
    }

    public draadjrbmk() {
        int i13 = y2.stevsuqkhv.f123602iobyxmoadg;
        if (i13 >= 35) {
            this.f10360iobyxmoadg = new ppxfxbqfkf();
        } else if (i13 >= 23) {
            this.f10360iobyxmoadg = new zoijcleaow();
        } else {
            this.f10360iobyxmoadg = null;
        }
    }

    @Override // androidx.media3.exoplayer.jrbgnlbqoe
    public void gxszxtbevo() {
        jrbgnlbqoe jrbgnlbqoeVar = this.f10360iobyxmoadg;
        if (jrbgnlbqoeVar != null) {
            jrbgnlbqoeVar.gxszxtbevo();
        }
    }

    @Override // androidx.media3.exoplayer.jrbgnlbqoe
    public void iobyxmoadg(jrbgnlbqoe.iobyxmoadg iobyxmoadgVar, Context context, Looper looper, Looper looper2, y2.dxjokdxxww dxjokdxxwwVar) {
        jrbgnlbqoe jrbgnlbqoeVar = this.f10360iobyxmoadg;
        if (jrbgnlbqoeVar != null) {
            jrbgnlbqoeVar.iobyxmoadg(iobyxmoadgVar, context, looper, looper2, dxjokdxxwwVar);
        }
    }

    @Override // androidx.media3.exoplayer.jrbgnlbqoe
    public boolean zoijcleaow() {
        jrbgnlbqoe jrbgnlbqoeVar = this.f10360iobyxmoadg;
        return jrbgnlbqoeVar == null || jrbgnlbqoeVar.zoijcleaow();
    }
}
