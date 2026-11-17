package c60;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.wflxmlrfwp;
import d9.btonecajqb;
import d9.dxjokdxxww;
import kotlin.jvm.internal.zdlpuopuiu;
import v8.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg implements c9.eablkybsjg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ImageView f19071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f19072zdlpuopuiu;

        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, ImageView imageView) {
            this.f19072zdlpuopuiu = iobyxmoadgVar;
            this.f19071yggfygwlhe = imageView;
        }

        @Override // c9.eablkybsjg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public boolean eablkybsjg(Drawable resource, Object model, dxjokdxxww dxjokdxxwwVar, l8.iobyxmoadg dataSource, boolean z13) {
            zdlpuopuiu.btonecajqb(resource, "resource");
            zdlpuopuiu.btonecajqb(model, "model");
            zdlpuopuiu.btonecajqb(dataSource, "dataSource");
            tg.iobyxmoadg iobyxmoadgVar = this.f19072zdlpuopuiu;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            this.f19071yggfygwlhe.setBackground(null);
            return false;
        }

        @Override // c9.eablkybsjg
        public boolean wkgbmnqykc(GlideException glideException, Object obj, dxjokdxxww target, boolean z13) {
            zdlpuopuiu.btonecajqb(target, "target");
            return false;
        }
    }

    public static final class zoijcleaow extends d9.wkgbmnqykc {

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ ImageView f19073lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ ImageView.ScaleType f19074pmvmpeiblj;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ImageView imageView, ImageView.ScaleType scaleType) {
            super(imageView);
            this.f19073lereixgezr = imageView;
            this.f19074pmvmpeiblj = scaleType;
        }

        @Override // d9.wkgbmnqykc
        protected void draadjrbmk(Drawable drawable) {
            this.f19073lereixgezr.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f19073lereixgezr.setImageDrawable(drawable);
        }

        @Override // d9.dxjokdxxww
        public void dxjokdxxww(Drawable drawable) {
            this.f19073lereixgezr.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f19073lereixgezr.setImageDrawable(drawable);
        }

        @Override // d9.dxjokdxxww
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public void nufgyqmvbu(Drawable resource, e9.wkgbmnqykc wkgbmnqykcVar) {
            zdlpuopuiu.btonecajqb(resource, "resource");
            this.f19073lereixgezr.setScaleType(this.f19074pmvmpeiblj);
            this.f19073lereixgezr.setImageDrawable(resource);
        }
    }

    public static final void dxjokdxxww(ImageView imageView, String str, int i13, ImageView.ScaleType scaleType) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        zdlpuopuiu.btonecajqb(scaleType, "scaleType");
        ((wflxmlrfwp) ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(str).ribwqtqdhb(i13)).nufgyqmvbu(i13)).skhdrjzrfn(new zoijcleaow(imageView, scaleType));
    }

    public static final void eablkybsjg(ImageView imageView, String str, c9.eablkybsjg listener, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        zdlpuopuiu.btonecajqb(listener, "listener");
        if (str == null || str.length() == 0) {
            com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).vdvldrhtss(Integer.valueOf(i13)).fiwbwshyhd(listener).wizcaqwiak(imageView);
        } else {
            ((wflxmlrfwp) ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(str).ribwqtqdhb(i13)).nufgyqmvbu(i13)).fiwbwshyhd(listener).wizcaqwiak(imageView);
        }
    }

    public static /* synthetic */ void gxszxtbevo(ImageView imageView, String str, int i13, c9.gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            iobyxmoadgVar = null;
        }
        wkgbmnqykc(imageView, str, i13, gxszxtbevoVar, iobyxmoadgVar);
    }

    public static final btonecajqb iobyxmoadg(ImageView imageView, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        btonecajqb btonecajqbVarWizcaqwiak = com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).vdvldrhtss(Integer.valueOf(i13)).fmlbqenlif(gtknphoqwx.gtknphoqwx()).wizcaqwiak(imageView);
        zdlpuopuiu.dxjokdxxww(btonecajqbVarWizcaqwiak, "into(...)");
        return btonecajqbVarWizcaqwiak;
    }

    public static final btonecajqb lqeggnwhkg(ImageView imageView, String str) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        btonecajqb btonecajqbVarWizcaqwiak = com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).eablkybsjg().grlcpdaxtj(str).wizcaqwiak(imageView);
        zdlpuopuiu.dxjokdxxww(btonecajqbVarWizcaqwiak, "into(...)");
        return btonecajqbVarWizcaqwiak;
    }

    public static final btonecajqb nufgyqmvbu(ImageView imageView, String uri, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        zdlpuopuiu.btonecajqb(uri, "uri");
        btonecajqb btonecajqbVarWizcaqwiak = com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(uri).fmlbqenlif(gtknphoqwx.draadjrbmk(i13)).wizcaqwiak(imageView);
        zdlpuopuiu.dxjokdxxww(btonecajqbVarWizcaqwiak, "into(...)");
        return btonecajqbVarWizcaqwiak;
    }

    public static final void ppxfxbqfkf(ImageView imageView, String str, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        if (str == null || str.length() == 0) {
            com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).vdvldrhtss(Integer.valueOf(i13)).wizcaqwiak(imageView);
        } else {
            ((wflxmlrfwp) ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(str).ribwqtqdhb(i13)).nufgyqmvbu(i13)).wizcaqwiak(imageView);
        }
    }

    public static final void wkgbmnqykc(ImageView imageView, String str, int i13, c9.gxszxtbevo options, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        zdlpuopuiu.btonecajqb(options, "options");
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(iobyxmoadgVar, imageView);
        if (str == null || str.length() == 0) {
            com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).vdvldrhtss(Integer.valueOf(i13)).wizcaqwiak(imageView);
        } else {
            ((wflxmlrfwp) ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(str).ribwqtqdhb(i13)).nufgyqmvbu(i13)).iobyxmoadg(options).iyctptxqzt(iobyxmoadgVar2).wizcaqwiak(imageView);
        }
    }

    public static final btonecajqb zoijcleaow(ImageView imageView, String str) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        btonecajqb btonecajqbVarWizcaqwiak = com.bumptech.glide.zoijcleaow.yggfygwlhe(imageView).kcexrzcfyt(str).wizcaqwiak(imageView);
        zdlpuopuiu.dxjokdxxww(btonecajqbVarWizcaqwiak, "into(...)");
        return btonecajqbVarWizcaqwiak;
    }
}
