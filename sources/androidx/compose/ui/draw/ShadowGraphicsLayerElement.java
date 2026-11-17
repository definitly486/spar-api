package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.lqeggnwhkg;
import gg.wwaezpbzkn;
import h.e;
import h.oipsdeybqn;
import h.okpsazkaxt;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import w0.nufgyqmvbu;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u00064"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lz/ribwqtqdhb;", "Lh/okpsazkaxt;", "Lw0/nufgyqmvbu;", "elevation", "Lh/e;", "shape", "", "clip", "Lh/oipsdeybqn;", "ambientColor", "spotColor", "<init>", "(FLh/e;ZJJLkotlin/jvm/internal/gtknphoqwx;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/lqeggnwhkg;", "Lgg/wwaezpbzkn;", "ojitshcjhn", "()Ltg/draadjrbmk;", "wflxmlrfwp", "()Lh/okpsazkaxt;", "node", "iwizpuwonk", "(Lh/okpsazkaxt;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "F", "kcexrzcfyt", "()F", "ppxfxbqfkf", "Lh/e;", "zdlpuopuiu", "()Lh/e;", "wkgbmnqykc", "Z", "vdvldrhtss", "()Z", "eablkybsjg", "J", "rgvfuqvkyq", "()J", "gxszxtbevo", "jyumaefscl", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final e shape;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((lqeggnwhkg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.esjtqupxsv(lqeggnwhkgVar.I(ShadowGraphicsLayerElement.this.getElevation()));
            lqeggnwhkgVar.weqkydbzbr(ShadowGraphicsLayerElement.this.getShape());
            lqeggnwhkgVar.vdvldrhtss(ShadowGraphicsLayerElement.this.getClip());
            lqeggnwhkgVar.draadjrbmk(ShadowGraphicsLayerElement.this.getAmbientColor());
            lqeggnwhkgVar.kcexrzcfyt(ShadowGraphicsLayerElement.this.getSpotColor());
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f13, e eVar, boolean z13, long j13, long j14, gtknphoqwx gtknphoqwxVar) {
        this(f13, eVar, z13, j13, j14);
    }

    private final draadjrbmk ojitshcjhn() {
        return new iobyxmoadg();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return nufgyqmvbu.dxjokdxxww(this.elevation, shadowGraphicsLayerElement.elevation) && zdlpuopuiu.eablkybsjg(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && oipsdeybqn.ojitshcjhn(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && oipsdeybqn.ojitshcjhn(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((nufgyqmvbu.btonecajqb(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + oipsdeybqn.yggfygwlhe(this.ambientColor)) * 31) + oipsdeybqn.yggfygwlhe(this.spotColor);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(okpsazkaxt node) {
        node.J0(ojitshcjhn());
        node.I0();
    }

    /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    /* JADX INFO: renamed from: kcexrzcfyt, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) nufgyqmvbu.gtknphoqwx(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) oipsdeybqn.jyumaefscl(this.ambientColor)) + ", spotColor=" + ((Object) oipsdeybqn.jyumaefscl(this.spotColor)) + ')';
    }

    /* JADX INFO: renamed from: vdvldrhtss, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public okpsazkaxt btonecajqb() {
        return new okpsazkaxt(ojitshcjhn());
    }

    /* JADX INFO: renamed from: zdlpuopuiu, reason: from getter */
    public final e getShape() {
        return this.shape;
    }

    private ShadowGraphicsLayerElement(float f13, e eVar, boolean z13, long j13, long j14) {
        this.elevation = f13;
        this.shape = eVar;
        this.clip = z13;
        this.ambientColor = j13;
        this.spotColor = j14;
    }
}
