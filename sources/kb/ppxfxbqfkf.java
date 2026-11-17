package kb;

import java.security.GeneralSecurityException;
import jb.dxjokdxxww;
import jb.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gb.zoijcleaow.EnumC0829zoijcleaow f54376zoijcleaow = gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f54377iobyxmoadg;

    public ppxfxbqfkf(dxjokdxxww dxjokdxxwwVar) throws GeneralSecurityException {
        if (!f54376zoijcleaow.iobyxmoadg()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f54377iobyxmoadg = dxjokdxxwwVar;
    }
}
