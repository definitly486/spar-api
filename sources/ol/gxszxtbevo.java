package ol;

import java.security.Security;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo extends ol.iobyxmoadg implements ol.eablkybsjg {

    public static class eablkybsjg extends gxszxtbevo {
        public eablkybsjg() {
            super("RS384", "SHA384withRSA");
        }
    }

    /* JADX INFO: renamed from: ol.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static class C1594gxszxtbevo extends gxszxtbevo {
        public C1594gxszxtbevo() {
            super("RS512", "SHA512withRSA");
        }
    }

    public static class iobyxmoadg extends gxszxtbevo {
        public iobyxmoadg() {
            super("PS256", gxszxtbevo.iwizpuwonk("SHA256withRSAandMGF1"));
            if (draadjrbmk().equals("RSASSA-PSS")) {
                MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
                yggfygwlhe(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1));
            }
        }
    }

    public static class ppxfxbqfkf extends gxszxtbevo {
        public ppxfxbqfkf() {
            super("PS512", gxszxtbevo.iwizpuwonk("SHA512withRSAandMGF1"));
            if (draadjrbmk().equals("RSASSA-PSS")) {
                MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
                yggfygwlhe(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 64, 1));
            }
        }
    }

    public static class wkgbmnqykc extends gxszxtbevo {
        public wkgbmnqykc() {
            super("RS256", "SHA256withRSA");
        }
    }

    public static class zoijcleaow extends gxszxtbevo {
        public zoijcleaow() {
            super("PS384", gxszxtbevo.iwizpuwonk("SHA384withRSAandMGF1"));
            if (draadjrbmk().equals("RSASSA-PSS")) {
                MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
                yggfygwlhe(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 48, 1));
            }
        }
    }

    public gxszxtbevo(String str, String str2) {
        super(str, str2, "RSA");
    }

    static String iwizpuwonk(String str) {
        return (!Security.getAlgorithms("Signature").contains("RSASSA-PSS") || Boolean.getBoolean("org.jose4j.jws.use-legacy-rsapss-alg-names")) ? str : "RSASSA-PSS";
    }
}
