package modern.payments.ecomAndroid.util.headerBuilder;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lj.wflxmlrfwp;
import lk.cdpycssgdh;
import mj.draadjrbmk;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandlerImpl;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "<init>", "()V", "", "Lmj/draadjrbmk;", "listOfCookie", "Lgg/wwaezpbzkn;", "proceedCookie", "(Ljava/util/List;)V", "", "setCookie", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType;", "cookieType", "handleSetCookie", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType;)V", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required;", "proceedRequiredCookie", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required;)V", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired;", "proceedNonRequiredCookie", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired;)V", "Llk/cdpycssgdh;", "response", "saveSetCookieData", "(Llk/cdpycssgdh;)V", "", "useRefresh", "getSetCookieData", "(Z)Ljava/lang/String;", "clearSetCookieData", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmj/rgvfuqvkyq;", "eComCookieRegex", "Lmj/rgvfuqvkyq;", "xGeoSticky", "Ljava/lang/String;", "xSpDM", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SetCookieHandlerImpl implements SetCookieHandler {
    private static final String GEO_STICKY = "X-Geo-Sticky";
    private static final String SET_COOKIE = "set-cookie";
    private static final String SP_D_M = "X-SP-D-M";
    private String xGeoSticky;
    private final rgvfuqvkyq eComCookieRegex = new rgvfuqvkyq("X.*?=.*?(?=[,;])");
    private String xSpDM = "";

    private final void handleSetCookie(String setCookie, SetCookieHandler.CookieType cookieType) {
        if (cookieType instanceof SetCookieHandler.CookieType.Required) {
            proceedRequiredCookie(setCookie, (SetCookieHandler.CookieType.Required) cookieType);
        } else if (cookieType instanceof SetCookieHandler.CookieType.NonRequired) {
            proceedNonRequiredCookie(setCookie, (SetCookieHandler.CookieType.NonRequired) cookieType);
        }
    }

    private final void proceedCookie(List<? extends draadjrbmk> listOfCookie) {
        for (draadjrbmk draadjrbmkVar : listOfCookie) {
            SetCookieHandler.CookieType cookieType = null;
            if (kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), GEO_STICKY, false, 2, null)) {
                cookieType = SetCookieHandler.CookieType.NonRequired.GeoSticky.INSTANCE;
            } else if (kcexrzcfyt.sopmlzcsov(draadjrbmkVar.getValue(), SP_D_M, false, 2, null)) {
                cookieType = SetCookieHandler.CookieType.Required.SPDM.INSTANCE;
            }
            if (cookieType != null) {
                handleSetCookie(draadjrbmkVar.getValue(), cookieType);
            }
        }
    }

    private final void proceedNonRequiredCookie(String setCookie, SetCookieHandler.CookieType.NonRequired cookieType) {
        if (zdlpuopuiu.eablkybsjg(cookieType, SetCookieHandler.CookieType.NonRequired.GeoSticky.INSTANCE)) {
            this.xGeoSticky = setCookie;
        }
    }

    private final void proceedRequiredCookie(String setCookie, SetCookieHandler.CookieType.Required cookieType) {
        if (zdlpuopuiu.eablkybsjg(cookieType, SetCookieHandler.CookieType.Required.SPDM.INSTANCE)) {
            String valueOrNull = StringExtensionsKt.getValueOrNull(setCookie);
            if (valueOrNull == null) {
                valueOrNull = this.xSpDM;
            }
            this.xSpDM = valueOrNull;
        }
    }

    @Override // modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler
    public Object clearSetCookieData(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        this.xGeoSticky = null;
        this.xSpDM = "";
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler
    public String getSetCookieData(boolean useRefresh) {
        StringBuilder sb3 = new StringBuilder();
        List listKcexrzcfyt = jyumaefscl.kcexrzcfyt(this.xSpDM, this.xGeoSticky);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listKcexrzcfyt) {
            String str = (String) obj;
            if (str != null && !zdlpuopuiu.eablkybsjg(str, "")) {
                arrayList.add(obj);
            }
        }
        int i13 = 0;
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            String str2 = (String) obj2;
            if (i13 != arrayList.size() - 1) {
                sb3.append(str2);
                sb3.append("; ");
            } else {
                sb3.append(str2);
            }
            i13 = i14;
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        if (kcexrzcfyt.zfvoamnweg(string)) {
            string = null;
        }
        return String.valueOf(string);
    }

    @Override // modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler
    public void saveSetCookieData(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        proceedCookie(wflxmlrfwp.crxdokpmqz(StringExtensionsKt.substrings(String.valueOf((List) response.kcexrzcfyt().dxjokdxxww().get(SET_COOKIE)), this.eComCookieRegex)));
    }
}
