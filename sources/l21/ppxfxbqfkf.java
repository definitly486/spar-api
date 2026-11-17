package l21;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import k21.ojitshcjhn;
import k21.rgvfuqvkyq;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f61375iobyxmoadg = new ppxfxbqfkf();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f61376iobyxmoadg;

        static {
            int[] iArr = new int[ojitshcjhn.values().length];
            try {
                iArr[ojitshcjhn.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ojitshcjhn.TIPS_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ojitshcjhn.QUIZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61376iobyxmoadg = iArr;
        }
    }

    private ppxfxbqfkf() {
    }

    private final NavigationPayload eablkybsjg(Map map, String str) {
        NavigationPayload navigationPayloadPpxfxbqfkf;
        NavigationPayload navigationPayloadLqeggnwhkg = ojitshcjhn.lqeggnwhkg(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg((String) map.get(rgvfuqvkyq.KEY_TYPE.wkgbmnqykc())), null, 1, null);
        int i13 = iobyxmoadg.f61376iobyxmoadg[navigationPayloadLqeggnwhkg.getNavigationLink().ordinal()];
        if (i13 == 1 || i13 == 2) {
            navigationPayloadPpxfxbqfkf = navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : (String) map.get(rgvfuqvkyq.KEY_ORDER_ID.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false);
        } else if (i13 != 3) {
            rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.KEY_ORDER_ID;
            navigationPayloadPpxfxbqfkf = map.containsKey(rgvfuqvkyqVar.wkgbmnqykc()) ? navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : ojitshcjhn.ORDER, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : (String) map.get(rgvfuqvkyqVar.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false) : navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : (String) map.get(rgvfuqvkyq.KEY_REFERENCE.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false);
        } else {
            navigationPayloadPpxfxbqfkf = navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : (String) map.get(rgvfuqvkyq.KEY_REFERENCE.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : (String) map.get(rgvfuqvkyq.KEY_TITLE.wkgbmnqykc()), (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : (String) map.get(rgvfuqvkyq.KEY_DESCRIPTION.wkgbmnqykc()), (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false);
        }
        NavigationPayload navigationPayload = navigationPayloadPpxfxbqfkf;
        NavigationPayload navigationPayloadPpxfxbqfkf2 = navigationPayload.ppxfxbqfkf((191 & 1) != 0 ? navigationPayload.navigationLink : null, (191 & 2) != 0 ? navigationPayload.reference : null, (191 & 4) != 0 ? navigationPayload.title : null, (191 & 8) != 0 ? navigationPayload.message : null, (191 & 16) != 0 ? navigationPayload.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayload.deepLink : null, (191 & 64) != 0 ? navigationPayload.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayload.isPushPayload : true);
        wkgbmnqykc.eablkybsjg(wkgbmnqykc.f60450iobyxmoadg, "Push received: id=\"" + str + "\", data=\"" + navigationPayloadPpxfxbqfkf2 + "\"", false, 2, null);
        return navigationPayloadPpxfxbqfkf2;
    }

    private final boolean iobyxmoadg(Map map) {
        String str = (String) map.get(rgvfuqvkyq.KEY_TYPE.wkgbmnqykc());
        return zdlpuopuiu.eablkybsjg(str, ojitshcjhn.NOTIFICATION.btonecajqb()) || zdlpuopuiu.eablkybsjg(str, ojitshcjhn.CHAT.btonecajqb()) || zoijcleaow(map) || ppxfxbqfkf(map);
    }

    private static final boolean ppxfxbqfkf(Map map) {
        CharSequence charSequence = (CharSequence) map.get(rgvfuqvkyq.KEY_ORDER_ID.wkgbmnqykc());
        return !(charSequence == null || charSequence.length() == 0);
    }

    private static final boolean zoijcleaow(Map map) {
        return map.containsKey(rgvfuqvkyq.KEY_TYPE.wkgbmnqykc());
    }

    public final NavigationPayload wkgbmnqykc(Map map, String str) {
        if (map == null) {
            return null;
        }
        if (!f61375iobyxmoadg.iobyxmoadg(map)) {
            map = null;
        }
        if (map != null) {
            return eablkybsjg(map, str);
        }
        return null;
    }
}
