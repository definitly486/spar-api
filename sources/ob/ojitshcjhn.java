package ob;

import bb.zdlpuopuiu;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn implements zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mb.iobyxmoadg f72512iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f72513zoijcleaow;

    public ojitshcjhn(mb.iobyxmoadg iobyxmoadgVar, int i13) throws InvalidAlgorithmParameterException {
        this.f72512iobyxmoadg = iobyxmoadgVar;
        this.f72513zoijcleaow = i13;
        if (i13 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        iobyxmoadgVar.iobyxmoadg(new byte[0], i13);
    }

    @Override // bb.zdlpuopuiu
    public void iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!gxszxtbevo.zoijcleaow(zoijcleaow(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // bb.zdlpuopuiu
    public byte[] zoijcleaow(byte[] bArr) {
        return this.f72512iobyxmoadg.iobyxmoadg(bArr, this.f72513zoijcleaow);
    }
}
