package g40;

import android.net.Uri;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.DeepLink;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f36185iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    private final DeepLink eablkybsjg(Uri uri) {
        String strWkgbmnqykc;
        if (uri.getPathSegments().contains("prime")) {
            return new DeepLink.Subscription(z30.iobyxmoadg.SPAR_PRIME, null, 2, null);
        }
        if (uri.getPathSegments().size() <= 1 && (strWkgbmnqykc = wkgbmnqykc(uri)) != null) {
            return new DeepLink.Subscription(z30.iobyxmoadg.COFFEE, strWkgbmnqykc);
        }
        return DeepLink.None.f87537iwizpuwonk;
    }

    private final DeepLink gxszxtbevo(Uri uri) {
        String queryParameter = uri.getQueryParameter("section");
        if (queryParameter == null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() <= 1) {
                pathSegments = null;
            }
            queryParameter = pathSegments != null ? (String) jyumaefscl.lxfrhoxuzk(pathSegments) : null;
        }
        return DeepLink.Catalog.INSTANCE.iobyxmoadg(queryParameter, uri.getQueryParameter("parent"));
    }

    private final DeepLink iobyxmoadg(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("type");
        return new DeepLink.RedirectPayment(queryParameter, queryParameter2 != null ? queryParameter2 : "");
    }

    private final DeepLink lqeggnwhkg(Uri uri) {
        return new DeepLink.Partner(uri.getQueryParameter("type"), uri.getQueryParameter("code"));
    }

    private final DeepLink ppxfxbqfkf(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            return null;
        }
        if (kcexrzcfyt.zfvoamnweg(queryParameter)) {
            queryParameter = null;
        }
        if (queryParameter != null) {
            return new DeepLink.Combo(queryParameter);
        }
        return null;
    }

    private final String wkgbmnqykc(Uri uri) {
        return uri.getQueryParameter("id");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    public final NavigationPayload zoijcleaow(Uri uri) {
        List<String> pathSegments;
        DeepLink deepLink;
        DeepLink deepLinkLqeggnwhkg;
        if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
            return null;
        }
        List listIobyxmoadg = DeepLink.INSTANCE.iobyxmoadg();
        if (pathSegments.isEmpty()) {
            return null;
        }
        Iterator<T> it = pathSegments.iterator();
        while (it.hasNext()) {
            if (listIobyxmoadg.contains((String) it.next())) {
                List<String> pathSegments2 = uri.getPathSegments();
                zdlpuopuiu.dxjokdxxww(pathSegments2, "getPathSegments(...)");
                String str = (String) jyumaefscl.weqkydbzbr(pathSegments2);
                if (str != null) {
                    switch (str) {
                        case "purchases":
                            deepLinkLqeggnwhkg = DeepLink.Purchases.f87542iwizpuwonk;
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "return_from_pay_system":
                            deepLinkLqeggnwhkg = DeepLink.ReturnFromPaySystem.f87545iwizpuwonk;
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "partner":
                            deepLinkLqeggnwhkg = lqeggnwhkg(uri);
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "successPayment":
                            deepLinkLqeggnwhkg = iobyxmoadg(uri);
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "product":
                            String strWkgbmnqykc = wkgbmnqykc(uri);
                            if (strWkgbmnqykc != null) {
                                deepLinkLqeggnwhkg = new DeepLink.Product(strWkgbmnqykc);
                            } else {
                                deepLinkLqeggnwhkg = null;
                            }
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "discounts":
                            deepLinkLqeggnwhkg = DeepLink.MyDiscounts.f87536iwizpuwonk;
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "combo":
                            deepLinkLqeggnwhkg = ppxfxbqfkf(uri);
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "lists":
                            List<String> pathSegments3 = uri.getPathSegments();
                            zdlpuopuiu.dxjokdxxww(pathSegments3, "getPathSegments(...)");
                            String str2 = (String) jyumaefscl.lrnfpwlwnk(pathSegments3, 1);
                            if (str2 != null) {
                                deepLinkLqeggnwhkg = new DeepLink.PurchaseList(str2);
                            } else {
                                deepLinkLqeggnwhkg = null;
                            }
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "subscription":
                            deepLinkLqeggnwhkg = eablkybsjg(uri);
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "catalog":
                            deepLinkLqeggnwhkg = gxszxtbevo(uri);
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        case "blockbanners":
                            String strWkgbmnqykc2 = wkgbmnqykc(uri);
                            if (strWkgbmnqykc2 != null) {
                                deepLinkLqeggnwhkg = new DeepLink.BlockBanners(strWkgbmnqykc2);
                            } else {
                                deepLinkLqeggnwhkg = null;
                            }
                            deepLink = deepLinkLqeggnwhkg;
                            break;
                        default:
                            deepLink = null;
                            break;
                    }
                } else {
                    deepLink = null;
                }
                if (deepLink != null) {
                    return new NavigationPayload(f40.zoijcleaow.DEEPLINK, null, null, null, false, deepLink, new AnalyticsPayload(AnalyticsPage.External.f84295iwizpuwonk, null, null, 6, null), false, 158, null);
                }
                return null;
            }
        }
        return null;
    }
}
