package androidx.compose.foundation;

import ikoacuggdj.tzroggbefp;
import kotlin.Metadata;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lz/ribwqtqdhb;", "Landroidx/compose/foundation/lqeggnwhkg;", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "Likoacuggdj/tzroggbefp;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lg0/nufgyqmvbu;", "role", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "onClick", "<init>", "(Lmetgxyhuhe/draadjrbmk;Likoacuggdj/tzroggbefp;ZZLjava/lang/String;Lg0/nufgyqmvbu;Ltg/iobyxmoadg;Lkotlin/jvm/internal/gtknphoqwx;)V", "wflxmlrfwp", "()Landroidx/compose/foundation/lqeggnwhkg;", "node", "ojitshcjhn", "(Landroidx/compose/foundation/lqeggnwhkg;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Lmetgxyhuhe/draadjrbmk;", "ppxfxbqfkf", "Likoacuggdj/tzroggbefp;", "wkgbmnqykc", "Z", "eablkybsjg", "gxszxtbevo", "Ljava/lang/String;", "lqeggnwhkg", "Lg0/nufgyqmvbu;", "nufgyqmvbu", "Ltg/iobyxmoadg;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClickableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final String onClickLabel;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final g0.nufgyqmvbu role;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final tg.iobyxmoadg onClick;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final tzroggbefp indicationNodeFactory;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final metgxyhuhe.draadjrbmk interactionSource;

    public /* synthetic */ ClickableElement(metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(draadjrbmkVar, tzroggbefpVar, z13, z14, str, nufgyqmvbuVar, iobyxmoadgVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.interactionSource, clickableElement.interactionSource) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.useLocalIndication == clickableElement.useLocalIndication && this.enabled == clickableElement.enabled && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.onClickLabel, clickableElement.onClickLabel) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    public int hashCode() {
        metgxyhuhe.draadjrbmk draadjrbmkVar = this.interactionSource;
        int iHashCode = (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0) * 31;
        tzroggbefp tzroggbefpVar = this.indicationNodeFactory;
        int iHashCode2 = (((((iHashCode + (tzroggbefpVar != null ? tzroggbefpVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g0.nufgyqmvbu nufgyqmvbuVar = this.role;
        return ((iHashCode3 + (nufgyqmvbuVar != null ? g0.nufgyqmvbu.agtfadlqog(nufgyqmvbuVar.rgvfuqvkyq()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(lqeggnwhkg node) {
        node.v1(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg btonecajqb() {
        return new lqeggnwhkg(this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    private ClickableElement(metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str, g0.nufgyqmvbu nufgyqmvbuVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.interactionSource = draadjrbmkVar;
        this.indicationNodeFactory = tzroggbefpVar;
        this.useLocalIndication = z13;
        this.enabled = z14;
        this.onClickLabel = str;
        this.role = nufgyqmvbuVar;
        this.onClick = iobyxmoadgVar;
    }
}
