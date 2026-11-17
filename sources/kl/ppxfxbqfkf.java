package kl;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.jose4j.lang.InvalidAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final ppxfxbqfkf f59732eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final ppxfxbqfkf f59733ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final ppxfxbqfkf f59734wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f59735iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f59736zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f59737iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f59737iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.PERMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59737iobyxmoadg[zoijcleaow.WHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59737iobyxmoadg[zoijcleaow.BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59737iobyxmoadg[zoijcleaow.BLACKLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum zoijcleaow {
        WHITELIST,
        BLACKLIST,
        PERMIT,
        BLOCK
    }

    static {
        zoijcleaow zoijcleaowVar = zoijcleaow.BLOCK;
        f59733ppxfxbqfkf = new ppxfxbqfkf(zoijcleaowVar, new String[0]);
        f59734wkgbmnqykc = new ppxfxbqfkf(zoijcleaowVar, DevicePublicKeyStringDef.NONE);
        f59732eablkybsjg = new ppxfxbqfkf(zoijcleaow.PERMIT, DevicePublicKeyStringDef.NONE);
    }

    public ppxfxbqfkf(zoijcleaow zoijcleaowVar, String... strArr) {
        if (zoijcleaowVar == null) {
            throw new NullPointerException("ConstraintType cannot be null");
        }
        this.f59735iobyxmoadg = zoijcleaowVar;
        this.f59736zoijcleaow = new HashSet(Arrays.asList(strArr));
    }

    public void iobyxmoadg(String str) throws InvalidAlgorithmException {
        int i13 = iobyxmoadg.f59737iobyxmoadg[this.f59735iobyxmoadg.ordinal()];
        if (i13 == 1 || i13 == 2) {
            if (this.f59736zoijcleaow.contains(str)) {
                return;
            }
            throw new InvalidAlgorithmException("'" + str + "' is not a permitted algorithm.");
        }
        if ((i13 == 3 || i13 == 4) && this.f59736zoijcleaow.contains(str)) {
            throw new InvalidAlgorithmException("'" + str + "' is a blocked algorithm.");
        }
    }
}
