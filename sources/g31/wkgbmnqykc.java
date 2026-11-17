package g31;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import j0.h;
import j0.n;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {
    public static final nufgyqmvbu iobyxmoadg(h textMeasurer, n defaultStyle, String badgeText, draadjrbmk draadjrbmkVar, int i13) {
        zdlpuopuiu.btonecajqb(textMeasurer, "textMeasurer");
        zdlpuopuiu.btonecajqb(defaultStyle, "defaultStyle");
        zdlpuopuiu.btonecajqb(badgeText, "badgeText");
        draadjrbmkVar.sopmlzcsov(-1170334318);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1170334318, i13, -1, "ru.myspar.proloyalty.core.ui.compose.components.badge.getBadgeWidthSize (MySparBadgeUtils.kt:24)");
        }
        if (kcexrzcfyt.zfvoamnweg(badgeText) || badgeText.length() > 1) {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return null;
        }
        float fX = ((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).x((int) (textMeasurer.iobyxmoadg(badgeText, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : defaultStyle, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? textMeasurer.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textMeasurer.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? textMeasurer.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() & 4294967295L));
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return nufgyqmvbu.wkgbmnqykc(fX);
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc widthNotNull, nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(widthNotNull, "$this$widthNotNull");
        return nufgyqmvbuVar != null ? cdpycssgdh.yggfygwlhe(widthNotNull, nufgyqmvbuVar.draadjrbmk()) : widthNotNull;
    }

    public static final String zoijcleaow(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        return iIntValue > 99 ? "99+" : String.valueOf(iIntValue);
    }
}
