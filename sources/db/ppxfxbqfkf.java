package db;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends wkgbmnqykc {
    public ppxfxbqfkf(byte[] bArr, int i13) {
        super(bArr, i13);
    }

    @Override // db.wkgbmnqykc
    public int eablkybsjg() {
        return 12;
    }

    @Override // db.wkgbmnqykc
    public /* bridge */ /* synthetic */ byte[] ppxfxbqfkf(byte[] bArr, ByteBuffer byteBuffer) {
        return super.ppxfxbqfkf(bArr, byteBuffer);
    }

    @Override // db.wkgbmnqykc
    public /* bridge */ /* synthetic */ void wkgbmnqykc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.wkgbmnqykc(byteBuffer, bArr, bArr2);
    }

    @Override // db.wkgbmnqykc
    public int[] zoijcleaow(int[] iArr, int i13) {
        if (iArr.length != eablkybsjg() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        iobyxmoadg.ppxfxbqfkf(iArr2, this.f27372iobyxmoadg);
        iArr2[12] = i13;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
