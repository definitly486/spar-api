package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements nufgyqmvbu.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f10835eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f10836gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final xa.vdvldrhtss f10837ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final xa.vdvldrhtss f10838wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f10839zoijcleaow;

    public lqeggnwhkg() {
        this.f10835eablkybsjg = 0;
        this.f10836gxszxtbevo = false;
        this.f10839zoijcleaow = null;
        this.f10837ppxfxbqfkf = null;
        this.f10838wkgbmnqykc = null;
    }

    private boolean ppxfxbqfkf() {
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 >= 31) {
            return true;
        }
        Context context = this.f10839zoijcleaow;
        return context != null && i13 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow
    public nufgyqmvbu zoijcleaow(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        int i13;
        xa.vdvldrhtss vdvldrhtssVar;
        if (stevsuqkhv.f123602iobyxmoadg < 23 || !((i13 = this.f10835eablkybsjg) == 1 || (i13 == 0 && ppxfxbqfkf()))) {
            return new vdvldrhtss.zoijcleaow().zoijcleaow(iobyxmoadgVar);
        }
        int iGtknphoqwx = iwizpuwonk.gtknphoqwx(iobyxmoadgVar.f10843ppxfxbqfkf.f9769ojitshcjhn);
        kcexrzcfyt.gxszxtbevo("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + stevsuqkhv.bfopjjpdmp(iGtknphoqwx));
        xa.vdvldrhtss vdvldrhtssVar2 = this.f10837ppxfxbqfkf;
        zoijcleaow.C0167zoijcleaow c0167zoijcleaow = (vdvldrhtssVar2 == null || (vdvldrhtssVar = this.f10838wkgbmnqykc) == null) ? new zoijcleaow.C0167zoijcleaow(iGtknphoqwx) : new zoijcleaow.C0167zoijcleaow(vdvldrhtssVar2, vdvldrhtssVar);
        c0167zoijcleaow.gxszxtbevo(this.f10836gxszxtbevo);
        return c0167zoijcleaow.zoijcleaow(iobyxmoadgVar);
    }

    public lqeggnwhkg(Context context) {
        this(context, null, null);
    }

    public lqeggnwhkg(Context context, xa.vdvldrhtss vdvldrhtssVar, xa.vdvldrhtss vdvldrhtssVar2) {
        this.f10839zoijcleaow = context;
        this.f10835eablkybsjg = 0;
        this.f10836gxszxtbevo = false;
        this.f10837ppxfxbqfkf = vdvldrhtssVar;
        this.f10838wkgbmnqykc = vdvldrhtssVar2;
    }
}
