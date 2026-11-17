package androidx.compose.ui.draw;

import g.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import z.ribwqtqdhb;
import z.wwaezpbzkn;
import z.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/ui/draw/eablkybsjg;", "Ll/ppxfxbqfkf;", "painter", "", "sizeToIntrinsics", "La/eablkybsjg;", "alignment", "Lx/gxszxtbevo;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/wkgbmnqykc;", "colorFilter", "<init>", "(Ll/ppxfxbqfkf;ZLa/eablkybsjg;Lx/gxszxtbevo;FLandroidx/compose/ui/graphics/wkgbmnqykc;)V", "wflxmlrfwp", "()Landroidx/compose/ui/draw/eablkybsjg;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Landroidx/compose/ui/draw/eablkybsjg;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Ll/ppxfxbqfkf;", "getPainter", "()Ll/ppxfxbqfkf;", "ppxfxbqfkf", "Z", "getSizeToIntrinsics", "()Z", "wkgbmnqykc", "La/eablkybsjg;", "getAlignment", "()La/eablkybsjg;", "eablkybsjg", "Lx/gxszxtbevo;", "getContentScale", "()Lx/gxszxtbevo;", "gxszxtbevo", "F", "getAlpha", "()F", "lqeggnwhkg", "Landroidx/compose/ui/graphics/wkgbmnqykc;", "getColorFilter", "()Landroidx/compose/ui/graphics/wkgbmnqykc;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PainterElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final x.gxszxtbevo contentScale;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.wkgbmnqykc colorFilter;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.eablkybsjg alignment;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final l.ppxfxbqfkf painter;

    public PainterElement(l.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, a.eablkybsjg eablkybsjgVar, x.gxszxtbevo gxszxtbevoVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.painter = ppxfxbqfkfVar;
        this.sizeToIntrinsics = z13;
        this.alignment = eablkybsjgVar;
        this.contentScale = gxszxtbevoVar;
        this.alpha = f13;
        this.colorFilter = wkgbmnqykcVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return zdlpuopuiu.eablkybsjg(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && zdlpuopuiu.eablkybsjg(this.alignment, painterElement.alignment) && zdlpuopuiu.eablkybsjg(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && zdlpuopuiu.eablkybsjg(this.colorFilter, painterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar = this.colorFilter;
        return iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode());
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(eablkybsjg node) {
        boolean zJ0 = node.J0();
        boolean z13 = this.sizeToIntrinsics;
        boolean z14 = zJ0 != z13 || (z13 && !gtknphoqwx.nufgyqmvbu(node.I0().nufgyqmvbu(), this.painter.nufgyqmvbu()));
        node.Q0(this.painter);
        node.R0(this.sizeToIntrinsics);
        node.O0(this.alignment);
        node.P0(this.contentScale);
        node.eablkybsjg(this.alpha);
        node.wkgbmnqykc(this.colorFilter);
        if (z14) {
            wwaezpbzkn.zoijcleaow(node);
        }
        yggfygwlhe.iobyxmoadg(node);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public eablkybsjg btonecajqb() {
        return new eablkybsjg(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }
}
