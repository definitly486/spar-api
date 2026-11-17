package androidx.compose.foundation.text.modifiers;

import dvvnrvtcbc.nufgyqmvbu;
import h.opjhrmiecq;
import j0.eablkybsjg;
import j0.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import n0.wflxmlrfwp;
import opjhrmiecq.eslsurpljm;
import tg.draadjrbmk;
import v0.jyumaefscl;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010BR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106¨\u0006D"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/text/modifiers/zoijcleaow;", "Lj0/eablkybsjg;", "text", "Lj0/n;", "style", "Ln0/wflxmlrfwp$zoijcleaow;", "fontFamilyResolver", "Lkotlin/Function1;", "Lj0/f;", "Lgg/wwaezpbzkn;", "onTextLayout", "Lv0/jyumaefscl;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Lj0/eablkybsjg$wkgbmnqykc;", "Lj0/hcddaimhww;", "placeholders", "Lg/lqeggnwhkg;", "onPlaceholderLayout", "Ldvvnrvtcbc/nufgyqmvbu;", "selectionController", "Lh/opjhrmiecq;", "color", "Lopjhrmiecq/eslsurpljm;", "autoSize", "Landroidx/compose/foundation/text/modifiers/zoijcleaow$iobyxmoadg;", "onShowTranslation", "<init>", "(Lj0/eablkybsjg;Lj0/n;Ln0/wflxmlrfwp$zoijcleaow;Ltg/draadjrbmk;IZIILjava/util/List;Ltg/draadjrbmk;Ldvvnrvtcbc/nufgyqmvbu;Lh/opjhrmiecq;Lopjhrmiecq/eslsurpljm;Ltg/draadjrbmk;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/text/modifiers/zoijcleaow;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/text/modifiers/zoijcleaow;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "zoijcleaow", "Lj0/eablkybsjg;", "ppxfxbqfkf", "Lj0/n;", "wkgbmnqykc", "Ln0/wflxmlrfwp$zoijcleaow;", "eablkybsjg", "Ltg/draadjrbmk;", "gxszxtbevo", "I", "lqeggnwhkg", "Z", "nufgyqmvbu", "dxjokdxxww", "btonecajqb", "Ljava/util/List;", "gtknphoqwx", "draadjrbmk", "Ldvvnrvtcbc/nufgyqmvbu;", "Lh/opjhrmiecq;", "agtfadlqog", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextAnnotatedStringElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onShowTranslation;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name and from kotlin metadata */
    private final List placeholders;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name and from kotlin metadata */
    private final nufgyqmvbu selectionController;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onTextLayout;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk onPlaceholderLayout;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final n style;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name and from kotlin metadata */
    private final opjhrmiecq color;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final wflxmlrfwp.zoijcleaow fontFamilyResolver;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final eablkybsjg text;

    public /* synthetic */ TextAnnotatedStringElement(eablkybsjg eablkybsjgVar, n nVar, wflxmlrfwp.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, int i13, boolean z13, int i14, int i15, List list, draadjrbmk draadjrbmkVar2, nufgyqmvbu nufgyqmvbuVar, opjhrmiecq opjhrmiecqVar, eslsurpljm eslsurpljmVar, draadjrbmk draadjrbmkVar3, gtknphoqwx gtknphoqwxVar) {
        this(eablkybsjgVar, nVar, zoijcleaowVar, draadjrbmkVar, i13, z13, i14, i15, list, draadjrbmkVar2, nufgyqmvbuVar, opjhrmiecqVar, eslsurpljmVar, draadjrbmkVar3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return zdlpuopuiu.eablkybsjg(this.color, textAnnotatedStringElement.color) && zdlpuopuiu.eablkybsjg(this.text, textAnnotatedStringElement.text) && zdlpuopuiu.eablkybsjg(this.style, textAnnotatedStringElement.style) && zdlpuopuiu.eablkybsjg(this.placeholders, textAnnotatedStringElement.placeholders) && zdlpuopuiu.eablkybsjg(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && jyumaefscl.lqeggnwhkg(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && zdlpuopuiu.eablkybsjg(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        draadjrbmk draadjrbmkVar = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0)) * 31) + jyumaefscl.nufgyqmvbu(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        draadjrbmk draadjrbmkVar2 = this.onPlaceholderLayout;
        int iHashCode4 = (((iHashCode3 + (draadjrbmkVar2 != null ? draadjrbmkVar2.hashCode() : 0)) * 31) + 0) * 31;
        opjhrmiecq opjhrmiecqVar = this.color;
        int iHashCode5 = (iHashCode4 + (opjhrmiecqVar != null ? opjhrmiecqVar.hashCode() : 0)) * 31;
        draadjrbmk draadjrbmkVar3 = this.onShowTranslation;
        return iHashCode5 + (draadjrbmkVar3 != null ? draadjrbmkVar3.hashCode() : 0);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(zoijcleaow node) {
        node.R0(node.e1(this.color, this.style), node.g1(this.text), node.f1(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, null), node.d1(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public zoijcleaow btonecajqb() {
        return new zoijcleaow(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, this.onShowTranslation, null);
    }

    private TextAnnotatedStringElement(eablkybsjg eablkybsjgVar, n nVar, wflxmlrfwp.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, int i13, boolean z13, int i14, int i15, List list, draadjrbmk draadjrbmkVar2, nufgyqmvbu nufgyqmvbuVar, opjhrmiecq opjhrmiecqVar, eslsurpljm eslsurpljmVar, draadjrbmk draadjrbmkVar3) {
        this.text = eablkybsjgVar;
        this.style = nVar;
        this.fontFamilyResolver = zoijcleaowVar;
        this.onTextLayout = draadjrbmkVar;
        this.overflow = i13;
        this.softWrap = z13;
        this.maxLines = i14;
        this.minLines = i15;
        this.placeholders = list;
        this.onPlaceholderLayout = draadjrbmkVar2;
        this.color = opjhrmiecqVar;
        this.onShowTranslation = draadjrbmkVar3;
    }
}
