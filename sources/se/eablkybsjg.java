package se;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final short f106027ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final short f106028wkgbmnqykc;

    eablkybsjg(lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(lqeggnwhkgVar);
        this.f106027ppxfxbqfkf = (short) i13;
        this.f106028wkgbmnqykc = (short) i14;
    }

    @Override // se.lqeggnwhkg
    void ppxfxbqfkf(te.iobyxmoadg iobyxmoadgVar, byte[] bArr) {
        iobyxmoadgVar.ppxfxbqfkf(this.f106027ppxfxbqfkf, this.f106028wkgbmnqykc);
    }

    public String toString() {
        short s13 = this.f106027ppxfxbqfkf;
        short s14 = this.f106028wkgbmnqykc;
        return "<" + Integer.toBinaryString((s13 & ((1 << s14) - 1)) | (1 << s14) | (1 << this.f106028wkgbmnqykc)).substring(1) + '>';
    }
}
