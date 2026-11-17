package cc;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.iozdgvuglv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final mc.iobyxmoadg f19568iobyxmoadg = new oc.wkgbmnqykc().dxjokdxxww(iobyxmoadg.f19579iobyxmoadg).nufgyqmvbu();

    private static String dxjokdxxww(String str) {
        return str.length() > 256 ? str.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT) : str;
    }

    static dxjokdxxww iobyxmoadg(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return zoijcleaow(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static dxjokdxxww zoijcleaow(String str, String str2, String str3, String str4, long j13) {
        return new zoijcleaow(str, str2, dxjokdxxww(str3), str4, j13);
    }

    public abstract String eablkybsjg();

    public abstract long gxszxtbevo();

    public abstract String lqeggnwhkg();

    public iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg nufgyqmvbu() {
        return iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg().wkgbmnqykc(iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg().ppxfxbqfkf(lqeggnwhkg()).zoijcleaow(eablkybsjg()).iobyxmoadg()).zoijcleaow(ppxfxbqfkf()).ppxfxbqfkf(wkgbmnqykc()).eablkybsjg(gxszxtbevo()).iobyxmoadg();
    }

    public abstract String ppxfxbqfkf();

    public abstract String wkgbmnqykc();
}
