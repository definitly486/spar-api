package ob;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final db.nufgyqmvbu f72507iobyxmoadg;

    public kcexrzcfyt(byte[] bArr) {
        this.f72507iobyxmoadg = new db.nufgyqmvbu(bArr);
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(24);
        byteBufferAllocate.put(bArrPpxfxbqfkf);
        this.f72507iobyxmoadg.zoijcleaow(byteBufferAllocate, bArrPpxfxbqfkf, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f72507iobyxmoadg.iobyxmoadg(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }
}
