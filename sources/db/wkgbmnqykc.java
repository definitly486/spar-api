package db;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int[] f27372iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f27373zoijcleaow;

    public wkgbmnqykc(byte[] bArr, int i13) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f27372iobyxmoadg = iobyxmoadg.eablkybsjg(bArr);
        this.f27373zoijcleaow = i13;
    }

    private void gxszxtbevo(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != eablkybsjg()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + eablkybsjg());
        }
        int iRemaining = byteBuffer2.remaining();
        int i13 = iRemaining / 64;
        int i14 = i13 + 1;
        for (int i15 = 0; i15 < i14; i15++) {
            ByteBuffer byteBufferIobyxmoadg = iobyxmoadg(bArr, this.f27373zoijcleaow + i15);
            if (i15 == i13) {
                ob.gxszxtbevo.ppxfxbqfkf(byteBuffer, byteBuffer2, byteBufferIobyxmoadg, iRemaining % 64);
            } else {
                ob.gxszxtbevo.ppxfxbqfkf(byteBuffer, byteBuffer2, byteBufferIobyxmoadg, 64);
            }
        }
    }

    abstract int eablkybsjg();

    ByteBuffer iobyxmoadg(byte[] bArr, int i13) {
        int[] iArrZoijcleaow = zoijcleaow(iobyxmoadg.eablkybsjg(bArr), i13);
        int[] iArr = (int[]) iArrZoijcleaow.clone();
        iobyxmoadg.wkgbmnqykc(iArr);
        for (int i14 = 0; i14 < iArrZoijcleaow.length; i14++) {
            iArrZoijcleaow[i14] = iArrZoijcleaow[i14] + iArr[i14];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZoijcleaow, 0, 16);
        return byteBufferOrder;
    }

    public byte[] ppxfxbqfkf(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        gxszxtbevo(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void wkgbmnqykc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        gxszxtbevo(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int[] zoijcleaow(int[] iArr, int i13);
}
