package ib;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import bb.agtfadlqog;
import bb.draadjrbmk;
import bb.ojitshcjhn;
import bb.vdvldrhtss;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import ob.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f42303eablkybsjg = "iobyxmoadg";

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Object f42304wkgbmnqykc = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f42305iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ojitshcjhn f42306ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bb.iobyxmoadg f42307zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private ojitshcjhn f42312nufgyqmvbu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Context f42310iobyxmoadg = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f42315zoijcleaow = null;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f42313ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f42314wkgbmnqykc = null;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private bb.iobyxmoadg f42308eablkybsjg = null;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f42309gxszxtbevo = true;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private draadjrbmk f42311lqeggnwhkg = null;

        private ojitshcjhn btonecajqb(byte[] bArr) {
            try {
                this.f42308eablkybsjg = new ppxfxbqfkf().zoijcleaow(this.f42314wkgbmnqykc);
                try {
                    return ojitshcjhn.btonecajqb(agtfadlqog.agtfadlqog(bb.zoijcleaow.zoijcleaow(bArr), this.f42308eablkybsjg));
                } catch (IOException | GeneralSecurityException e13) {
                    try {
                        return dxjokdxxww(bArr);
                    } catch (IOException unused) {
                        throw e13;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e14) {
                try {
                    ojitshcjhn ojitshcjhnVarDxjokdxxww = dxjokdxxww(bArr);
                    Log.w(iobyxmoadg.f42303eablkybsjg, "cannot use Android Keystore, it'll be disabled", e14);
                    return ojitshcjhnVarDxjokdxxww;
                } catch (IOException unused2) {
                    throw e14;
                }
            }
        }

        private ojitshcjhn dxjokdxxww(byte[] bArr) {
            return ojitshcjhn.btonecajqb(bb.ppxfxbqfkf.iobyxmoadg(bb.zoijcleaow.zoijcleaow(bArr)));
        }

        private bb.iobyxmoadg gtknphoqwx() throws KeyStoreException {
            if (!iobyxmoadg.eablkybsjg()) {
                Log.w(iobyxmoadg.f42303eablkybsjg, "Android Keystore requires at least Android M");
                return null;
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            try {
                boolean zWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(this.f42314wkgbmnqykc);
                try {
                    return ppxfxbqfkfVar.zoijcleaow(this.f42314wkgbmnqykc);
                } catch (GeneralSecurityException | ProviderException e13) {
                    if (!zWkgbmnqykc) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f42314wkgbmnqykc), e13);
                    }
                    Log.w(iobyxmoadg.f42303eablkybsjg, "cannot use Android Keystore, it'll be disabled", e13);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e14) {
                Log.w(iobyxmoadg.f42303eablkybsjg, "cannot use Android Keystore, it'll be disabled", e14);
                return null;
            }
        }

        private ojitshcjhn lqeggnwhkg() throws GeneralSecurityException {
            if (this.f42311lqeggnwhkg == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.dxjokdxxww().iobyxmoadg(this.f42311lqeggnwhkg);
            ojitshcjhn ojitshcjhnVarNufgyqmvbu = ojitshcjhnVarIobyxmoadg.nufgyqmvbu(ojitshcjhnVarIobyxmoadg.wkgbmnqykc().dxjokdxxww().mbcevpiqjq(0).mbcevpiqjq());
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f42310iobyxmoadg, this.f42315zoijcleaow, this.f42313ppxfxbqfkf);
            if (this.f42308eablkybsjg != null) {
                ojitshcjhnVarNufgyqmvbu.wkgbmnqykc().oxmwwwfdhm(wkgbmnqykcVar, this.f42308eablkybsjg);
            } else {
                bb.ppxfxbqfkf.zoijcleaow(ojitshcjhnVarNufgyqmvbu.wkgbmnqykc(), wkgbmnqykcVar);
            }
            return ojitshcjhnVarNufgyqmvbu;
        }

        private static byte[] nufgyqmvbu(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return gtknphoqwx.iobyxmoadg(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public zoijcleaow agtfadlqog(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f42310iobyxmoadg = context;
            this.f42315zoijcleaow = str;
            this.f42313ppxfxbqfkf = str2;
            return this;
        }

        public zoijcleaow draadjrbmk(draadjrbmk draadjrbmkVar) {
            this.f42311lqeggnwhkg = draadjrbmkVar;
            return this;
        }

        public synchronized iobyxmoadg gxszxtbevo() {
            iobyxmoadg iobyxmoadgVar;
            try {
                if (this.f42315zoijcleaow == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (iobyxmoadg.f42304wkgbmnqykc) {
                    try {
                        byte[] bArrNufgyqmvbu = nufgyqmvbu(this.f42310iobyxmoadg, this.f42315zoijcleaow, this.f42313ppxfxbqfkf);
                        if (bArrNufgyqmvbu == null) {
                            if (this.f42314wkgbmnqykc != null) {
                                this.f42308eablkybsjg = gtknphoqwx();
                            }
                            this.f42312nufgyqmvbu = lqeggnwhkg();
                        } else if (this.f42314wkgbmnqykc == null || !iobyxmoadg.eablkybsjg()) {
                            this.f42312nufgyqmvbu = dxjokdxxww(bArrNufgyqmvbu);
                        } else {
                            this.f42312nufgyqmvbu = btonecajqb(bArrNufgyqmvbu);
                        }
                        iobyxmoadgVar = new iobyxmoadg(this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return iobyxmoadgVar;
        }

        public zoijcleaow wflxmlrfwp(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f42309gxszxtbevo) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f42314wkgbmnqykc = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean eablkybsjg() {
        return true;
    }

    public synchronized agtfadlqog wkgbmnqykc() {
        return this.f42306ppxfxbqfkf.wkgbmnqykc();
    }

    private iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f42305iobyxmoadg = new wkgbmnqykc(zoijcleaowVar.f42310iobyxmoadg, zoijcleaowVar.f42315zoijcleaow, zoijcleaowVar.f42313ppxfxbqfkf);
        this.f42307zoijcleaow = zoijcleaowVar.f42308eablkybsjg;
        this.f42306ppxfxbqfkf = zoijcleaowVar.f42312nufgyqmvbu;
    }
}
