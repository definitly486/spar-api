package bz;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import t6.p1;

/* JADX INFO: loaded from: classes2.dex */
class agtfadlqog extends metgxyhuhe implements e, p1 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17379eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17380gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final pc2.iobyxmoadg f17381lqeggnwhkg;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ File zoijcleaow() {
            try {
                return new File(agtfadlqog.this.f17379eablkybsjg.getPackageManager().getPackageInfo(agtfadlqog.this.f17379eablkybsjg.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).applicationInfo.sourceDir);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = (File) agtfadlqog.this.vdvldrhtss(new Callable() { // from class: bz.wflxmlrfwp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17658iobyxmoadg.zoijcleaow();
                }
            });
            if (file == null) {
                return;
            }
            String string = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    while (true) {
                        int i13 = fileInputStream.read(bArr);
                        if (i13 <= 0) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i13);
                        }
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb3 = new StringBuilder();
                    for (byte b13 : bArrDigest) {
                        StringBuilder sb4 = new StringBuilder(Integer.toHexString(b13 & 255));
                        while (sb4.length() < 2) {
                            sb4.insert(0, CommonUrlParts.Values.FALSE_INTEGER);
                        }
                        sb3.append((CharSequence) sb4);
                    }
                    string = sb3.toString();
                    fileInputStream.close();
                    agtfadlqog.this.btonecajqb(string);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | NoSuchAlgorithmException unused) {
            }
        }
    }

    agtfadlqog(Context context, t6.zdlpuopuiu zdlpuopuiuVar, pc2.iobyxmoadg iobyxmoadgVar) {
        super(kc2.lqeggnwhkg.ApplicationMD5);
        this.f17379eablkybsjg = context;
        this.f17380gxszxtbevo = zdlpuopuiuVar;
        this.f17381lqeggnwhkg = iobyxmoadgVar;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jrbgnlbqoe {
        String str = (String) ppxfxbqfkf();
        if (str != null) {
            return str;
        }
        ojitshcjhn(null);
        throw new jrbgnlbqoe("cachedValue == null");
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17380gxszxtbevo;
    }

    @Override // t6.p1
    public pc2.iobyxmoadg zoijcleaow() {
        return this.f17381lqeggnwhkg;
    }
}
