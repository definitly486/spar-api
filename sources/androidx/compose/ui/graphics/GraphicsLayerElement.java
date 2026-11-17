package androidx.compose.ui.graphics;

import h.e;
import h.krqnebusok;
import h.oipsdeybqn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b1\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\bR\u0010JR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bS\u0010H\u001a\u0004\bT\u0010JR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010,R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bY\u0010,R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/graphics/dxjokdxxww;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/btonecajqb;", "transformOrigin", "Lh/e;", "shape", "", "clip", "Lh/krqnebusok;", "renderEffect", "Lh/oipsdeybqn;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/eablkybsjg;", "compositingStrategy", "Landroidx/compose/ui/graphics/ppxfxbqfkf;", "blendMode", "Landroidx/compose/ui/graphics/wkgbmnqykc;", "colorFilter", "<init>", "(FFFFFFFFFFJLh/e;ZLh/krqnebusok;JJIILandroidx/compose/ui/graphics/wkgbmnqykc;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/ui/graphics/dxjokdxxww;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/graphics/dxjokdxxww;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "F", "getScaleX", "()F", "ppxfxbqfkf", "getScaleY", "wkgbmnqykc", "getAlpha", "eablkybsjg", "getTranslationX", "gxszxtbevo", "getTranslationY", "lqeggnwhkg", "getShadowElevation", "nufgyqmvbu", "getRotationX", "dxjokdxxww", "getRotationY", "btonecajqb", "getRotationZ", "gtknphoqwx", "getCameraDistance", "draadjrbmk", "J", "getTransformOrigin-SzJe1aQ", "()J", "Lh/e;", "getShape", "()Lh/e;", "agtfadlqog", "Z", "getClip", "()Z", "getAmbientShadowColor-0d7_KjU", "rgvfuqvkyq", "getSpotShadowColor-0d7_KjU", "vdvldrhtss", "I", "getCompositingStrategy--NrFUSI", "oxmwwwfdhm", "getBlendMode-0nO6VwU", "kcexrzcfyt", "Landroidx/compose/ui/graphics/wkgbmnqykc;", "getColorFilter", "()Landroidx/compose/ui/graphics/wkgbmnqykc;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationZ;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationY;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationX;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraDistance;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationY;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name and from kotlin metadata and from toString */
    private final wkgbmnqykc colorFilter;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private final float shadowElevation;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationX;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name and from kotlin metadata and from toString */
    private final int blendMode;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleY;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name and from kotlin metadata and from toString */
    private final int compositingStrategy;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name and from kotlin metadata and from toString */
    private final e shape;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    public /* synthetic */ GraphicsLayerElement(float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, e eVar, boolean z13, krqnebusok krqnebusokVar, long j14, long j15, int i13, int i14, wkgbmnqykc wkgbmnqykcVar, gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, f17, f18, f19, f23, f24, f25, j13, eVar, z13, krqnebusokVar, j14, j15, i13, i14, wkgbmnqykcVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && btonecajqb.eablkybsjg(this.transformOrigin, graphicsLayerElement.transformOrigin) && zdlpuopuiu.eablkybsjg(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && zdlpuopuiu.eablkybsjg(null, null) && oipsdeybqn.ojitshcjhn(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && oipsdeybqn.ojitshcjhn(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && eablkybsjg.eablkybsjg(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && ppxfxbqfkf.yadqdtsiqt(this.blendMode, graphicsLayerElement.blendMode) && zdlpuopuiu.eablkybsjg(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + btonecajqb.nufgyqmvbu(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 961) + oipsdeybqn.yggfygwlhe(this.ambientShadowColor)) * 31) + oipsdeybqn.yggfygwlhe(this.spotShadowColor)) * 31) + eablkybsjg.gxszxtbevo(this.compositingStrategy)) * 31) + ppxfxbqfkf.iozdgvuglv(this.blendMode)) * 31;
        wkgbmnqykc wkgbmnqykcVar = this.colorFilter;
        return iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode());
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(dxjokdxxww node) {
        node.ojitshcjhn(this.scaleX);
        node.istkbnxepw(this.scaleY);
        node.eablkybsjg(this.alpha);
        node.pkzmftpjix(this.translationX);
        node.nufgyqmvbu(this.translationY);
        node.esjtqupxsv(this.shadowElevation);
        node.jyumaefscl(this.rotationX);
        node.iwizpuwonk(this.rotationY);
        node.lereixgezr(this.rotationZ);
        node.zdlpuopuiu(this.cameraDistance);
        node.fiwbwshyhd(this.transformOrigin);
        node.weqkydbzbr(this.shape);
        node.vdvldrhtss(this.clip);
        node.hcddaimhww(null);
        node.draadjrbmk(this.ambientShadowColor);
        node.kcexrzcfyt(this.spotShadowColor);
        node.xrmfcynszj(this.compositingStrategy);
        node.ppxfxbqfkf(this.blendMode);
        node.wkgbmnqykc(this.colorFilter);
        node.S0();
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) btonecajqb.dxjokdxxww(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) oipsdeybqn.jyumaefscl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) oipsdeybqn.jyumaefscl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) eablkybsjg.lqeggnwhkg(this.compositingStrategy)) + ", blendMode=" + ((Object) ppxfxbqfkf.lmojexxdyd(this.blendMode)) + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww btonecajqb() {
        return new dxjokdxxww(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, null, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    private GraphicsLayerElement(float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, e eVar, boolean z13, krqnebusok krqnebusokVar, long j14, long j15, int i13, int i14, wkgbmnqykc wkgbmnqykcVar) {
        this.scaleX = f13;
        this.scaleY = f14;
        this.alpha = f15;
        this.translationX = f16;
        this.translationY = f17;
        this.shadowElevation = f18;
        this.rotationX = f19;
        this.rotationY = f23;
        this.rotationZ = f24;
        this.cameraDistance = f25;
        this.transformOrigin = j13;
        this.shape = eVar;
        this.clip = z13;
        this.ambientShadowColor = j14;
        this.spotShadowColor = j15;
        this.compositingStrategy = i13;
        this.blendMode = i14;
        this.colorFilter = wkgbmnqykcVar;
    }
}
