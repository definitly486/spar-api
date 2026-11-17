package o0;

import n0.draadjrbmk;
import n0.lereixgezr;
import n0.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {
    public static final draadjrbmk iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar, int i13) {
        return new wkgbmnqykc(ppxfxbqfkfVar.zoijcleaow(), iobyxmoadgVar, yadqdtsiqtVar, i13, ppxfxbqfkfVar.iobyxmoadg(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(int i13) {
        if (i13 == -4) {
            return "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context";
        }
        if (i13 == -3) {
            return "Generic error loading font, for example variation settings were not parsable";
        }
        if (i13 == -2) {
            return "The given provider cannot be authenticated with the certificates given.";
        }
        if (i13 == -1) {
            return "The requested provider was not found on this device.";
        }
        if (i13 == 1) {
            return "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml";
        }
        if (i13 != 2) {
            return i13 != 3 ? "Unknown error code" : "The given query was not supported by this provider.";
        }
        return "The provider found the queried font, but it is currently unavailable.";
    }

    public static /* synthetic */ draadjrbmk zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            yadqdtsiqtVar = yadqdtsiqt.f68367yggfygwlhe.eablkybsjg();
        }
        if ((i14 & 8) != 0) {
            i13 = lereixgezr.f68283zoijcleaow.zoijcleaow();
        }
        return iobyxmoadg(ppxfxbqfkfVar, iobyxmoadgVar, yadqdtsiqtVar, i13);
    }
}
