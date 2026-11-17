package nc2;

import com.google.gson.btonecajqb;
import java.io.Serializable;
import kc2.lqeggnwhkg;
import org.json.JSONException;
import zone.bi.mobile.fingerprint.api.serialize.FingerprintSerializeException;

/* JADX INFO: loaded from: classes6.dex */
public class ppxfxbqfkf extends iobyxmoadg {
    public ppxfxbqfkf(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ppxfxbqfkf(oc2.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar, String str, Boolean bool) {
        oc2.iobyxmoadg iobyxmoadgVar2 = bool.booleanValue() ? (oc2.iobyxmoadg) iobyxmoadgVar.remove(lqeggnwhkgVar.name()) : (oc2.iobyxmoadg) iobyxmoadgVar.get(lqeggnwhkgVar.name());
        if (iobyxmoadgVar2 != null) {
            for (String str2 : iobyxmoadgVar2.keySet()) {
                iobyxmoadgVar.put(String.format(str, str2), (Serializable) iobyxmoadgVar2.get(str2));
            }
        }
    }

    void eablkybsjg(oc2.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(iobyxmoadgVar, lqeggnwhkg.GoogleServicesParameters, "%s", Boolean.TRUE);
    }

    @Override // nc2.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(oc2.iobyxmoadg iobyxmoadgVar) throws FingerprintSerializeException {
        try {
            eablkybsjg(iobyxmoadgVar);
            zoijcleaow(iobyxmoadgVar);
            btonecajqb btonecajqbVarNufgyqmvbu = gxszxtbevo.nufgyqmvbu(gxszxtbevo.dxjokdxxww(iobyxmoadgVar));
            if (this.f69696iobyxmoadg != null && iobyxmoadgVar.containsKey(lqeggnwhkg.LocationHash.name())) {
                gxszxtbevo.wkgbmnqykc(btonecajqbVarNufgyqmvbu, this.f69696iobyxmoadg);
            }
            return gxszxtbevo.eablkybsjg(btonecajqbVarNufgyqmvbu);
        } catch (JSONException e13) {
            throw new FingerprintSerializeException(e13.getMessage());
        }
    }

    void zoijcleaow(oc2.iobyxmoadg iobyxmoadgVar) {
        ppxfxbqfkf(iobyxmoadgVar, lqeggnwhkg.HoursSinceInstall, "%s", Boolean.FALSE);
        lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.Default;
        Boolean bool = Boolean.TRUE;
        ppxfxbqfkf(iobyxmoadgVar, lqeggnwhkgVar, "HoursSince%sInstall", bool);
        ppxfxbqfkf(iobyxmoadgVar, lqeggnwhkg.Custom, "HoursSince%sInstall", bool);
    }
}
