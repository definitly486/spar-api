package ob;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final db.eablkybsjg f72508iobyxmoadg;

    public lqeggnwhkg(byte[] bArr) {
        this.f72508iobyxmoadg = new db.eablkybsjg(bArr);
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(12);
        byteBufferAllocate.put(bArrPpxfxbqfkf);
        this.f72508iobyxmoadg.zoijcleaow(byteBufferAllocate, bArrPpxfxbqfkf, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f72508iobyxmoadg.iobyxmoadg(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
