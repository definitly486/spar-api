package uc;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte f113248iobyxmoadg = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte f113249zoijcleaow = Byte.parseByte("00001111", 2);

    private static byte[] ppxfxbqfkf(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    private static String zoijcleaow(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public String iobyxmoadg() {
        byte[] bArrPpxfxbqfkf = ppxfxbqfkf(UUID.randomUUID(), new byte[17]);
        byte b13 = bArrPpxfxbqfkf[0];
        bArrPpxfxbqfkf[16] = b13;
        bArrPpxfxbqfkf[0] = (byte) ((b13 & f113249zoijcleaow) | f113248iobyxmoadg);
        return zoijcleaow(bArrPpxfxbqfkf);
    }
}
