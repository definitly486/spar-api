package x8;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements h8.iobyxmoadg.InterfaceC0923iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.wkgbmnqykc f121480iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.zoijcleaow f121481zoijcleaow;

    public zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar) {
        this.f121480iobyxmoadg = wkgbmnqykcVar;
        this.f121481zoijcleaow = zoijcleaowVar;
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public void eablkybsjg(byte[] bArr) {
        o8.zoijcleaow zoijcleaowVar = this.f121481zoijcleaow;
        if (zoijcleaowVar == null) {
            return;
        }
        zoijcleaowVar.eablkybsjg(bArr);
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public void gxszxtbevo(int[] iArr) {
        o8.zoijcleaow zoijcleaowVar = this.f121481zoijcleaow;
        if (zoijcleaowVar == null) {
            return;
        }
        zoijcleaowVar.eablkybsjg(iArr);
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public void iobyxmoadg(Bitmap bitmap) {
        this.f121480iobyxmoadg.ppxfxbqfkf(bitmap);
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public Bitmap ppxfxbqfkf(int i13, int i14, Bitmap.Config config) {
        return this.f121480iobyxmoadg.eablkybsjg(i13, i14, config);
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public int[] wkgbmnqykc(int i13) {
        o8.zoijcleaow zoijcleaowVar = this.f121481zoijcleaow;
        return zoijcleaowVar == null ? new int[i13] : (int[]) zoijcleaowVar.ppxfxbqfkf(i13, int[].class);
    }

    @Override // h8.iobyxmoadg.InterfaceC0923iobyxmoadg
    public byte[] zoijcleaow(int i13) {
        o8.zoijcleaow zoijcleaowVar = this.f121481zoijcleaow;
        return zoijcleaowVar == null ? new byte[i13] : (byte[]) zoijcleaowVar.ppxfxbqfkf(i13, byte[].class);
    }
}
