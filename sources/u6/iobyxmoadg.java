package u6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.PictureDrawable;
import kotlin.jvm.internal.zdlpuopuiu;
import l8.lqeggnwhkg;
import t8.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements y8.eablkybsjg {
    @Override // y8.eablkybsjg
    public n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf toTranscode, lqeggnwhkg options) {
        zdlpuopuiu.btonecajqb(toTranscode, "toTranscode");
        zdlpuopuiu.btonecajqb(options, "options");
        Object obj = toTranscode.get();
        zdlpuopuiu.dxjokdxxww(obj, "toTranscode.get()");
        com.caverock.androidsvg.lqeggnwhkg lqeggnwhkgVar = (com.caverock.androidsvg.lqeggnwhkg) obj;
        lqeggnwhkgVar.jyumaefscl(com.caverock.androidsvg.eablkybsjg.f21365gxszxtbevo);
        Integer numValueOf = Integer.valueOf((int) lqeggnwhkgVar.nufgyqmvbu());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : (int) (lqeggnwhkgVar.lqeggnwhkg().right - lqeggnwhkgVar.lqeggnwhkg().left);
        Integer numValueOf2 = Integer.valueOf((int) lqeggnwhkgVar.gxszxtbevo());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : (int) (lqeggnwhkgVar.lqeggnwhkg().bottom - lqeggnwhkgVar.lqeggnwhkg().top);
        PictureDrawable pictureDrawable = new PictureDrawable(lqeggnwhkgVar.rgvfuqvkyq(iIntValue, iIntValue2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawPicture(pictureDrawable.getPicture());
        return new dxjokdxxww(bitmapCreateBitmap);
    }
}
