package h;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkdspvbjdz {
    public static final int eablkybsjg(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return skhdrjzrfn.f38965zoijcleaow.iobyxmoadg();
        }
        if (config == Bitmap.Config.RGB_565) {
            return skhdrjzrfn.f38965zoijcleaow.eablkybsjg();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return skhdrjzrfn.f38965zoijcleaow.zoijcleaow();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return skhdrjzrfn.f38965zoijcleaow.ppxfxbqfkf();
        }
        return config == Bitmap.Config.HARDWARE ? skhdrjzrfn.f38965zoijcleaow.wkgbmnqykc() : skhdrjzrfn.f38965zoijcleaow.zoijcleaow();
    }

    public static final dvvnrvtcbc iobyxmoadg(int i13, int i14, int i15, boolean z13, i.ppxfxbqfkf ppxfxbqfkfVar) {
        wkgbmnqykc(i15);
        return new jpowsppfya(crxdokpmqz.iobyxmoadg(i13, i14, i15, z13, ppxfxbqfkfVar));
    }

    public static final dvvnrvtcbc ppxfxbqfkf(Bitmap bitmap) {
        return new jpowsppfya(bitmap);
    }

    public static final Bitmap.Config wkgbmnqykc(int i13) {
        skhdrjzrfn.iobyxmoadg iobyxmoadgVar = skhdrjzrfn.f38965zoijcleaow;
        if (skhdrjzrfn.dxjokdxxww(i13, iobyxmoadgVar.zoijcleaow())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (skhdrjzrfn.dxjokdxxww(i13, iobyxmoadgVar.iobyxmoadg())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (skhdrjzrfn.dxjokdxxww(i13, iobyxmoadgVar.eablkybsjg())) {
            return Bitmap.Config.RGB_565;
        }
        if (skhdrjzrfn.dxjokdxxww(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return Bitmap.Config.RGBA_F16;
        }
        return skhdrjzrfn.dxjokdxxww(i13, iobyxmoadgVar.wkgbmnqykc()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Bitmap zoijcleaow(dvvnrvtcbc dvvnrvtcbcVar) {
        if (dvvnrvtcbcVar instanceof jpowsppfya) {
            return ((jpowsppfya) dvvnrvtcbcVar).ppxfxbqfkf();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }
}
