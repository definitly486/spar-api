package l1;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f61325iobyxmoadg;

    /* JADX INFO: renamed from: l1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1238iobyxmoadg extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f61329iobyxmoadg;

        C1238iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f61329iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i13, CharSequence charSequence) {
            this.f61329iobyxmoadg.iobyxmoadg(i13, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f61329iobyxmoadg.zoijcleaow();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i13, CharSequence charSequence) {
            this.f61329iobyxmoadg.ppxfxbqfkf(i13, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f61329iobyxmoadg.wkgbmnqykc(new wkgbmnqykc(iobyxmoadg.lqeggnwhkg(zoijcleaow.zoijcleaow(authenticationResult))));
        }
    }

    public static abstract class ppxfxbqfkf {
        public abstract void iobyxmoadg(int i13, CharSequence charSequence);

        public abstract void ppxfxbqfkf(int i13, CharSequence charSequence);

        public abstract void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar);

        public abstract void zoijcleaow();
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eablkybsjg f61330iobyxmoadg;

        public wkgbmnqykc(eablkybsjg eablkybsjgVar) {
            this.f61330iobyxmoadg = eablkybsjgVar;
        }

        public eablkybsjg iobyxmoadg() {
            return this.f61330iobyxmoadg;
        }
    }

    static class zoijcleaow {
        static boolean eablkybsjg(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static eablkybsjg gxszxtbevo(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new eablkybsjg(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new eablkybsjg(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new eablkybsjg(cryptoObject.getMac());
            }
            return null;
        }

        static void iobyxmoadg(Object obj, Object obj2, CancellationSignal cancellationSignal, int i13, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i13, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject lqeggnwhkg(eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar == null) {
                return null;
            }
            if (eablkybsjgVar.iobyxmoadg() != null) {
                return new FingerprintManager.CryptoObject(eablkybsjgVar.iobyxmoadg());
            }
            if (eablkybsjgVar.ppxfxbqfkf() != null) {
                return new FingerprintManager.CryptoObject(eablkybsjgVar.ppxfxbqfkf());
            }
            if (eablkybsjgVar.zoijcleaow() != null) {
                return new FingerprintManager.CryptoObject(eablkybsjgVar.zoijcleaow());
            }
            return null;
        }

        public static FingerprintManager ppxfxbqfkf(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean wkgbmnqykc(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static FingerprintManager.CryptoObject zoijcleaow(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }
    }

    private iobyxmoadg(Context context) {
        this.f61325iobyxmoadg = context;
    }

    private static FingerprintManager.CryptoObject dxjokdxxww(eablkybsjg eablkybsjgVar) {
        return zoijcleaow.lqeggnwhkg(eablkybsjgVar);
    }

    static eablkybsjg lqeggnwhkg(FingerprintManager.CryptoObject cryptoObject) {
        return zoijcleaow.gxszxtbevo(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar) {
        return new C1238iobyxmoadg(ppxfxbqfkfVar);
    }

    public static iobyxmoadg ppxfxbqfkf(Context context) {
        return new iobyxmoadg(context);
    }

    private static FingerprintManager wkgbmnqykc(Context context) {
        return zoijcleaow.ppxfxbqfkf(context);
    }

    public boolean eablkybsjg() {
        FingerprintManager fingerprintManagerWkgbmnqykc = wkgbmnqykc(this.f61325iobyxmoadg);
        return fingerprintManagerWkgbmnqykc != null && zoijcleaow.wkgbmnqykc(fingerprintManagerWkgbmnqykc);
    }

    public boolean gxszxtbevo() {
        FingerprintManager fingerprintManagerWkgbmnqykc = wkgbmnqykc(this.f61325iobyxmoadg);
        return fingerprintManagerWkgbmnqykc != null && zoijcleaow.eablkybsjg(fingerprintManagerWkgbmnqykc);
    }

    public void iobyxmoadg(eablkybsjg eablkybsjgVar, int i13, CancellationSignal cancellationSignal, ppxfxbqfkf ppxfxbqfkfVar, Handler handler) {
        FingerprintManager fingerprintManagerWkgbmnqykc = wkgbmnqykc(this.f61325iobyxmoadg);
        if (fingerprintManagerWkgbmnqykc != null) {
            zoijcleaow.iobyxmoadg(fingerprintManagerWkgbmnqykc, dxjokdxxww(eablkybsjgVar), cancellationSignal, i13, nufgyqmvbu(ppxfxbqfkfVar), handler);
        }
    }

    public void zoijcleaow(eablkybsjg eablkybsjgVar, int i13, q1.wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar, Handler handler) {
        iobyxmoadg(eablkybsjgVar, i13, wkgbmnqykcVar != null ? (CancellationSignal) wkgbmnqykcVar.zoijcleaow() : null, ppxfxbqfkfVar, handler);
    }

    public static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Signature f61326iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Mac f61327ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Cipher f61328zoijcleaow;

        public eablkybsjg(Signature signature) {
            this.f61326iobyxmoadg = signature;
            this.f61328zoijcleaow = null;
            this.f61327ppxfxbqfkf = null;
        }

        public Cipher iobyxmoadg() {
            return this.f61328zoijcleaow;
        }

        public Signature ppxfxbqfkf() {
            return this.f61326iobyxmoadg;
        }

        public Mac zoijcleaow() {
            return this.f61327ppxfxbqfkf;
        }

        public eablkybsjg(Cipher cipher) {
            this.f61328zoijcleaow = cipher;
            this.f61326iobyxmoadg = null;
            this.f61327ppxfxbqfkf = null;
        }

        public eablkybsjg(Mac mac) {
            this.f61327ppxfxbqfkf = mac;
            this.f61328zoijcleaow = null;
            this.f61326iobyxmoadg = null;
        }
    }
}
