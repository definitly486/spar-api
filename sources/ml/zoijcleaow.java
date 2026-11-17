package ml;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes3.dex */
abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final am.iobyxmoadg f67393iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Class f67394zoijcleaow;

    static {
        am.iobyxmoadg iobyxmoadgVarDxjokdxxww = am.zoijcleaow.dxjokdxxww(zoijcleaow.class);
        f67393iobyxmoadg = iobyxmoadgVarDxjokdxxww;
        String property = System.getProperty("org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256");
        if (property != null) {
            try {
                Class<?> cls = Class.forName(property);
                f67394zoijcleaow = cls;
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) cls.newInstance();
                ppxfxbqfkfVar.iobyxmoadg(new byte[]{124, -81, 43, 14, -71, -72, -84, 75, 115, 73, -52, -39, 74, -58, 77, -83}, UserVerificationMethods.USER_VERIFY_NONE, new byte[8]);
                iobyxmoadgVarDxjokdxxww.wkgbmnqykc("Using custom ConcatenationKeyDerivationFunctionWithSha256 implementation: " + ppxfxbqfkfVar.getClass());
            } catch (Throwable th2) {
                f67394zoijcleaow = null;
                f67393iobyxmoadg.jyumaefscl("Using jose4j's concatenation key derivation function implementation because of problems with " + property, th2);
            }
        }
    }

    static ppxfxbqfkf iobyxmoadg(String str) {
        Class cls = f67394zoijcleaow;
        if (cls != null) {
            try {
                return (ppxfxbqfkf) cls.newInstance();
            } catch (Exception e13) {
                f67393iobyxmoadg.jyumaefscl("Unable to create new instance of " + f67394zoijcleaow, e13);
            }
        }
        return new iobyxmoadg("SHA-256", str);
    }
}
