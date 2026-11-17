package j1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp extends agtfadlqog {
    private static int btonecajqb(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static FontFamily dxjokdxxww(CancellationSignal cancellationSignal, r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (r1.gtknphoqwx.zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(zoijcleaowVar.wkgbmnqykc(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(zoijcleaowVar.eablkybsjg()).setSlant(zoijcleaowVar.gxszxtbevo() ? 1 : 0).setTtcIndex(zoijcleaowVar.ppxfxbqfkf()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e13) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private Font nufgyqmvbu(FontFamily fontFamily, int i13) {
        FontStyle fontStyle = new FontStyle((i13 & 1) != 0 ? 700 : OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST, (i13 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iBtonecajqb = btonecajqb(fontStyle, font.getStyle());
        for (int i14 = 1; i14 < fontFamily.getSize(); i14++) {
            Font font2 = fontFamily.getFont(i14);
            int iBtonecajqb2 = btonecajqb(fontStyle, font2.getStyle());
            if (iBtonecajqb2 < iBtonecajqb) {
                font = font2;
                iBtonecajqb = iBtonecajqb2;
            }
        }
        return font;
    }

    @Override // j1.agtfadlqog
    public Typeface iobyxmoadg(Context context, i1.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, Resources resources, int i13) {
        try {
            FontFamily.Builder builder = null;
            for (i1.eablkybsjg.wkgbmnqykc wkgbmnqykcVar : ppxfxbqfkfVar.iobyxmoadg()) {
                try {
                    Font fontBuild = new Font.Builder(resources, wkgbmnqykcVar.zoijcleaow()).setWeight(wkgbmnqykcVar.eablkybsjg()).setSlant(wkgbmnqykcVar.gxszxtbevo() ? 1 : 0).setTtcIndex(wkgbmnqykcVar.ppxfxbqfkf()).setFontVariationSettings(wkgbmnqykcVar.wkgbmnqykc()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(nufgyqmvbu(fontFamilyBuild, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // j1.agtfadlqog
    protected r1.gtknphoqwx.zoijcleaow lqeggnwhkg(r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // j1.agtfadlqog
    public Typeface ppxfxbqfkf(Context context, CancellationSignal cancellationSignal, List list, int i13) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyDxjokdxxww = dxjokdxxww(cancellationSignal, (r1.gtknphoqwx.zoijcleaow[]) list.get(0), contentResolver);
            if (fontFamilyDxjokdxxww == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyDxjokdxxww);
            for (int i14 = 1; i14 < list.size(); i14++) {
                FontFamily fontFamilyDxjokdxxww2 = dxjokdxxww(cancellationSignal, (r1.gtknphoqwx.zoijcleaow[]) list.get(i14), contentResolver);
                if (fontFamilyDxjokdxxww2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyDxjokdxxww2);
                }
            }
            return customFallbackBuilder.setStyle(nufgyqmvbu(fontFamilyDxjokdxxww, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // j1.agtfadlqog
    public Typeface wkgbmnqykc(Context context, Resources resources, int i13, String str, int i14) {
        try {
            Font fontBuild = new Font.Builder(resources, i13).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // j1.agtfadlqog
    public Typeface zoijcleaow(Context context, CancellationSignal cancellationSignal, r1.gtknphoqwx.zoijcleaow[] zoijcleaowVarArr, int i13) {
        try {
            FontFamily fontFamilyDxjokdxxww = dxjokdxxww(cancellationSignal, zoijcleaowVarArr, context.getContentResolver());
            if (fontFamilyDxjokdxxww == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyDxjokdxxww).setStyle(nufgyqmvbu(fontFamilyDxjokdxxww, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }
}
