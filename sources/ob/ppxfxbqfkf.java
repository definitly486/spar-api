package ob;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements bb.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final gb.zoijcleaow.EnumC0829zoijcleaow f72516zoijcleaow = gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final db.zoijcleaow f72517iobyxmoadg;

    public ppxfxbqfkf(byte[] bArr) throws GeneralSecurityException {
        if (!f72516zoijcleaow.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f72517iobyxmoadg = new db.zoijcleaow(bArr, true);
    }

    @Override // bb.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) {
        return this.f72517iobyxmoadg.zoijcleaow(rgvfuqvkyq.ppxfxbqfkf(12), bArr, bArr2);
    }

    @Override // bb.iobyxmoadg
    public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) {
        return this.f72517iobyxmoadg.iobyxmoadg(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
