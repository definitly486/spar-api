package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* JADX INFO: loaded from: classes.dex */
class ojitshcjhn {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f3378ppxfxbqfkf = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ProgressBar f3379iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Bitmap f3380zoijcleaow;

    private static class iobyxmoadg {
        public static void iobyxmoadg(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i13) {
            layerDrawable2.setLayerGravity(i13, layerDrawable.getLayerGravity(i13));
            layerDrawable2.setLayerWidth(i13, layerDrawable.getLayerWidth(i13));
            layerDrawable2.setLayerHeight(i13, layerDrawable.getLayerHeight(i13));
            layerDrawable2.setLayerInsetLeft(i13, layerDrawable.getLayerInsetLeft(i13));
            layerDrawable2.setLayerInsetRight(i13, layerDrawable.getLayerInsetRight(i13));
            layerDrawable2.setLayerInsetTop(i13, layerDrawable.getLayerInsetTop(i13));
            layerDrawable2.setLayerInsetBottom(i13, layerDrawable.getLayerInsetBottom(i13));
            layerDrawable2.setLayerInsetStart(i13, layerDrawable.getLayerInsetStart(i13));
            layerDrawable2.setLayerInsetEnd(i13, layerDrawable.getLayerInsetEnd(i13));
        }
    }

    ojitshcjhn(ProgressBar progressBar) {
        this.f3379iobyxmoadg = progressBar;
    }

    private Drawable eablkybsjg(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i13 = 0; i13 < numberOfFrames; i13++) {
            Drawable drawableWkgbmnqykc = wkgbmnqykc(animationDrawable.getFrame(i13), true);
            drawableWkgbmnqykc.setLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            animationDrawable2.addFrame(drawableWkgbmnqykc, animationDrawable.getDuration(i13));
        }
        animationDrawable2.setLevel(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        return animationDrawable2;
    }

    private Shape iobyxmoadg() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    void ppxfxbqfkf(AttributeSet attributeSet, int i13) {
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(this.f3379iobyxmoadg.getContext(), attributeSet, f3378ppxfxbqfkf, i13, 0);
        Drawable drawableNufgyqmvbu = mbcevpiqjqVarJyumaefscl.nufgyqmvbu(0);
        if (drawableNufgyqmvbu != null) {
            this.f3379iobyxmoadg.setIndeterminateDrawable(eablkybsjg(drawableNufgyqmvbu));
        }
        Drawable drawableNufgyqmvbu2 = mbcevpiqjqVarJyumaefscl.nufgyqmvbu(1);
        if (drawableNufgyqmvbu2 != null) {
            this.f3379iobyxmoadg.setProgressDrawable(wkgbmnqykc(drawableNufgyqmvbu2, false));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    Drawable wkgbmnqykc(Drawable drawable, boolean z13) {
        if (drawable instanceof k1.zoijcleaow) {
            k1.zoijcleaow zoijcleaowVar = (k1.zoijcleaow) drawable;
            Drawable drawableIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            if (drawableIobyxmoadg != null) {
                zoijcleaowVar.zoijcleaow(wkgbmnqykc(drawableIobyxmoadg, z13));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i13 = 0; i13 < numberOfLayers; i13++) {
                    int id2 = layerDrawable.getId(i13);
                    drawableArr[i13] = wkgbmnqykc(layerDrawable.getDrawable(i13), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i14 = 0; i14 < numberOfLayers; i14++) {
                    layerDrawable2.setId(i14, layerDrawable.getId(i14));
                    iobyxmoadg.iobyxmoadg(layerDrawable, layerDrawable2, i14);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f3380zoijcleaow == null) {
                    this.f3380zoijcleaow = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(iobyxmoadg());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z13 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    Bitmap zoijcleaow() {
        return this.f3380zoijcleaow;
    }
}
