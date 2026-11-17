package tl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.jose4j.lang.JoseException;
import org.jose4j.lang.UncheckedJoseException;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final am.iobyxmoadg f111023zoijcleaow = am.zoijcleaow.dxjokdxxww(zoijcleaow.class);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f111024iobyxmoadg;

    public zoijcleaow() {
        this.f111024iobyxmoadg = 204800;
        try {
            this.f111024iobyxmoadg = Integer.parseInt(System.getProperty("org.jose4j.zip.decompress-max-bytes", "204800"));
        } catch (NumberFormatException e13) {
            f111023zoijcleaow.wkgbmnqykc("Using the default value of " + this.f111024iobyxmoadg + " for the maximum allowed size of decompressed data because the system property org.jose4j.zip.decompress-max-bytes contains an invalid value: " + e13);
        }
        f111023zoijcleaow.wkgbmnqykc("");
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return true;
    }

    @Override // tl.iobyxmoadg
    public byte[] compress(byte[] bArr) {
        Deflater deflater = new Deflater(8, true);
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                    try {
                        deflaterOutputStream.write(bArr);
                        deflaterOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        deflaterOutputStream.close();
                        byteArrayOutputStream.close();
                        deflater.end();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            deflaterOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e13) {
                throw new UncheckedJoseException("Problem compressing data.", e13);
            }
        } catch (Throwable th6) {
            deflater.end();
            throw th6;
        }
    }

    @Override // kl.iobyxmoadg
    public String eablkybsjg() {
        return "DEF";
    }

    @Override // tl.iobyxmoadg
    public byte[] iobyxmoadg(byte[] bArr) {
        Inflater inflater = new Inflater(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
                    do {
                        int i13 = inflaterInputStream.read(bArr2);
                        if (i13 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream.close();
                            inflater.end();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i13);
                    } while (byteArrayOutputStream.size() <= this.f111024iobyxmoadg);
                    throw new JoseException("Maximum allowed size of decompressed data exceeded (which is " + this.f111024iobyxmoadg + " bytes but configurable with the org.jose4j.zip.decompress-max-bytes system property)");
                } catch (Throwable th2) {
                    try {
                        inflaterInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inflater.end();
                throw th4;
            }
        } catch (IOException e13) {
            throw new JoseException("Problem decompressing data.", e13);
        }
    }
}
