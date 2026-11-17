package ob;

import bb.zdlpuopuiu;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f72509iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f72510ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zdlpuopuiu f72511zoijcleaow;

    public nufgyqmvbu(draadjrbmk draadjrbmkVar, zdlpuopuiu zdlpuopuiuVar, int i13) {
        this.f72509iobyxmoadg = draadjrbmkVar;
        this.f72511zoijcleaow = zdlpuopuiuVar;
        this.f72510ppxfxbqfkf = i13;
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) {
        byte[] bArrEncrypt = this.f72509iobyxmoadg.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return gxszxtbevo.iobyxmoadg(bArrEncrypt, this.f72511zoijcleaow.zoijcleaow(gxszxtbevo.iobyxmoadg(bArr2, bArrEncrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f72510ppxfxbqfkf;
        if (length < i13) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i13);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f72510ppxfxbqfkf, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f72511zoijcleaow.iobyxmoadg(bArrCopyOfRange2, gxszxtbevo.iobyxmoadg(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f72509iobyxmoadg.iobyxmoadg(bArrCopyOfRange);
    }
}
