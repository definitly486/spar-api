package t3;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp implements dsvhmnatus {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f109547iobyxmoadg = new byte[4096];

    @Override // t3.dsvhmnatus
    public void iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
    }

    @Override // t3.dsvhmnatus
    public int ppxfxbqfkf(v2.btonecajqb btonecajqbVar, int i13, boolean z13, int i14) throws EOFException {
        int iZoijcleaow = btonecajqbVar.zoijcleaow(this.f109547iobyxmoadg, 0, Math.min(this.f109547iobyxmoadg.length, i13));
        if (iZoijcleaow != -1) {
            return iZoijcleaow;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // t3.dsvhmnatus
    public void wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        yadqdtsiqtVar.crxdokpmqz(i13);
    }

    @Override // t3.dsvhmnatus
    public void zoijcleaow(long j13, int i13, int i14, int i15, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
    }
}
