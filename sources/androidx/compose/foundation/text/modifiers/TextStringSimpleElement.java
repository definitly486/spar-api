package androidx.compose.foundation.text.modifiers;

import h.opjhrmiecq;
import j0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import n0.wflxmlrfwp;
import v0.jyumaefscl;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lz/ribwqtqdhb;", "Ldvvnrvtcbc/zdlpuopuiu;", "", "text", "Lj0/n;", "style", "Ln0/wflxmlrfwp$zoijcleaow;", "fontFamilyResolver", "Lv0/jyumaefscl;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lh/opjhrmiecq;", "color", "<init>", "(Ljava/lang/String;Lj0/n;Ln0/wflxmlrfwp$zoijcleaow;IZIILh/opjhrmiecq;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Ldvvnrvtcbc/zdlpuopuiu;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Ldvvnrvtcbc/zdlpuopuiu;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "zoijcleaow", "Ljava/lang/String;", "ppxfxbqfkf", "Lj0/n;", "wkgbmnqykc", "Ln0/wflxmlrfwp$zoijcleaow;", "eablkybsjg", "I", "gxszxtbevo", "Z", "lqeggnwhkg", "nufgyqmvbu", "dxjokdxxww", "Lh/opjhrmiecq;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextStringSimpleElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata */
    private final opjhrmiecq color;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final n style;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final wflxmlrfwp.zoijcleaow fontFamilyResolver;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, n nVar, wflxmlrfwp.zoijcleaow zoijcleaowVar, int i13, boolean z13, int i14, int i15, opjhrmiecq opjhrmiecqVar, gtknphoqwx gtknphoqwxVar) {
        this(str, nVar, zoijcleaowVar, i13, z13, i14, i15, opjhrmiecqVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return zdlpuopuiu.eablkybsjg(this.color, textStringSimpleElement.color) && zdlpuopuiu.eablkybsjg(this.text, textStringSimpleElement.text) && zdlpuopuiu.eablkybsjg(this.style, textStringSimpleElement.style) && zdlpuopuiu.eablkybsjg(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && jyumaefscl.lqeggnwhkg(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + jyumaefscl.nufgyqmvbu(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        opjhrmiecq opjhrmiecqVar = this.color;
        return iHashCode + (opjhrmiecqVar != null ? opjhrmiecqVar.hashCode() : 0);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(dvvnrvtcbc.zdlpuopuiu node) {
        node.R0(node.Y0(this.color, this.style), node.a1(this.text), node.Z0(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public dvvnrvtcbc.zdlpuopuiu btonecajqb() {
        return new dvvnrvtcbc.zdlpuopuiu(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    private TextStringSimpleElement(String str, n nVar, wflxmlrfwp.zoijcleaow zoijcleaowVar, int i13, boolean z13, int i14, int i15, opjhrmiecq opjhrmiecqVar) {
        this.text = str;
        this.style = nVar;
        this.fontFamilyResolver = zoijcleaowVar;
        this.overflow = i13;
        this.softWrap = z13;
        this.maxLines = i14;
        this.minLines = i15;
        this.color = opjhrmiecqVar;
    }
}
