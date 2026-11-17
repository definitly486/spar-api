package ql;

import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends SecretKeySpec {
    public iobyxmoadg(byte[] bArr) {
        super(bArr, "AES");
    }

    public String toString() {
        return rl.iobyxmoadg.iobyxmoadg(getEncoded().length) + " bit AES key";
    }
}
