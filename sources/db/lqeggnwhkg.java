package db;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends wkgbmnqykc {
    public lqeggnwhkg(byte[] bArr, int i13) {
        super(bArr, i13);
    }

    static int[] lqeggnwhkg(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        iobyxmoadg.ppxfxbqfkf(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        iobyxmoadg.wkgbmnqykc(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // db.wkgbmnqykc
    int eablkybsjg() {
        return 24;
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
    int[] zoijcleaow(int[] iArr, int i13) {
        if (iArr.length != eablkybsjg() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        iobyxmoadg.ppxfxbqfkf(iArr2, lqeggnwhkg(this.f27372iobyxmoadg, iArr));
        iArr2[12] = i13;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
