package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DraggableElement;
import jztzpxfvev.hcddaimhww;
import jztzpxfvev.jlmebxxoox;
import jztzpxfvev.jpowsppfya;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import t.pmvmpeiblj;
import tg.draadjrbmk;
import tg.vdvldrhtss;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(¨\u00062"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lz/ribwqtqdhb;", "Ljztzpxfvev/hcddaimhww;", "Ljztzpxfvev/jpowsppfya;", "state", "Ljztzpxfvev/jlmebxxoox;", "orientation", "", "enabled", "Lmetgxyhuhe/draadjrbmk;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lpj/cllcsxoeiz;", "Lg/eablkybsjg;", "Llg/gxszxtbevo;", "Lgg/wwaezpbzkn;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Ljztzpxfvev/jpowsppfya;Ljztzpxfvev/jlmebxxoox;ZLmetgxyhuhe/draadjrbmk;ZLtg/vdvldrhtss;Ltg/vdvldrhtss;Z)V", "rgvfuqvkyq", "()Ljztzpxfvev/hcddaimhww;", "node", "vdvldrhtss", "(Ljztzpxfvev/hcddaimhww;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "zoijcleaow", "Ljztzpxfvev/jpowsppfya;", "ppxfxbqfkf", "Ljztzpxfvev/jlmebxxoox;", "wkgbmnqykc", "Z", "eablkybsjg", "Lmetgxyhuhe/draadjrbmk;", "gxszxtbevo", "lqeggnwhkg", "Ltg/vdvldrhtss;", "nufgyqmvbu", "dxjokdxxww", "btonecajqb", "iobyxmoadg", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DraggableElement extends ribwqtqdhb {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final draadjrbmk f4629gtknphoqwx = new draadjrbmk() { // from class: jztzpxfvev.lmojexxdyd
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return Boolean.valueOf(DraggableElement.ojitshcjhn((t.pmvmpeiblj) obj));
        }
    };

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final metgxyhuhe.draadjrbmk interactionSource;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final vdvldrhtss onDragStarted;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final vdvldrhtss onDragStopped;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final jlmebxxoox orientation;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final jpowsppfya state;

    public DraggableElement(jpowsppfya jpowsppfyaVar, jlmebxxoox jlmebxxooxVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z14, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2, boolean z15) {
        this.state = jpowsppfyaVar;
        this.orientation = jlmebxxooxVar;
        this.enabled = z13;
        this.interactionSource = draadjrbmkVar;
        this.startDragImmediately = z14;
        this.onDragStarted = vdvldrhtssVar;
        this.onDragStopped = vdvldrhtssVar2;
        this.reverseDirection = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ojitshcjhn(pmvmpeiblj pmvmpeibljVar) {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return zdlpuopuiu.eablkybsjg(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && zdlpuopuiu.eablkybsjg(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && zdlpuopuiu.eablkybsjg(this.onDragStarted, draggableElement.onDragStarted) && zdlpuopuiu.eablkybsjg(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        metgxyhuhe.draadjrbmk draadjrbmkVar = this.interactionSource;
        return ((((((((iHashCode + (draadjrbmkVar != null ? draadjrbmkVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public hcddaimhww btonecajqb() {
        return new hcddaimhww(this.state, f4629gtknphoqwx, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // z.ribwqtqdhb
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void draadjrbmk(hcddaimhww node) {
        node.t1(this.state, f4629gtknphoqwx, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
