package db;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f27368ppxfxbqfkf = gb.zoijcleaow.EnumC0829zoijcleaow.f36735zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f27369iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f27370zoijcleaow;

    public gxszxtbevo(byte[] bArr) throws GeneralSecurityException {
        if (!f27368ppxfxbqfkf.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f27369iobyxmoadg = eablkybsjg(bArr, 1);
        this.f27370zoijcleaow = eablkybsjg(bArr, 0);
    }

    private byte[] ppxfxbqfkf(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f27370zoijcleaow.iobyxmoadg(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] wkgbmnqykc(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i13 = iRemaining % 16;
        int i14 = (i13 == 0 ? iRemaining : (iRemaining + 16) - i13) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i14);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    abstract wkgbmnqykc eablkybsjg(byte[] bArr, int i13);

    public byte[] iobyxmoadg(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            dxjokdxxww.gxszxtbevo(ppxfxbqfkf(bArr), wkgbmnqykc(bArr2, byteBuffer), bArr3);
            byteBuffer.position(iPosition);
            return this.f27369iobyxmoadg.ppxfxbqfkf(bArr, byteBuffer);
        } catch (GeneralSecurityException e13) {
            throw new AEADBadTagException(e13.toString());
        }
    }

    public void zoijcleaow(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f27369iobyxmoadg.wkgbmnqykc(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrIobyxmoadg = dxjokdxxww.iobyxmoadg(ppxfxbqfkf(bArr), wkgbmnqykc(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrIobyxmoadg);
    }
}
