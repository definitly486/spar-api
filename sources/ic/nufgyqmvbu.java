package ic;

import ac.cdpycssgdh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f42374iobyxmoadg;

    nufgyqmvbu(cdpycssgdh cdpycssgdhVar) {
        this.f42374iobyxmoadg = cdpycssgdhVar;
    }

    private static dxjokdxxww iobyxmoadg(int i13) {
        if (i13 == 3) {
            return new wflxmlrfwp();
        }
        xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Could not determine SettingsJsonTransform for settings version " + i13 + ". Using default settings values.");
        return new zoijcleaow();
    }

    public wkgbmnqykc zoijcleaow(JSONObject jSONObject) {
        return iobyxmoadg(jSONObject.getInt("settings_version")).iobyxmoadg(this.f42374iobyxmoadg, jSONObject);
    }
}
