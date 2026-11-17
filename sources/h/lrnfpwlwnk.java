package h;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
final class lrnfpwlwnk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lrnfpwlwnk f38921iobyxmoadg = new lrnfpwlwnk();

    private lrnfpwlwnk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eablkybsjg(tg.draadjrbmk draadjrbmkVar, double d13) {
        return ((Number) draadjrbmkVar.invoke(Double.valueOf(d13))).doubleValue();
    }

    public static final ColorSpace ppxfxbqfkf(i.ppxfxbqfkf ppxfxbqfkfVar) {
        ColorSpace.Rgb rgb;
        ColorSpace colorSpaceIobyxmoadg;
        i.gtknphoqwx gtknphoqwxVar = i.gtknphoqwx.f41496iobyxmoadg;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.lmojexxdyd())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.wflxmlrfwp())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.agtfadlqog())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.ojitshcjhn())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.rgvfuqvkyq())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.kcexrzcfyt())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.zdlpuopuiu())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.yggfygwlhe())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.iwizpuwonk())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.cqumvgiudr())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.esjtqupxsv())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.lereixgezr())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.pmvmpeiblj())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.zynmafqrjb())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.yadqdtsiqt())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.iozdgvuglv())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceIobyxmoadg = tbqsvytpvh.iobyxmoadg(ppxfxbqfkfVar)) != null) {
            return colorSpaceIobyxmoadg;
        }
        if (!(ppxfxbqfkfVar instanceof i.iozdgvuglv)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        i.iozdgvuglv iozdgvuglvVar = (i.iozdgvuglv) ppxfxbqfkfVar;
        float[] fArrPpxfxbqfkf = iozdgvuglvVar.iozdgvuglv().ppxfxbqfkf();
        i.lmojexxdyd lmojexxdydVarCdpycssgdh = iozdgvuglvVar.cdpycssgdh();
        ColorSpace.Rgb.TransferParameters transferParameters = lmojexxdydVarCdpycssgdh != null ? new ColorSpace.Rgb.TransferParameters(lmojexxdydVarCdpycssgdh.iobyxmoadg(), lmojexxdydVarCdpycssgdh.zoijcleaow(), lmojexxdydVarCdpycssgdh.ppxfxbqfkf(), lmojexxdydVarCdpycssgdh.wkgbmnqykc(), lmojexxdydVarCdpycssgdh.eablkybsjg(), lmojexxdydVarCdpycssgdh.gxszxtbevo(), lmojexxdydVarCdpycssgdh.lqeggnwhkg()) : null;
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(ppxfxbqfkfVar.gxszxtbevo(), iozdgvuglvVar.istkbnxepw(), fArrPpxfxbqfkf, transferParameters);
        } else {
            String strGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
            float[] fArrIstkbnxepw = iozdgvuglvVar.istkbnxepw();
            final tg.draadjrbmk draadjrbmkVarLereixgezr = iozdgvuglvVar.lereixgezr();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: h.iyctptxqzt
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d13) {
                    return lrnfpwlwnk.wkgbmnqykc(draadjrbmkVarLereixgezr, d13);
                }
            };
            final tg.draadjrbmk draadjrbmkVarJyumaefscl = iozdgvuglvVar.jyumaefscl();
            rgb = new ColorSpace.Rgb(strGxszxtbevo, fArrIstkbnxepw, fArrPpxfxbqfkf, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: h.weqkydbzbr
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d13) {
                    return lrnfpwlwnk.eablkybsjg(draadjrbmkVarJyumaefscl, d13);
                }
            }, iozdgvuglvVar.wkgbmnqykc(0), iozdgvuglvVar.ppxfxbqfkf(0));
        }
        return rgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, double d13) {
        return ((Number) draadjrbmkVar.invoke(Double.valueOf(d13))).doubleValue();
    }
}
