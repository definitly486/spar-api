package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final PorterDuff.Mode f8494gtknphoqwx = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public String f8495btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public String f8496dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f8497eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f8498gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int f8499iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public ColorStateList f8500lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    PorterDuff.Mode f8501nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public byte[] f8502ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public Parcelable f8503wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    Object f8504zoijcleaow;

    static class iobyxmoadg {
        static Uri eablkybsjg(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ppxfxbqfkf.wkgbmnqykc(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e13) {
                Log.e("IconCompat", "Unable to get icon uri", e13);
                return null;
            } catch (NoSuchMethodException e14) {
                Log.e("IconCompat", "Unable to get icon uri", e14);
                return null;
            } catch (InvocationTargetException e15) {
                Log.e("IconCompat", "Unable to get icon uri", e15);
                return null;
            }
        }

        static Icon gxszxtbevo(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f8499iobyxmoadg) {
                case -1:
                    return (Icon) iconCompat.f8504zoijcleaow;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f8504zoijcleaow);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.gtknphoqwx(), iconCompat.f8497eablkybsjg);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f8504zoijcleaow, iconCompat.f8497eablkybsjg, iconCompat.f8498gxszxtbevo);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f8504zoijcleaow);
                    break;
                case 5:
                    iconCreateWithBitmap = zoijcleaow.iobyxmoadg((Bitmap) iconCompat.f8504zoijcleaow);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = wkgbmnqykc.iobyxmoadg(iconCompat.wflxmlrfwp());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.wflxmlrfwp());
                        }
                        InputStream inputStreamAgtfadlqog = iconCompat.agtfadlqog(context);
                        if (inputStreamAgtfadlqog == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.wflxmlrfwp());
                        }
                        iconCreateWithBitmap = zoijcleaow.iobyxmoadg(BitmapFactory.decodeStream(inputStreamAgtfadlqog));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f8500lqeggnwhkg;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f8501nufgyqmvbu;
            if (mode != IconCompat.f8494gtknphoqwx) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        static IconCompat iobyxmoadg(Object obj) {
            nufgyqmvbu.gxszxtbevo(obj);
            int iWkgbmnqykc = wkgbmnqykc(obj);
            if (iWkgbmnqykc == 2) {
                return IconCompat.nufgyqmvbu(null, ppxfxbqfkf(obj), zoijcleaow(obj));
            }
            if (iWkgbmnqykc == 4) {
                return IconCompat.gxszxtbevo(eablkybsjg(obj));
            }
            if (iWkgbmnqykc == 6) {
                return IconCompat.ppxfxbqfkf(eablkybsjg(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f8504zoijcleaow = obj;
            return iconCompat;
        }

        static String ppxfxbqfkf(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ppxfxbqfkf.zoijcleaow(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e13) {
                Log.e("IconCompat", "Unable to get icon package", e13);
                return null;
            } catch (NoSuchMethodException e14) {
                Log.e("IconCompat", "Unable to get icon package", e14);
                return null;
            } catch (InvocationTargetException e15) {
                Log.e("IconCompat", "Unable to get icon package", e15);
                return null;
            }
        }

        static int wkgbmnqykc(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ppxfxbqfkf.ppxfxbqfkf(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e13) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e13);
                return -1;
            } catch (NoSuchMethodException e14) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e14);
                return -1;
            } catch (InvocationTargetException e15) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e15);
                return -1;
            }
        }

        static int zoijcleaow(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ppxfxbqfkf.iobyxmoadg(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e13) {
                Log.e("IconCompat", "Unable to get icon resource", e13);
                return 0;
            } catch (NoSuchMethodException e14) {
                Log.e("IconCompat", "Unable to get icon resource", e14);
                return 0;
            } catch (InvocationTargetException e15) {
                Log.e("IconCompat", "Unable to get icon resource", e15);
                return 0;
            }
        }
    }

    static class ppxfxbqfkf {
        static int iobyxmoadg(Object obj) {
            return ((Icon) obj).getResId();
        }

        static int ppxfxbqfkf(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri wkgbmnqykc(Object obj) {
            return ((Icon) obj).getUri();
        }

        static String zoijcleaow(Object obj) {
            return ((Icon) obj).getResPackage();
        }
    }

    static class wkgbmnqykc {
        static Icon iobyxmoadg(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static class zoijcleaow {
        static Icon iobyxmoadg(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public IconCompat() {
        this.f8499iobyxmoadg = -1;
        this.f8502ppxfxbqfkf = null;
        this.f8503wkgbmnqykc = null;
        this.f8497eablkybsjg = 0;
        this.f8498gxszxtbevo = 0;
        this.f8500lqeggnwhkg = null;
        this.f8501nufgyqmvbu = f8494gtknphoqwx;
        this.f8496dxjokdxxww = null;
    }

    public static IconCompat eablkybsjg(Bitmap bitmap) {
        u1.zoijcleaow.ppxfxbqfkf(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f8504zoijcleaow = bitmap;
        return iconCompat;
    }

    public static IconCompat gxszxtbevo(Uri uri) {
        u1.zoijcleaow.ppxfxbqfkf(uri);
        return lqeggnwhkg(uri.toString());
    }

    public static IconCompat iobyxmoadg(Icon icon) {
        return iobyxmoadg.iobyxmoadg(icon);
    }

    private static String kcexrzcfyt(int i13) {
        switch (i13) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat lqeggnwhkg(String str) {
        u1.zoijcleaow.ppxfxbqfkf(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f8504zoijcleaow = str;
        return iconCompat;
    }

    public static IconCompat nufgyqmvbu(Resources resources, String str, int i13) {
        u1.zoijcleaow.ppxfxbqfkf(str);
        if (i13 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f8497eablkybsjg = i13;
        if (resources != null) {
            try {
                iconCompat.f8504zoijcleaow = resources.getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f8504zoijcleaow = str;
        }
        iconCompat.f8495btonecajqb = str;
        return iconCompat;
    }

    public static IconCompat ppxfxbqfkf(Uri uri) {
        u1.zoijcleaow.ppxfxbqfkf(uri);
        return wkgbmnqykc(uri.toString());
    }

    public static IconCompat wkgbmnqykc(String str) {
        u1.zoijcleaow.ppxfxbqfkf(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f8504zoijcleaow = str;
        return iconCompat;
    }

    static Bitmap zoijcleaow(Bitmap bitmap, boolean z13) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f13 = iMin;
        float f14 = 0.5f * f13;
        float f15 = 0.9166667f * f14;
        if (z13) {
            float f16 = 0.010416667f * f13;
            paint.setColor(0);
            paint.setShadowLayer(f16, 0.0f, f13 * 0.020833334f, 1023410176);
            canvas.drawCircle(f14, f14, f15, paint);
            paint.setShadowLayer(f16, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f14, f14, f15, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f14, f14, f15, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public InputStream agtfadlqog(Context context) {
        Uri uriWflxmlrfwp = wflxmlrfwp();
        String scheme = uriWflxmlrfwp.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriWflxmlrfwp);
            } catch (Exception e13) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriWflxmlrfwp, e13);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f8504zoijcleaow));
        } catch (FileNotFoundException e14) {
            Log.w("IconCompat", "Unable to load image from path: " + uriWflxmlrfwp, e14);
            return null;
        }
    }

    public int btonecajqb() {
        int i13 = this.f8499iobyxmoadg;
        if (i13 == -1) {
            return iobyxmoadg.zoijcleaow(this.f8504zoijcleaow);
        }
        if (i13 == 2) {
            return this.f8497eablkybsjg;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public int draadjrbmk() {
        int i13 = this.f8499iobyxmoadg;
        return i13 == -1 ? iobyxmoadg.wkgbmnqykc(this.f8504zoijcleaow) : i13;
    }

    public Bitmap dxjokdxxww() {
        int i13 = this.f8499iobyxmoadg;
        if (i13 == -1) {
            Object obj = this.f8504zoijcleaow;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i13 == 1) {
            return (Bitmap) this.f8504zoijcleaow;
        }
        if (i13 == 5) {
            return zoijcleaow((Bitmap) this.f8504zoijcleaow, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public String gtknphoqwx() {
        int i13 = this.f8499iobyxmoadg;
        if (i13 == -1) {
            return iobyxmoadg.ppxfxbqfkf(this.f8504zoijcleaow);
        }
        if (i13 == 2) {
            String str = this.f8495btonecajqb;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f8504zoijcleaow).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : this.f8495btonecajqb;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void ojitshcjhn() {
        this.f8501nufgyqmvbu = PorterDuff.Mode.valueOf(this.f8496dxjokdxxww);
        switch (this.f8499iobyxmoadg) {
            case -1:
                Parcelable parcelable = this.f8503wkgbmnqykc;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f8504zoijcleaow = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f8503wkgbmnqykc;
                if (parcelable2 != null) {
                    this.f8504zoijcleaow = parcelable2;
                    return;
                }
                byte[] bArr = this.f8502ppxfxbqfkf;
                this.f8504zoijcleaow = bArr;
                this.f8499iobyxmoadg = 3;
                this.f8497eablkybsjg = 0;
                this.f8498gxszxtbevo = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f8502ppxfxbqfkf, Charset.forName("UTF-16"));
                this.f8504zoijcleaow = str;
                if (this.f8499iobyxmoadg == 2 && this.f8495btonecajqb == null) {
                    this.f8495btonecajqb = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f8504zoijcleaow = this.f8502ppxfxbqfkf;
                return;
        }
    }

    public Icon oxmwwwfdhm(Context context) {
        return iobyxmoadg.gxszxtbevo(this, context);
    }

    public void rgvfuqvkyq(boolean z13) {
        this.f8496dxjokdxxww = this.f8501nufgyqmvbu.name();
        switch (this.f8499iobyxmoadg) {
            case -1:
                if (z13) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f8503wkgbmnqykc = (Parcelable) this.f8504zoijcleaow;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z13) {
                    this.f8503wkgbmnqykc = (Parcelable) this.f8504zoijcleaow;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f8504zoijcleaow;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f8502ppxfxbqfkf = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f8502ppxfxbqfkf = ((String) this.f8504zoijcleaow).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f8502ppxfxbqfkf = (byte[]) this.f8504zoijcleaow;
                return;
            case 4:
            case 6:
                this.f8502ppxfxbqfkf = this.f8504zoijcleaow.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public String toString() {
        if (this.f8499iobyxmoadg == -1) {
            return String.valueOf(this.f8504zoijcleaow);
        }
        StringBuilder sb3 = new StringBuilder("Icon(typ=");
        sb3.append(kcexrzcfyt(this.f8499iobyxmoadg));
        switch (this.f8499iobyxmoadg) {
            case 1:
            case 5:
                sb3.append(" size=");
                sb3.append(((Bitmap) this.f8504zoijcleaow).getWidth());
                sb3.append("x");
                sb3.append(((Bitmap) this.f8504zoijcleaow).getHeight());
                break;
            case 2:
                sb3.append(" pkg=");
                sb3.append(this.f8495btonecajqb);
                sb3.append(" id=");
                sb3.append(String.format("0x%08x", Integer.valueOf(btonecajqb())));
                break;
            case 3:
                sb3.append(" len=");
                sb3.append(this.f8497eablkybsjg);
                if (this.f8498gxszxtbevo != 0) {
                    sb3.append(" off=");
                    sb3.append(this.f8498gxszxtbevo);
                }
                break;
            case 4:
            case 6:
                sb3.append(" uri=");
                sb3.append(this.f8504zoijcleaow);
                break;
        }
        if (this.f8500lqeggnwhkg != null) {
            sb3.append(" tint=");
            sb3.append(this.f8500lqeggnwhkg);
        }
        if (this.f8501nufgyqmvbu != f8494gtknphoqwx) {
            sb3.append(" mode=");
            sb3.append(this.f8501nufgyqmvbu);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public Icon vdvldrhtss() {
        return oxmwwwfdhm(null);
    }

    public Uri wflxmlrfwp() {
        int i13 = this.f8499iobyxmoadg;
        if (i13 == -1) {
            return iobyxmoadg.eablkybsjg(this.f8504zoijcleaow);
        }
        if (i13 == 4 || i13 == 6) {
            return Uri.parse((String) this.f8504zoijcleaow);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    IconCompat(int i13) {
        this.f8502ppxfxbqfkf = null;
        this.f8503wkgbmnqykc = null;
        this.f8497eablkybsjg = 0;
        this.f8498gxszxtbevo = 0;
        this.f8500lqeggnwhkg = null;
        this.f8501nufgyqmvbu = f8494gtknphoqwx;
        this.f8496dxjokdxxww = null;
        this.f8499iobyxmoadg = i13;
    }
}
