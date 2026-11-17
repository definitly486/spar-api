package z6;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import bl.zdlpuopuiu;
import hg.jyumaefscl;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import x6.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Uri f129205iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129206zoijcleaow;

    /* JADX INFO: renamed from: z6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3277iobyxmoadg implements dxjokdxxww.iobyxmoadg {
        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Uri uri, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            if (i7.gtknphoqwx.vdvldrhtss(uri)) {
                return new iobyxmoadg(uri, draadjrbmkVar);
            }
            return null;
        }
    }

    public iobyxmoadg(Uri uri, e7.draadjrbmk draadjrbmkVar) {
        this.f129205iobyxmoadg = uri;
        this.f129206zoijcleaow = draadjrbmkVar;
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        String strIwxlajgraz = jyumaefscl.iwxlajgraz(jyumaefscl.rlfsiqarku(this.f129205iobyxmoadg.getPathSegments(), 1), CardDateFormatTextWatcher.DIVIDER_CHARACTER, null, null, 0, null, null, 62, null);
        return new wflxmlrfwp(ojitshcjhn.zoijcleaow(zdlpuopuiu.ppxfxbqfkf(zdlpuopuiu.btonecajqb(this.f129206zoijcleaow.lqeggnwhkg().getAssets().open(strIwxlajgraz))), this.f129206zoijcleaow.lqeggnwhkg(), new x6.iobyxmoadg(strIwxlajgraz)), i7.gtknphoqwx.btonecajqb(MimeTypeMap.getSingleton(), strIwxlajgraz), x6.wkgbmnqykc.DISK);
    }
}
