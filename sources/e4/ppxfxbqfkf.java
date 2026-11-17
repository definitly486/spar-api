package e4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ByteArrayOutputStream f30419iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DataOutputStream f30420zoijcleaow;

    public ppxfxbqfkf() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
        this.f30419iobyxmoadg = byteArrayOutputStream;
        this.f30420zoijcleaow = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zoijcleaow(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        this.f30419iobyxmoadg.reset();
        try {
            zoijcleaow(this.f30420zoijcleaow, iobyxmoadgVar.f30415iobyxmoadg);
            String str = iobyxmoadgVar.f30418zoijcleaow;
            if (str == null) {
                str = "";
            }
            zoijcleaow(this.f30420zoijcleaow, str);
            this.f30420zoijcleaow.writeLong(iobyxmoadgVar.f30416ppxfxbqfkf);
            this.f30420zoijcleaow.writeLong(iobyxmoadgVar.f30417wkgbmnqykc);
            this.f30420zoijcleaow.write(iobyxmoadgVar.f30413eablkybsjg);
            this.f30420zoijcleaow.flush();
            return this.f30419iobyxmoadg.toByteArray();
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }
}
