package pb;

import bb.esjtqupxsv;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f76302iobyxmoadg;

    private zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.f76302iobyxmoadg = iobyxmoadgVar;
    }

    public static zoijcleaow iobyxmoadg(byte[] bArr, esjtqupxsv esjtqupxsvVar) {
        if (esjtqupxsvVar != null) {
            return new zoijcleaow(iobyxmoadg.iobyxmoadg(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int zoijcleaow() {
        return this.f76302iobyxmoadg.ppxfxbqfkf();
    }
}
