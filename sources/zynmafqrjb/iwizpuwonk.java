package zynmafqrjb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class iwizpuwonk implements jpowsppfya.yggfygwlhe {
    iwizpuwonk() {
    }

    private Bitmap zoijcleaow(byte[] bArr, Rect rect) throws ImageCaptureException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e13) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e13);
        }
    }

    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jpowsppfya.jyumaefscl apply(jpowsppfya.jyumaefscl jyumaefsclVar) throws ImageCaptureException {
        Rect rectZoijcleaow = jyumaefsclVar.zoijcleaow();
        Bitmap bitmapZoijcleaow = zoijcleaow((byte[]) jyumaefsclVar.ppxfxbqfkf(), rectZoijcleaow);
        cdpycssgdh.gxszxtbevo gxszxtbevoVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc();
        Objects.requireNonNull(gxszxtbevoVarWkgbmnqykc);
        return jpowsppfya.jyumaefscl.btonecajqb(bitmapZoijcleaow, gxszxtbevoVarWkgbmnqykc, new Rect(0, 0, bitmapZoijcleaow.getWidth(), bitmapZoijcleaow.getHeight()), jyumaefsclVar.gxszxtbevo(), cdpycssgdh.vdvldrhtss.zdlpuopuiu(jyumaefsclVar.lqeggnwhkg(), rectZoijcleaow), jyumaefsclVar.iobyxmoadg());
    }
}
