package ml;

import java.io.ByteArrayOutputStream;
import javax.crypto.Mac;
import org.jose4j.lang.JoseException;
import org.jose4j.lang.UncheckedJoseException;
import ql.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f67387iobyxmoadg;

    public eablkybsjg(String str) {
        this.f67387iobyxmoadg = str;
    }

    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2, int i13, int i14, String str) throws JoseException {
        Mac macIobyxmoadg = sl.iobyxmoadg.iobyxmoadg(this.f67387iobyxmoadg, new vdvldrhtss(bArr), str);
        int macLength = macIobyxmoadg.getMacLength();
        if (i14 > 4294967295L) {
            throw new UncheckedJoseException("derived key too long " + i14);
        }
        int iCeil = (int) Math.ceil(((double) i14) / ((double) macLength));
        int i15 = iCeil - 1;
        int i16 = i14 - (macLength * i15);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i17 = 0;
        while (i17 < iCeil) {
            int i18 = i17 + 1;
            byte[] bArrZoijcleaow = zoijcleaow(bArr2, i13, i18, macIobyxmoadg);
            if (i17 == i15) {
                bArrZoijcleaow = rl.iobyxmoadg.ojitshcjhn(bArrZoijcleaow, 0, i16);
            }
            byteArrayOutputStream.write(bArrZoijcleaow, 0, bArrZoijcleaow.length);
            i17 = i18;
        }
        return byteArrayOutputStream.toByteArray();
    }

    byte[] zoijcleaow(byte[] bArr, int i13, int i14, Mac mac) {
        byte[] bArrDoFinal = null;
        byte[] bArrDoFinal2 = null;
        for (int i15 = 1; i15 <= i13; i15++) {
            if (i15 == 1) {
                bArrDoFinal = mac.doFinal(rl.iobyxmoadg.wkgbmnqykc(bArr, rl.iobyxmoadg.gxszxtbevo(i14)));
                bArrDoFinal2 = bArrDoFinal;
            } else {
                bArrDoFinal2 = mac.doFinal(bArrDoFinal2);
                for (int i16 = 0; i16 < bArrDoFinal2.length; i16++) {
                    bArrDoFinal[i16] = (byte) (bArrDoFinal2[i16] ^ bArrDoFinal[i16]);
                }
            }
        }
        return bArrDoFinal;
    }
}
