package z6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import hg.jyumaefscl;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import x6.ojitshcjhn;
import x6.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk implements dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f129178ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Uri f129179iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129180zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements dxjokdxxww.iobyxmoadg {
        private final boolean ppxfxbqfkf(Uri uri) {
            return zdlpuopuiu.eablkybsjg(uri.getScheme(), "android.resource");
        }

        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Uri uri, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            if (ppxfxbqfkf(uri)) {
                return new draadjrbmk(uri, draadjrbmkVar);
            }
            return null;
        }
    }

    public draadjrbmk(Uri uri, e7.draadjrbmk draadjrbmkVar) {
        this.f129179iobyxmoadg = uri;
        this.f129180zoijcleaow = draadjrbmkVar;
    }

    private final Void zoijcleaow(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        Integer numVdvldrhtss;
        String authority = this.f129179iobyxmoadg.getAuthority();
        if (authority != null) {
            if (kcexrzcfyt.zfvoamnweg(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) jyumaefscl.lxfrhoxuzk(this.f129179iobyxmoadg.getPathSegments());
                if (str == null || (numVdvldrhtss = kcexrzcfyt.vdvldrhtss(str)) == null) {
                    zoijcleaow(this.f129179iobyxmoadg);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numVdvldrhtss.intValue();
                Context contextLqeggnwhkg = this.f129180zoijcleaow.lqeggnwhkg();
                Resources resources = zdlpuopuiu.eablkybsjg(authority, contextLqeggnwhkg.getPackageName()) ? contextLqeggnwhkg.getResources() : contextLqeggnwhkg.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strBtonecajqb = i7.gtknphoqwx.btonecajqb(MimeTypeMap.getSingleton(), charSequence.subSequence(kcexrzcfyt.opjhrmiecq(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!zdlpuopuiu.eablkybsjg(strBtonecajqb, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new wflxmlrfwp(ojitshcjhn.zoijcleaow(bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(resources.openRawResource(iIntValue, typedValue2))), contextLqeggnwhkg, new rgvfuqvkyq(authority, iIntValue, typedValue2.density)), strBtonecajqb, x6.wkgbmnqykc.DISK);
                }
                Drawable drawableIobyxmoadg = zdlpuopuiu.eablkybsjg(authority, contextLqeggnwhkg.getPackageName()) ? i7.wkgbmnqykc.iobyxmoadg(contextLqeggnwhkg, iIntValue) : i7.wkgbmnqykc.wkgbmnqykc(contextLqeggnwhkg, resources, iIntValue);
                boolean zYggfygwlhe = i7.gtknphoqwx.yggfygwlhe(drawableIobyxmoadg);
                if (zYggfygwlhe) {
                    drawableIobyxmoadg = new BitmapDrawable(contextLqeggnwhkg.getResources(), i7.wflxmlrfwp.f42080iobyxmoadg.iobyxmoadg(drawableIobyxmoadg, this.f129180zoijcleaow.gxszxtbevo(), this.f129180zoijcleaow.ojitshcjhn(), this.f129180zoijcleaow.agtfadlqog(), this.f129180zoijcleaow.ppxfxbqfkf()));
                }
                return new lqeggnwhkg(drawableIobyxmoadg, zYggfygwlhe, x6.wkgbmnqykc.DISK);
            }
        }
        zoijcleaow(this.f129179iobyxmoadg);
        throw new KotlinNothingValueException();
    }
}
