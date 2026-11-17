package g40;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import rs.wkgbmnqykc;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f36186iobyxmoadg = new ppxfxbqfkf();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f36187iobyxmoadg;

        static {
            int[] iArr = new int[f40.zoijcleaow.values().length];
            try {
                iArr[f40.zoijcleaow.POPUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f40.zoijcleaow.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f40.zoijcleaow.QUIZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36187iobyxmoadg = iArr;
        }
    }

    private ppxfxbqfkf() {
    }

    private final NavigationPayload eablkybsjg(Map map, String str) {
        NavigationPayload navigationPayloadZoijcleaow;
        NavigationPayload navigationPayloadWkgbmnqykc = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg((String) map.get(f40.ppxfxbqfkf.KEY_TYPE.wkgbmnqykc())).wkgbmnqykc();
        int i13 = iobyxmoadg.f36187iobyxmoadg[navigationPayloadWkgbmnqykc.getNavigationLink().ordinal()];
        if (i13 == 1) {
            navigationPayloadZoijcleaow = navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : (String) map.get(f40.ppxfxbqfkf.KEY_DESCRIPTION.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false);
        } else if (i13 == 2) {
            navigationPayloadZoijcleaow = navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : (String) map.get(f40.ppxfxbqfkf.KEY_LEGACY_ORDER_ID.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false);
        } else if (i13 != 3) {
            f40.ppxfxbqfkf ppxfxbqfkfVar = f40.ppxfxbqfkf.KEY_LEGACY_ORDER_ID;
            navigationPayloadZoijcleaow = map.containsKey(ppxfxbqfkfVar.wkgbmnqykc()) ? navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : f40.zoijcleaow.ORDER, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : (String) map.get(ppxfxbqfkfVar.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false) : navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : (String) map.get(f40.ppxfxbqfkf.KEY_REFERENCE.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false);
        } else {
            navigationPayloadZoijcleaow = navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : (String) map.get(f40.ppxfxbqfkf.KEY_REFERENCE.wkgbmnqykc()), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : (String) map.get(f40.ppxfxbqfkf.KEY_TITLE.wkgbmnqykc()), (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : (String) map.get(f40.ppxfxbqfkf.KEY_DESCRIPTION.wkgbmnqykc()), (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false);
        }
        NavigationPayload navigationPayload = navigationPayloadZoijcleaow;
        NavigationPayload navigationPayloadZoijcleaow2 = navigationPayload.zoijcleaow((191 & 1) != 0 ? navigationPayload.navigationLink : null, (191 & 2) != 0 ? navigationPayload.reference : null, (191 & 4) != 0 ? navigationPayload.title : null, (191 & 8) != 0 ? navigationPayload.message : null, (191 & 16) != 0 ? navigationPayload.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayload.deepLink : null, (191 & 64) != 0 ? navigationPayload.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayload.isPushPayload : true);
        wkgbmnqykc.eablkybsjg(wkgbmnqykc.f83693iobyxmoadg, "Push received: id=\"" + str + "\", data=\"" + navigationPayloadZoijcleaow2 + "\"", false, 2, null);
        return navigationPayloadZoijcleaow2;
    }

    private final boolean iobyxmoadg(Map map) {
        String str = (String) map.get(f40.ppxfxbqfkf.KEY_TYPE.wkgbmnqykc());
        return zdlpuopuiu.eablkybsjg(str, f40.zoijcleaow.NOTIFICATION.dxjokdxxww()) || zdlpuopuiu.eablkybsjg(str, f40.zoijcleaow.CHAT.dxjokdxxww()) || zoijcleaow(map) || ppxfxbqfkf(map);
    }

    private static final boolean ppxfxbqfkf(Map map) {
        CharSequence charSequence = (CharSequence) map.get(f40.ppxfxbqfkf.KEY_LEGACY_ORDER_ID.wkgbmnqykc());
        return !(charSequence == null || charSequence.length() == 0);
    }

    private static final boolean zoijcleaow(Map map) {
        return map.containsKey(f40.ppxfxbqfkf.KEY_TYPE.wkgbmnqykc());
    }

    public final NavigationPayload wkgbmnqykc(Map map, String str) {
        if (map == null) {
            return null;
        }
        if (!f36186iobyxmoadg.iobyxmoadg(map)) {
            map = null;
        }
        if (map != null) {
            return eablkybsjg(map, str);
        }
        return null;
    }
}
