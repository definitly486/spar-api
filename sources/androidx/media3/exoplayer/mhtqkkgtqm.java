package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class mhtqkkgtqm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private wkgbmnqykc f10878eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f10879gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f10880iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.lqeggnwhkg f10881ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private AudioManager f10882wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f10883zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f10884eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f10885iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean f10886ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f10887wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f10888zoijcleaow;

        public ppxfxbqfkf(int i13, int i14, boolean z13, int i15, int i16) {
            this.f10885iobyxmoadg = i13;
            this.f10888zoijcleaow = i14;
            this.f10886ppxfxbqfkf = z13;
            this.f10887wkgbmnqykc = i15;
            this.f10884eablkybsjg = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class wkgbmnqykc extends BroadcastReceiver {
        private wkgbmnqykc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow() {
            if (mhtqkkgtqm.this.f10878eablkybsjg == null) {
                return;
            }
            mhtqkkgtqm.this.f10881ppxfxbqfkf.dxjokdxxww(mhtqkkgtqm.this.nufgyqmvbu(((ppxfxbqfkf) mhtqkkgtqm.this.f10881ppxfxbqfkf.wkgbmnqykc()).f10885iobyxmoadg));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            mhtqkkgtqm.this.f10881ppxfxbqfkf.nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.ixidwrxhsl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10586zdlpuopuiu.zoijcleaow();
                }
            });
        }
    }

    public interface zoijcleaow {
        void nufgyqmvbu(int i13);

        void yadqdtsiqt(int i13, boolean z13);
    }

    public mhtqkkgtqm(Context context, zoijcleaow zoijcleaowVar, final int i13, Looper looper, Looper looper2, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10880iobyxmoadg = context.getApplicationContext();
        this.f10883zoijcleaow = zoijcleaowVar;
        y2.lqeggnwhkg lqeggnwhkgVar = new y2.lqeggnwhkg(new ppxfxbqfkf(i13, 0, false, 0, 0), looper, looper2, dxjokdxxwwVar, new y2.lqeggnwhkg.iobyxmoadg() { // from class: androidx.media3.exoplayer.ageimvtcrz
            @Override // y2.lqeggnwhkg.iobyxmoadg
            public final void iobyxmoadg(Object obj, Object obj2) {
                this.f10074iobyxmoadg.agtfadlqog((mhtqkkgtqm.ppxfxbqfkf) obj, (mhtqkkgtqm.ppxfxbqfkf) obj2);
            }
        });
        this.f10881ppxfxbqfkf = lqeggnwhkgVar;
        lqeggnwhkgVar.nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.fyldjkxazc
            @Override // java.lang.Runnable
            public final void run() {
                this.f10552zdlpuopuiu.gtknphoqwx(i13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        boolean z13 = ppxfxbqfkfVar.f10886ppxfxbqfkf;
        if (!z13 && ppxfxbqfkfVar2.f10886ppxfxbqfkf) {
            this.f10879gxszxtbevo = ppxfxbqfkfVar.f10888zoijcleaow;
        }
        int i13 = ppxfxbqfkfVar.f10888zoijcleaow;
        int i14 = ppxfxbqfkfVar2.f10888zoijcleaow;
        if (i13 != i14 || z13 != ppxfxbqfkfVar2.f10886ppxfxbqfkf) {
            this.f10883zoijcleaow.yadqdtsiqt(i14, ppxfxbqfkfVar2.f10886ppxfxbqfkf);
        }
        int i15 = ppxfxbqfkfVar.f10885iobyxmoadg;
        int i16 = ppxfxbqfkfVar2.f10885iobyxmoadg;
        if (i15 == i16 && ppxfxbqfkfVar.f10887wkgbmnqykc == ppxfxbqfkfVar2.f10887wkgbmnqykc && ppxfxbqfkfVar.f10884eablkybsjg == ppxfxbqfkfVar2.f10884eablkybsjg) {
            return;
        }
        this.f10883zoijcleaow.nufgyqmvbu(i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ppxfxbqfkf draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(int i13) {
        this.f10882wkgbmnqykc = (AudioManager) y2.iobyxmoadg.dxjokdxxww((AudioManager) this.f10880iobyxmoadg.getSystemService("audio"));
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        try {
            this.f10880iobyxmoadg.registerReceiver(wkgbmnqykcVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f10878eablkybsjg = wkgbmnqykcVar;
        } catch (RuntimeException e13) {
            y2.kcexrzcfyt.dxjokdxxww("StreamVolumeManager", "Error registering stream volume receiver", e13);
        }
        this.f10881ppxfxbqfkf.dxjokdxxww(nufgyqmvbu(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ppxfxbqfkf nufgyqmvbu(int i13) {
        y2.iobyxmoadg.eablkybsjg(this.f10882wkgbmnqykc);
        return new ppxfxbqfkf(i13, w2.eablkybsjg.gxszxtbevo(this.f10882wkgbmnqykc, i13), w2.eablkybsjg.lqeggnwhkg(this.f10882wkgbmnqykc, i13), w2.eablkybsjg.eablkybsjg(this.f10882wkgbmnqykc, i13), w2.eablkybsjg.wkgbmnqykc(this.f10882wkgbmnqykc, i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ppxfxbqfkf wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar) {
        wkgbmnqykc wkgbmnqykcVar = this.f10878eablkybsjg;
        if (wkgbmnqykcVar != null) {
            try {
                this.f10880iobyxmoadg.unregisterReceiver(wkgbmnqykcVar);
            } catch (RuntimeException e13) {
                y2.kcexrzcfyt.dxjokdxxww("StreamVolumeManager", "Error unregistering stream volume receiver", e13);
            }
            this.f10878eablkybsjg = null;
        }
        return ppxfxbqfkfVar;
    }

    public int btonecajqb() {
        return ((ppxfxbqfkf) this.f10881ppxfxbqfkf.wkgbmnqykc()).f10887wkgbmnqykc;
    }

    public int dxjokdxxww() {
        return ((ppxfxbqfkf) this.f10881ppxfxbqfkf.wkgbmnqykc()).f10884eablkybsjg;
    }

    public void ojitshcjhn() {
        this.f10881ppxfxbqfkf.btonecajqb(new xa.eablkybsjg() { // from class: androidx.media3.exoplayer.ipoelvxyzq
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return mhtqkkgtqm.draadjrbmk((mhtqkkgtqm.ppxfxbqfkf) obj);
            }
        }, new xa.eablkybsjg() { // from class: androidx.media3.exoplayer.grlcpdaxtj
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return this.f10553zdlpuopuiu.wflxmlrfwp((mhtqkkgtqm.ppxfxbqfkf) obj);
            }
        });
    }
}
