package cb;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class yadqdtsiqt implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final byte[] f19501ppxfxbqfkf = new byte[0];

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nb.pmvmpeiblj f19502iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bb.iobyxmoadg f19503zoijcleaow;

    public yadqdtsiqt(nb.pmvmpeiblj pmvmpeibljVar, bb.iobyxmoadg iobyxmoadgVar) {
        this.f19502iobyxmoadg = pmvmpeibljVar;
        this.f19503zoijcleaow = iobyxmoadgVar;
    }

    private byte[] ppxfxbqfkf(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = bb.cqumvgiudr.btonecajqb(this.f19502iobyxmoadg).toByteArray();
        return ppxfxbqfkf(this.f19503zoijcleaow.iobyxmoadg(byteArray, f19501ppxfxbqfkf), ((bb.iobyxmoadg) bb.cqumvgiudr.gxszxtbevo(this.f19502iobyxmoadg.ntlheqmsrt(), byteArray, bb.iobyxmoadg.class)).iobyxmoadg(bArr, bArr2));
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i13 = byteBufferWrap.getInt();
            if (i13 <= 0 || i13 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i13];
            byteBufferWrap.get(bArr3, 0, i13);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((bb.iobyxmoadg) bb.cqumvgiudr.gxszxtbevo(this.f19502iobyxmoadg.ntlheqmsrt(), this.f19503zoijcleaow.zoijcleaow(bArr3, f19501ppxfxbqfkf), bb.iobyxmoadg.class)).zoijcleaow(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e13) {
            e = e13;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e14) {
            e = e14;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e15) {
            e = e15;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
