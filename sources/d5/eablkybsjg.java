package d5;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg implements yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Resources f27053iobyxmoadg;

    public eablkybsjg(Resources resources) {
        this.f27053iobyxmoadg = (Resources) y2.iobyxmoadg.eablkybsjg(resources);
    }

    private String btonecajqb(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f27053iobyxmoadg.getString(zynmafqrjb.exo_item_list, string, str);
            }
        }
        return string;
    }

    private static int dxjokdxxww(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int iGtknphoqwx = v2.iwizpuwonk.gtknphoqwx(iobyxmoadgVar.f9769ojitshcjhn);
        if (iGtknphoqwx != -1) {
            return iGtknphoqwx;
        }
        if (v2.iwizpuwonk.wflxmlrfwp(iobyxmoadgVar.f9754gtknphoqwx) != null) {
            return 2;
        }
        if (v2.iwizpuwonk.ppxfxbqfkf(iobyxmoadgVar.f9754gtknphoqwx) != null) {
            return 1;
        }
        if (iobyxmoadgVar.f9763jyumaefscl == -1 && iobyxmoadgVar.f9761iwizpuwonk == -1) {
            return (iobyxmoadgVar.f9779yadqdtsiqt == -1 && iobyxmoadgVar.f9759iozdgvuglv == -1) ? -1 : 1;
        }
        return 2;
    }

    private String eablkybsjg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String strBtonecajqb = btonecajqb(gxszxtbevo(iobyxmoadgVar), nufgyqmvbu(iobyxmoadgVar));
        return TextUtils.isEmpty(strBtonecajqb) ? wkgbmnqykc(iobyxmoadgVar) : strBtonecajqb;
    }

    private String gxszxtbevo(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9777wkgbmnqykc;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeNtlheqmsrt = stevsuqkhv.ntlheqmsrt();
        String displayName = localeForLanguageTag.getDisplayName(localeNtlheqmsrt);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeNtlheqmsrt) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String lqeggnwhkg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f9763jyumaefscl;
        int i14 = iobyxmoadgVar.f9761iwizpuwonk;
        return (i13 == -1 || i14 == -1) ? "" : this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_resolution, Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private String nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String string = (iobyxmoadgVar.f9755gxszxtbevo & 2) != 0 ? this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_role_alternate) : "";
        if ((iobyxmoadgVar.f9755gxszxtbevo & 4) != 0) {
            string = btonecajqb(string, this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_role_supplementary));
        }
        if ((iobyxmoadgVar.f9755gxszxtbevo & 8) != 0) {
            string = btonecajqb(string, this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_role_commentary));
        }
        return (iobyxmoadgVar.f9755gxszxtbevo & 1088) != 0 ? btonecajqb(string, this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_role_closed_captions)) : string;
    }

    private String ppxfxbqfkf(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f9745btonecajqb;
        return i13 == -1 ? "" : this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f));
    }

    private String wkgbmnqykc(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return TextUtils.isEmpty(iobyxmoadgVar.f9783zoijcleaow) ? "" : iobyxmoadgVar.f9783zoijcleaow;
    }

    private String zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f9779yadqdtsiqt;
        if (i13 == -1 || i13 < 1) {
            return "";
        }
        if (i13 == 1) {
            return this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_mono);
        }
        if (i13 == 2) {
            return this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_stereo);
        }
        if (i13 == 6 || i13 == 7) {
            return this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_surround_5_point_1);
        }
        return i13 != 8 ? this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_surround) : this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_surround_7_point_1);
    }

    @Override // d5.yadqdtsiqt
    public String iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String strBtonecajqb;
        int iDxjokdxxww = dxjokdxxww(iobyxmoadgVar);
        if (iDxjokdxxww == 2) {
            strBtonecajqb = btonecajqb(nufgyqmvbu(iobyxmoadgVar), lqeggnwhkg(iobyxmoadgVar), ppxfxbqfkf(iobyxmoadgVar));
        } else {
            strBtonecajqb = iDxjokdxxww == 1 ? btonecajqb(eablkybsjg(iobyxmoadgVar), zoijcleaow(iobyxmoadgVar), ppxfxbqfkf(iobyxmoadgVar)) : eablkybsjg(iobyxmoadgVar);
        }
        if (strBtonecajqb.length() != 0) {
            return strBtonecajqb;
        }
        String str = iobyxmoadgVar.f9777wkgbmnqykc;
        return (str == null || str.trim().isEmpty()) ? this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_unknown) : this.f27053iobyxmoadg.getString(zynmafqrjb.exo_track_unknown_name, str);
    }
}
