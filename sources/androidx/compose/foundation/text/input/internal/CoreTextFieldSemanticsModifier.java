package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.focus.wflxmlrfwp;
import iwxlajgraz.jyumaefscl;
import kotlin.Metadata;
import opjhrmiecq.igdgnonuha;
import p0.jhduphickx;
import p0.tzroggbefp;
import p0.ylkuphrtab;
import p0.zdlpuopuiu;
import skhdrjzrfn.skhdrjzrfn;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b\f\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Lz/ribwqtqdhb;", "Liwxlajgraz/jyumaefscl;", "Lp0/jhduphickx;", "transformedText", "Lp0/tzroggbefp;", "value", "Lopjhrmiecq/igdgnonuha;", "state", "", "readOnly", "enabled", "isPassword", "Lp0/ylkuphrtab;", "offsetMapping", "Lskhdrjzrfn/skhdrjzrfn;", "manager", "Lp0/zdlpuopuiu;", "imeOptions", "Landroidx/compose/ui/focus/wflxmlrfwp;", "focusRequester", "<init>", "(Lp0/jhduphickx;Lp0/tzroggbefp;Lopjhrmiecq/igdgnonuha;ZZZLp0/ylkuphrtab;Lskhdrjzrfn/skhdrjzrfn;Lp0/zdlpuopuiu;Landroidx/compose/ui/focus/wflxmlrfwp;)V", "wflxmlrfwp", "()Liwxlajgraz/jyumaefscl;", "node", "Lgg/wwaezpbzkn;", "ojitshcjhn", "(Liwxlajgraz/jyumaefscl;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "zoijcleaow", "Lp0/jhduphickx;", "getTransformedText", "()Lp0/jhduphickx;", "ppxfxbqfkf", "Lp0/tzroggbefp;", "getValue", "()Lp0/tzroggbefp;", "wkgbmnqykc", "Lopjhrmiecq/igdgnonuha;", "getState", "()Lopjhrmiecq/igdgnonuha;", "eablkybsjg", "Z", "getReadOnly", "()Z", "gxszxtbevo", "getEnabled", "lqeggnwhkg", "nufgyqmvbu", "Lp0/ylkuphrtab;", "getOffsetMapping", "()Lp0/ylkuphrtab;", "dxjokdxxww", "Lskhdrjzrfn/skhdrjzrfn;", "getManager", "()Lskhdrjzrfn/skhdrjzrfn;", "btonecajqb", "Lp0/zdlpuopuiu;", "getImeOptions", "()Lp0/zdlpuopuiu;", "gtknphoqwx", "Landroidx/compose/ui/focus/wflxmlrfwp;", "getFocusRequester", "()Landroidx/compose/ui/focus/wflxmlrfwp;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends ribwqtqdhb {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name and from kotlin metadata and from toString */
    private final zdlpuopuiu imeOptions;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata and from toString */
    private final skhdrjzrfn manager;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean readOnly;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name and from kotlin metadata and from toString */
    private final wflxmlrfwp focusRequester;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPassword;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ylkuphrtab offsetMapping;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp value;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata and from toString */
    private final igdgnonuha state;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final jhduphickx transformedText;

    public CoreTextFieldSemanticsModifier(jhduphickx jhduphickxVar, tzroggbefp tzroggbefpVar, igdgnonuha igdgnonuhaVar, boolean z13, boolean z14, boolean z15, ylkuphrtab ylkuphrtabVar, skhdrjzrfn skhdrjzrfnVar, zdlpuopuiu zdlpuopuiuVar, wflxmlrfwp wflxmlrfwpVar) {
        this.transformedText = jhduphickxVar;
        this.value = tzroggbefpVar;
        this.state = igdgnonuhaVar;
        this.readOnly = z13;
        this.enabled = z14;
        this.isPassword = z15;
        this.offsetMapping = ylkuphrtabVar;
        this.manager = skhdrjzrfnVar;
        this.imeOptions = zdlpuopuiuVar;
        this.focusRequester = wflxmlrfwpVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.value, coreTextFieldSemanticsModifier.value) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.manager, coreTextFieldSemanticsModifier.manager) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(jyumaefscl node) {
        node.n1(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public jyumaefscl getNode() {
        return new jyumaefscl(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }
}
